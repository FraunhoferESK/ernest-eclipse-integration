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

import ernest.architecture.Port;

import ernest.timingspecification.EventConstraint;
import ernest.timingspecification.TimingspecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.impl.EventConstraintImpl#getPort <em>Port</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.EventConstraintImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.EventConstraintImpl#getJitter <em>Jitter</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.EventConstraintImpl#getMinimumInterarrivalTime <em>Minimum Interarrival Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventConstraintImpl extends ConstraintImpl implements EventConstraint {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected double period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getJitter() <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected static final double JITTER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected double jitter = JITTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumInterarrivalTime() <em>Minimum Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumInterarrivalTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_INTERARRIVAL_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumInterarrivalTime() <em>Minimum Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumInterarrivalTime()
	 * @generated
	 * @ordered
	 */
	protected double minimumInterarrivalTime = MINIMUM_INTERARRIVAL_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingspecificationPackage.Literals.EVENT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingspecificationPackage.EVENT_CONSTRAINT__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.EVENT_CONSTRAINT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(double newPeriod) {
		double oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.EVENT_CONSTRAINT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(double newJitter) {
		double oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.EVENT_CONSTRAINT__JITTER, oldJitter, jitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumInterarrivalTime() {
		return minimumInterarrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumInterarrivalTime(double newMinimumInterarrivalTime) {
		double oldMinimumInterarrivalTime = minimumInterarrivalTime;
		minimumInterarrivalTime = newMinimumInterarrivalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME, oldMinimumInterarrivalTime, minimumInterarrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingspecificationPackage.EVENT_CONSTRAINT__PORT:
				if (resolve) return getPort();
				return basicGetPort();
			case TimingspecificationPackage.EVENT_CONSTRAINT__PERIOD:
				return getPeriod();
			case TimingspecificationPackage.EVENT_CONSTRAINT__JITTER:
				return getJitter();
			case TimingspecificationPackage.EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME:
				return getMinimumInterarrivalTime();
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
			case TimingspecificationPackage.EVENT_CONSTRAINT__PORT:
				setPort((Port)newValue);
				return;
			case TimingspecificationPackage.EVENT_CONSTRAINT__PERIOD:
				setPeriod((Double)newValue);
				return;
			case TimingspecificationPackage.EVENT_CONSTRAINT__JITTER:
				setJitter((Double)newValue);
				return;
			case TimingspecificationPackage.EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME:
				setMinimumInterarrivalTime((Double)newValue);
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
			case TimingspecificationPackage.EVENT_CONSTRAINT__PORT:
				setPort((Port)null);
				return;
			case TimingspecificationPackage.EVENT_CONSTRAINT__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case TimingspecificationPackage.EVENT_CONSTRAINT__JITTER:
				setJitter(JITTER_EDEFAULT);
				return;
			case TimingspecificationPackage.EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME:
				setMinimumInterarrivalTime(MINIMUM_INTERARRIVAL_TIME_EDEFAULT);
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
			case TimingspecificationPackage.EVENT_CONSTRAINT__PORT:
				return port != null;
			case TimingspecificationPackage.EVENT_CONSTRAINT__PERIOD:
				return period != PERIOD_EDEFAULT;
			case TimingspecificationPackage.EVENT_CONSTRAINT__JITTER:
				return jitter != JITTER_EDEFAULT;
			case TimingspecificationPackage.EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME:
				return minimumInterarrivalTime != MINIMUM_INTERARRIVAL_TIME_EDEFAULT;
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
		result.append(" (period: ");
		result.append(period);
		result.append(", jitter: ");
		result.append(jitter);
		result.append(", minimumInterarrivalTime: ");
		result.append(minimumInterarrivalTime);
		result.append(')');
		return result.toString();
	}

} //EventConstraintImpl
