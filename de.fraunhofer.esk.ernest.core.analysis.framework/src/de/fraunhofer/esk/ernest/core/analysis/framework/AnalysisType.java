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
package de.fraunhofer.esk.ernest.core.analysis.framework;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.IAnalysis;
import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.IAnalysisHandler;

/**
 * This class defines an AnalysisType and holds all Analyses that were
 * registered to this Plug-In.<p>
 * The AnalysisType stores Information about an Analysis and is used to
 * create the ContextMenu and Instances of Analyses.<br>
 * It is an internal class that should not be used outside of this Plug-In.
 *
 * Note: this class has a natural ordering that is inconsistent with equals.
 */
public class AnalysisType implements Comparable<AnalysisType> {
	/*
	 * Some Constants
	 */
	public static final String TAG_ANALYSE = "analyse";
	public static final String ATT_NAME = "name";
	public static final String ATT_CLASSNAME = "class";
	public static final String ATT_EXTENSION = "extension";
	public static final String ATT_HANDLER = "handler";

	/*
	 * Variables
	 */
	private final IConfigurationElement configElement;
	private final int ordinal;
	private final String name;
	private final String classname;
	private final String extension;
	private final String handler;

	/**
	 * Static Array of all found Analyses
	 */
	private static AnalysisType[] cachedAnalyses;
	public static final AnalysisType UNKNOWN = new AnalysisType();

	private AnalysisType() {
		this.name = "Unknown";
		this.ordinal = 0;
		this.classname = "Unknown";
		this.extension = "*";
		this.handler = "Unknown";
		this.configElement = null;
	}

	public AnalysisType(IConfigurationElement configElement, int ordinal) {
		this.configElement = configElement;
		this.ordinal = ordinal;
		this.name = getAttribute(configElement, ATT_NAME, null);
		this.classname = getAttribute(configElement, ATT_CLASSNAME, null);
		this.extension = getAttribute(configElement, ATT_EXTENSION, "*");
		this.handler = getAttribute(configElement, ATT_HANDLER, "");
	}

	/**
	 * Extract the value of a variable in the given configElement.
	 * Only used internally, thus private
	 *
	 * @param configElement Element that holds the variable
	 * @param name name of the variable
	 * @param defaultValue defaultValue of the variable if no value was set
	 * @return the corresponding value as a String
	 */
	private static String getAttribute(IConfigurationElement configElement,
			String name, String defaultValue) {
		String value = configElement.getAttribute(name);
		if(value != null) {
		    return value;
		}
		if(defaultValue != null) {
		    return defaultValue;
		}
		throw new IllegalArgumentException("Missing " + name + " attribute");
	}

	/**
	 * Returns all found Analyses.<p>
	 * If this is called the first time, the method will go through all registered
	 * extensions and search for Analyses, storing it internally in cachedAnalyses.
	 * @return Array containing all Analyses
	 */
	public static AnalysisType[] getAnalyses() {
		if(cachedAnalyses != null) {
		    return cachedAnalyses;
		}

		IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint(Activator.PLUGIN_ID,"analysis").getExtensions();
		List<AnalysisType> found = new ArrayList<AnalysisType>();
		for(int i = 0; i < extensions.length; i++) {
			IConfigurationElement[] configElements = extensions[i].getConfigurationElements();
			for(int j = 0; j < configElements.length; j++) {
				AnalysisType proxy = parseAnalyse(configElements[j], found.size());
				if(proxy != null) {
				    found.add(proxy);
				}
			}
		}
		cachedAnalyses = found.toArray(new AnalysisType[found.size()]);
		return cachedAnalyses;
	}

	/**
	 * Checks if at least one Analysis exists that is valid for all given extensions
	 * @param extensions string with all extensions, multiple extensions have to be separated with a comma
	 * @return true if at least one Analysis exists
	 */
	public static boolean hasAnalyses(String extensions) {
		String extension[] = extensions.split(",");

		for(AnalysisType a : AnalysisType.getAnalyses()){
			String validExt = a.getExtension().replace(" ", "");
			boolean found = true;

			for(int j = 0; j < extension.length; j++) {
				if(validExt.compareTo(extension[j]) != 0 && !validExt.startsWith(extension[j]+",") && !validExt.contains(","+extension[j])) {
					found = false;
					break;
				}
			}
			if(found) {
			    return found;
			}

		}
		return false;
	}

	/**
	 * Checks if a given configElement is a correct Analysis and in that case
	 * creates a new AnalysisType Object
	 *
	 * @param configElement the configElement to check and create
	 * @param ordinal the place in the cachedTypes array that this Object will be
	 * @return the AnalysisType for the configElement
	 */
	private static AnalysisType parseAnalyse(IConfigurationElement configElement, int ordinal) {
		if(!configElement.getName().equals(TAG_ANALYSE)) {
		    return null;
		}
		try{
			return new AnalysisType(configElement, ordinal);
		} catch (Exception e) {
			String name = configElement.getAttribute(ATT_NAME);
			if(name == null) {
			    name = "[missing name attribute]";
			}
			String msg = "Failed to load Analysis with name "
						+ name
						+ " in "
						+ configElement.getDeclaringExtension().getNamespaceIdentifier();
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e));
			return null;
		}
	}

	/**
	 * Creates an Instance of the IAnalysis class defined in the AnalysisType
	 * @return instance of the Analysis Object
	 */
	public IAnalysis getInstance() {
		IAnalysis analysis = null;
		try {
			analysis = (IAnalysis)this.getConfigElement().createExecutableExtension(AnalysisType.ATT_CLASSNAME);
		} catch (CoreException e) {
			String classname = this.configElement.getAttribute(ATT_CLASSNAME);
			if(classname == null) {
			    classname = "[missing classname attribute]";
			}
			String msg = "Failed to load Analysis with classname "
						+ classname
						+ " in "
						+ this.configElement.getDeclaringExtension().getNamespaceIdentifier();
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e));
		}
		return analysis;
	}

	/**
	 * Creates an Instance of the IAnalysisHandler class defined in the AnalysisType
	 * @return instance of the Analysis Object
	 */
	public IAnalysisHandler getHandlerInstance() {
		IAnalysisHandler analysishandler = null;
		try {
			analysishandler = (IAnalysisHandler)this.getConfigElement().createExecutableExtension(AnalysisType.ATT_HANDLER);
		} catch (CoreException e) {
			String classname = this.configElement.getAttribute(ATT_HANDLER);
			if(classname == null) {
			    classname = "[missing handler attribute]";
			}
			String msg = "Failed to load AnalysisHandler with classname "
						+ classname
						+ " in "
						+ this.configElement.getDeclaringExtension().getNamespaceIdentifier();
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg, e));
		}
		return analysishandler;
	}

	private IConfigurationElement getConfigElement() {
		return this.configElement;
	}

	public String getName() {
		return this.name;
	}

	public int getOrdinal() {
		return this.ordinal;
	}

	public String getClassname() {
		return this.classname;
	}

	public String getExtension() {
		return this.extension;
	}

	public String getHandler() {
		return this.handler;
	}

	@Override
	public int compareTo(AnalysisType obj) {
		if (this == obj)
			return 0;
		
		int cmp = this.getName().compareTo(obj.getName() );
		if (cmp == 0)
			cmp = Integer.compare(this.getOrdinal(), obj.getOrdinal());
		if (cmp == 0)
			cmp = this.getHandler().compareTo(obj.getHandler());
		return cmp;
	}
	
}
