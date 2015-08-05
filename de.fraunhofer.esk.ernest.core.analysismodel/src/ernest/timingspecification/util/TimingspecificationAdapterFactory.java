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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ernest.timingspecification.TimingspecificationPackage
 * @generated
 */
public class TimingspecificationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TimingspecificationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingspecificationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TimingspecificationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingspecificationSwitch<Adapter> modelSwitch =
		new TimingspecificationSwitch<Adapter>() {
			@Override
			public Adapter caseDelayConstraint(DelayConstraint object) {
				return createDelayConstraintAdapter();
			}
			@Override
			public Adapter caseTimingModel(TimingModel object) {
				return createTimingModelAdapter();
			}
			@Override
			public Adapter caseAgeTimingConstraint(AgeTimingConstraint object) {
				return createAgeTimingConstraintAdapter();
			}
			@Override
			public Adapter caseReactionConstraint(ReactionConstraint object) {
				return createReactionConstraintAdapter();
			}
			@Override
			public Adapter caseInputSynchronizationConstraint(InputSynchronizationConstraint object) {
				return createInputSynchronizationConstraintAdapter();
			}
			@Override
			public Adapter caseOutputSynchronizationConstraint(OutputSynchronizationConstraint object) {
				return createOutputSynchronizationConstraintAdapter();
			}
			@Override
			public Adapter caseEventConstraint(EventConstraint object) {
				return createEventConstraintAdapter();
			}
			@Override
			public Adapter casePeriodicRepetitionConstraint(PeriodicRepetitionConstraint object) {
				return createPeriodicRepetitionConstraintAdapter();
			}
			@Override
			public Adapter caseSporadicRepetitionConstraint(SporadicRepetitionConstraint object) {
				return createSporadicRepetitionConstraintAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseConstraintValidation(ConstraintValidation object) {
				return createConstraintValidationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.DelayConstraint <em>Delay Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.DelayConstraint
	 * @generated
	 */
	public Adapter createDelayConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.TimingModel <em>Timing Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.TimingModel
	 * @generated
	 */
	public Adapter createTimingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.AgeTimingConstraint <em>Age Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.AgeTimingConstraint
	 * @generated
	 */
	public Adapter createAgeTimingConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.ReactionConstraint <em>Reaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.ReactionConstraint
	 * @generated
	 */
	public Adapter createReactionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.InputSynchronizationConstraint <em>Input Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.InputSynchronizationConstraint
	 * @generated
	 */
	public Adapter createInputSynchronizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.OutputSynchronizationConstraint <em>Output Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.OutputSynchronizationConstraint
	 * @generated
	 */
	public Adapter createOutputSynchronizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.EventConstraint <em>Event Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.EventConstraint
	 * @generated
	 */
	public Adapter createEventConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.PeriodicRepetitionConstraint <em>Periodic Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.PeriodicRepetitionConstraint
	 * @generated
	 */
	public Adapter createPeriodicRepetitionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.SporadicRepetitionConstraint <em>Sporadic Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.SporadicRepetitionConstraint
	 * @generated
	 */
	public Adapter createSporadicRepetitionConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ernest.timingspecification.ConstraintValidation <em>Constraint Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ernest.timingspecification.ConstraintValidation
	 * @generated
	 */
	public Adapter createConstraintValidationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TimingspecificationAdapterFactory
