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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.Constraint#getName <em>Name</em>}</li>
 *   <li>{@link ernest.timingspecification.Constraint#isResult <em>Result</em>}</li>
 *   <li>{@link ernest.timingspecification.Constraint#getConstValid <em>Const Valid</em>}</li>
 * </ul>
 *
 * @see ernest.timingspecification.TimingspecificationPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ernest.timingspecification.TimingspecificationPackage#getConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.Constraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(boolean)
	 * @see ernest.timingspecification.TimingspecificationPackage#getConstraint_Result()
	 * @model
	 * @generated
	 */
	boolean isResult();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.Constraint#isResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #isResult()
	 * @generated
	 */
	void setResult(boolean value);

	/**
	 * Returns the value of the '<em><b>Const Valid</b></em>' containment reference list.
	 * The list contents are of type {@link ernest.timingspecification.ConstraintValidation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Valid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Valid</em>' containment reference list.
	 * @see ernest.timingspecification.TimingspecificationPackage#getConstraint_ConstValid()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstraintValidation> getConstValid();

} // Constraint
