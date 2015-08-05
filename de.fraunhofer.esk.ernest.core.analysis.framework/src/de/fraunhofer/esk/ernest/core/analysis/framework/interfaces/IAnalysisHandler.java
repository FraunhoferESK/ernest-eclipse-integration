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
package de.fraunhofer.esk.ernest.core.analysis.framework.interfaces;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import de.fraunhofer.esk.ernest.core.analysis.framework.Activator;

/**
 * A class must implement this interface if it wants to be a Handler for an Analysis.<p>
 * The Handler is called after the Analysis has finished and was either successful or it failed.<br>
 * Defining a Handler in the analyze extension will override the standard behavior,
 * which means that no Dialog will appear as soon as an Analysis has finished.<br>
 * {@link #done(String, String, IStatus)} is executed instead and should contain every action that is desired.<p>
 * <b>Dialogs for Error Handling and Cancellation are untouched by the Handler and can not be modified.<br></b>

 *
 *
 *
 */
public interface IAnalysisHandler {
	/** Indicates that the Analysis was successful and no errors occurred.*/
	public static final IStatus STATUS_SUCCESSNOERR = new Status(Status.OK, Activator.PLUGIN_ID, "Analysis successful.");
	/** Indicates that the Analysis was successful but constraint violation occurred. */
	public static final IStatus STATUS_SUCCESSERR = new Status(Status.OK, Activator.PLUGIN_ID, "Analysis sucessful. Constraint failed!");
	/** Indicates that the Analysis failed. */
	public static final IStatus STATUS_FAILED = new Status(Status.INFO, Activator.PLUGIN_ID, "Analysis failed.");

	/**
	 * Gets called after the Analysis has finished.<p>
	 * Should be used for custom output to the user or to execute further code.<br>
	 * It is possible to open Dialogs and perform UI Action as this is executed in the UI Thread.<br>
	 * <br>
	 * status is one of the following IStatus Objects: {@link #STATUS_SUCCESSNOERR}, {@link #STATUS_SUCCESSERR}, {@link #STATUS_FAILED}
	 *
	 * @param analysisname the name of the analysis
	 * @param filename the name of the file the analysis was exectued for
	 * @param status the result of the analysis. this can only be one of the following:
	 * {@link #STATUS_SUCCESSNOERR}, {@link #STATUS_FAILED}, {@link #STATUS_SUCCESSERR}
	 *
	 */
	public void done(String analysisname, String filename, IStatus status);
}
