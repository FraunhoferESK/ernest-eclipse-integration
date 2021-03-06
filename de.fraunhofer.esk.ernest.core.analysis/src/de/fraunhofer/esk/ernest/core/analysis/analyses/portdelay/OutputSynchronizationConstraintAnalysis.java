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
import de.fraunhofer.esk.ernest.core.analysis.analyses.Event;
import de.fraunhofer.esk.ernest.core.analysis.analyses.Time;
import ernest.timingspecification.Constraint;
import ernest.timingspecification.ConstraintValidation;
import ernest.timingspecification.DelayConstraint;
import ernest.timingspecification.OutputSynchronizationConstraint;
import ernest.timingspecification.TimingspecificationFactory;

public class OutputSynchronizationConstraintAnalysis extends PortDelayAnalysis {
	private Time upper;
	private Time lower;
	private Time width;

	@Override
	public Class<? extends Constraint> getConstraintClass() {
		return OutputSynchronizationConstraint.class;
	}

	/**
	 * Should never be used. Default Constructor for the Analysis Framework
	 */
	public OutputSynchronizationConstraintAnalysis() {
	}

	public OutputSynchronizationConstraintAnalysis(Time lower, Time upper, Time width) {
		this.lower = lower;
		this.upper = upper;
		this.width = width;
	}

	protected ArrayList<ConstraintValidation> check(ArrayList<Event> stimuli, ArrayList<Event> responses, IProgressMonitor progress) {
		ArrayList<ConstraintValidation> validationList = new ArrayList<ConstraintValidation>();

		/*
		 * progressWork 1 and 2 are used to estimate the amount of work done per loop
		 */
		int progressWork1, progressWork2;
		progressWork1 = 1 + ( WORK_PER_LOOP /stimuli.size() );
		progress.subTask(UI_MESSAGE_ANALYSISSTARTED);

		for (Event e : stimuli)
		{
			progressWork2 = 1 + (progressWork1 / e.getDynamics().size());

			for (Time t : e.getDynamics())
			{
				ConstraintValidation theValidation = TimingspecificationFactory.eINSTANCE.createConstraintValidation();
				if(t.getTimeUnit() == AnalysisUtil.TIMEUNIT) {
				    theValidation.setStarttime(t.getValue());
				} else {
				    theValidation.setStarttime(Time.convertToUnit(AnalysisUtil.TIMEUNIT, t.getTimeUnit(), t.getValue()));
				}


				Time a = null;
				Time b = null;

				for (Event r : responses) {

					for (Time u : r.getDynamics()) {
						if ((t.add(this.lower).compareTo(u) <= 0) && (t.add(this.upper).compareTo(u) >= 0)) {
							if(t.getTimeUnit() == AnalysisUtil.TIMEUNIT) {
							    theValidation.setEndtime(t.getValue());
							} else {
							    theValidation.setEndtime(Time.convertToUnit(AnalysisUtil.TIMEUNIT, t.getTimeUnit(), t.getValue()));
							}



							Time as = u.substract(this.width);
							Time bs = u;
							a = Time.max(a, as);
							b = Time.min(b, bs);

							System.out.println("Found: " + u.getValue());

							if ((a.compareTo(b) <= 0)) {
								theValidation.setSatisfied(true);
							}
							if(progress.isCanceled()) {
							    break;
							}
						}
						if(progress.isCanceled()) {
						    break;
						}
					}
					if(progress.isCanceled()) {
					    break;
					}
				}
				validationList.add(theValidation);

				progress.worked(progressWork2);
				if(progress.isCanceled()) {
				    break;
				}
			}
		}

		return validationList;
	}

	@Override
	protected ArrayList<ConstraintValidation> check(ArrayList<Event> stimuli, ArrayList<Event> responses, DelayConstraint constraint, IProgressMonitor progress) {
		this.upper = AnalysisUtil.getTime(constraint.getMaximumLatency());
		this.lower = AnalysisUtil.getTime(constraint.getMinimumLatency());
		this.width = AnalysisUtil.getTime(((OutputSynchronizationConstraint) constraint).getTolerance());
		return this.check(stimuli, responses, progress);
	}
}
