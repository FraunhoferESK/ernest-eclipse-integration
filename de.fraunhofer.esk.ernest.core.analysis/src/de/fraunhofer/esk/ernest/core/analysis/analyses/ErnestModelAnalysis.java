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
import java.util.Map;
import java.util.SortedSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

import de.fraunhofer.esk.ernest.core.analysis.DefinedConstants;
import de.fraunhofer.esk.ernest.core.analysis.analyses.port.PortAnalysis;
import de.fraunhofer.esk.ernest.core.analysis.analyses.portdelay.PortDelayAnalysis;
import de.fraunhofer.esk.ernest.core.analysis.framework.interfaces.AnalysisException;
import ernest.Model;
import ernest.architecture.Port;
import ernest.impl.ModelImpl;
import ernest.timingspecification.Constraint;
import ernest.timingspecification.ConstraintValidation;

/**
 * Base class for running an Analysis on an ERNEST model.
 * <p>
 * Includes Error Handling on load, so throws a {@link LoadAnalysisException}
 * when:
 * <li>the model is not an ERNEST model</li>
 * <li>the model has no TimingSpecifications, TracingResults or AnalysisSpecifications</li>
 * <p>
 * <br>
 * As long as no error occurred the components of the model will be loaded and
 * are accessible through predefined getter methods.<br>
 * <br>
 * Furthermore iterates through the constraint list of the model and executes
 * {@link #analyseConstraint(AnalysisConstraint)} for every constraint that
 * matches the class definition of {@link #getConstraintClass()} which is
 * implemented in subclasses.
 * <p>
 * <br>
 * Current Subclasses are:<br>
 * <br>
 * <b>
 * <li>PortDelayAnalysis</li>
 * <li>PortAnalysis</li>
 * </b> <br>
 * <br>
 *
 * @see PortDelayAnalysis
 * @see PortAnalysis
 *
 */
public abstract class ErnestModelAnalysis extends GenericModelAnalysis implements DefinedConstants {
	private Model model = null;
	private Map<Port, ? extends SortedSet<Long>> occurrencesMap = null;
	private EList<Constraint> constraints = null;

	/**
	 * Analyses a single constraint.
	 * <p>
	 * Subclasses have to override this.<br>
	 * Will be called in {@link #analyse(AnalysisProgress progress)} for every
	 * fitting constraint that is found.
	 *
	 * @param constraint
	 *            constraint that will be analysed
	 * @return true if the analysis was successful, false if it failed
	 * @throws AnalysisException
	 */
	protected abstract ArrayList<ConstraintValidation> analyseConstraint(Constraint constraint, IProgressMonitor progress) throws AnalysisException;

	/**
	 * Returns a Class Object of a valid Constraint in the ERNEST Model.
	 * <p>
	 * Only the returned constraint will be analysed in the model.
	 * <p>
	 * <b>Subclasses need to override this method and provide a valid Constraint
	 * as return value.</b>
	 *
	 * @return the class object of the constraint in the ERNEST Model
	 * @see AnalysisConstraint
	 */
	public abstract Class<? extends Constraint> getConstraintClass();

	protected Model getModel() {
		return this.model;
	}

	protected Map<Port, ? extends SortedSet<Long>> getOccurrences() {
		return this.occurrencesMap;
	}

	protected EList<Constraint> getConstraints() {
		return this.constraints;
	}

	@Override
	public void preAnalyse(Object obj, IProgressMonitor monitor) throws AnalysisException {
		super.preAnalyse(obj, monitor);

		// First we must be sure that the model in the resource is a correct ERNEST model
		if (!(this.getModelResource().getContents().get(0) instanceof Model)) {
		    throw new AnalysisException(String.format(UI_EXCEPTION_MODELCAST, obj.toString()));
		}

		// Now extract the model from the resource
		this.model = (ModelImpl) this.getModelResource().getContents().get(0);

		// store the references for convenient access
		this.occurrencesMap = AnalysisUtil.getEventOccurrences(this.model);
		this.constraints = AnalysisUtil.getConstraints(this.model);

		/*
		 * Time to check the structure of the model. An Analysis needs the
		 * following structure: - List of EventOccurrences in the TracingResults
		 * (to get the dynamics for an event) - List of Constraint in the
		 * AnalysisModel (to know what to do)
		 */
		if (this.occurrencesMap == null) {
		    throw new AnalysisException(UI_EXCEPTION_LOADINGTRACING);
		}
		if (this.constraints == null) {
		    throw new AnalysisException(UI_EXCEPTION_LOADINGCONSTRAINTS);
		}

		/*
		 * Again some checks, this time for the contents. An Analysis needs the
		 * following contents: 
		 * - at least one EventOccurrence in the EventOccurrence List 
		 *   (most analyses need more than one, but can't check it here) 
		 * - at least one Constraint in the Constraint List an
		 * analysis is not possible if one of these is empty
		 */
		if (this.getOccurrences().size() <= 0) {
		    throw new AnalysisException(UI_EXCEPTION_EMPTYTRACING);
		}
		if (this.getConstraints().size() <= 0) {
		    throw new AnalysisException(UI_EXCEPTION_EMPTYCONSTRAINTS);
		}
	}

	@Override
	public boolean analyse(IProgressMonitor progress) throws AnalysisException {


		// that is the result of the whole analysis and will be returned at the end
		boolean success = true;
		// we want to know if at least one fitting constraint was found
		boolean constraintFound = false;

		/*
		 * Goes trough the Constraints list, searches for Constraints that fit
		 * the getConstraintClass method return value, get the PortDelay for the
		 * Constraint and convert the PortDelay to TADL Events
		 */
		for (Constraint constraint : this.getConstraints()) {
			// reflective instanceof check - subclasses define the ConstraintClass for which they are valid

			if (this.getConstraintClass().isInstance(constraint)) {
				constraintFound = true;
				constraint.setResult(true);

				// get the result for this particular constraint
				ArrayList<ConstraintValidation> result = this.analyseConstraint(constraint, progress);

				/*
				 * one fail is enough to let the whole analysis fail, remember
				 * it, but continue the analysis, so we get through all the
				 * constraints and are able to see how much and what failed.
				 */
				constraint.getConstValid().clear();
				constraint.getConstValid().addAll(result);
				for (ConstraintValidation valid : result) {
					if (!valid.isSatisfied()) {
						constraint.setResult(false);
						success = false;
						break;
					}
					if(progress.isCanceled()) {
					    break;
					}
				}
			}

			if(progress.isCanceled()) {
			    throw new AnalysisException(UI_EXCEPTION_CANCELED);
			}
		}
		// in case there was no appropriate constraint for the analysis, this error will be shown.
		if (!constraintFound) {
		    throw new AnalysisException(UI_EXCEPTION_NOCONSTRAINTFITTING);
		}

		return success;
	}
}
