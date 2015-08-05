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
 * A representation of the model object '<em><b>Hardware Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.HardwareConnector#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getHardwareConnector()
 * @model
 * @generated
 */
public interface HardwareConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link ernest.architecture.HardwarePort}.
	 * It is bidirectional and its opposite is '{@link ernest.architecture.HardwarePort#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see ernest.architecture.ArchitecturePackage#getHardwareConnector_ConnectedTo()
	 * @see ernest.architecture.HardwarePort#getConnectedTo
	 * @model opposite="connectedTo" upper="2"
	 * @generated
	 */
	EList<HardwarePort> getConnectedTo();

} // HardwareConnector
