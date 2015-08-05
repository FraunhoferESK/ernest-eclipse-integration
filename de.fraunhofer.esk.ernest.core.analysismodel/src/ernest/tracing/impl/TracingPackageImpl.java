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
package ernest.tracing.impl;

import ernest.ErnestPackage;

import ernest.architecture.ArchitecturePackage;

import ernest.architecture.impl.ArchitecturePackageImpl;

import ernest.architecture.types.TypesPackage;

import ernest.architecture.types.impl.TypesPackageImpl;

import ernest.impl.ErnestPackageImpl;

import ernest.timingspecification.TimingspecificationPackage;

import ernest.timingspecification.impl.TimingspecificationPackageImpl;

import ernest.tracing.BinaryTrace;
import ernest.tracing.EventMapping;
import ernest.tracing.Trace;
import ernest.tracing.TracingFactory;
import ernest.tracing.TracingPackage;
import ernest.tracing.TracingResults;

import ernest.util.TraceReader;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracingPackageImpl extends EPackageImpl implements TracingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracingResultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType traceReaderEDataType = null;

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
	 * @see ernest.tracing.TracingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracingPackageImpl() {
		super(eNS_URI, TracingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TracingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracingPackage init() {
		if (isInited) return (TracingPackage)EPackage.Registry.INSTANCE.getEPackage(TracingPackage.eNS_URI);

		// Obtain or create and register package
		TracingPackageImpl theTracingPackage = (TracingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ErnestPackageImpl theErnestPackage = (ErnestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ErnestPackage.eNS_URI) instanceof ErnestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErnestPackage.eNS_URI) : ErnestPackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		TimingspecificationPackageImpl theTimingspecificationPackage = (TimingspecificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimingspecificationPackage.eNS_URI) instanceof TimingspecificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimingspecificationPackage.eNS_URI) : TimingspecificationPackage.eINSTANCE);

		// Create package meta-data objects
		theTracingPackage.createPackageContents();
		theErnestPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theTimingspecificationPackage.createPackageContents();

		// Initialize created meta-data
		theTracingPackage.initializePackageContents();
		theErnestPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theTimingspecificationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracingPackage.eNS_URI, theTracingPackage);
		return theTracingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracingResults() {
		return tracingResultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracingResults_Name() {
		return (EAttribute)tracingResultsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracingResults_Trace() {
		return (EReference)tracingResultsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryTrace() {
		return binaryTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryTrace_FileLocation() {
		return (EAttribute)binaryTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryTrace_Mappings() {
		return (EReference)binaryTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrace_Name() {
		return (EAttribute)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrace_ReaderExtension() {
		return (EAttribute)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrace__GetTraceReader() {
		return traceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventMapping() {
		return eventMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventMapping_ElementID() {
		return (EAttribute)eventMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventMapping_Element() {
		return (EReference)eventMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTraceReader() {
		return traceReaderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracingFactory getTracingFactory() {
		return (TracingFactory)getEFactoryInstance();
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
		tracingResultsEClass = createEClass(TRACING_RESULTS);
		createEAttribute(tracingResultsEClass, TRACING_RESULTS__NAME);
		createEReference(tracingResultsEClass, TRACING_RESULTS__TRACE);

		binaryTraceEClass = createEClass(BINARY_TRACE);
		createEAttribute(binaryTraceEClass, BINARY_TRACE__FILE_LOCATION);
		createEReference(binaryTraceEClass, BINARY_TRACE__MAPPINGS);

		traceEClass = createEClass(TRACE);
		createEAttribute(traceEClass, TRACE__NAME);
		createEAttribute(traceEClass, TRACE__READER_EXTENSION);
		createEOperation(traceEClass, TRACE___GET_TRACE_READER);

		eventMappingEClass = createEClass(EVENT_MAPPING);
		createEAttribute(eventMappingEClass, EVENT_MAPPING__ELEMENT_ID);
		createEReference(eventMappingEClass, EVENT_MAPPING__ELEMENT);

		// Create data types
		traceReaderEDataType = createEDataType(TRACE_READER);
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
		binaryTraceEClass.getESuperTypes().add(this.getTrace());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracingResultsEClass, TracingResults.class, "TracingResults", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTracingResults_Name(), ecorePackage.getEString(), "name", null, 0, 1, TracingResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracingResults_Trace(), this.getTrace(), null, "trace", null, 0, 1, TracingResults.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryTraceEClass, BinaryTrace.class, "BinaryTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryTrace_FileLocation(), ecorePackage.getEString(), "fileLocation", null, 1, 1, BinaryTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryTrace_Mappings(), this.getEventMapping(), null, "mappings", null, 0, -1, BinaryTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrace_ReaderExtension(), ecorePackage.getEString(), "readerExtension", null, 1, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTrace__GetTraceReader(), this.getTraceReader(), "getTraceReader", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eventMappingEClass, EventMapping.class, "EventMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventMapping_ElementID(), ecorePackage.getEInt(), "elementID", null, 0, 1, EventMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventMapping_Element(), theArchitecturePackage.getElement(), null, "element", null, 1, 1, EventMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(traceReaderEDataType, TraceReader.class, "TraceReader", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //TracingPackageImpl
