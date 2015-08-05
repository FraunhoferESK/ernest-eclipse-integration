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
package ernest.tracing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ernest.tracing.TracingFactory
 * @model kind="package"
 * @generated
 */
public interface TracingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.esk.fraunhofer.de/ERNEST/Tracing/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ernest.tracing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracingPackage eINSTANCE = ernest.tracing.impl.TracingPackageImpl.init();

	/**
	 * The meta object id for the '{@link ernest.tracing.impl.TracingResultsImpl <em>Results</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.tracing.impl.TracingResultsImpl
	 * @see ernest.tracing.impl.TracingPackageImpl#getTracingResults()
	 * @generated
	 */
	int TRACING_RESULTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_RESULTS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_RESULTS__TRACE = 1;

	/**
	 * The number of structural features of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_RESULTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Results</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACING_RESULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.tracing.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.tracing.impl.TraceImpl
	 * @see ernest.tracing.impl.TracingPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reader Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__READER_EXTENSION = 1;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Trace Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE___GET_TRACE_READER = 0;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ernest.tracing.impl.BinaryTraceImpl <em>Binary Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.tracing.impl.BinaryTraceImpl
	 * @see ernest.tracing.impl.TracingPackageImpl#getBinaryTrace()
	 * @generated
	 */
	int BINARY_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TRACE__NAME = TRACE__NAME;

	/**
	 * The feature id for the '<em><b>Reader Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TRACE__READER_EXTENSION = TRACE__READER_EXTENSION;

	/**
	 * The feature id for the '<em><b>File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TRACE__FILE_LOCATION = TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TRACE__MAPPINGS = TRACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TRACE_FEATURE_COUNT = TRACE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Trace Reader</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TRACE___GET_TRACE_READER = TRACE___GET_TRACE_READER;

	/**
	 * The number of operations of the '<em>Binary Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TRACE_OPERATION_COUNT = TRACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.tracing.impl.EventMappingImpl <em>Event Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.tracing.impl.EventMappingImpl
	 * @see ernest.tracing.impl.TracingPackageImpl#getEventMapping()
	 * @generated
	 */
	int EVENT_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MAPPING__ELEMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MAPPING__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Event Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_MAPPING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '<em>Trace Reader</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.util.TraceReader
	 * @see ernest.tracing.impl.TracingPackageImpl#getTraceReader()
	 * @generated
	 */
	int TRACE_READER = 4;


	/**
	 * Returns the meta object for class '{@link ernest.tracing.TracingResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Results</em>'.
	 * @see ernest.tracing.TracingResults
	 * @generated
	 */
	EClass getTracingResults();

	/**
	 * Returns the meta object for the attribute '{@link ernest.tracing.TracingResults#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.tracing.TracingResults#getName()
	 * @see #getTracingResults()
	 * @generated
	 */
	EAttribute getTracingResults_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ernest.tracing.TracingResults#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see ernest.tracing.TracingResults#getTrace()
	 * @see #getTracingResults()
	 * @generated
	 */
	EReference getTracingResults_Trace();

	/**
	 * Returns the meta object for class '{@link ernest.tracing.BinaryTrace <em>Binary Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Trace</em>'.
	 * @see ernest.tracing.BinaryTrace
	 * @generated
	 */
	EClass getBinaryTrace();

	/**
	 * Returns the meta object for the attribute '{@link ernest.tracing.BinaryTrace#getFileLocation <em>File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Location</em>'.
	 * @see ernest.tracing.BinaryTrace#getFileLocation()
	 * @see #getBinaryTrace()
	 * @generated
	 */
	EAttribute getBinaryTrace_FileLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.tracing.BinaryTrace#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see ernest.tracing.BinaryTrace#getMappings()
	 * @see #getBinaryTrace()
	 * @generated
	 */
	EReference getBinaryTrace_Mappings();

	/**
	 * Returns the meta object for class '{@link ernest.tracing.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see ernest.tracing.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link ernest.tracing.Trace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.tracing.Trace#getName()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Name();

	/**
	 * Returns the meta object for the attribute '{@link ernest.tracing.Trace#getReaderExtension <em>Reader Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reader Extension</em>'.
	 * @see ernest.tracing.Trace#getReaderExtension()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_ReaderExtension();

	/**
	 * Returns the meta object for the '{@link ernest.tracing.Trace#getTraceReader() <em>Get Trace Reader</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Trace Reader</em>' operation.
	 * @see ernest.tracing.Trace#getTraceReader()
	 * @generated
	 */
	EOperation getTrace__GetTraceReader();

	/**
	 * Returns the meta object for class '{@link ernest.tracing.EventMapping <em>Event Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Mapping</em>'.
	 * @see ernest.tracing.EventMapping
	 * @generated
	 */
	EClass getEventMapping();

	/**
	 * Returns the meta object for the attribute '{@link ernest.tracing.EventMapping#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see ernest.tracing.EventMapping#getElementID()
	 * @see #getEventMapping()
	 * @generated
	 */
	EAttribute getEventMapping_ElementID();

	/**
	 * Returns the meta object for the reference '{@link ernest.tracing.EventMapping#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see ernest.tracing.EventMapping#getElement()
	 * @see #getEventMapping()
	 * @generated
	 */
	EReference getEventMapping_Element();

	/**
	 * Returns the meta object for data type '{@link ernest.util.TraceReader <em>Trace Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Trace Reader</em>'.
	 * @see ernest.util.TraceReader
	 * @model instanceClass="ernest.util.TraceReader"
	 * @generated
	 */
	EDataType getTraceReader();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracingFactory getTracingFactory();

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
		 * The meta object literal for the '{@link ernest.tracing.impl.TracingResultsImpl <em>Results</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.tracing.impl.TracingResultsImpl
		 * @see ernest.tracing.impl.TracingPackageImpl#getTracingResults()
		 * @generated
		 */
		EClass TRACING_RESULTS = eINSTANCE.getTracingResults();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACING_RESULTS__NAME = eINSTANCE.getTracingResults_Name();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACING_RESULTS__TRACE = eINSTANCE.getTracingResults_Trace();

		/**
		 * The meta object literal for the '{@link ernest.tracing.impl.BinaryTraceImpl <em>Binary Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.tracing.impl.BinaryTraceImpl
		 * @see ernest.tracing.impl.TracingPackageImpl#getBinaryTrace()
		 * @generated
		 */
		EClass BINARY_TRACE = eINSTANCE.getBinaryTrace();

		/**
		 * The meta object literal for the '<em><b>File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_TRACE__FILE_LOCATION = eINSTANCE.getBinaryTrace_FileLocation();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_TRACE__MAPPINGS = eINSTANCE.getBinaryTrace_Mappings();

		/**
		 * The meta object literal for the '{@link ernest.tracing.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.tracing.impl.TraceImpl
		 * @see ernest.tracing.impl.TracingPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__NAME = eINSTANCE.getTrace_Name();

		/**
		 * The meta object literal for the '<em><b>Reader Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__READER_EXTENSION = eINSTANCE.getTrace_ReaderExtension();

		/**
		 * The meta object literal for the '<em><b>Get Trace Reader</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRACE___GET_TRACE_READER = eINSTANCE.getTrace__GetTraceReader();

		/**
		 * The meta object literal for the '{@link ernest.tracing.impl.EventMappingImpl <em>Event Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.tracing.impl.EventMappingImpl
		 * @see ernest.tracing.impl.TracingPackageImpl#getEventMapping()
		 * @generated
		 */
		EClass EVENT_MAPPING = eINSTANCE.getEventMapping();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_MAPPING__ELEMENT_ID = eINSTANCE.getEventMapping_ElementID();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_MAPPING__ELEMENT = eINSTANCE.getEventMapping_Element();

		/**
		 * The meta object literal for the '<em>Trace Reader</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.util.TraceReader
		 * @see ernest.tracing.impl.TracingPackageImpl#getTraceReader()
		 * @generated
		 */
		EDataType TRACE_READER = eINSTANCE.getTraceReader();

	}

} //TracingPackage
