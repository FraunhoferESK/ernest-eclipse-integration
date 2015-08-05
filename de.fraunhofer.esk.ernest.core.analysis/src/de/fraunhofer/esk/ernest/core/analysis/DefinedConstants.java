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
package de.fraunhofer.esk.ernest.core.analysis;

/**
 * Holds all Strings that are used by this Plug-In.
 * Especially holds all Strings for MessageDialogs.
 */
public interface DefinedConstants {
	/* IProgress Monitor */
	public final String UI_MESSAGE_ANALYSISSTARTED = "Analysing Data...";
	public final String UI_MESSAGE_GETRESOURCES = "Get Resources";
	public final String UI_MESSAGE_SAVEFILE = "Save model file";
	public final String UI_EXCEPTION_CANCELED = "Analysis Canceled";


	/* Now for the Analysis */
	public final String UI_EXCEPTION_MODELCAST = "Could not cast to a model. Check if %s is a valid model file.";
	public final String UI_EXCEPTION_LOADINGTIMING = "Timing Model not defined.";
	public final String UI_EXCEPTION_LOADINGTRACING = "Tracing Results not defined.";
	public final String UI_EXCEPTION_LOADINGCONSTRAINTS = "Constraint Specifications not defined.";
	public final String UI_EXCEPTION_EMPTYTIMING = "Could not load the Timing Model. No Entries found.";
	public final String UI_EXCEPTION_EMPTYTRACING = "Could not load the TracingResults. No Entries found.";
	public final String UI_EXCEPTION_EMPTYCONSTRAINTS = "Could not load the Constraint Specifications. No Entries found.";
	public final String UI_EXCEPTION_NOCONSTRAINTFITTING = "Could not finish the analysis.\nNo Constraints for this Analysis found.";
	public final String UI_EXCEPTION_PORTANALYSIS = "Error in Constraint Specification:\n%s\n\nPort not found.";
	public final String UI_EXCEPTION_PORTDELAYANALYSIS = "Error in Constraint Specification:\n%s\n\nPortDelay not found.";
	
	/* Integer constants*/
	// 80 000 as base for the amount of work done per loop, because that is the amount given by the AnalysisJob Class (hard coded)
	public final static int WORK_PER_LOOP = 80000;
}
