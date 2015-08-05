/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer Institute for Embedded Systems and
 * Communication Technologies ESK
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file is part of ERNEST.
 *
 * Contributors:
 * Fraunhofer ESK - initial API and implementation
 *******************************************************************************/
package de.fraunhofer.esk.ernest.core.generator.templates

import de.fraunhofer.esk.ernest.core.generator.preferences.simulation.SimulationPreferencePage
import ernest.architecture.Bus
import ernest.architecture.ECU
import ernest.architecture.FModule
import ernest.architecture.Function
import ernest.architecture.HWModule
import ernest.architecture.HardwareConnector
import ernest.architecture.SoftwareConnector
import ernest.architecture.SoftwarePort
import ernest.architecture.StructureModel
import ernest.tracing.BinaryTrace
import ernest.tracing.TracingResults
import java.util.List

import static extension ernest.util.TraceReaderFactory.*

class Generate_Main {
	
	def generateMain (StructureModel structureModel, TracingResults results)'''
		#define SC_INCLUDE_DYNAMIC_PROCESSES
		
		#include <ernest/ernest.hpp>
		«FOR swf : structureModel.modules.filter(FModule)»
			#include "«swf.name.toLowerCase».h"
		«ENDFOR»
		
		using namespace std;
		using namespace ERNEST;
		
		int sc_main(int argc, char* argv[])
		{
			
			//
			// Configuring the simulator
			//
			
			Simulator::Init(L"«structureModel.eResource.getURI.lastSegment»");
			Simulator::SetDuration(seconds(«SimulationPreferencePage.time»));
			
			«IF results.trace instanceof BinaryTrace»
			«results.trace.readerExtension.recorderName ?: "BinaryTraceRecorder"» trace_recorder("«(results.trace as BinaryTrace).fileLocation»");
			// Event Mapping
			«FOR map : (results.trace as BinaryTrace).mappings»
			trace_recorder.AddEventMapping("«map.element.eResource.getURI.lastSegment+'#'+map.element.eResource.getURIFragment(map.element)»", «map.elementID»);
			«ENDFOR»
			«ENDIF»
			Simulator::SetTraceRecorder(&trace_recorder);
			
			//
			// Building the hardware topology
			//
			
			//Create ECU
			«FOR ecu : structureModel.modules.filter(ECU)»
				Ecu «ecu.name.toLowerCase»("«ecu.name»");
			«ENDFOR»
			
			//Create the Bus
			«FOR bus : structureModel.modules.filter(Bus)»
				SimpleBus «bus.name.toLowerCase»("«bus.name»");
			«ENDFOR»
			«FOR bus : structureModel.modules.filter(Bus)»
			
			// Adding «bus.name» interfaces to ecus
			«FOR ecuName : bus.ports.map[port | (port.connectedTo.head?.connectedTo?:emptyList).filter(oPort | oPort != port).head?.owner?.name?:"PleaseFixUnboundBusPort"]»
				SimpleBusInterface *«bus.name.toLowerCase»_«ecuName.toLowerCase»_interface = «ecuName.toLowerCase».AddHardware<SimpleBusInterface>();
			«ENDFOR»
			
			//Attaching the interfaces to «bus.name»
			«FOR ecuName : bus.ports.map[port | (port.connectedTo.head?.connectedTo?:emptyList).filter(oPort | oPort != port).head?.owner?.name?:"PleaseFixUnboundBusPort"]»
				«bus.name.toLowerCase».AttachInterface(«bus.name.toLowerCase»_«ecuName.toLowerCase»_interface);
			«ENDFOR»
			«ENDFOR»
			
			//
			// Configuring the software system
			// 
			
			//Set OS
			«FOR ecu : structureModel.modules.filter(ECU)»
				OsekOS* «ecu.name.toLowerCase»OS = «ecu.name.toLowerCase».GetService<OsekOS>();
			«ENDFOR»
			
			//Set Scheduler
			«FOR ecu : structureModel.modules.filter(ECU)»
				«ecu.name.toLowerCase»OS->SetScheduler<«(ecu as ECU).schedulerType»>();
			«ENDFOR»
			
			// Create one task for each SWF
			«FOR swf : structureModel.modules.filter(Function)»
				«IF swf.allocatedTo.head instanceof ECU»
					Task* «swf.name.toLowerCase»Task = «swf.allocatedTo.last.name.toLowerCase»OS->DeclareTask<«swf.name»>(«swf.priority», milliseconds(«swf.offset»), milliseconds(«swf.period»), new WorstCaseExecutionSpecification(milliseconds(«swf.wcet»)));
				«ENDIF»
				«IF !(swf.allocatedTo.head instanceof ECU)»
					Task* «swf.name.toLowerCase»Task = «swf.allocatedTo.last.getConnectedECU.name.toLowerCase»OS->DeclareTask<«swf.name»>(«swf.priority», milliseconds(«swf.offset»), milliseconds(«swf.period»), new WorstCaseExecutionSpecification(milliseconds(«swf.wcet»)));
				«ENDIF»
			«ENDFOR»
			
			// Getting Functions from tasks
			«FOR swf : structureModel.modules.filter(Function)»
				«swf.name»* «swf.name.toLowerCase» = dynamic_cast<«swf.name»*>(«swf.name.toLowerCase»Task->GetSwf());
			«ENDFOR»
			
			// Connecting Ports
			«FOR connector : structureModel.connectors.filter(SoftwareConnector)»
				«FOR pair : connector.getPairs.filter[key.owner instanceof Function && value.owner instanceof Function]»
					connect_ports(«pair.key.owner.name.toLowerCase»->«pair.key.name», «pair.value.owner.name.toLowerCase»->«pair.value.name»);
				«ENDFOR»
			«ENDFOR»
			
			Simulator::Start();
			
			return 0;
		}
	'''
	
	def getPairs(SoftwareConnector connector) {
		val List<Pair<SoftwarePort,SoftwarePort>> pairs = newArrayList
		connector.connectedTo.getPairs(pairs)
	}
	def <T> List<Pair<T,T>> getPairs(Iterable<T> list, List<Pair<T,T>> pairs) {
		val tail = list.tail.toList
		tail.forEach[pairs.add(new Pair(list.head, it))]
		if (tail.size > 1)
			tail.getPairs(pairs)
		pairs
	}
	
	def ECU getConnectedECU (HWModule theModule){
		var ECU theConnectedECU
		for(port : theModule.ports){
			var connector = port.connectedTo.last as HardwareConnector
			var secondPort = connector.connectedTo.findFirst(theSecondPort | theSecondPort != port)
			var connectedModule = secondPort.owner
			if(connectedModule instanceof ECU){
				theConnectedECU = connectedModule as ECU
			}
		}
		return theConnectedECU
	}
}