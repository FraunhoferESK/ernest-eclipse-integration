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
package ernest.timingspecification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Age Timing Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.AgeTimingConstraint#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see ernest.timingspecification.TimingspecificationPackage#getAgeTimingConstraint()
 * @model
 * @generated
 */
public interface AgeTimingConstraint extends DelayConstraint {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getAgeTimingConstraint_Age()
	 * @model
	 * @generated
	 */
	double getAge();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.AgeTimingConstraint#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(double value);

} // AgeTimingConstraint
