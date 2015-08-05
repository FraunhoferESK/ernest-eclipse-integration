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
package ernest.architecture.impl;

import ernest.architecture.ArchitecturePackage;
import ernest.architecture.ECU;

import ernest.architecture.types.SchedType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.impl.ECUImpl#getSchedulerType <em>Scheduler Type</em>}</li>
 *   <li>{@link ernest.architecture.impl.ECUImpl#getPerformanceFactor <em>Performance Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECUImpl extends HWModuleImpl implements ECU {
	/**
	 * The default value of the '{@link #getSchedulerType() <em>Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerType()
	 * @generated
	 * @ordered
	 */
	protected static final SchedType SCHEDULER_TYPE_EDEFAULT = SchedType.FIXED_PRIORITY_PREEMPTIVE;

	/**
	 * The cached value of the '{@link #getSchedulerType() <em>Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulerType()
	 * @generated
	 * @ordered
	 */
	protected SchedType schedulerType = SCHEDULER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformanceFactor() <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double PERFORMANCE_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPerformanceFactor() <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceFactor()
	 * @generated
	 * @ordered
	 */
	protected double performanceFactor = PERFORMANCE_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.ECU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedType getSchedulerType() {
		return schedulerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulerType(SchedType newSchedulerType) {
		SchedType oldSchedulerType = schedulerType;
		schedulerType = newSchedulerType == null ? SCHEDULER_TYPE_EDEFAULT : newSchedulerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ECU__SCHEDULER_TYPE, oldSchedulerType, schedulerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPerformanceFactor() {
		return performanceFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceFactor(double newPerformanceFactor) {
		double oldPerformanceFactor = performanceFactor;
		performanceFactor = newPerformanceFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.ECU__PERFORMANCE_FACTOR, oldPerformanceFactor, performanceFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.ECU__SCHEDULER_TYPE:
				return getSchedulerType();
			case ArchitecturePackage.ECU__PERFORMANCE_FACTOR:
				return getPerformanceFactor();
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
			case ArchitecturePackage.ECU__SCHEDULER_TYPE:
				setSchedulerType((SchedType)newValue);
				return;
			case ArchitecturePackage.ECU__PERFORMANCE_FACTOR:
				setPerformanceFactor((Double)newValue);
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
			case ArchitecturePackage.ECU__SCHEDULER_TYPE:
				setSchedulerType(SCHEDULER_TYPE_EDEFAULT);
				return;
			case ArchitecturePackage.ECU__PERFORMANCE_FACTOR:
				setPerformanceFactor(PERFORMANCE_FACTOR_EDEFAULT);
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
			case ArchitecturePackage.ECU__SCHEDULER_TYPE:
				return schedulerType != SCHEDULER_TYPE_EDEFAULT;
			case ArchitecturePackage.ECU__PERFORMANCE_FACTOR:
				return performanceFactor != PERFORMANCE_FACTOR_EDEFAULT;
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
		result.append(" (schedulerType: ");
		result.append(schedulerType);
		result.append(", performanceFactor: ");
		result.append(performanceFactor);
		result.append(')');
		return result.toString();
	}

} //ECUImpl
