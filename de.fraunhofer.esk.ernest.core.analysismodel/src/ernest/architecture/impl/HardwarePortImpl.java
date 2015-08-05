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
import ernest.architecture.HWModule;
import ernest.architecture.HardwareConnector;
import ernest.architecture.HardwarePort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.impl.HardwarePortImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link ernest.architecture.impl.HardwarePortImpl#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HardwarePortImpl extends PortImpl implements HardwarePort {
	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<HardwareConnector> connectedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwarePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArchitecturePackage.Literals.HARDWARE_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWModule getOwner() {
		if (eContainerFeatureID() != ArchitecturePackage.HARDWARE_PORT__OWNER) return null;
		return (HWModule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(HWModule newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, ArchitecturePackage.HARDWARE_PORT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(HWModule newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != ArchitecturePackage.HARDWARE_PORT__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, ArchitecturePackage.HW_MODULE__PORTS, HWModule.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArchitecturePackage.HARDWARE_PORT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HardwareConnector> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectWithInverseResolvingEList.ManyInverse<HardwareConnector>(HardwareConnector.class, this, ArchitecturePackage.HARDWARE_PORT__CONNECTED_TO, ArchitecturePackage.HARDWARE_CONNECTOR__CONNECTED_TO);
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
			case ArchitecturePackage.HARDWARE_PORT__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((HWModule)otherEnd, msgs);
			case ArchitecturePackage.HARDWARE_PORT__CONNECTED_TO:
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
			case ArchitecturePackage.HARDWARE_PORT__OWNER:
				return basicSetOwner(null, msgs);
			case ArchitecturePackage.HARDWARE_PORT__CONNECTED_TO:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ArchitecturePackage.HARDWARE_PORT__OWNER:
				return eInternalContainer().eInverseRemove(this, ArchitecturePackage.HW_MODULE__PORTS, HWModule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArchitecturePackage.HARDWARE_PORT__OWNER:
				return getOwner();
			case ArchitecturePackage.HARDWARE_PORT__CONNECTED_TO:
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
			case ArchitecturePackage.HARDWARE_PORT__OWNER:
				setOwner((HWModule)newValue);
				return;
			case ArchitecturePackage.HARDWARE_PORT__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends HardwareConnector>)newValue);
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
			case ArchitecturePackage.HARDWARE_PORT__OWNER:
				setOwner((HWModule)null);
				return;
			case ArchitecturePackage.HARDWARE_PORT__CONNECTED_TO:
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
			case ArchitecturePackage.HARDWARE_PORT__OWNER:
				return getOwner() != null;
			case ArchitecturePackage.HARDWARE_PORT__CONNECTED_TO:
				return connectedTo != null && !connectedTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HardwarePortImpl
