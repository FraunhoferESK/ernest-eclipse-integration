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

import ernest.timingspecification.SporadicRepetitionConstraint;
import ernest.timingspecification.TimingspecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sporadic Repetition Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.impl.SporadicRepetitionConstraintImpl#getMaximumInterarrivalTime <em>Maximum Interarrival Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SporadicRepetitionConstraintImpl extends EventConstraintImpl implements SporadicRepetitionConstraint {
	/**
	 * The default value of the '{@link #getMaximumInterarrivalTime() <em>Maximum Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumInterarrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_INTERARRIVAL_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumInterarrivalTime() <em>Maximum Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumInterarrivalTime()
	 * @generated
	 * @ordered
	 */
	protected double maximumInterarrivalTime = MAXIMUM_INTERARRIVAL_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SporadicRepetitionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingspecificationPackage.Literals.SPORADIC_REPETITION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumInterarrivalTime() {
		return maximumInterarrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumInterarrivalTime(double newMaximumInterarrivalTime) {
		double oldMaximumInterarrivalTime = maximumInterarrivalTime;
		maximumInterarrivalTime = newMaximumInterarrivalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.SPORADIC_REPETITION_CONSTRAINT__MAXIMUM_INTERARRIVAL_TIME, oldMaximumInterarrivalTime, maximumInterarrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingspecificationPackage.SPORADIC_REPETITION_CONSTRAINT__MAXIMUM_INTERARRIVAL_TIME:
				return getMaximumInterarrivalTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingspecificationPackage.SPORADIC_REPETITION_CONSTRAINT__MAXIMUM_INTERARRIVAL_TIME:
				setMaximumInterarrivalTime((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TimingspecificationPackage.SPORADIC_REPETITION_CONSTRAINT__MAXIMUM_INTERARRIVAL_TIME:
				setMaximumInterarrivalTime(MAXIMUM_INTERARRIVAL_TIME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TimingspecificationPackage.SPORADIC_REPETITION_CONSTRAINT__MAXIMUM_INTERARRIVAL_TIME:
				return maximumInterarrivalTime != MAXIMUM_INTERARRIVAL_TIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (maximumInterarrivalTime: ");
		result.append(maximumInterarrivalTime);
		result.append(')');
		return result.toString();
	}

} //SporadicRepetitionConstraintImpl
