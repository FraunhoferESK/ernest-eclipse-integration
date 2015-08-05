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
 * A representation of the model object '<em><b>FModule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.FModule#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link ernest.architecture.FModule#getPorts <em>Ports</em>}</li>
 *   <li>{@link ernest.architecture.FModule#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getFModule()
 * @model abstract="true"
 * @generated
 */
public interface FModule extends Module {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ernest.architecture.Attribute}.
	 * It is bidirectional and its opposite is '{@link ernest.architecture.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ernest.architecture.ArchitecturePackage#getFModule_Attributes()
	 * @see ernest.architecture.Attribute#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ernest.architecture.SoftwarePort}.
	 * It is bidirectional and its opposite is '{@link ernest.architecture.SoftwarePort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see ernest.architecture.ArchitecturePackage#getFModule_Ports()
	 * @see ernest.architecture.SoftwarePort#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<SoftwarePort> getPorts();

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link ernest.architecture.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see ernest.architecture.ArchitecturePackage#getFModule_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getBehavior();

} // FModule
