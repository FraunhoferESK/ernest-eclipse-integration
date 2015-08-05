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
package ernest.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.SoftwareConnector#getCanID <em>Can ID</em>}</li>
 *   <li>{@link ernest.architecture.SoftwareConnector#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getSoftwareConnector()
 * @model
 * @generated
 */
public interface SoftwareConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Can ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can ID</em>' attribute.
	 * @see #setCanID(int)
	 * @see ernest.architecture.ArchitecturePackage#getSoftwareConnector_CanID()
	 * @model
	 * @generated
	 */
	int getCanID();

	/**
	 * Sets the value of the '{@link ernest.architecture.SoftwareConnector#getCanID <em>Can ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can ID</em>' attribute.
	 * @see #getCanID()
	 * @generated
	 */
	void setCanID(int value);

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link ernest.architecture.SoftwarePort}.
	 * It is bidirectional and its opposite is '{@link ernest.architecture.SoftwarePort#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see ernest.architecture.ArchitecturePackage#getSoftwareConnector_ConnectedTo()
	 * @see ernest.architecture.SoftwarePort#getConnectedTo
	 * @model opposite="connectedTo" upper="2"
	 * @generated
	 */
	EList<SoftwarePort> getConnectedTo();

} // SoftwareConnector
