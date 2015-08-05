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

import ernest.architecture.types.ImplementationKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CS Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.CSPort#getInterface <em>Interface</em>}</li>
 *   <li>{@link ernest.architecture.CSPort#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getCSPort()
 * @model
 * @generated
 */
public interface CSPort extends SoftwarePort {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see ernest.architecture.ArchitecturePackage#getCSPort_Interface()
	 * @model required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link ernest.architecture.CSPort#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ernest.architecture.types.ImplementationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ernest.architecture.types.ImplementationKind
	 * @see #setKind(ImplementationKind)
	 * @see ernest.architecture.ArchitecturePackage#getCSPort_Kind()
	 * @model
	 * @generated
	 */
	ImplementationKind getKind();

	/**
	 * Sets the value of the '{@link ernest.architecture.CSPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ernest.architecture.types.ImplementationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ImplementationKind value);

} // CSPort
