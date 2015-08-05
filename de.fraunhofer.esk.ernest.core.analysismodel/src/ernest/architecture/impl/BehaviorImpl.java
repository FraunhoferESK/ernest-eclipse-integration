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
import ernest.architecture.Behavior;
import ernest.architecture.Operation;

import ernest.architecture.types.TriggerPolicyKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.impl.BehaviorImpl#getBody <em>Body</em>}</li>
 *   <li>{@link ernest.architecture.impl.BehaviorImpl#getTriggerPolicy <em>Trigger Policy</em>}</li>
 *   <li>{@link ernest.architecture.impl.BehaviorImpl#getTriggerCondition <em>Trigger Condition</em>}</li>
 *   <li>{@link ernest.architecture.impl.BehaviorImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends MinimalEObjectImpl.Container implements Behavior {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerPolicy() <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerPolicyKind TRIGGER_POLICY_EDEFAULT = TriggerPolicyKind.EVENT;

	/**
	 * The cached value of the '{@link #getTriggerPolicy() <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPolicy()
	 * @generated
	 * @ordered
	 */
	protected TriggerPolicyKind triggerPolicy = TRIGGER_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTriggerCondition() <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTriggerCondition() <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerCondition()
	 * @generated
	 * @ordered
	 */
	protected String triggerCondition = TRIGGER_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BEHAVIOR__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerPolicyKind getTriggerPolicy() {
		return triggerPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerPolicy(TriggerPolicyKind newTriggerPolicy) {
		TriggerPolicyKind oldTriggerPolicy = triggerPolicy;
		triggerPolicy = newTriggerPolicy == null ? TRIGGER_POLICY_EDEFAULT : newTriggerPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BEHAVIOR__TRIGGER_POLICY, oldTriggerPolicy, triggerPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTriggerCondition() {
		return triggerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerCondition(String newTriggerCondition) {
		String oldTriggerCondition = triggerCondition;
		triggerCondition = newTriggerCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BEHAVIOR__TRIGGER_CONDITION, oldTriggerCondition, triggerCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArchitecturePackage.BEHAVIOR__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BEHAVIOR__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, ArchitecturePackage.OPERATION__BEHAVIOR, Operation.class, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, ArchitecturePackage.OPERATION__BEHAVIOR, Operation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.BEHAVIOR__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.BEHAVIOR__OPERATION:
				if (operation != null)
					msgs = ((InternalEObject)operation).eInverseRemove(this, ArchitecturePackage.OPERATION__BEHAVIOR, Operation.class, msgs);
				return basicSetOperation((Operation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.BEHAVIOR__OPERATION:
				return basicSetOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.BEHAVIOR__BODY:
				return getBody();
			case ArchitecturePackage.BEHAVIOR__TRIGGER_POLICY:
				return getTriggerPolicy();
			case ArchitecturePackage.BEHAVIOR__TRIGGER_CONDITION:
				return getTriggerCondition();
			case ArchitecturePackage.BEHAVIOR__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
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
			case ArchitecturePackage.BEHAVIOR__BODY:
				setBody((String)newValue);
				return;
			case ArchitecturePackage.BEHAVIOR__TRIGGER_POLICY:
				setTriggerPolicy((TriggerPolicyKind)newValue);
				return;
			case ArchitecturePackage.BEHAVIOR__TRIGGER_CONDITION:
				setTriggerCondition((String)newValue);
				return;
			case ArchitecturePackage.BEHAVIOR__OPERATION:
				setOperation((Operation)newValue);
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
			case ArchitecturePackage.BEHAVIOR__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case ArchitecturePackage.BEHAVIOR__TRIGGER_POLICY:
				setTriggerPolicy(TRIGGER_POLICY_EDEFAULT);
				return;
			case ArchitecturePackage.BEHAVIOR__TRIGGER_CONDITION:
				setTriggerCondition(TRIGGER_CONDITION_EDEFAULT);
				return;
			case ArchitecturePackage.BEHAVIOR__OPERATION:
				setOperation((Operation)null);
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
			case ArchitecturePackage.BEHAVIOR__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case ArchitecturePackage.BEHAVIOR__TRIGGER_POLICY:
				return triggerPolicy != TRIGGER_POLICY_EDEFAULT;
			case ArchitecturePackage.BEHAVIOR__TRIGGER_CONDITION:
				return TRIGGER_CONDITION_EDEFAULT == null ? triggerCondition != null : !TRIGGER_CONDITION_EDEFAULT.equals(triggerCondition);
			case ArchitecturePackage.BEHAVIOR__OPERATION:
				return operation != null;
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
		result.append(" (body: ");
		result.append(body);
		result.append(", triggerPolicy: ");
		result.append(triggerPolicy);
		result.append(", triggerCondition: ");
		result.append(triggerCondition);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
