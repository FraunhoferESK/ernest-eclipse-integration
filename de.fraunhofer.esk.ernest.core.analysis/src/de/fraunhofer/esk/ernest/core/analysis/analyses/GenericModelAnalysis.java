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
package de.fraunhofer.esk.ernest.core.analysis.analyses;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.fraunhofer.esk.ernest.core.analysis.DefinedConstants;
import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.AnalysisException;
import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.IAnalysis;

/**
 * This defines a generic model analysis.<p>
 * Implements {@link IAnalysis} and defines a {@link #preAnalyse} and
 * {@link postAnalyse} method to handle model files generated through EMF.<p>
 * preAnalyse loads the model in a {@link #Resource}.<br>
 * postAnalyse saves the model.<p>
 *
 * <b>To use this functionality in an extending class while redefining postAnalyse or
 * preAnalyse, a call to the corresponding method in the superclass is needed.</b>
 * <p>
 * Example of an extending class:
 * <pre>
 * public void preAnalyse(Object obj) throws AnalysisException {
 * 	super.preAnalyse(obj);
 * 	...
 * }
 *
 * public boolean analyse(AnalysisProgress progress) throws AnalysisException {
 * 	...
 * }
 *
 * public void postAnalyse() {
 * ...
 * 	super.postAnalyse();
 * }
 * </pre>
 */
public abstract class GenericModelAnalysis implements IAnalysis, DefinedConstants {
	private ResourceSet resourceset;
	private Resource modelResource;
	private boolean result;

	protected ResourceSet getResourceSet() {
		return this.resourceset;
	}

	protected Resource getModelResource() {
		return this.modelResource;
	}

	protected boolean getResult() {
		return this.result;
	}

	protected void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public void preAnalyse(Object obj, IProgressMonitor progress) throws AnalysisException {
		// Get the Filename of the Resource (including Path)
		String file = obj.toString();

		// Create the ResourceSet
		this.resourceset = new ResourceSetImpl();
		// Load the File into the ResourceSet
		URI fileuri = URI.createPlatformResourceURI(file,false);

		progress.worked(10000);
		if(progress.isCanceled()) {
		    return;
		}
		progress.subTask( UI_MESSAGE_GETRESOURCES );

		this.modelResource = this.resourceset.getResource(fileuri,true);

		progress.worked(10000);
	}

	@Override
	public abstract boolean analyse(IProgressMonitor progress) throws AnalysisException;

	@Override
	public void postAnalyse(IProgressMonitor progress) {
		// Save the model file
		progress.subTask(UI_MESSAGE_SAVEFILE);
		if(progress.isCanceled()) {
		    return;
		}

		try {
			this.modelResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
