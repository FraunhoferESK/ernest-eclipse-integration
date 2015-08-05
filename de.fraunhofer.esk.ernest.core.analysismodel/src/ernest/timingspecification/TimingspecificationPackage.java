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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ernest.timingspecification.TimingspecificationFactory
 * @model kind="package"
 * @generated
 */
public interface TimingspecificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "timingspecification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.esk.fraunhofer.de/ERNEST/TimingSpecification/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ernest.timingspecification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingspecificationPackage eINSTANCE = ernest.timingspecification.impl.TimingspecificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.ConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONST_VALID = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.DelayConstraintImpl <em>Delay Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.DelayConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getDelayConstraint()
	 * @generated
	 */
	int DELAY_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__RESULT = CONSTRAINT__RESULT;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__CONST_VALID = CONSTRAINT__CONST_VALID;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__STIMULUS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__RESPONSE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__ELAPSED_TIME = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__MINIMUM_LATENCY = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Maximum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__MAXIMUM_LATENCY = CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nominal Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT__NOMINAL_LATENCY = CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Delay Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.TimingModelImpl <em>Timing Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.TimingModelImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getTimingModel()
	 * @generated
	 */
	int TIMING_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_MODEL__CONSTRAINTS = 1;

	/**
	 * The number of structural features of the '<em>Timing Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Timing Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.AgeTimingConstraintImpl <em>Age Timing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.AgeTimingConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getAgeTimingConstraint()
	 * @generated
	 */
	int AGE_TIMING_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__NAME = DELAY_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__RESULT = DELAY_CONSTRAINT__RESULT;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__CONST_VALID = DELAY_CONSTRAINT__CONST_VALID;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__STIMULUS = DELAY_CONSTRAINT__STIMULUS;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__RESPONSE = DELAY_CONSTRAINT__RESPONSE;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__ELAPSED_TIME = DELAY_CONSTRAINT__ELAPSED_TIME;

	/**
	 * The feature id for the '<em><b>Minimum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__MINIMUM_LATENCY = DELAY_CONSTRAINT__MINIMUM_LATENCY;

	/**
	 * The feature id for the '<em><b>Maximum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__MAXIMUM_LATENCY = DELAY_CONSTRAINT__MAXIMUM_LATENCY;

	/**
	 * The feature id for the '<em><b>Nominal Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__NOMINAL_LATENCY = DELAY_CONSTRAINT__NOMINAL_LATENCY;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT__AGE = DELAY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Age Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT_FEATURE_COUNT = DELAY_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Age Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_TIMING_CONSTRAINT_OPERATION_COUNT = DELAY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.ReactionConstraintImpl <em>Reaction Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.ReactionConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getReactionConstraint()
	 * @generated
	 */
	int REACTION_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__NAME = DELAY_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__RESULT = DELAY_CONSTRAINT__RESULT;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__CONST_VALID = DELAY_CONSTRAINT__CONST_VALID;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__STIMULUS = DELAY_CONSTRAINT__STIMULUS;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__RESPONSE = DELAY_CONSTRAINT__RESPONSE;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__ELAPSED_TIME = DELAY_CONSTRAINT__ELAPSED_TIME;

	/**
	 * The feature id for the '<em><b>Minimum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MINIMUM_LATENCY = DELAY_CONSTRAINT__MINIMUM_LATENCY;

	/**
	 * The feature id for the '<em><b>Maximum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__MAXIMUM_LATENCY = DELAY_CONSTRAINT__MAXIMUM_LATENCY;

	/**
	 * The feature id for the '<em><b>Nominal Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT__NOMINAL_LATENCY = DELAY_CONSTRAINT__NOMINAL_LATENCY;

	/**
	 * The number of structural features of the '<em>Reaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT_FEATURE_COUNT = DELAY_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reaction Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_CONSTRAINT_OPERATION_COUNT = DELAY_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.InputSynchronizationConstraintImpl <em>Input Synchronization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.InputSynchronizationConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getInputSynchronizationConstraint()
	 * @generated
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__NAME = AGE_TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__RESULT = AGE_TIMING_CONSTRAINT__RESULT;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__CONST_VALID = AGE_TIMING_CONSTRAINT__CONST_VALID;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__STIMULUS = AGE_TIMING_CONSTRAINT__STIMULUS;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__RESPONSE = AGE_TIMING_CONSTRAINT__RESPONSE;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__ELAPSED_TIME = AGE_TIMING_CONSTRAINT__ELAPSED_TIME;

	/**
	 * The feature id for the '<em><b>Minimum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__MINIMUM_LATENCY = AGE_TIMING_CONSTRAINT__MINIMUM_LATENCY;

	/**
	 * The feature id for the '<em><b>Maximum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__MAXIMUM_LATENCY = AGE_TIMING_CONSTRAINT__MAXIMUM_LATENCY;

	/**
	 * The feature id for the '<em><b>Nominal Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__NOMINAL_LATENCY = AGE_TIMING_CONSTRAINT__NOMINAL_LATENCY;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__AGE = AGE_TIMING_CONSTRAINT__AGE;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = AGE_TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT_FEATURE_COUNT = AGE_TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SYNCHRONIZATION_CONSTRAINT_OPERATION_COUNT = AGE_TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.OutputSynchronizationConstraintImpl <em>Output Synchronization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.OutputSynchronizationConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getOutputSynchronizationConstraint()
	 * @generated
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__NAME = AGE_TIMING_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__RESULT = AGE_TIMING_CONSTRAINT__RESULT;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__CONST_VALID = AGE_TIMING_CONSTRAINT__CONST_VALID;

	/**
	 * The feature id for the '<em><b>Stimulus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__STIMULUS = AGE_TIMING_CONSTRAINT__STIMULUS;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__RESPONSE = AGE_TIMING_CONSTRAINT__RESPONSE;

	/**
	 * The feature id for the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__ELAPSED_TIME = AGE_TIMING_CONSTRAINT__ELAPSED_TIME;

	/**
	 * The feature id for the '<em><b>Minimum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__MINIMUM_LATENCY = AGE_TIMING_CONSTRAINT__MINIMUM_LATENCY;

	/**
	 * The feature id for the '<em><b>Maximum Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__MAXIMUM_LATENCY = AGE_TIMING_CONSTRAINT__MAXIMUM_LATENCY;

	/**
	 * The feature id for the '<em><b>Nominal Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__NOMINAL_LATENCY = AGE_TIMING_CONSTRAINT__NOMINAL_LATENCY;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__AGE = AGE_TIMING_CONSTRAINT__AGE;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = AGE_TIMING_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT_FEATURE_COUNT = AGE_TIMING_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Synchronization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SYNCHRONIZATION_CONSTRAINT_OPERATION_COUNT = AGE_TIMING_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.EventConstraintImpl <em>Event Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.EventConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getEventConstraint()
	 * @generated
	 */
	int EVENT_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT__RESULT = CONSTRAINT__RESULT;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT__CONST_VALID = CONSTRAINT__CONST_VALID;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT__PORT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT__PERIOD = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT__JITTER = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Interarrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Event Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.PeriodicRepetitionConstraintImpl <em>Periodic Repetition Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.PeriodicRepetitionConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getPeriodicRepetitionConstraint()
	 * @generated
	 */
	int PERIODIC_REPETITION_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT__NAME = EVENT_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT__RESULT = EVENT_CONSTRAINT__RESULT;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT__CONST_VALID = EVENT_CONSTRAINT__CONST_VALID;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT__PORT = EVENT_CONSTRAINT__PORT;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT__PERIOD = EVENT_CONSTRAINT__PERIOD;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT__JITTER = EVENT_CONSTRAINT__JITTER;

	/**
	 * The feature id for the '<em><b>Minimum Interarrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME = EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME;

	/**
	 * The number of structural features of the '<em>Periodic Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT_FEATURE_COUNT = EVENT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Periodic Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_REPETITION_CONSTRAINT_OPERATION_COUNT = EVENT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.SporadicRepetitionConstraintImpl <em>Sporadic Repetition Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.SporadicRepetitionConstraintImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getSporadicRepetitionConstraint()
	 * @generated
	 */
	int SPORADIC_REPETITION_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT__NAME = EVENT_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT__RESULT = EVENT_CONSTRAINT__RESULT;

	/**
	 * The feature id for the '<em><b>Const Valid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT__CONST_VALID = EVENT_CONSTRAINT__CONST_VALID;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT__PORT = EVENT_CONSTRAINT__PORT;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT__PERIOD = EVENT_CONSTRAINT__PERIOD;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT__JITTER = EVENT_CONSTRAINT__JITTER;

	/**
	 * The feature id for the '<em><b>Minimum Interarrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME = EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME;

	/**
	 * The feature id for the '<em><b>Maximum Interarrival Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT__MAXIMUM_INTERARRIVAL_TIME = EVENT_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sporadic Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT_FEATURE_COUNT = EVENT_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sporadic Repetition Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_REPETITION_CONSTRAINT_OPERATION_COUNT = EVENT_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.timingspecification.impl.ConstraintValidationImpl <em>Constraint Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.timingspecification.impl.ConstraintValidationImpl
	 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getConstraintValidation()
	 * @generated
	 */
	int CONSTRAINT_VALIDATION = 10;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__SATISFIED = 0;

	/**
	 * The feature id for the '<em><b>Starttime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__STARTTIME = 1;

	/**
	 * The feature id for the '<em><b>Endtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION__ENDTIME = 2;

	/**
	 * The number of structural features of the '<em>Constraint Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Constraint Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VALIDATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.DelayConstraint <em>Delay Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay Constraint</em>'.
	 * @see ernest.timingspecification.DelayConstraint
	 * @generated
	 */
	EClass getDelayConstraint();

	/**
	 * Returns the meta object for the reference list '{@link ernest.timingspecification.DelayConstraint#getStimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stimulus</em>'.
	 * @see ernest.timingspecification.DelayConstraint#getStimulus()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Stimulus();

	/**
	 * Returns the meta object for the reference list '{@link ernest.timingspecification.DelayConstraint#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Response</em>'.
	 * @see ernest.timingspecification.DelayConstraint#getResponse()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EReference getDelayConstraint_Response();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.DelayConstraint#getElapsedTime <em>Elapsed Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elapsed Time</em>'.
	 * @see ernest.timingspecification.DelayConstraint#getElapsedTime()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EAttribute getDelayConstraint_ElapsedTime();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.DelayConstraint#getMinimumLatency <em>Minimum Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Latency</em>'.
	 * @see ernest.timingspecification.DelayConstraint#getMinimumLatency()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EAttribute getDelayConstraint_MinimumLatency();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.DelayConstraint#getMaximumLatency <em>Maximum Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Latency</em>'.
	 * @see ernest.timingspecification.DelayConstraint#getMaximumLatency()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EAttribute getDelayConstraint_MaximumLatency();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.DelayConstraint#getNominalLatency <em>Nominal Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nominal Latency</em>'.
	 * @see ernest.timingspecification.DelayConstraint#getNominalLatency()
	 * @see #getDelayConstraint()
	 * @generated
	 */
	EAttribute getDelayConstraint_NominalLatency();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.TimingModel <em>Timing Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Model</em>'.
	 * @see ernest.timingspecification.TimingModel
	 * @generated
	 */
	EClass getTimingModel();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.TimingModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.timingspecification.TimingModel#getName()
	 * @see #getTimingModel()
	 * @generated
	 */
	EAttribute getTimingModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.timingspecification.TimingModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see ernest.timingspecification.TimingModel#getConstraints()
	 * @see #getTimingModel()
	 * @generated
	 */
	EReference getTimingModel_Constraints();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.AgeTimingConstraint <em>Age Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age Timing Constraint</em>'.
	 * @see ernest.timingspecification.AgeTimingConstraint
	 * @generated
	 */
	EClass getAgeTimingConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.AgeTimingConstraint#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see ernest.timingspecification.AgeTimingConstraint#getAge()
	 * @see #getAgeTimingConstraint()
	 * @generated
	 */
	EAttribute getAgeTimingConstraint_Age();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.ReactionConstraint <em>Reaction Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Constraint</em>'.
	 * @see ernest.timingspecification.ReactionConstraint
	 * @generated
	 */
	EClass getReactionConstraint();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.InputSynchronizationConstraint <em>Input Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Synchronization Constraint</em>'.
	 * @see ernest.timingspecification.InputSynchronizationConstraint
	 * @generated
	 */
	EClass getInputSynchronizationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.InputSynchronizationConstraint#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see ernest.timingspecification.InputSynchronizationConstraint#getTolerance()
	 * @see #getInputSynchronizationConstraint()
	 * @generated
	 */
	EAttribute getInputSynchronizationConstraint_Tolerance();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.OutputSynchronizationConstraint <em>Output Synchronization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Synchronization Constraint</em>'.
	 * @see ernest.timingspecification.OutputSynchronizationConstraint
	 * @generated
	 */
	EClass getOutputSynchronizationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.OutputSynchronizationConstraint#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tolerance</em>'.
	 * @see ernest.timingspecification.OutputSynchronizationConstraint#getTolerance()
	 * @see #getOutputSynchronizationConstraint()
	 * @generated
	 */
	EAttribute getOutputSynchronizationConstraint_Tolerance();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.EventConstraint <em>Event Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Constraint</em>'.
	 * @see ernest.timingspecification.EventConstraint
	 * @generated
	 */
	EClass getEventConstraint();

	/**
	 * Returns the meta object for the reference '{@link ernest.timingspecification.EventConstraint#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see ernest.timingspecification.EventConstraint#getPort()
	 * @see #getEventConstraint()
	 * @generated
	 */
	EReference getEventConstraint_Port();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.EventConstraint#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see ernest.timingspecification.EventConstraint#getPeriod()
	 * @see #getEventConstraint()
	 * @generated
	 */
	EAttribute getEventConstraint_Period();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.EventConstraint#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jitter</em>'.
	 * @see ernest.timingspecification.EventConstraint#getJitter()
	 * @see #getEventConstraint()
	 * @generated
	 */
	EAttribute getEventConstraint_Jitter();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.EventConstraint#getMinimumInterarrivalTime <em>Minimum Interarrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Interarrival Time</em>'.
	 * @see ernest.timingspecification.EventConstraint#getMinimumInterarrivalTime()
	 * @see #getEventConstraint()
	 * @generated
	 */
	EAttribute getEventConstraint_MinimumInterarrivalTime();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.PeriodicRepetitionConstraint <em>Periodic Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Repetition Constraint</em>'.
	 * @see ernest.timingspecification.PeriodicRepetitionConstraint
	 * @generated
	 */
	EClass getPeriodicRepetitionConstraint();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.SporadicRepetitionConstraint <em>Sporadic Repetition Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Repetition Constraint</em>'.
	 * @see ernest.timingspecification.SporadicRepetitionConstraint
	 * @generated
	 */
	EClass getSporadicRepetitionConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.SporadicRepetitionConstraint#getMaximumInterarrivalTime <em>Maximum Interarrival Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Interarrival Time</em>'.
	 * @see ernest.timingspecification.SporadicRepetitionConstraint#getMaximumInterarrivalTime()
	 * @see #getSporadicRepetitionConstraint()
	 * @generated
	 */
	EAttribute getSporadicRepetitionConstraint_MaximumInterarrivalTime();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see ernest.timingspecification.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.timingspecification.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.Constraint#isResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see ernest.timingspecification.Constraint#isResult()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Result();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.timingspecification.Constraint#getConstValid <em>Const Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Const Valid</em>'.
	 * @see ernest.timingspecification.Constraint#getConstValid()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_ConstValid();

	/**
	 * Returns the meta object for class '{@link ernest.timingspecification.ConstraintValidation <em>Constraint Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Validation</em>'.
	 * @see ernest.timingspecification.ConstraintValidation
	 * @generated
	 */
	EClass getConstraintValidation();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.ConstraintValidation#isSatisfied <em>Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfied</em>'.
	 * @see ernest.timingspecification.ConstraintValidation#isSatisfied()
	 * @see #getConstraintValidation()
	 * @generated
	 */
	EAttribute getConstraintValidation_Satisfied();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.ConstraintValidation#getStarttime <em>Starttime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starttime</em>'.
	 * @see ernest.timingspecification.ConstraintValidation#getStarttime()
	 * @see #getConstraintValidation()
	 * @generated
	 */
	EAttribute getConstraintValidation_Starttime();

	/**
	 * Returns the meta object for the attribute '{@link ernest.timingspecification.ConstraintValidation#getEndtime <em>Endtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endtime</em>'.
	 * @see ernest.timingspecification.ConstraintValidation#getEndtime()
	 * @see #getConstraintValidation()
	 * @generated
	 */
	EAttribute getConstraintValidation_Endtime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TimingspecificationFactory getTimingspecificationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.DelayConstraintImpl <em>Delay Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.DelayConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getDelayConstraint()
		 * @generated
		 */
		EClass DELAY_CONSTRAINT = eINSTANCE.getDelayConstraint();

		/**
		 * The meta object literal for the '<em><b>Stimulus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__STIMULUS = eINSTANCE.getDelayConstraint_Stimulus();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY_CONSTRAINT__RESPONSE = eINSTANCE.getDelayConstraint_Response();

		/**
		 * The meta object literal for the '<em><b>Elapsed Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_CONSTRAINT__ELAPSED_TIME = eINSTANCE.getDelayConstraint_ElapsedTime();

		/**
		 * The meta object literal for the '<em><b>Minimum Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_CONSTRAINT__MINIMUM_LATENCY = eINSTANCE.getDelayConstraint_MinimumLatency();

		/**
		 * The meta object literal for the '<em><b>Maximum Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_CONSTRAINT__MAXIMUM_LATENCY = eINSTANCE.getDelayConstraint_MaximumLatency();

		/**
		 * The meta object literal for the '<em><b>Nominal Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY_CONSTRAINT__NOMINAL_LATENCY = eINSTANCE.getDelayConstraint_NominalLatency();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.TimingModelImpl <em>Timing Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.TimingModelImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getTimingModel()
		 * @generated
		 */
		EClass TIMING_MODEL = eINSTANCE.getTimingModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_MODEL__NAME = eINSTANCE.getTimingModel_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_MODEL__CONSTRAINTS = eINSTANCE.getTimingModel_Constraints();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.AgeTimingConstraintImpl <em>Age Timing Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.AgeTimingConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getAgeTimingConstraint()
		 * @generated
		 */
		EClass AGE_TIMING_CONSTRAINT = eINSTANCE.getAgeTimingConstraint();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGE_TIMING_CONSTRAINT__AGE = eINSTANCE.getAgeTimingConstraint_Age();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.ReactionConstraintImpl <em>Reaction Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.ReactionConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getReactionConstraint()
		 * @generated
		 */
		EClass REACTION_CONSTRAINT = eINSTANCE.getReactionConstraint();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.InputSynchronizationConstraintImpl <em>Input Synchronization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.InputSynchronizationConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getInputSynchronizationConstraint()
		 * @generated
		 */
		EClass INPUT_SYNCHRONIZATION_CONSTRAINT = eINSTANCE.getInputSynchronizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = eINSTANCE.getInputSynchronizationConstraint_Tolerance();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.OutputSynchronizationConstraintImpl <em>Output Synchronization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.OutputSynchronizationConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getOutputSynchronizationConstraint()
		 * @generated
		 */
		EClass OUTPUT_SYNCHRONIZATION_CONSTRAINT = eINSTANCE.getOutputSynchronizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE = eINSTANCE.getOutputSynchronizationConstraint_Tolerance();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.EventConstraintImpl <em>Event Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.EventConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getEventConstraint()
		 * @generated
		 */
		EClass EVENT_CONSTRAINT = eINSTANCE.getEventConstraint();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CONSTRAINT__PORT = eINSTANCE.getEventConstraint_Port();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_CONSTRAINT__PERIOD = eINSTANCE.getEventConstraint_Period();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_CONSTRAINT__JITTER = eINSTANCE.getEventConstraint_Jitter();

		/**
		 * The meta object literal for the '<em><b>Minimum Interarrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME = eINSTANCE.getEventConstraint_MinimumInterarrivalTime();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.PeriodicRepetitionConstraintImpl <em>Periodic Repetition Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.PeriodicRepetitionConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getPeriodicRepetitionConstraint()
		 * @generated
		 */
		EClass PERIODIC_REPETITION_CONSTRAINT = eINSTANCE.getPeriodicRepetitionConstraint();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.SporadicRepetitionConstraintImpl <em>Sporadic Repetition Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.SporadicRepetitionConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getSporadicRepetitionConstraint()
		 * @generated
		 */
		EClass SPORADIC_REPETITION_CONSTRAINT = eINSTANCE.getSporadicRepetitionConstraint();

		/**
		 * The meta object literal for the '<em><b>Maximum Interarrival Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_REPETITION_CONSTRAINT__MAXIMUM_INTERARRIVAL_TIME = eINSTANCE.getSporadicRepetitionConstraint_MaximumInterarrivalTime();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.ConstraintImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__RESULT = eINSTANCE.getConstraint_Result();

		/**
		 * The meta object literal for the '<em><b>Const Valid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONST_VALID = eINSTANCE.getConstraint_ConstValid();

		/**
		 * The meta object literal for the '{@link ernest.timingspecification.impl.ConstraintValidationImpl <em>Constraint Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.timingspecification.impl.ConstraintValidationImpl
		 * @see ernest.timingspecification.impl.TimingspecificationPackageImpl#getConstraintValidation()
		 * @generated
		 */
		EClass CONSTRAINT_VALIDATION = eINSTANCE.getConstraintValidation();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_VALIDATION__SATISFIED = eINSTANCE.getConstraintValidation_Satisfied();

		/**
		 * The meta object literal for the '<em><b>Starttime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_VALIDATION__STARTTIME = eINSTANCE.getConstraintValidation_Starttime();

		/**
		 * The meta object literal for the '<em><b>Endtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_VALIDATION__ENDTIME = eINSTANCE.getConstraintValidation_Endtime();

	}

} //TimingspecificationPackage
