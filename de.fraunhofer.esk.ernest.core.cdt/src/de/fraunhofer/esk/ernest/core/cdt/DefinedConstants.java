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
package de.fraunhofer.esk.ernest.core.cdt;

/**
 * Holds all Strings that are used by this Plug-In.
 * Especially holds all Strings for the Wizard
 */
public interface DefinedConstants 
{	
	/* Wizard page */
	public final String UI_WIZARDPAGE_NAME = "ERNEST Simulation Wizard";
	public final String UI_WIZARDPAGE_DESCRIPTION ="Creates ERNEST Simulation Project";
	
	/* Simulation Wizard Container */
	public final String UI_CONTAINER_ENTERPROJNAME = "Project name";
	public final String UI_CONTAINER_ENTERPROJLOC = "Enter the location";
	public final String UI_CONTAINER_BUTTONBROWSE = "Browse";
	public final String UI_CONTAINER_BROWSESELECT = "Select the parent directory for the project";

	public final String UI_USERMSG_TITLE ="ERNEST";
	public final String UI_USERMSG_SUCCESS = "Successfully created %s.";
	public final String UI_USERMSG_FINISHED ="Finished Wizard for %s";
	public final String UI_USERMSG_EXISTQST = "A project with this name already exists, do you want to override it?";
	public final String UI_USERMSG_ERROR = "An error occurred.";
	
	/* ProgressMonitor */
	public final String UI_MONITOR_MAINTASKNAME ="Generate Simulation";
	public final String UI_MONITOR_GENERATOR ="Generate Simulation";
	public final String UI_MONITOR_GENPROJECT ="Create Project";
	public final String UI_MONITOR_GENPROJCONFIG ="Generate project configuration";
	
	/* Preferences */
	public final String PREF_PAGE_DESCRIPTION = "Settings for the Generate Simulation Wizard";
	public final String PREF_PAGE_ENVIRONMENTLABEL = "Environment Variables: ";
	public final String PREF_PAGE_REMOVEBUTTON = "Remove";
	public final String PREF_PAGE_ADDBUTTON = "Add";
	
	public final String PREF_PAGE_TABLE_VALUE = "Value";
	public final String PREF_PAGE_TABLE_VARIABLE = "Variable";
	
	public final String PREF_PAGE_LIST_DIALOGTEXT = "New Environment Variable";
	public final String PREF_PAGE_LIST_DIALOGMESSAGE = "Please enter an environment variable:";
	public final String PREF_PAGE_LIST_DIALOGENTERVARIABLE = "Enter Variable: ";
	public final String PREF_PAGE_LIST_DIALOGENTERVALUE = "Enter Value: ";
	public final String PREF_PAGE_LIST_DIALOGOKBUTTON = "Ok";
	public final String PREF_PAGE_LIST_DIALOGCANCELBUTTON ="Cancel";
}