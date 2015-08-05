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

import ernest.ErnestPackage;

import ernest.architecture.ArchitecturePackage;

import ernest.architecture.impl.ArchitecturePackageImpl;

import ernest.architecture.types.TypesPackage;

import ernest.architecture.types.impl.TypesPackageImpl;

import ernest.impl.ErnestPackageImpl;

import ernest.timingspecification.AgeTimingConstraint;
import ernest.timingspecification.Constraint;
import ernest.timingspecification.ConstraintValidation;
import ernest.timingspecification.DelayConstraint;
import ernest.timingspecification.EventConstraint;
import ernest.timingspecification.InputSynchronizationConstraint;
import ernest.timingspecification.OutputSynchronizationConstraint;
import ernest.timingspecification.PeriodicRepetitionConstraint;
import ernest.timingspecification.ReactionConstraint;
import ernest.timingspecification.SporadicRepetitionConstraint;
import ernest.timingspecification.TimingModel;
import ernest.timingspecification.TimingspecificationFactory;
import ernest.timingspecification.TimingspecificationPackage;

import ernest.tracing.TracingPackage;

import ernest.tracing.impl.TracingPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimingspecificationPackageImpl extends EPackageImpl implements TimingspecificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageTimingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputSynchronizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputSynchronizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicRepetitionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicRepetitionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintValidationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ernest.timingspecification.TimingspecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TimingspecificationPackageImpl() {
		super(eNS_URI, TimingspecificationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TimingspecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TimingspecificationPackage init() {
		if (isInited) return (TimingspecificationPackage)EPackage.Registry.INSTANCE.getEPackage(TimingspecificationPackage.eNS_URI);

		// Obtain or create and register package
		TimingspecificationPackageImpl theTimingspecificationPackage = (TimingspecificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TimingspecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TimingspecificationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ErnestPackageImpl theErnestPackage = (ErnestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ErnestPackage.eNS_URI) instanceof ErnestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErnestPackage.eNS_URI) : ErnestPackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		TracingPackageImpl theTracingPackage = (TracingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracingPackage.eNS_URI) instanceof TracingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracingPackage.eNS_URI) : TracingPackage.eINSTANCE);

		// Create package meta-data objects
		theTimingspecificationPackage.createPackageContents();
		theErnestPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theTracingPackage.createPackageContents();

		// Initialize created meta-data
		theTimingspecificationPackage.initializePackageContents();
		theErnestPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theTracingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTimingspecificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TimingspecificationPackage.eNS_URI, theTimingspecificationPackage);
		return theTimingspecificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelayConstraint() {
		return delayConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Stimulus() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelayConstraint_Response() {
		return (EReference)delayConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayConstraint_ElapsedTime() {
		return (EAttribute)delayConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayConstraint_MinimumLatency() {
		return (EAttribute)delayConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayConstraint_MaximumLatency() {
		return (EAttribute)delayConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelayConstraint_NominalLatency() {
		return (EAttribute)delayConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingModel() {
		return timingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimingModel_Name() {
		return (EAttribute)timingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingModel_Constraints() {
		return (EReference)timingModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeTimingConstraint() {
		return ageTimingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgeTimingConstraint_Age() {
		return (EAttribute)ageTimingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionConstraint() {
		return reactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputSynchronizationConstraint() {
		return inputSynchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputSynchronizationConstraint_Tolerance() {
		return (EAttribute)inputSynchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputSynchronizationConstraint() {
		return outputSynchronizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputSynchronizationConstraint_Tolerance() {
		return (EAttribute)outputSynchronizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventConstraint() {
		return eventConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventConstraint_Port() {
		return (EReference)eventConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventConstraint_Period() {
		return (EAttribute)eventConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventConstraint_Jitter() {
		return (EAttribute)eventConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventConstraint_MinimumInterarrivalTime() {
		return (EAttribute)eventConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriodicRepetitionConstraint() {
		return periodicRepetitionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSporadicRepetitionConstraint() {
		return sporadicRepetitionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSporadicRepetitionConstraint_MaximumInterarrivalTime() {
		return (EAttribute)sporadicRepetitionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Name() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Result() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstValid() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintValidation() {
		return constraintValidationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintValidation_Satisfied() {
		return (EAttribute)constraintValidationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintValidation_Starttime() {
		return (EAttribute)constraintValidationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintValidation_Endtime() {
		return (EAttribute)constraintValidationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingspecificationFactory getTimingspecificationFactory() {
		return (TimingspecificationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		delayConstraintEClass = createEClass(DELAY_CONSTRAINT);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__STIMULUS);
		createEReference(delayConstraintEClass, DELAY_CONSTRAINT__RESPONSE);
		createEAttribute(delayConstraintEClass, DELAY_CONSTRAINT__ELAPSED_TIME);
		createEAttribute(delayConstraintEClass, DELAY_CONSTRAINT__MINIMUM_LATENCY);
		createEAttribute(delayConstraintEClass, DELAY_CONSTRAINT__MAXIMUM_LATENCY);
		createEAttribute(delayConstraintEClass, DELAY_CONSTRAINT__NOMINAL_LATENCY);

		timingModelEClass = createEClass(TIMING_MODEL);
		createEAttribute(timingModelEClass, TIMING_MODEL__NAME);
		createEReference(timingModelEClass, TIMING_MODEL__CONSTRAINTS);

		ageTimingConstraintEClass = createEClass(AGE_TIMING_CONSTRAINT);
		createEAttribute(ageTimingConstraintEClass, AGE_TIMING_CONSTRAINT__AGE);

		reactionConstraintEClass = createEClass(REACTION_CONSTRAINT);

		inputSynchronizationConstraintEClass = createEClass(INPUT_SYNCHRONIZATION_CONSTRAINT);
		createEAttribute(inputSynchronizationConstraintEClass, INPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE);

		outputSynchronizationConstraintEClass = createEClass(OUTPUT_SYNCHRONIZATION_CONSTRAINT);
		createEAttribute(outputSynchronizationConstraintEClass, OUTPUT_SYNCHRONIZATION_CONSTRAINT__TOLERANCE);

		eventConstraintEClass = createEClass(EVENT_CONSTRAINT);
		createEReference(eventConstraintEClass, EVENT_CONSTRAINT__PORT);
		createEAttribute(eventConstraintEClass, EVENT_CONSTRAINT__PERIOD);
		createEAttribute(eventConstraintEClass, EVENT_CONSTRAINT__JITTER);
		createEAttribute(eventConstraintEClass, EVENT_CONSTRAINT__MINIMUM_INTERARRIVAL_TIME);

		periodicRepetitionConstraintEClass = createEClass(PERIODIC_REPETITION_CONSTRAINT);

		sporadicRepetitionConstraintEClass = createEClass(SPORADIC_REPETITION_CONSTRAINT);
		createEAttribute(sporadicRepetitionConstraintEClass, SPORADIC_REPETITION_CONSTRAINT__MAXIMUM_INTERARRIVAL_TIME);

		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__NAME);
		createEAttribute(constraintEClass, CONSTRAINT__RESULT);
		createEReference(constraintEClass, CONSTRAINT__CONST_VALID);

		constraintValidationEClass = createEClass(CONSTRAINT_VALIDATION);
		createEAttribute(constraintValidationEClass, CONSTRAINT_VALIDATION__SATISFIED);
		createEAttribute(constraintValidationEClass, CONSTRAINT_VALIDATION__STARTTIME);
		createEAttribute(constraintValidationEClass, CONSTRAINT_VALIDATION__ENDTIME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArchitecturePackage theArchitecturePackage = (ArchitecturePackage)EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		delayConstraintEClass.getESuperTypes().add(this.getConstraint());
		ageTimingConstraintEClass.getESuperTypes().add(this.getDelayConstraint());
		reactionConstraintEClass.getESuperTypes().add(this.getDelayConstraint());
		inputSynchronizationConstraintEClass.getESuperTypes().add(this.getAgeTimingConstraint());
		outputSynchronizationConstraintEClass.getESuperTypes().add(this.getAgeTimingConstraint());
		eventConstraintEClass.getESuperTypes().add(this.getConstraint());
		periodicRepetitionConstraintEClass.getESuperTypes().add(this.getEventConstraint());
		sporadicRepetitionConstraintEClass.getESuperTypes().add(this.getEventConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(delayConstraintEClass, DelayConstraint.class, "DelayConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelayConstraint_Stimulus(), theArchitecturePackage.getPort(), null, "stimulus", null, 0, -1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelayConstraint_Response(), theArchitecturePackage.getPort(), null, "response", null, 0, -1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelayConstraint_ElapsedTime(), ecorePackage.getEDouble(), "elapsedTime", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelayConstraint_MinimumLatency(), ecorePackage.getEDouble(), "minimumLatency", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelayConstraint_MaximumLatency(), ecorePackage.getEDouble(), "maximumLatency", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelayConstraint_NominalLatency(), ecorePackage.getEDouble(), "nominalLatency", null, 0, 1, DelayConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingModelEClass, TimingModel.class, "TimingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimingModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, TimingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingModel_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, TimingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ageTimingConstraintEClass, AgeTimingConstraint.class, "AgeTimingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgeTimingConstraint_Age(), ecorePackage.getEDouble(), "age", null, 0, 1, AgeTimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactionConstraintEClass, ReactionConstraint.class, "ReactionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputSynchronizationConstraintEClass, InputSynchronizationConstraint.class, "InputSynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputSynchronizationConstraint_Tolerance(), ecorePackage.getEDouble(), "tolerance", null, 0, 1, InputSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputSynchronizationConstraintEClass, OutputSynchronizationConstraint.class, "OutputSynchronizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputSynchronizationConstraint_Tolerance(), ecorePackage.getEDouble(), "tolerance", null, 0, 1, OutputSynchronizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventConstraintEClass, EventConstraint.class, "EventConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventConstraint_Port(), theArchitecturePackage.getPort(), null, "port", null, 1, 1, EventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventConstraint_Period(), ecorePackage.getEDouble(), "period", null, 0, 1, EventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventConstraint_Jitter(), ecorePackage.getEDouble(), "jitter", null, 0, 1, EventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventConstraint_MinimumInterarrivalTime(), ecorePackage.getEDouble(), "minimumInterarrivalTime", null, 0, 1, EventConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicRepetitionConstraintEClass, PeriodicRepetitionConstraint.class, "PeriodicRepetitionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sporadicRepetitionConstraintEClass, SporadicRepetitionConstraint.class, "SporadicRepetitionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadicRepetitionConstraint_MaximumInterarrivalTime(), ecorePackage.getEDouble(), "maximumInterarrivalTime", null, 0, 1, SporadicRepetitionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Result(), ecorePackage.getEBoolean(), "result", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_ConstValid(), this.getConstraintValidation(), null, "constValid", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintValidationEClass, ConstraintValidation.class, "ConstraintValidation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraintValidation_Satisfied(), ecorePackage.getEBoolean(), "satisfied", null, 0, 1, ConstraintValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintValidation_Starttime(), ecorePackage.getEDouble(), "starttime", null, 0, 1, ConstraintValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintValidation_Endtime(), ecorePackage.getEDouble(), "endtime", null, 0, 1, ConstraintValidation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TimingspecificationPackageImpl
