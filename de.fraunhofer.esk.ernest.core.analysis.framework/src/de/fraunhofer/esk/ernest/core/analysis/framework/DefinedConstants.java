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

/**
 * Holds all String Constants that are used by this Plug-In.
 *
 */
public interface DefinedConstants {
	// ID Strings
	public final String ID_CMDPARAM_ORDINAL = "de.fraunhofer.esk.ernest.core.analysis.framework.cmdparameter.ordinal";

	// String Constants for the AnalysisJobChangeListener - This will be displayed in the various MessageDialogs
	public final String UI_ANALYSIS_LABELRESULT = "Analysis Result";
	public final String UI_ANALYSIS_LABELCANCELED = "Analysis Canceled";
	public final String UI_ANALYSIS_LABELERROR = "Analysis Error";
	public final String UI_ANALYSIS_TEXTSUCCESSNOERR = "Analysis was successful - no violated constraint\n";
	public final String UI_ANALYSIS_TEXTSUCCESSERR = "Analysis - Some constraints failed\n";
	public final String UI_ANALYSIS_TEXTFAILED = "Analysis failed\n";
	public final String UI_ANALYSIS_TEXTCANCELED = "Analysis was canceled\n";
	public final String UI_ANALYSIS_TEXTINITFAILED = "Errors occured while trying to start Analysis\n";
	public final String UI_ANALYSIS_MULTIPROBLEMS = "Different problems occured";

	public final String UI_MESSAGEDETAILS_CONSTRAINTFAILED = " - Some constraints failed for: ";
	public final String UI_MESSAGEDETAILS_INITFAILED = " - Initialization failed (likely no trace or constraints found) for: ";
	public final String UI_MESSAGEDETAILS_ANALYSISFAILED = " - Analysis failed for: ";
	public final String UI_MESSAGEWINDOW_NOANALYSISFOUND = "No valid analysis found";

	public final String UI_MESSAGEINFO_FINISHED = "Analysis completed - See Details for further information";
	public final String UI_MESSAGEINFO_MULTIPROBLEMS = "Different problems occured, click Details for further information";
	public final String UI_MESSAGEINFO_INIT = "Failed to initialize some Analysis, click Details for further information";
	public final String UI_MESSAGEINFO_FAIL = "Some Analysis failed, click Details for further information";
	public final String UI_MESSAGEINFO_CONSTRAINT = "Constraint violations appeared";
	public final String UI_MESSAGEINFO_SUCCESS = "Analysis Success";
	
	/* Integer constants*/
	// 80 000 as base for the amount of work done per loop, because that is the amount given by the AnalysisJob Class (hard coded)
	public final static int WORK_PER_LOOP = 80000;
}
