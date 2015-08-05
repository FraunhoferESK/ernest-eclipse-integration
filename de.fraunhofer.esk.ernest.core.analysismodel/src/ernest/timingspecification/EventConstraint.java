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

import ernest.architecture.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.EventConstraint#getPort <em>Port</em>}</li>
 *   <li>{@link ernest.timingspecification.EventConstraint#getPeriod <em>Period</em>}</li>
 *   <li>{@link ernest.timingspecification.EventConstraint#getJitter <em>Jitter</em>}</li>
 *   <li>{@link ernest.timingspecification.EventConstraint#getMinimumInterarrivalTime <em>Minimum Interarrival Time</em>}</li>
 * </ul>
 *
 * @see ernest.timingspecification.TimingspecificationPackage#getEventConstraint()
 * @model abstract="true"
 * @generated
 */
public interface EventConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see ernest.timingspecification.TimingspecificationPackage#getEventConstraint_Port()
	 * @model required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.EventConstraint#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getEventConstraint_Period()
	 * @model
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.EventConstraint#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jitter</em>' attribute.
	 * @see #setJitter(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getEventConstraint_Jitter()
	 * @model
	 * @generated
	 */
	double getJitter();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.EventConstraint#getJitter <em>Jitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jitter</em>' attribute.
	 * @see #getJitter()
	 * @generated
	 */
	void setJitter(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Interarrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Interarrival Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Interarrival Time</em>' attribute.
	 * @see #setMinimumInterarrivalTime(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getEventConstraint_MinimumInterarrivalTime()
	 * @model
	 * @generated
	 */
	double getMinimumInterarrivalTime();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.EventConstraint#getMinimumInterarrivalTime <em>Minimum Interarrival Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Interarrival Time</em>' attribute.
	 * @see #getMinimumInterarrivalTime()
	 * @generated
	 */
	void setMinimumInterarrivalTime(double value);

} // EventConstraint
