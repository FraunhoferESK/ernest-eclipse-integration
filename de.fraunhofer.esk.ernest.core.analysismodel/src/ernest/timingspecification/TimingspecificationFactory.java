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
package ernest.timingspecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ernest.timingspecification.TimingspecificationPackage
 * @generated
 */
public interface TimingspecificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingspecificationFactory eINSTANCE = ernest.timingspecification.impl.TimingspecificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Timing Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Model</em>'.
	 * @generated
	 */
	TimingModel createTimingModel();

	/**
	 * Returns a new object of class '<em>Age Timing Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Age Timing Constraint</em>'.
	 * @generated
	 */
	AgeTimingConstraint createAgeTimingConstraint();

	/**
	 * Returns a new object of class '<em>Reaction Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Constraint</em>'.
	 * @generated
	 */
	ReactionConstraint createReactionConstraint();

	/**
	 * Returns a new object of class '<em>Input Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Synchronization Constraint</em>'.
	 * @generated
	 */
	InputSynchronizationConstraint createInputSynchronizationConstraint();

	/**
	 * Returns a new object of class '<em>Output Synchronization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Synchronization Constraint</em>'.
	 * @generated
	 */
	OutputSynchronizationConstraint createOutputSynchronizationConstraint();

	/**
	 * Returns a new object of class '<em>Periodic Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Repetition Constraint</em>'.
	 * @generated
	 */
	PeriodicRepetitionConstraint createPeriodicRepetitionConstraint();

	/**
	 * Returns a new object of class '<em>Sporadic Repetition Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic Repetition Constraint</em>'.
	 * @generated
	 */
	SporadicRepetitionConstraint createSporadicRepetitionConstraint();

	/**
	 * Returns a new object of class '<em>Constraint Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Validation</em>'.
	 * @generated
	 */
	ConstraintValidation createConstraintValidation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimingspecificationPackage getTimingspecificationPackage();

} //TimingspecificationFactory
