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
import ernest.timingspecification.ReactionConstraint;
import ernest.timingspecification.TimingspecificationFactory;

public class ReactionConstraintAnalysis extends PortDelayAnalysis {

	private Time upper;
	private Time lower;

	@Override
	public Class<? extends Constraint> getConstraintClass() {
		return ReactionConstraint.class;
	}

	/**
	 * Should never be used. Default Constructor for the Analysis Framework
	 */
	public ReactionConstraintAnalysis() {
	}

	public ReactionConstraintAnalysis(Time lower, Time upper) {
		this.lower = lower;
		this.upper = upper;
	}

	public ArrayList<ConstraintValidation> check(ArrayList<Event> stimuli, ArrayList<Event> responses, IProgressMonitor progress) {
		ArrayList<ConstraintValidation> validationList = new ArrayList<ConstraintValidation>();

		/*
		 * progressWork 1 and 2 are used to estimate the amount of work done per loop
		 */
		int progressWork1, progressWork2;
		progressWork1 = 1 + ( WORK_PER_LOOP /stimuli.size() );
		progress.subTask(UI_MESSAGE_ANALYSISSTARTED);

		for (Event e : stimuli) {

			ArrayList<Time> stimuliTimeList = e.getDynamics();

			progressWork2 = 1 + ( progressWork1/stimuliTimeList.size() );

			for (Time t : stimuliTimeList)
			{
				ConstraintValidation theValidation = TimingspecificationFactory.eINSTANCE.createConstraintValidation();
				if(t.getTimeUnit() == AnalysisUtil.TIMEUNIT) {
				    theValidation.setStarttime(t.getValue());
				} else {
				    theValidation.setStarttime(Time.convertToUnit(AnalysisUtil.TIMEUNIT, t.getTimeUnit(), t.getValue()));
				}



				for (Event r : responses)
				{
					ArrayList<Time> responseTimeList = r.getDynamics();

					for (Time u : responseTimeList)
					{
						if ((t.add(this.lower).compareTo(u) <= 0) && (t.add(this.upper).compareTo(u) >= 0)) {
							if(u.getTimeUnit() == AnalysisUtil.TIMEUNIT) {
							    theValidation.setEndtime(u.getValue());
							} else {
							    theValidation.setEndtime(Time.convertToUnit(AnalysisUtil.TIMEUNIT, u.getTimeUnit(), u.getValue()));
							}


							theValidation.setSatisfied(true);
							break;
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

			if(progress.isCanceled()) {
			    break;
			}
		}
		return validationList;
	}

	@Override
	protected ArrayList<ConstraintValidation> check(ArrayList<Event> stimuli, ArrayList<Event> responses, DelayConstraint constraint, IProgressMonitor progress) {
		this.init(constraint);
		return this.check(stimuli, responses, progress);
	}

	private void init(DelayConstraint constraint) {
		this.upper = AnalysisUtil.getTime(constraint.getMaximumLatency());
		this.lower = AnalysisUtil.getTime(constraint.getMinimumLatency());
	}
}
