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

import ernest.Model
import ernest.architecture.CSPort
import ernest.architecture.FModule
import ernest.architecture.FlowPort
import ernest.architecture.Interface
import ernest.architecture.Port
import ernest.timingspecification.DelayConstraint
import ernest.timingspecification.EventConstraint
import ernest.timingspecification.TimingModel
import ernest.architecture.Attribute

class Generate_Function {
	
	def generateFunctionHeader(FModule theFunction)'''
		#ifndef _«theFunction.name.toUpperCase»_
		#define _«theFunction.name.toUpperCase»_
		
		#include <ernest/ernest.hpp>
		
		using namespace ERNEST;
		
		class «theFunction.name» : public SoftwareFunction
		{
		public:
			«theFunction.name»(TaskContext *context);
			virtual ~«theFunction.name»(void);
			void PullPorts();
			void Exec();
			void PushPorts();

			// Flow ports
			«FOR port : theFunction.ports.filter(FlowPort)»
				«IF port.kind.literal == "In"»
					FlowPort<«port.datatype», In> «port.name»;
				«ENDIF»
				«IF port.kind.literal == "InOut"»
					FlowPort<«port.datatype», InOut> «port.name»;
				«ENDIF»
				«IF port.kind.literal == "Out"»
					FlowPort<«port.datatype», Out> «port.name»;
				«ENDIF»					
			«ENDFOR»
			«FOR port : theFunction.ports.filter(CSPort)»
				«IF port.kind.literal == "Provided"»
					«port.name» = new «port.interface.name»();
				«ENDIF»
			«ENDFOR»
			«FOR port : theFunction.ports.filter(CSPort)»
				«(port as CSPort).interface.name» *«port.name»;
			«ENDFOR»
			«FOR attribute : theFunction.attributes.filter[visibility.literal == "public"]»
				«attribute.type» «attribute.name»;
			«ENDFOR»
		private:
			«FOR attribute : theFunction.attributes.filter[visibility.literal == "private"]»
				«attribute.type» «attribute.name»;
			«ENDFOR»
		protected:
			«FOR attribute : theFunction.attributes.filter[visibility.literal == "protected"]»
				«attribute.type» «attribute.name»;
			«ENDFOR»
		};

		#endif /* _«theFunction.name.toUpperCase»_ */
	'''
	
	def generatePortTraceCalls(Port port, TimingModel timingModel) {
		var boolean isTraced = false
		for(constraint : timingModel.constraints) {
			if (constraint instanceof DelayConstraint) {
				val delayconstraint = constraint as DelayConstraint
				if (delayconstraint.response.indexOf(port)!= -1 || delayconstraint.stimulus.indexOf(port) != -1) {
					isTraced = true
				}
			}
			else {
				if (constraint instanceof EventConstraint) {
					val eventConstraint = constraint as EventConstraint
					if (eventConstraint.port.equals(port)) {
						isTraced = true
					}
				}
			}
		}
		if (isTraced) {
			print(', "'+port.eResource.getURI.lastSegment+'#'+port.eResource.getURIFragment(port)+'"')
		}
	}
	
	def attributeConstructor(Attribute attribute)'''
	
	«attribute.name» ( «attribute.defaultValue» )'''
	
	def portConstructor(FlowPort port, FModule theFunction, Model model)'''
	
	«port.name»("«theFunction.name.toLowerCase»_«port.name»", context«generatePortTraceCalls(port, model.timingModel)»)'''
	
	def generateFunction(FModule theFunction, Model model)'''
		#include <iostream>
		#include <ernest/ernest.hpp>
		#include "«theFunction.name.toLowerCase».h"
		
		using namespace std;
		
		«theFunction.name»::«theFunction.name»(TaskContext *context) :
				SoftwareFunction(context)«
				»«theFunction.attributes.join(',', ',', '', [attributeConstructor])»«
				»«theFunction.ports.filter(FlowPort).join(',', ',', '', [portConstructor(theFunction, model)])»
		{
		}
		
		«theFunction.name»::~«theFunction.name»(void)
		{
		}
		
		void «theFunction.name»::PullPorts()
		{
			// #######################################################################
			// # Pull all in flow ports
			// #######################################################################
			«FOR port : theFunction.ports.filter(FlowPort)»
				«IF port.kind.literal == "In" || port.kind.literal == "InOut"»
					«port.name».Pull();
				«ENDIF»
			«ENDFOR»
			// # End #################################################################			
		}
		
		void «theFunction.name»::Exec()
		{

			«FOR behavior : theFunction.behavior»
				«IF behavior.operation === null»
					«behavior.body»
				«ENDIF»
			«ENDFOR»
		}
		
		void «theFunction.name»::PushPorts()
		{
			// #######################################################################
			// # Push all out flow ports
			// #######################################################################
			«FOR port : theFunction.ports.filter(FlowPort)»
				«IF port.kind.literal == "Out" || port.kind.literal == "InOut"»
					«port.name».Push();
				«ENDIF»
			«ENDFOR»
			// # End #################################################################
		}
	'''
	
	def generateInterface(Interface theInterface)'''
		class «theInterface.name»()
		{
			«FOR operation : theInterface.operations»
				«operation.returntype» «operation.name»(«FOR param : operation.arguments SEPARATOR ','»«param.type» «param.name»«ENDFOR»)
				{
					«operation.behavior.body»
				}
			«ENDFOR»
		}
	'''
}