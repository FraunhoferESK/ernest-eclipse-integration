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
 * A representation of the model object '<em><b>Output Synchronization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.timingspecification.OutputSynchronizationConstraint#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 *
 * @see ernest.timingspecification.TimingspecificationPackage#getOutputSynchronizationConstraint()
 * @model
 * @generated
 */
public interface OutputSynchronizationConstraint extends AgeTimingConstraint {
	/**
	 * Returns the value of the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance</em>' attribute.
	 * @see #setTolerance(double)
	 * @see ernest.timingspecification.TimingspecificationPackage#getOutputSynchronizationConstraint_Tolerance()
	 * @model
	 * @generated
	 */
	double getTolerance();

	/**
	 * Sets the value of the '{@link ernest.timingspecification.OutputSynchronizationConstraint#getTolerance <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance</em>' attribute.
	 * @see #getTolerance()
	 * @generated
	 */
	void setTolerance(double value);

} // OutputSynchronizationConstraint
