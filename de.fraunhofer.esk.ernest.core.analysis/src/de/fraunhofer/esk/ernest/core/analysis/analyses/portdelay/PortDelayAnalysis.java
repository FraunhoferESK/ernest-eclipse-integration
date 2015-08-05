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
package de.fraunhofer.esk.ernest.core.analysis.analyses.portdelay;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;

import de.fraunhofer.esk.ernest.core.analysis.analyses.AnalysisUtil;
import de.fraunhofer.esk.ernest.core.analysis.analyses.ErnestModelAnalysis;
import de.fraunhofer.esk.ernest.core.analysis.analyses.Event;
import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.AnalysisException;
import ernest.timingspecification.Constraint;
import ernest.timingspecification.ConstraintValidation;
import ernest.timingspecification.DelayConstraint;

/**
 * Abstract class for a PortDelay Analysis.
 * <p>
 * This class already provides the whole analyse process.<br>
 * Subclasses only need to implement the {@link #getConstraintClass} method,
 * while the remaining analyse process will be done through this class.
 *
 * @see AnalysisFactory
 *
 *
 */
public abstract class PortDelayAnalysis extends ErnestModelAnalysis {
	@Override
	public abstract Class<? extends ernest.timingspecification.Constraint> getConstraintClass();

	/**
	 * Holds the analysis algorithm.
	 * <p>
	 * Initializes the Analysis with the data from the Constraint.
	 *
	 * @param stimuli
	 *            the stimuli events
	 * @param responses
	 *            the response events
	 * @param constraint
	 *            contains the data for the analysis
	 * @return true if the analysis was successful, false otherwise
	 */
	protected abstract ArrayList<ConstraintValidation> check(ArrayList<Event> stimuli, ArrayList<Event> responses, DelayConstraint constraint, IProgressMonitor progress);

	@Override
	protected final ArrayList<ConstraintValidation> analyseConstraint(Constraint constraint, IProgressMonitor progress) throws AnalysisException {
		DelayConstraint c = (DelayConstraint) constraint;

		/*
		 * Some Error Handling - In case that the PortDelay was not set
		 */
		if (c == null) {
		    throw new AnalysisException(String.format(UI_EXCEPTION_PORTDELAYANALYSIS, "PortDelay was not set" ));
		}

		// now get lists of Events that can be passed to the tadlcc analyses
		ArrayList<Event> stimulus = AnalysisUtil.convertERNESTPortListToTADLEventList(c.getStimulus(), this.getOccurrences());
		ArrayList<Event> response = AnalysisUtil.convertERNESTPortListToTADLEventList(c.getResponse(), this.getOccurrences());

		/*
		 * Send the Factory the Constraint, it will return the correct and fully
		 * initialized de.fraunhofer.esk.tadlcc analysis class
		 */
		// DelayConstraint analysis = AnalysisFactory.getPortDelayAnalysis(c);
		// return analysis.check(stimulus, response);

		// analyse and return the result for the particular Constraint
		return this.check(stimulus, response, c, progress);
	}
}
