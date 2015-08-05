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

import ernest.timingspecification.DelayConstraint;
import ernest.timingspecification.TimingspecificationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delay Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.impl.DelayConstraintImpl#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.DelayConstraintImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.DelayConstraintImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.DelayConstraintImpl#getMinimumLatency <em>Minimum Latency</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.DelayConstraintImpl#getMaximumLatency <em>Maximum Latency</em>}</li>
 *   <li>{@link ernest.timingspecification.impl.DelayConstraintImpl#getNominalLatency <em>Nominal Latency</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DelayConstraintImpl extends ConstraintImpl implements DelayConstraint {
	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> stimulus;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> response;

	/**
	 * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final double ELAPSED_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected double elapsedTime = ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumLatency() <em>Minimum Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLatency()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_LATENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumLatency() <em>Minimum Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumLatency()
	 * @generated
	 * @ordered
	 */
	protected double minimumLatency = MINIMUM_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumLatency() <em>Maximum Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLatency()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_LATENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumLatency() <em>Maximum Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLatency()
	 * @generated
	 * @ordered
	 */
	protected double maximumLatency = MAXIMUM_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalLatency() <em>Nominal Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLatency()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_LATENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalLatency() <em>Nominal Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLatency()
	 * @generated
	 * @ordered
	 */
	protected double nominalLatency = NOMINAL_LATENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelayConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingspecificationPackage.Literals.DELAY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getStimulus() {
		if (stimulus == null) {
			stimulus = new EObjectResolvingEList<Port>(Port.class, this, TimingspecificationPackage.DELAY_CONSTRAINT__STIMULUS);
		}
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getResponse() {
		if (response == null) {
			response = new EObjectResolvingEList<Port>(Port.class, this, TimingspecificationPackage.DELAY_CONSTRAINT__RESPONSE);
		}
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElapsedTime(double newElapsedTime) {
		double oldElapsedTime = elapsedTime;
		elapsedTime = newElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.DELAY_CONSTRAINT__ELAPSED_TIME, oldElapsedTime, elapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumLatency() {
		return minimumLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumLatency(double newMinimumLatency) {
		double oldMinimumLatency = minimumLatency;
		minimumLatency = newMinimumLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.DELAY_CONSTRAINT__MINIMUM_LATENCY, oldMinimumLatency, minimumLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumLatency() {
		return maximumLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumLatency(double newMaximumLatency) {
		double oldMaximumLatency = maximumLatency;
		maximumLatency = newMaximumLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.DELAY_CONSTRAINT__MAXIMUM_LATENCY, oldMaximumLatency, maximumLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalLatency() {
		return nominalLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalLatency(double newNominalLatency) {
		double oldNominalLatency = nominalLatency;
		nominalLatency = newNominalLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingspecificationPackage.DELAY_CONSTRAINT__NOMINAL_LATENCY, oldNominalLatency, nominalLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingspecificationPackage.DELAY_CONSTRAINT__STIMULUS:
				return getStimulus();
			case TimingspecificationPackage.DELAY_CONSTRAINT__RESPONSE:
				return getResponse();
			case TimingspecificationPackage.DELAY_CONSTRAINT__ELAPSED_TIME:
				return getElapsedTime();
			case TimingspecificationPackage.DELAY_CONSTRAINT__MINIMUM_LATENCY:
				return getMinimumLatency();
			case TimingspecificationPackage.DELAY_CONSTRAINT__MAXIMUM_LATENCY:
				return getMaximumLatency();
			case TimingspecificationPackage.DELAY_CONSTRAINT__NOMINAL_LATENCY:
				return getNominalLatency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TimingspecificationPackage.DELAY_CONSTRAINT__STIMULUS:
				getStimulus().clear();
				getStimulus().addAll((Collection<? extends Port>)newValue);
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__RESPONSE:
				getResponse().clear();
				getResponse().addAll((Collection<? extends Port>)newValue);
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__ELAPSED_TIME:
				setElapsedTime((Double)newValue);
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__MINIMUM_LATENCY:
				setMinimumLatency((Double)newValue);
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__MAXIMUM_LATENCY:
				setMaximumLatency((Double)newValue);
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__NOMINAL_LATENCY:
				setNominalLatency((Double)newValue);
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
			case TimingspecificationPackage.DELAY_CONSTRAINT__STIMULUS:
				getStimulus().clear();
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__RESPONSE:
				getResponse().clear();
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__ELAPSED_TIME:
				setElapsedTime(ELAPSED_TIME_EDEFAULT);
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__MINIMUM_LATENCY:
				setMinimumLatency(MINIMUM_LATENCY_EDEFAULT);
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__MAXIMUM_LATENCY:
				setMaximumLatency(MAXIMUM_LATENCY_EDEFAULT);
				return;
			case TimingspecificationPackage.DELAY_CONSTRAINT__NOMINAL_LATENCY:
				setNominalLatency(NOMINAL_LATENCY_EDEFAULT);
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
			case TimingspecificationPackage.DELAY_CONSTRAINT__STIMULUS:
				return stimulus != null && !stimulus.isEmpty();
			case TimingspecificationPackage.DELAY_CONSTRAINT__RESPONSE:
				return response != null && !response.isEmpty();
			case TimingspecificationPackage.DELAY_CONSTRAINT__ELAPSED_TIME:
				return elapsedTime != ELAPSED_TIME_EDEFAULT;
			case TimingspecificationPackage.DELAY_CONSTRAINT__MINIMUM_LATENCY:
				return minimumLatency != MINIMUM_LATENCY_EDEFAULT;
			case TimingspecificationPackage.DELAY_CONSTRAINT__MAXIMUM_LATENCY:
				return maximumLatency != MAXIMUM_LATENCY_EDEFAULT;
			case TimingspecificationPackage.DELAY_CONSTRAINT__NOMINAL_LATENCY:
				return nominalLatency != NOMINAL_LATENCY_EDEFAULT;
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
		result.append(" (elapsedTime: ");
		result.append(elapsedTime);
		result.append(", minimumLatency: ");
		result.append(minimumLatency);
		result.append(", maximumLatency: ");
		result.append(maximumLatency);
		result.append(", nominalLatency: ");
		result.append(nominalLatency);
		result.append(')');
		return result.toString();
	}

} //DelayConstraintImpl
