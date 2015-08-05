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

import ernest.architecture.types.PortKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.FlowPort#getKind <em>Kind</em>}</li>
 *   <li>{@link ernest.architecture.FlowPort#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getFlowPort()
 * @model
 * @generated
 */
public interface FlowPort extends SoftwarePort {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ernest.architecture.types.PortKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ernest.architecture.types.PortKind
	 * @see #setKind(PortKind)
	 * @see ernest.architecture.ArchitecturePackage#getFlowPort_Kind()
	 * @model
	 * @generated
	 */
	PortKind getKind();

	/**
	 * Sets the value of the '{@link ernest.architecture.FlowPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ernest.architecture.types.PortKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PortKind value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The default value is <code>"int"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see #setDatatype(String)
	 * @see ernest.architecture.ArchitecturePackage#getFlowPort_Datatype()
	 * @model default="int" required="true"
	 * @generated
	 */
	String getDatatype();

	/**
	 * Sets the value of the '{@link ernest.architecture.FlowPort#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(String value);

} // FlowPort
