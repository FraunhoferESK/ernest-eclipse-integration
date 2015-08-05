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
package ernest.timingspecification.impl;

import ernest.timingspecification.PeriodicRepetitionConstraint;
import ernest.timingspecification.TimingspecificationPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Repetition Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PeriodicRepetitionConstraintImpl extends EventConstraintImpl implements PeriodicRepetitionConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicRepetitionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingspecificationPackage.Literals.PERIODIC_REPETITION_CONSTRAINT;
	}

} //PeriodicRepetitionConstraintImpl
