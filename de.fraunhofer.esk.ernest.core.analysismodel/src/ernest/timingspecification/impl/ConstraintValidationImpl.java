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

import ernest.timingspecification.ConstraintValidation;
import ernest.timingspecification.TimingspecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.impl.ConstraintValidationImpl#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.ConstraintValidationImpl#getStarttime <em>Starttime</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.ConstraintValidationImpl#getEndtime <em>Endtime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintValidationImpl extends MinimalEObjectImpl.Container implements ConstraintValidation {
	/**
	 * The default value of the '{@link #isSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATISFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected boolean satisfied = SATISFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStarttime() <em>Starttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarttime()
	 * @generated
	 * @ordered
	 */
	protected static final double STARTTIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStarttime() <em>Starttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarttime()
	 * @generated
	 * @ordered
	 */
	protected double starttime = STARTTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndtime() <em>Endtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndtime()
	 * @generated
	 * @ordered
	 */
	protected static final double ENDTIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEndtime() <em>Endtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndtime()
	 * @generated
	 * @ordered
	 */
	protected double endtime = ENDTIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintValidationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingspecificationPackage.Literals.CONSTRAINT_VALIDATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfied() {
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfied(boolean newSatisfied) {
		boolean oldSatisfied = satisfied;
		satisfied = newSatisfied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.CONSTRAINT_VALIDATION__SATISFIED, oldSatisfied, satisfied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStarttime() {
		return starttime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarttime(double newStarttime) {
		double oldStarttime = starttime;
		starttime = newStarttime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.CONSTRAINT_VALIDATION__STARTTIME, oldStarttime, starttime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEndtime() {
		return endtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndtime(double newEndtime) {
		double oldEndtime = endtime;
		endtime = newEndtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.CONSTRAINT_VALIDATION__ENDTIME, oldEndtime, endtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__SATISFIED:
				return isSatisfied();
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__STARTTIME:
				return getStarttime();
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__ENDTIME:
				return getEndtime();
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
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__SATISFIED:
				setSatisfied((Boolean)newValue);
				return;
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__STARTTIME:
				setStarttime((Double)newValue);
				return;
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__ENDTIME:
				setEndtime((Double)newValue);
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
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__SATISFIED:
				setSatisfied(SATISFIED_EDEFAULT);
				return;
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__STARTTIME:
				setStarttime(STARTTIME_EDEFAULT);
				return;
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__ENDTIME:
				setEndtime(ENDTIME_EDEFAULT);
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
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__SATISFIED:
				return satisfied != SATISFIED_EDEFAULT;
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__STARTTIME:
				return starttime != STARTTIME_EDEFAULT;
			case TimingspecificationPackage.CONSTRAINT_VALIDATION__ENDTIME:
				return endtime != ENDTIME_EDEFAULT;
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
		result.append(" (satisfied: ");
		result.append(satisfied);
		result.append(", starttime: ");
		result.append(starttime);
		result.append(", endtime: ");
		result.append(endtime);
		result.append(')');
		return result.toString();
	}

} //ConstraintValidationImpl
