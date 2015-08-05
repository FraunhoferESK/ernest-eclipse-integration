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
package ernest.timingspecification.util;

import ernest.timingspecification.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ernest.timingspecification.TimingspecificationPackage
 * @generated
 */
public class TimingspecificationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimingspecificationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingspecificationSwitch() {
		if (modelPackage == null) {
			modelPackage = TimingspecificationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TimingspecificationPackage.DELAY_CONSTRAINT: {
				DelayConstraint delayConstraint = (DelayConstraint)theEObject;
				T result = caseDelayConstraint(delayConstraint);
				if (result == null) result = caseConstraint(delayConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.TIMING_MODEL: {
				TimingModel timingModel = (TimingModel)theEObject;
				T result = caseTimingModel(timingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.AGE_TIMING_CONSTRAINT: {
				AgeTimingConstraint ageTimingConstraint = (AgeTimingConstraint)theEObject;
				T result = caseAgeTimingConstraint(ageTimingConstraint);
				if (result == null) result = caseDelayConstraint(ageTimingConstraint);
				if (result == null) result = caseConstraint(ageTimingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.REACTION_CONSTRAINT: {
				ReactionConstraint reactionConstraint = (ReactionConstraint)theEObject;
				T result = caseReactionConstraint(reactionConstraint);
				if (result == null) result = caseDelayConstraint(reactionConstraint);
				if (result == null) result = caseConstraint(reactionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.INPUT_SYNCHRONIZATION_CONSTRAINT: {
				InputSynchronizationConstraint inputSynchronizationConstraint = (InputSynchronizationConstraint)theEObject;
				T result = caseInputSynchronizationConstraint(inputSynchronizationConstraint);
				if (result == null) result = caseAgeTimingConstraint(inputSynchronizationConstraint);
				if (result == null) result = caseDelayConstraint(inputSynchronizationConstraint);
				if (result == null) result = caseConstraint(inputSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT: {
				OutputSynchronizationConstraint outputSynchronizationConstraint = (OutputSynchronizationConstraint)theEObject;
				T result = caseOutputSynchronizationConstraint(outputSynchronizationConstraint);
				if (result == null) result = caseAgeTimingConstraint(outputSynchronizationConstraint);
				if (result == null) result = caseDelayConstraint(outputSynchronizationConstraint);
				if (result == null) result = caseConstraint(outputSynchronizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.EVENT_CONSTRAINT: {
				EventConstraint eventConstraint = (EventConstraint)theEObject;
				T result = caseEventConstraint(eventConstraint);
				if (result == null) result = caseConstraint(eventConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.PERIODIC_REPETITION_CONSTRAINT: {
				PeriodicRepetitionConstraint periodicRepetitionConstraint = (PeriodicRepetitionConstraint)theEObject;
				T result = casePeriodicRepetitionConstraint(periodicRepetitionConstraint);
				if (result == null) result = caseEventConstraint(periodicRepetitionConstraint);
				if (result == null) result = caseConstraint(periodicRepetitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.SPORADIC_REPETITION_CONSTRAINT: {
				SporadicRepetitionConstraint sporadicRepetitionConstraint = (SporadicRepetitionConstraint)theEObject;
				T result = caseSporadicRepetitionConstraint(sporadicRepetitionConstraint);
				if (result == null) result = caseEventConstraint(sporadicRepetitionConstraint);
				if (result == null) result = caseConstraint(sporadicRepetitionConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TimingspecificationPackage.CONSTRAINT_VALIDATION: {
				ConstraintValidation constraintValidation = (ConstraintValidation)theEObject;
				T result = caseConstraintValidation(constraintValidation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delay Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayConstraint(DelayConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingModel(TimingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age Timing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age Timing Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgeTimingConstraint(AgeTimingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactionConstraint(ReactionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputSynchronizationConstraint(InputSynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Synchronization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputSynchronizationConstraint(OutputSynchronizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventConstraint(EventConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Repetition Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicRepetitionConstraint(PeriodicRepetitionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic Repetition Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadicRepetitionConstraint(SporadicRepetitionConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintValidation(ConstraintValidation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TimingspecificationSwitch
