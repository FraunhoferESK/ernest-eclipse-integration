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
package de.fraunhofer.esk.ernest.core.analysis.analyses;

import java.util.ArrayList;

import ernest.timingspecification.ConstraintValidation;
import ernest.timingspecification.TimingspecificationFactory;


/**
 * Class representing the TADL generic repetition constraint. Every derived
 * constraint can be reduced to generic repetition constraints.
 *
 */

public class GenericRepetitionConstraint {
	private Time lower;
	private Time upper;
	private Time jitter;
	private int span;

	/**
	 * Allocate a (@code GenericRepetitionConstraint} object that is initialized
	 * with the values supplied as arguments. The value of span is set to 1.
	 *
	 * @param lower
	 *            a lower bound on the distance between occurrences
	 * @param upper
	 *            a upper bound on the distance between occurrences
	 * @param jitter
	 *            the deviation from an ideal point accepted at each occurrence
	 * @param span
	 *            a count indicating whether it is subsequent occurrences or
	 *            occurrences farther apart that are constrained
	 */
	public GenericRepetitionConstraint(Time lower, Time upper, Time jitter, int span) {
		this.lower = lower;
		this.upper = upper;
		this.jitter = jitter;
		this.span = span;
	}

	/**
	 * Allocate a (@code GenericRepetitionConstraint} object that is initialized
	 * with the values supplied as arguments. The value of span is set to 1.
	 *
	 * @param lower
	 *            a lower bound on the distance between occurrences
	 * @param upper
	 *            a upper bound on the distance between occurrences
	 * @param jitter
	 *            the deviation from an ideal point accepted at each occurrence
	 */
	public GenericRepetitionConstraint(Time lower, Time upper, Time jitter) {
		this(lower, upper, jitter, 1);
	}

	/**
	 * Allocates a {@code GenericRepeitionConstraint} object that is initialized
	 * with default values according to TADL specification. lower = 0, upper =
	 * infinity, jitter = 0, span = 1
	 */
	GenericRepetitionConstraint() {
		this(Time.ZERO, Time.INFINITY, Time.ZERO, 1);
	}

	/**
	 * Performs a check if the given Event conforms to the constraint defined.
	 *
	 * @param event
	 *            the event to check against the defined constraints
	 * @return
	 */
	public ArrayList<ConstraintValidation> check(Event event) {
		ArrayList<ConstraintValidation> validationList = new ArrayList<ConstraintValidation>();
		Time[] a = new Time[event.getDynamics().size() + 1];
		Time[] b = new Time[event.getDynamics().size() + 1];

		/*
		 * we start at index 1 and let 0 be null, this way it is easier to
		 * understand the algorithm (verification procedure is exactly like in
		 * the TIMMO TADL specifications)
		 */
		int position = 1;

		// Get every time value of the event
		for (Time t : event.getDynamics()) {
			ConstraintValidation theValidation = TimingspecificationFactory.eINSTANCE.createConstraintValidation();
			theValidation.setSatisfied(true);
			if(t.getTimeUnit() == AnalysisUtil.TIMEUNIT) {
				theValidation.setStarttime(t.getValue());
				theValidation.setEndtime(t.getValue());
			} else {
				theValidation.setStarttime(Time.convertToUnit(AnalysisUtil.TIMEUNIT, t.getTimeUnit(), t.getValue()));
				theValidation.setEndtime(Time.convertToUnit(AnalysisUtil.TIMEUNIT, t.getTimeUnit(), t.getValue()));
			}

			a[position] = t.substract(this.jitter);
			b[position] = t.clone();

			if (position > this.span) {
				a[position] = Time.max(a[position], a[position - this.span].add(this.lower));
				b[position] = Time.min(b[position], b[position - this.span].add(this.upper));

				// if a_current > b_current the constraint is violated
				if (!(a[position].compareTo(b[position]) <= 0)) {
					System.out.print("[a" + position + " .. b" + position + "]" + "    ");
					System.out.println("[" + a[position].getValue() + " .. " + b[position].getValue() + "]");
					theValidation.setSatisfied(false);
				}
			}
			System.out.print("[a" + position + " .. b" + position + "]" + "    ");
			System.out.println("[" + a[position].getValue() + " .. " + b[position].getValue() + "]");

			++position;
			validationList.add(theValidation);
		}

		return validationList;
	}

	/**
	 * Get the lower bound of the constraint.
	 *
	 * @return lower bound of the constraint
	 */
	Time getLower() {
		return this.lower;
	}

	/**
	 * Sets the lower bound of the constraint.
	 *
	 * @param lower
	 *            the new lower bound of the constraint
	 */
	void setLower(Time lower) {
		this.lower = lower;
	}

	/**
	 * Get the upper bound of the constraint.
	 *
	 * @return upper bound of the constraint
	 */
	Time getUpper() {
		return this.upper;
	}

	/**
	 * Sets the upper bound of the constraint.
	 *
	 * @param upper
	 *            the new upper bound of the constraint
	 */
	void setUpper(Time upper) {
		this.upper = upper;
	}

	/**
	 * Get the jitter of the constraint.
	 *
	 * @return jitter of the constraint
	 */
	Time getJitter() {
		return this.jitter;
	}

	/**
	 * Sets the jitter of the constraint.
	 *
	 * @param jitter
	 *            the new jitter of the constraint
	 */
	void setJitter(Time jitter) {
		this.jitter = jitter;
	}

	/**
	 * Get the span of the constraint.
	 *
	 * @return span of the constraint
	 */
	int getSpan() {
		return this.span;
	}

	/**
	 * Sets the span of the constraint.
	 *
	 * @param jitter
	 *            the new span of the constraint
	 */
	void setSpan(int span) {
		this.span = span;
	}
}
