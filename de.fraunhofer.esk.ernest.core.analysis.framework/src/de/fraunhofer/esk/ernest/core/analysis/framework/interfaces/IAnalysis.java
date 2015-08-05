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

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * The Analysis Interface that has to be implemented to be able to use an analysis
 * in the Analysis Plug-In.<p>
 * It offers methods for pre and postprocessing of an analysis.<br>
 * Errors during initialization should be reported through a {@link AnalysisException}.
 *
 *
 */
public interface IAnalysis {
	/**
	 * This method will be called directly before the analyse method is called.<p>
	 * It passes the file the analysis was started for as a String and
	 * offers the opportunity to load the file and initialize values and objects.<p>
	 * If an Error occurres during the Initialization an {@link AnalysisException}
	 * has to be thrown to Inform the underlying job that this Analysis
	 * should not be executed. <br>
	 * In such a case neither {@link #analyse(AnalyseProgress)} nor {@link #postAnalyse()} will be called.
	 *
	 * @param obj the file that will be analysed
	 * @throws AnalysisException should be thrown if an error occures
	 * while loading the file to be analysed, i.e. some data is missing in the file.
	 */
	public void preAnalyse(Object obj, IProgressMonitor monitor) throws AnalysisException;

	/**
	 * The Core of the Analysis.<p>
	 * Called after preAnalyse and before postAnalyse.
	 * That's the place for the real analysis.<br>
	 * The {@link AnalysisProgress} can be used to inform the user about the current status
	 * of the Analysis.<br>
	 * The result has to return a boolean value. true if the analysis was successful and
	 * false if the analysis failed.<p>
	 * Should errors occur during the analysis, false can be returned.
	 * An AnalysisException can be thrown for further error handling.
	 *
	 * @param progress provides methods to show the current progress to the user
	 * @return true if the analysis was successful, false if it failed
	 * @throws AnalysisException AnalysisProgress may throw this Exception when the user
	 * cancels the Analysis. Can also be thrown if an error occurs. A Message will be displayed
	 * to the user.
	 * @see AnalysisProgress
	 */
	public boolean analyse(IProgressMonitor progress) throws  AnalysisException;
	/**
	 * Will be called after the analysis is finished.<p>
	 * Routines for data or result storage should be included here.<p>
	 * The result of the analysis has no impact on this methods call.
	 * So, this will be also called when {@link #analyse(AnalyseProgress)} returned false.<br>
	 * If the postAnalyse() routine is not favoured for failed analyses, then you should
	 * store the result of <samp>analyse(AnalyseProgress)</samp> and include a check in this method.
	 */
	public void postAnalyse(IProgressMonitor progress);
}
