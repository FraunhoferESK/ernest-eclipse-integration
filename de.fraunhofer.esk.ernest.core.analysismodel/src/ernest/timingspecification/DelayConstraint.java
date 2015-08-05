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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delay Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.DelayConstraint#getStimulus <em>Stimulus</em>}</li>
 *   <li>{@link ernest.timingspecification.DelayConstraint#getResponse <em>Response</em>}</li>
 *   <li>{@link ernest.timingspecification.DelayConstraint#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link ernest.timingspecification.DelayConstraint#getMinimumLatency <em>Minimum Latency</em>}</li>
 *   <li>{@link ernest.timingspecification.DelayConstraint#getMaximumLatency <em>Maximum Latency</em>}</li>
 *   <li>{@link ernest.timingspecification.DelayConstraint#getNominalLatency <em>Nominal Latency</em>}</li>
 * </ul>
 *
 * @see ernest.timingspecification.TimingspecificationPackage#getDelayConstraint()
 * @model abstract="true"
 * @generated
 */
public interface DelayConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' reference list.
	 * The list contents are of type {@link ernest.architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus</em>' reference list.
	 * @see ernest.timingspecification.TimingspecificationPackage#getDelayConstraint_Stimulus()
	 * @model
	 * @generated
	 */
	EList<Port> getStimulus();

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference list.
	 * The list contents are of type {@link ernest.architecture.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference list.
	 * @see ernest.timingspecification.TimingspecificationPackage#getDelayConstraint_Response()
	 * @model
	 * @generated
	 */
	EList<Port> getResponse();

	/**
	 * Returns the value of the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elapsed Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elapsed Time</em>' attribute.
	 * @see #setElapsedTime(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getDelayConstraint_ElapsedTime()
	 * @model
	 * @generated
	 */
	double getElapsedTime();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.DelayConstraint#getElapsedTime <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed Time</em>' attribute.
	 * @see #getElapsedTime()
	 * @generated
	 */
	void setElapsedTime(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Latency</em>' attribute.
	 * @see #setMinimumLatency(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getDelayConstraint_MinimumLatency()
	 * @model
	 * @generated
	 */
	double getMinimumLatency();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.DelayConstraint#getMinimumLatency <em>Minimum Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Latency</em>' attribute.
	 * @see #getMinimumLatency()
	 * @generated
	 */
	void setMinimumLatency(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Latency</em>' attribute.
	 * @see #setMaximumLatency(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getDelayConstraint_MaximumLatency()
	 * @model
	 * @generated
	 */
	double getMaximumLatency();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.DelayConstraint#getMaximumLatency <em>Maximum Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Latency</em>' attribute.
	 * @see #getMaximumLatency()
	 * @generated
	 */
	void setMaximumLatency(double value);

	/**
	 * Returns the value of the '<em><b>Nominal Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nominal Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Latency</em>' attribute.
	 * @see #setNominalLatency(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getDelayConstraint_NominalLatency()
	 * @model
	 * @generated
	 */
	double getNominalLatency();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.DelayConstraint#getNominalLatency <em>Nominal Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Latency</em>' attribute.
	 * @see #getNominalLatency()
	 * @generated
	 */
	void setNominalLatency(double value);

} // DelayConstraint
