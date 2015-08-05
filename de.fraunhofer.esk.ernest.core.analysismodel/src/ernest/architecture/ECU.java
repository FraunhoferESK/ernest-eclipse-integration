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

import ernest.architecture.types.SchedType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.ECU#getSchedulerType <em>Scheduler Type</em>}</li>
 *   <li>{@link ernest.architecture.ECU#getPerformanceFactor <em>Performance Factor</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getECU()
 * @model
 * @generated
 */
public interface ECU extends HWModule {
	/**
	 * Returns the value of the '<em><b>Scheduler Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ernest.architecture.types.SchedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler Type</em>' attribute.
	 * @see ernest.architecture.types.SchedType
	 * @see #setSchedulerType(SchedType)
	 * @see ernest.architecture.ArchitecturePackage#getECU_SchedulerType()
	 * @model
	 * @generated
	 */
	SchedType getSchedulerType();

	/**
	 * Sets the value of the '{@link ernest.architecture.ECU#getSchedulerType <em>Scheduler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler Type</em>' attribute.
	 * @see ernest.architecture.types.SchedType
	 * @see #getSchedulerType()
	 * @generated
	 */
	void setSchedulerType(SchedType value);

	/**
	 * Returns the value of the '<em><b>Performance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Factor</em>' attribute.
	 * @see #setPerformanceFactor(double)
	 * @see ernest.architecture.ArchitecturePackage#getECU_PerformanceFactor()
	 * @model
	 * @generated
	 */
	double getPerformanceFactor();

	/**
	 * Sets the value of the '{@link ernest.architecture.ECU#getPerformanceFactor <em>Performance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Factor</em>' attribute.
	 * @see #getPerformanceFactor()
	 * @generated
	 */
	void setPerformanceFactor(double value);

} // ECU
