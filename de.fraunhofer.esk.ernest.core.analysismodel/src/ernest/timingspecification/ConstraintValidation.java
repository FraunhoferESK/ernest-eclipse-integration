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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.ConstraintValidation#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link ernest.timingspecification.ConstraintValidation#getStarttime <em>Starttime</em>}</li>
 *   <li>{@link ernest.timingspecification.ConstraintValidation#getEndtime <em>Endtime</em>}</li>
 * </ul>
 *
 * @see ernest.timingspecification.TimingspecificationPackage#getConstraintValidation()
 * @model
 * @generated
 */
public interface ConstraintValidation extends EObject {
	/**
	 * Returns the value of the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfied</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied</em>' attribute.
	 * @see #setSatisfied(boolean)
	 * @see ernest.timingspecification.TimingspecificationPackage#getConstraintValidation_Satisfied()
	 * @model
	 * @generated
	 */
	boolean isSatisfied();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.ConstraintValidation#isSatisfied <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied</em>' attribute.
	 * @see #isSatisfied()
	 * @generated
	 */
	void setSatisfied(boolean value);

	/**
	 * Returns the value of the '<em><b>Starttime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starttime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starttime</em>' attribute.
	 * @see #setStarttime(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getConstraintValidation_Starttime()
	 * @model
	 * @generated
	 */
	double getStarttime();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.ConstraintValidation#getStarttime <em>Starttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starttime</em>' attribute.
	 * @see #getStarttime()
	 * @generated
	 */
	void setStarttime(double value);

	/**
	 * Returns the value of the '<em><b>Endtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endtime</em>' attribute.
	 * @see #setEndtime(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getConstraintValidation_Endtime()
	 * @model
	 * @generated
	 */
	double getEndtime();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.ConstraintValidation#getEndtime <em>Endtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endtime</em>' attribute.
	 * @see #getEndtime()
	 * @generated
	 */
	void setEndtime(double value);

} // ConstraintValidation
