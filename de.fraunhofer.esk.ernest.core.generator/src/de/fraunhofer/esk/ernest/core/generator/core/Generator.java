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
package de.fraunhofer.esk.ernest.core.generator.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.fraunhofer.esk.ernest.core.generator.preferences.simulation.SimulationPreferencePage;
import de.fraunhofer.esk.ernest.core.generator.templates.Generate_Function;
import de.fraunhofer.esk.ernest.core.generator.templates.Generate_Main;
import ernest.Model;
import ernest.architecture.Element;
import ernest.architecture.FModule;
import ernest.architecture.Module;
import ernest.timingspecification.Constraint;
import ernest.timingspecification.DelayConstraint;
import ernest.timingspecification.EventConstraint;
import ernest.timingspecification.TimingspecificationFactory;
import ernest.tracing.BinaryTrace;
import ernest.tracing.EventMapping;
import ernest.tracing.TracingResults;
import ernest.tracing.impl.TracingFactoryImpl;

/**
 * Class to generate the SystemC simulation.
 * 
 */
public class Generator {

	private String srcGenPath;
	private Model ernestroot;
	private IFile theModelFile;

	/**
	 * Constructor of the Generator Class.
	 * @param modelFile the file containing the ERNEST model
	 */
	public Generator(IFile modelFile) {
		theModelFile = modelFile;
		IProject project = theModelFile.getProject();
		// basedir to be used for the platformURI
		String path = project.getLocation().toString();
		srcGenPath = path + "\\src-gen\\";
		// create subdirectory if it's not existing
		new File(srcGenPath).mkdir();
		ernestroot = extractModel(theModelFile);
	}

	
	/**
	 * Constructor of the Generator Class.
	 * @param modelFile the file containing the ERNEST model
	 * @param path the path to generate the SystemC files
	 */
	public Generator(IFile modelFile, String path) {
		theModelFile = modelFile;
		srcGenPath = path + "\\src-gen\\";
		// create subdirectory if it's not existing
		new File(srcGenPath).mkdir();
		ernestroot = extractModel(theModelFile);
	}

	
	/**
	 * Function to generate the SystemC files (.h & .cpp).
	 */
	public void generateAndWrite() {
		writeToFile("main.cpp", createMain());
		for (Module module : ernestroot.getStructureModel().getModules()) {
			if (module instanceof FModule) {
				FModule function = (FModule) module;
				writeToFile(function.getName() + ".cpp",
							createFunction(function, ernestroot));
				writeToFile(function.getName() + ".h",
							createFunctionHeader(function));
			}
		}
	}


	/**
	 * Function to generate the SystemC files (.h & .cpp).
	 * @param progress ProgeressMonitor
	 * @param work
	 */
	public void generateAndWrite(IProgressMonitor progress, int work) {
		writeToFile("main.cpp", createMain());

		final int workPerProgress =
				1 + (work / ernestroot.getStructureModel().getModules().size());

		for (Module module : ernestroot.getStructureModel().getModules()) {
			if (module instanceof FModule) {
				FModule function = (FModule) module;
				writeToFile(function.getName() + ".cpp",
							createFunction(function, ernestroot));
				writeToFile(function.getName() + ".h",
							createFunctionHeader(function));
			}
			progress.worked(workPerProgress);
		}
	}

	
	/**
	 * Function to write a certain content into a file.
	 * @param filename the name of the file to write the content
	 * @param content String contains the data to be written into the file
	 */
	public void writeToFile(String filename, String content) {
		try (FileWriter fileStream = new FileWriter(srcGenPath + filename);
				BufferedWriter out = new BufferedWriter(fileStream);) {
			out.write(content);
		} catch (IOException ioe) {
			System.err.println("Error: " + ioe.getMessage());
		}
	}

	
	private String createMain() {
		Generate_Main mainGen = new Generate_Main();
		ernestroot = setBinaryMapping(ernestroot);
		writeModel(ernestroot);
		return mainGen.generateMain(ernestroot.getStructureModel(), ernestroot.getTracingResults()).toString();
	}

	private String createFunction(FModule theFunction, Model model) {
		Generate_Function funcGen = new Generate_Function();
		return funcGen.generateFunction(theFunction, model).toString();
	}

	private String createFunctionHeader(FModule theFunction) {
		Generate_Function funcGen = new Generate_Function();
		return funcGen.generateFunctionHeader(theFunction).toString();
	}

	private boolean writeModel(Model theModel) {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(theModelFile.getFullPath().toString());
		Resource resource = resourceSet.getResource(uri, true);

		resource.getContents().set(0, theModel);

		try {
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	private ernest.Model extractModel(IFile modelFile) {
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createURI(modelFile.getFullPath().toString());
		Resource resource = resourceSet.getResource(uri, true);
		Model ernestModel = (Model) resource.getContents().get(0);

		return ernestModel;
	}

	private ernest.Model setBinaryMapping(Model theModel) {

		BinaryTrace newBinaryTrace = TracingFactoryImpl.eINSTANCE.createBinaryTrace();
		newBinaryTrace.setName(theModelFile.getName() + "BinaryTrace");
		newBinaryTrace.setFileLocation(theModelFile.getLocation().toString() + ".bt1");
		newBinaryTrace.setReaderExtension(SimulationPreferencePage.getTrace());
		
		int eventCounter = 0;
		
		if (theModel.getTimingModel() == null) {
			theModel.setTimingModel(TimingspecificationFactory.eINSTANCE.createTimingModel());
		}

		for (Constraint theConstraint : theModel.getTimingModel().getConstraints()) {
			if ((theConstraint instanceof DelayConstraint)) {
				DelayConstraint theDelayConstraint =
						(DelayConstraint) theConstraint;
				for (Element theElement : theDelayConstraint.getStimulus()) {
					EventMapping newEventMapping =
							TracingFactoryImpl.eINSTANCE.createEventMapping();
					newEventMapping.setElementID(eventCounter);
					newEventMapping.setElement(theElement);
					newBinaryTrace.getMappings().add(newEventMapping);
					eventCounter++;
				}
				for (Element theElement : theDelayConstraint.getResponse()) {
					EventMapping newEventMapping =
							TracingFactoryImpl.eINSTANCE.createEventMapping();
					newEventMapping.setElementID(eventCounter);
					newEventMapping.setElement(theElement);
					newBinaryTrace.getMappings().add(newEventMapping);
					eventCounter++;
				}
			} else {
				EventConstraint theEventConstraint =
						(EventConstraint) theConstraint;
				EventMapping newEventMapping =
						TracingFactoryImpl.eINSTANCE.createEventMapping();
				newEventMapping.setElementID(eventCounter);
				newEventMapping.setElement(theEventConstraint.getPort());
				newBinaryTrace.getMappings().add(newEventMapping);
				eventCounter++;
			}
		}

		TracingResults theTracingResults =
				TracingFactoryImpl.eINSTANCE.createTracingResults();
		theTracingResults.setName("BinaryTrace");
		theTracingResults.setTrace(newBinaryTrace);

		theModel.setTracingResults(theTracingResults);

		return theModel;
	}

}