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
import ernest.architecture.Function;
import ernest.architecture.HWModule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.impl.FunctionImpl#getWcet <em>Wcet</em>}</li>
 *   <li>{@link ernest.architecture.impl.FunctionImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link ernest.architecture.impl.FunctionImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link ernest.architecture.impl.FunctionImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link ernest.architecture.impl.FunctionImpl#getAllocatedTo <em>Allocated To</em>}</li>
 *   <li>{@link ernest.architecture.impl.FunctionImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link ernest.architecture.impl.FunctionImpl#getJitter <em>Jitter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends FModuleImpl implements Function {
	/**
	 * The default value of the '{@link #getWcet() <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected static final int WCET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWcet() <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected int wcet = WCET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final int DEADLINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected int deadline = DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedTo() <em>Allocated To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<HWModule> allocatedTo;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getJitter() <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected static final int JITTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJitter() <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJitter()
	 * @generated
	 * @ordered
	 */
	protected int jitter = JITTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWcet() {
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWcet(int newWcet) {
		int oldWcet = wcet;
		wcet = newWcet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FUNCTION__WCET, oldWcet, wcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(int newDeadline) {
		int oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FUNCTION__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FUNCTION__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FUNCTION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWModule> getAllocatedTo() {
		if (allocatedTo == null) {
			allocatedTo = new EObjectResolvingEList<HWModule>(HWModule.class, this, ArchitecturePackage.FUNCTION__ALLOCATED_TO);
		}
		return allocatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FUNCTION__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJitter() {
		return jitter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJitter(int newJitter) {
		int oldJitter = jitter;
		jitter = newJitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.FUNCTION__JITTER, oldJitter, jitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.FUNCTION__WCET:
				return getWcet();
			case ArchitecturePackage.FUNCTION__DEADLINE:
				return getDeadline();
			case ArchitecturePackage.FUNCTION__PERIOD:
				return getPeriod();
			case ArchitecturePackage.FUNCTION__PRIORITY:
				return getPriority();
			case ArchitecturePackage.FUNCTION__ALLOCATED_TO:
				return getAllocatedTo();
			case ArchitecturePackage.FUNCTION__OFFSET:
				return getOffset();
			case ArchitecturePackage.FUNCTION__JITTER:
				return getJitter();
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
			case ArchitecturePackage.FUNCTION__WCET:
				setWcet((Integer)newValue);
				return;
			case ArchitecturePackage.FUNCTION__DEADLINE:
				setDeadline((Integer)newValue);
				return;
			case ArchitecturePackage.FUNCTION__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case ArchitecturePackage.FUNCTION__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case ArchitecturePackage.FUNCTION__ALLOCATED_TO:
				getAllocatedTo().clear();
				getAllocatedTo().addAll((Collection<? extends HWModule>)newValue);
				return;
			case ArchitecturePackage.FUNCTION__OFFSET:
				setOffset((Integer)newValue);
				return;
			case ArchitecturePackage.FUNCTION__JITTER:
				setJitter((Integer)newValue);
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
			case ArchitecturePackage.FUNCTION__WCET:
				setWcet(WCET_EDEFAULT);
				return;
			case ArchitecturePackage.FUNCTION__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case ArchitecturePackage.FUNCTION__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case ArchitecturePackage.FUNCTION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case ArchitecturePackage.FUNCTION__ALLOCATED_TO:
				getAllocatedTo().clear();
				return;
			case ArchitecturePackage.FUNCTION__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case ArchitecturePackage.FUNCTION__JITTER:
				setJitter(JITTER_EDEFAULT);
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
			case ArchitecturePackage.FUNCTION__WCET:
				return wcet != WCET_EDEFAULT;
			case ArchitecturePackage.FUNCTION__DEADLINE:
				return deadline != DEADLINE_EDEFAULT;
			case ArchitecturePackage.FUNCTION__PERIOD:
				return period != PERIOD_EDEFAULT;
			case ArchitecturePackage.FUNCTION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case ArchitecturePackage.FUNCTION__ALLOCATED_TO:
				return allocatedTo != null && !allocatedTo.isEmpty();
			case ArchitecturePackage.FUNCTION__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case ArchitecturePackage.FUNCTION__JITTER:
				return jitter != JITTER_EDEFAULT;
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
		result.append(" (wcet: ");
		result.append(wcet);
		result.append(", deadline: ");
		result.append(deadline);
		result.append(", period: ");
		result.append(period);
		result.append(", priority: ");
		result.append(priority);
		result.append(", offset: ");
		result.append(offset);
		result.append(", jitter: ");
		result.append(jitter);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
