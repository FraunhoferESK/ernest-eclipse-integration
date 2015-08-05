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
 * A representation of the model object '<em><b>HW Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.HWModule#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getHWModule()
 * @model abstract="true"
 * @generated
 */
public interface HWModule extends Module {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link ernest.architecture.HardwarePort}.
	 * It is bidirectional and its opposite is '{@link ernest.architecture.HardwarePort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see ernest.architecture.ArchitecturePackage#getHWModule_Ports()
	 * @see ernest.architecture.HardwarePort#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<HardwarePort> getPorts();

} // HWModule
