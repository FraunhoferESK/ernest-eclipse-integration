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
import ernest.architecture.SoftwareConnector;
import ernest.architecture.SoftwarePort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.impl.SoftwareConnectorImpl#getCanID <em>Can ID</em>}</li>
 *   <li>{@link ernest.architecture.impl.SoftwareConnectorImpl#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareConnectorImpl extends ConnectorImpl implements SoftwareConnector {
	/**
	 * The default value of the '{@link #getCanID() <em>Can ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanID()
	 * @generated
	 * @ordered
	 */
	protected static final int CAN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCanID() <em>Can ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanID()
	 * @generated
	 * @ordered
	 */
	protected int canID = CAN_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwarePort> connectedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.SOFTWARE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCanID() {
		return canID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanID(int newCanID) {
		int oldCanID = canID;
		canID = newCanID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.SOFTWARE_CONNECTOR__CAN_ID, oldCanID, canID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwarePort> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectWithInverseResolvingEList.ManyInverse<SoftwarePort>(SoftwarePort.class, this, ArchitecturePackage.SOFTWARE_CONNECTOR__CONNECTED_TO, ArchitecturePackage.SOFTWARE_PORT__CONNECTED_TO);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CONNECTED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedTo()).basicAdd(otherEnd, msgs);
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
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CONNECTED_TO:
				return ((InternalEList<?>)getConnectedTo()).basicRemove(otherEnd, msgs);
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
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CAN_ID:
				return getCanID();
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CONNECTED_TO:
				return getConnectedTo();
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
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CAN_ID:
				setCanID((Integer)newValue);
				return;
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends SoftwarePort>)newValue);
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
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CAN_ID:
				setCanID(CAN_ID_EDEFAULT);
				return;
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CONNECTED_TO:
				getConnectedTo().clear();
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
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CAN_ID:
				return canID != CAN_ID_EDEFAULT;
			case ArchitecturePackage.SOFTWARE_CONNECTOR__CONNECTED_TO:
				return connectedTo != null && !connectedTo.isEmpty();
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
		result.append(" (canID: ");
		result.append(canID);
		result.append(')');
		return result.toString();
	}

} //SoftwareConnectorImpl
