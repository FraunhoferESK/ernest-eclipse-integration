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
import de.fraunhofer.esk.ernest.core.analysis.analyses.Event;
import de.fraunhofer.esk.ernest.core.analysis.analyses.GenericRepetitionConstraint;
import de.fraunhofer.esk.ernest.core.analysis.analyses.Time;
import ernest.timingspecification.Constraint;
import ernest.timingspecification.ConstraintValidation;
import ernest.timingspecification.EventConstraint;
import ernest.timingspecification.SporadicRepetitionConstraint;

public class SporadicRepetitionConstraintAnalysis extends PortAnalysis {

	private GenericRepetitionConstraint constraint1;
	private GenericRepetitionConstraint constraint2;

	@Override
	public Class<? extends Constraint> getConstraintClass() {
		return SporadicRepetitionConstraint.class;
	}

	/**
	 * Should never be used. Default Constructor for the Analysis Framework
	 */
	public SporadicRepetitionConstraintAnalysis() {
	}

	public SporadicRepetitionConstraintAnalysis(Time period, Time jitter, Time minimumInterArrivalTime, Time maximumInterArrivalTime) {
		// Create first constraint
		this.constraint1 = new GenericRepetitionConstraint(period, Time.INFINITY, jitter, 1);

		assert ((minimumInterArrivalTime == null && maximumInterArrivalTime == null) || (minimumInterArrivalTime != null && maximumInterArrivalTime != null));

		if (minimumInterArrivalTime != null && maximumInterArrivalTime != null) {
			this.constraint2 = new GenericRepetitionConstraint(minimumInterArrivalTime, maximumInterArrivalTime, Time.ZERO, 1);
		}
	}

	public SporadicRepetitionConstraintAnalysis(Time period, Time jitter) {
		this(period, jitter, null, null);
	}

	public ArrayList<ConstraintValidation> check(Event e, IProgressMonitor progress) {
		if (this.constraint2 == null) {
		    return this.constraint1.check(e);
		} else {

			/*
			 * progressWork is used to estimate the amount of work done per loop
			 */
			int progressWork;
			progress.subTask(UI_MESSAGE_ANALYSISSTARTED);

			ArrayList<ConstraintValidation> mergedConstraints = this.constraint1.check(e);
			ArrayList<ConstraintValidation> constValid2 = this.constraint2.check(e);

			progressWork = 1 + ( WORK_PER_LOOP / mergedConstraints.size() );

			for (int i = 0; i < mergedConstraints.size(); i++)
			{
				mergedConstraints.get(i).setSatisfied(mergedConstraints.get(i).isSatisfied() && constValid2.get(i).isSatisfied());

				progress.worked(progressWork);
				if(progress.isCanceled()) {
				    break;
				}
			}
			return mergedConstraints;
		}
	}

	@Override
	protected ArrayList<ConstraintValidation> check(Event e, EventConstraint constraint, IProgressMonitor progress) {
		this.init(constraint);
		return this.check(e, progress);
	}

	private void init(EventConstraint constraint) {
		SporadicRepetitionConstraint c = (SporadicRepetitionConstraint) constraint;
		this.constraint1 = new GenericRepetitionConstraint(AnalysisUtil.getTime(c.getPeriod()), Time.INFINITY, AnalysisUtil.getTime(c.getJitter()), 1);

		if (!Double.isNaN(c.getMinimumInterarrivalTime()) && !Double.isNaN(c.getMaximumInterarrivalTime())) {
			this.constraint2 = new GenericRepetitionConstraint(AnalysisUtil.getTime(c.getMinimumInterarrivalTime()), AnalysisUtil.getTime(c
					.getMaximumInterarrivalTime()), Time.ZERO, 1);
		} else {
		    this.constraint2 = null;
		}
	}
}
