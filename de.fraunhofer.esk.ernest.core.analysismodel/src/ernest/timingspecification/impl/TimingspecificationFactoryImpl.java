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
package ernest.timingspecification.impl;

import ernest.timingspecification.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingspecificationFactoryImpl extends EFactoryImpl implements TimingspecificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TimingspecificationFactory init() {
		try {
			TimingspecificationFactory theTimingspecificationFactory = (TimingspecificationFactory)EPackage.Registry.INSTANCE.getEFactory(TimingspecificationPackage.eNS_URI);
			if (theTimingspecificationFactory != null) {
				return theTimingspecificationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TimingspecificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingspecificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TimingspecificationPackage.TIMING_MODEL: return createTimingModel();
			case TimingspecificationPackage.AGE_TIMING_CONSTRAINT: return createAgeTimingConstraint();
			case TimingspecificationPackage.REACTION_CONSTRAINT: return createReactionConstraint();
			case TimingspecificationPackage.INPUT_SYNCHRONIZATION_CONSTRAINT: return createInputSynchronizationConstraint();
			case TimingspecificationPackage.OUTPUT_SYNCHRONIZATION_CONSTRAINT: return createOutputSynchronizationConstraint();
			case TimingspecificationPackage.PERIODIC_REPETITION_CONSTRAINT: return createPeriodicRepetitionConstraint();
			case TimingspecificationPackage.SPORADIC_REPETITION_CONSTRAINT: return createSporadicRepetitionConstraint();
			case TimingspecificationPackage.CONSTRAINT_VALIDATION: return createConstraintValidation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingModel createTimingModel() {
		TimingModelImpl timingModel = new TimingModelImpl();
		return timingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeTimingConstraint createAgeTimingConstraint() {
		AgeTimingConstraintImpl ageTimingConstraint = new AgeTimingConstraintImpl();
		return ageTimingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionConstraint createReactionConstraint() {
		ReactionConstraintImpl reactionConstraint = new ReactionConstraintImpl();
		return reactionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSynchronizationConstraint createInputSynchronizationConstraint() {
		InputSynchronizationConstraintImpl inputSynchronizationConstraint = new InputSynchronizationConstraintImpl();
		return inputSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSynchronizationConstraint createOutputSynchronizationConstraint() {
		OutputSynchronizationConstraintImpl outputSynchronizationConstraint = new OutputSynchronizationConstraintImpl();
		return outputSynchronizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicRepetitionConstraint createPeriodicRepetitionConstraint() {
		PeriodicRepetitionConstraintImpl periodicRepetitionConstraint = new PeriodicRepetitionConstraintImpl();
		return periodicRepetitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicRepetitionConstraint createSporadicRepetitionConstraint() {
		SporadicRepetitionConstraintImpl sporadicRepetitionConstraint = new SporadicRepetitionConstraintImpl();
		return sporadicRepetitionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintValidation createConstraintValidation() {
		ConstraintValidationImpl constraintValidation = new ConstraintValidationImpl();
		return constraintValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingspecificationPackage getTimingspecificationPackage() {
		return (TimingspecificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TimingspecificationPackage getPackage() {
		return TimingspecificationPackage.eINSTANCE;
	}

} //TimingspecificationFactoryImpl
