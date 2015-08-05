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
package de.fraunhofer.esk.ernest.core.analysis.analyses.port;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;

import de.fraunhofer.esk.ernest.core.analysis.analyses.AnalysisUtil;
import de.fraunhofer.esk.ernest.core.analysis.analyses.ErnestModelAnalysis;
import de.fraunhofer.esk.ernest.core.analysis.analyses.Event;
import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.AnalysisException;
import ernest.timingspecification.Constraint;
import ernest.timingspecification.ConstraintValidation;
import ernest.timingspecification.EventConstraint;

public abstract class PortAnalysis extends ErnestModelAnalysis {
	@Override
	public abstract Class<? extends Constraint> getConstraintClass();

	/**
	 * Holds the analysis algorithm.
	 * <p>
	 * Initializes the Analysis with the data from the Constraint.
	 *
	 * @param e
	 *            event to analyse
	 * @param constraint
	 *            contains the data for the analysis
	 * @return true if the analysis was successful, false otherwise
	 */
	protected abstract ArrayList<ConstraintValidation> check(Event e, EventConstraint constraint, IProgressMonitor progress);

	@Override
	protected final ArrayList<ConstraintValidation> analyseConstraint(Constraint constraint, IProgressMonitor progress) throws AnalysisException {
		EventConstraint c = (EventConstraint) constraint;

		/*
		 * Some Error Handling - In case that the Port was not set
		 */
		if (c.getPort() == null) {
		    throw new AnalysisException(String.format(UI_EXCEPTION_PORTANALYSIS, c.getName()));
		}

		// now get an Event that can be passed to the tadlcc analyses
		Event event = AnalysisUtil.convertERNESTPortToTADLEvent(c.getPort(), this.getOccurrences());

		/*
		 * Send the Factory the Constraint, it will return the correct and fully
		 * initialized de.fraunhofer.esk.tadlcc analysis class
		 */

		// analyse and return the result for the particular Constraint
		return this.check(event, c, progress);
	}
}
