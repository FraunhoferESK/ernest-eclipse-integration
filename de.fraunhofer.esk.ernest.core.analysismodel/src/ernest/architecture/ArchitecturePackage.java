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
 * @see ernest.architecture.ArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "architecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.esk.fraunhofer.de/ERNEST/Architecture/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ernest.architecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArchitecturePackage eINSTANCE = ernest.architecture.impl.ArchitecturePackageImpl.init();

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.ElementImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 11;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.PortImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.StructureModelImpl <em>Structure Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.StructureModelImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getStructureModel()
	 * @generated
	 */
	int STRUCTURE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__MODULES = 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__CONNECTORS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Structure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Structure Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.ModuleImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.BehaviorImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BODY = 0;

	/**
	 * The feature id for the '<em><b>Trigger Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TRIGGER_POLICY = 1;

	/**
	 * The feature id for the '<em><b>Trigger Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__TRIGGER_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OPERATION = 3;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.FModuleImpl <em>FModule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.FModuleImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getFModule()
	 * @generated
	 */
	int FMODULE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMODULE__ATTRIBUTES = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMODULE__PORTS = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMODULE__BEHAVIOR = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FModule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.FunctionImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = FMODULE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ATTRIBUTES = FMODULE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PORTS = FMODULE__PORTS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BEHAVIOR = FMODULE__BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__WCET = FMODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEADLINE = FMODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PERIOD = FMODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PRIORITY = FMODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allocated To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ALLOCATED_TO = FMODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OFFSET = FMODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__JITTER = FMODULE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = FMODULE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = FMODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.ConnectorImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.HWModuleImpl <em>HW Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.HWModuleImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getHWModule()
	 * @generated
	 */
	int HW_MODULE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODULE__PORTS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HW Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HW Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.ECUImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getECU()
	 * @generated
	 */
	int ECU = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__NAME = HW_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PORTS = HW_MODULE__PORTS;

	/**
	 * The feature id for the '<em><b>Scheduler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__SCHEDULER_TYPE = HW_MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Performance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PERFORMANCE_FACTOR = HW_MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_FEATURE_COUNT = HW_MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_OPERATION_COUNT = HW_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.BusImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getBus()
	 * @generated
	 */
	int BUS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = HW_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__PORTS = HW_MODULE__PORTS;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = HW_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = HW_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.SensorImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = HW_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PORTS = HW_MODULE__PORTS;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = HW_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = HW_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.ActuatorImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = HW_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PORTS = HW_MODULE__PORTS;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = HW_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = HW_MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.EnvironmentImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = FMODULE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ATTRIBUTES = FMODULE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__PORTS = FMODULE__PORTS;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__BEHAVIOR = FMODULE__BEHAVIOR;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = FMODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = FMODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.SoftwarePortImpl <em>Software Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.SoftwarePortImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getSoftwarePort()
	 * @generated
	 */
	int SOFTWARE_PORT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__OWNER = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT__CONNECTED_TO = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Software Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Software Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.FlowPortImpl <em>Flow Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.FlowPortImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getFlowPort()
	 * @generated
	 */
	int FLOW_PORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__NAME = SOFTWARE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__OWNER = SOFTWARE_PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__CONNECTED_TO = SOFTWARE_PORT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__KIND = SOFTWARE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__DATATYPE = SOFTWARE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_FEATURE_COUNT = SOFTWARE_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_OPERATION_COUNT = SOFTWARE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.CSPortImpl <em>CS Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.CSPortImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getCSPort()
	 * @generated
	 */
	int CS_PORT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PORT__NAME = SOFTWARE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PORT__OWNER = SOFTWARE_PORT__OWNER;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PORT__CONNECTED_TO = SOFTWARE_PORT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PORT__INTERFACE = SOFTWARE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PORT__KIND = SOFTWARE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CS Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PORT_FEATURE_COUNT = SOFTWARE_PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CS Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CS_PORT_OPERATION_COUNT = SOFTWARE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.InterfaceImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATIONS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.OperationImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURNTYPE = 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARGUMENTS = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.ArgumentImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.AttributeImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER = 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.HardwarePortImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getHardwarePort()
	 * @generated
	 */
	int HARDWARE_PORT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__OWNER = PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT__CONNECTED_TO = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hardware Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hardware Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.SoftwareConnectorImpl <em>Software Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.SoftwareConnectorImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getSoftwareConnector()
	 * @generated
	 */
	int SOFTWARE_CONNECTOR = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Can ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR__CAN_ID = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR__CONNECTED_TO = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Software Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Software Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.impl.HardwareConnectorImpl <em>Hardware Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.impl.HardwareConnectorImpl
	 * @see ernest.architecture.impl.ArchitecturePackageImpl#getHardwareConnector()
	 * @generated
	 */
	int HARDWARE_CONNECTOR = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__NAME = CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR__CONNECTED_TO = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hardware Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hardware Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_CONNECTOR_OPERATION_COUNT = CONNECTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ernest.architecture.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see ernest.architecture.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.architecture.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.StructureModel <em>Structure Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Model</em>'.
	 * @see ernest.architecture.StructureModel
	 * @generated
	 */
	EClass getStructureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.architecture.StructureModel#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see ernest.architecture.StructureModel#getModules()
	 * @see #getStructureModel()
	 * @generated
	 */
	EReference getStructureModel_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.architecture.StructureModel#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see ernest.architecture.StructureModel#getConnectors()
	 * @see #getStructureModel()
	 * @generated
	 */
	EReference getStructureModel_Connectors();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.StructureModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.architecture.StructureModel#getName()
	 * @see #getStructureModel()
	 * @generated
	 */
	EAttribute getStructureModel_Name();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see ernest.architecture.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.architecture.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see ernest.architecture.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Behavior#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see ernest.architecture.Behavior#getBody()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Body();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Behavior#getTriggerPolicy <em>Trigger Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Policy</em>'.
	 * @see ernest.architecture.Behavior#getTriggerPolicy()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_TriggerPolicy();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Behavior#getTriggerCondition <em>Trigger Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Condition</em>'.
	 * @see ernest.architecture.Behavior#getTriggerCondition()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_TriggerCondition();

	/**
	 * Returns the meta object for the reference '{@link ernest.architecture.Behavior#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see ernest.architecture.Behavior#getOperation()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Operation();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see ernest.architecture.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Function#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet</em>'.
	 * @see ernest.architecture.Function#getWcet()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Wcet();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Function#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see ernest.architecture.Function#getDeadline()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Function#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see ernest.architecture.Function#getPeriod()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Period();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Function#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see ernest.architecture.Function#getPriority()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Priority();

	/**
	 * Returns the meta object for the reference list '{@link ernest.architecture.Function#getAllocatedTo <em>Allocated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allocated To</em>'.
	 * @see ernest.architecture.Function#getAllocatedTo()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_AllocatedTo();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Function#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see ernest.architecture.Function#getOffset()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Offset();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Function#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jitter</em>'.
	 * @see ernest.architecture.Function#getJitter()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Jitter();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see ernest.architecture.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.architecture.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU</em>'.
	 * @see ernest.architecture.ECU
	 * @generated
	 */
	EClass getECU();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.ECU#getSchedulerType <em>Scheduler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduler Type</em>'.
	 * @see ernest.architecture.ECU#getSchedulerType()
	 * @see #getECU()
	 * @generated
	 */
	EAttribute getECU_SchedulerType();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.ECU#getPerformanceFactor <em>Performance Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance Factor</em>'.
	 * @see ernest.architecture.ECU#getPerformanceFactor()
	 * @see #getECU()
	 * @generated
	 */
	EAttribute getECU_PerformanceFactor();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see ernest.architecture.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see ernest.architecture.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see ernest.architecture.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see ernest.architecture.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ernest.architecture.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.FlowPort <em>Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Port</em>'.
	 * @see ernest.architecture.FlowPort
	 * @generated
	 */
	EClass getFlowPort();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.FlowPort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ernest.architecture.FlowPort#getKind()
	 * @see #getFlowPort()
	 * @generated
	 */
	EAttribute getFlowPort_Kind();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.FlowPort#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see ernest.architecture.FlowPort#getDatatype()
	 * @see #getFlowPort()
	 * @generated
	 */
	EAttribute getFlowPort_Datatype();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.CSPort <em>CS Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CS Port</em>'.
	 * @see ernest.architecture.CSPort
	 * @generated
	 */
	EClass getCSPort();

	/**
	 * Returns the meta object for the reference '{@link ernest.architecture.CSPort#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see ernest.architecture.CSPort#getInterface()
	 * @see #getCSPort()
	 * @generated
	 */
	EReference getCSPort_Interface();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.CSPort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ernest.architecture.CSPort#getKind()
	 * @see #getCSPort()
	 * @generated
	 */
	EAttribute getCSPort_Kind();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see ernest.architecture.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.architecture.Interface#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ernest.architecture.Interface#getOperations()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operations();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ernest.architecture.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.architecture.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Operation#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returntype</em>'.
	 * @see ernest.architecture.Operation#getReturntype()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Returntype();

	/**
	 * Returns the meta object for the reference '{@link ernest.architecture.Operation#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior</em>'.
	 * @see ernest.architecture.Operation#getBehavior()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.architecture.Operation#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see ernest.architecture.Operation#getArguments()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Arguments();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see ernest.architecture.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Argument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.architecture.Argument#getName()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Argument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ernest.architecture.Argument#getType()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Type();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.HWModule <em>HW Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Module</em>'.
	 * @see ernest.architecture.HWModule
	 * @generated
	 */
	EClass getHWModule();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.architecture.HWModule#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see ernest.architecture.HWModule#getPorts()
	 * @see #getHWModule()
	 * @generated
	 */
	EReference getHWModule_Ports();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.FModule <em>FModule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FModule</em>'.
	 * @see ernest.architecture.FModule
	 * @generated
	 */
	EClass getFModule();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.architecture.FModule#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ernest.architecture.FModule#getAttributes()
	 * @see #getFModule()
	 * @generated
	 */
	EReference getFModule_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.architecture.FModule#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see ernest.architecture.FModule#getPorts()
	 * @see #getFModule()
	 * @generated
	 */
	EReference getFModule_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link ernest.architecture.FModule#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see ernest.architecture.FModule#getBehavior()
	 * @see #getFModule()
	 * @generated
	 */
	EReference getFModule_Behavior();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ernest.architecture.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ernest.architecture.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ernest.architecture.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see ernest.architecture.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.Attribute#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see ernest.architecture.Attribute#getVisibility()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Visibility();

	/**
	 * Returns the meta object for the container reference '{@link ernest.architecture.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ernest.architecture.Attribute#getOwner()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Owner();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.SoftwarePort <em>Software Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Port</em>'.
	 * @see ernest.architecture.SoftwarePort
	 * @generated
	 */
	EClass getSoftwarePort();

	/**
	 * Returns the meta object for the container reference '{@link ernest.architecture.SoftwarePort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ernest.architecture.SoftwarePort#getOwner()
	 * @see #getSoftwarePort()
	 * @generated
	 */
	EReference getSoftwarePort_Owner();

	/**
	 * Returns the meta object for the reference list '{@link ernest.architecture.SoftwarePort#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see ernest.architecture.SoftwarePort#getConnectedTo()
	 * @see #getSoftwarePort()
	 * @generated
	 */
	EReference getSoftwarePort_ConnectedTo();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.HardwarePort <em>Hardware Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Port</em>'.
	 * @see ernest.architecture.HardwarePort
	 * @generated
	 */
	EClass getHardwarePort();

	/**
	 * Returns the meta object for the container reference '{@link ernest.architecture.HardwarePort#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see ernest.architecture.HardwarePort#getOwner()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_Owner();

	/**
	 * Returns the meta object for the reference list '{@link ernest.architecture.HardwarePort#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see ernest.architecture.HardwarePort#getConnectedTo()
	 * @see #getHardwarePort()
	 * @generated
	 */
	EReference getHardwarePort_ConnectedTo();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.SoftwareConnector <em>Software Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Connector</em>'.
	 * @see ernest.architecture.SoftwareConnector
	 * @generated
	 */
	EClass getSoftwareConnector();

	/**
	 * Returns the meta object for the attribute '{@link ernest.architecture.SoftwareConnector#getCanID <em>Can ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can ID</em>'.
	 * @see ernest.architecture.SoftwareConnector#getCanID()
	 * @see #getSoftwareConnector()
	 * @generated
	 */
	EAttribute getSoftwareConnector_CanID();

	/**
	 * Returns the meta object for the reference list '{@link ernest.architecture.SoftwareConnector#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see ernest.architecture.SoftwareConnector#getConnectedTo()
	 * @see #getSoftwareConnector()
	 * @generated
	 */
	EReference getSoftwareConnector_ConnectedTo();

	/**
	 * Returns the meta object for class '{@link ernest.architecture.HardwareConnector <em>Hardware Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Connector</em>'.
	 * @see ernest.architecture.HardwareConnector
	 * @generated
	 */
	EClass getHardwareConnector();

	/**
	 * Returns the meta object for the reference list '{@link ernest.architecture.HardwareConnector#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see ernest.architecture.HardwareConnector#getConnectedTo()
	 * @see #getHardwareConnector()
	 * @generated
	 */
	EReference getHardwareConnector_ConnectedTo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArchitectureFactory getArchitectureFactory();

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
		 * The meta object literal for the '{@link ernest.architecture.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.PortImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.StructureModelImpl <em>Structure Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.StructureModelImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getStructureModel()
		 * @generated
		 */
		EClass STRUCTURE_MODEL = eINSTANCE.getStructureModel();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_MODEL__MODULES = eINSTANCE.getStructureModel_Modules();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_MODEL__CONNECTORS = eINSTANCE.getStructureModel_Connectors();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_MODEL__NAME = eINSTANCE.getStructureModel_Name();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.ModuleImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.BehaviorImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__BODY = eINSTANCE.getBehavior_Body();

		/**
		 * The meta object literal for the '<em><b>Trigger Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__TRIGGER_POLICY = eINSTANCE.getBehavior_TriggerPolicy();

		/**
		 * The meta object literal for the '<em><b>Trigger Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__TRIGGER_CONDITION = eINSTANCE.getBehavior_TriggerCondition();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__OPERATION = eINSTANCE.getBehavior_Operation();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.FunctionImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__WCET = eINSTANCE.getFunction_Wcet();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__DEADLINE = eINSTANCE.getFunction_Deadline();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__PERIOD = eINSTANCE.getFunction_Period();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__PRIORITY = eINSTANCE.getFunction_Priority();

		/**
		 * The meta object literal for the '<em><b>Allocated To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__ALLOCATED_TO = eINSTANCE.getFunction_AllocatedTo();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__OFFSET = eINSTANCE.getFunction_Offset();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__JITTER = eINSTANCE.getFunction_Jitter();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.ConnectorImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.ECUImpl <em>ECU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.ECUImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getECU()
		 * @generated
		 */
		EClass ECU = eINSTANCE.getECU();

		/**
		 * The meta object literal for the '<em><b>Scheduler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECU__SCHEDULER_TYPE = eINSTANCE.getECU_SchedulerType();

		/**
		 * The meta object literal for the '<em><b>Performance Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECU__PERFORMANCE_FACTOR = eINSTANCE.getECU_PerformanceFactor();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.BusImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.SensorImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.ActuatorImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.EnvironmentImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.ElementImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.FlowPortImpl <em>Flow Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.FlowPortImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getFlowPort()
		 * @generated
		 */
		EClass FLOW_PORT = eINSTANCE.getFlowPort();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PORT__KIND = eINSTANCE.getFlowPort_Kind();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PORT__DATATYPE = eINSTANCE.getFlowPort_Datatype();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.CSPortImpl <em>CS Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.CSPortImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getCSPort()
		 * @generated
		 */
		EClass CS_PORT = eINSTANCE.getCSPort();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CS_PORT__INTERFACE = eINSTANCE.getCSPort_Interface();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CS_PORT__KIND = eINSTANCE.getCSPort_Kind();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.InterfaceImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OPERATIONS = eINSTANCE.getInterface_Operations();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.OperationImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURNTYPE = eINSTANCE.getOperation_Returntype();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BEHAVIOR = eINSTANCE.getOperation_Behavior();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ARGUMENTS = eINSTANCE.getOperation_Arguments();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.ArgumentImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__TYPE = eINSTANCE.getArgument_Type();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.HWModuleImpl <em>HW Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.HWModuleImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getHWModule()
		 * @generated
		 */
		EClass HW_MODULE = eINSTANCE.getHWModule();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MODULE__PORTS = eINSTANCE.getHWModule_Ports();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.FModuleImpl <em>FModule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.FModuleImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getFModule()
		 * @generated
		 */
		EClass FMODULE = eINSTANCE.getFModule();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMODULE__ATTRIBUTES = eINSTANCE.getFModule_Attributes();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMODULE__PORTS = eINSTANCE.getFModule_Ports();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMODULE__BEHAVIOR = eINSTANCE.getFModule_Behavior();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.AttributeImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VISIBILITY = eINSTANCE.getAttribute_Visibility();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNER = eINSTANCE.getAttribute_Owner();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.SoftwarePortImpl <em>Software Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.SoftwarePortImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getSoftwarePort()
		 * @generated
		 */
		EClass SOFTWARE_PORT = eINSTANCE.getSoftwarePort();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PORT__OWNER = eINSTANCE.getSoftwarePort_Owner();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_PORT__CONNECTED_TO = eINSTANCE.getSoftwarePort_ConnectedTo();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.HardwarePortImpl <em>Hardware Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.HardwarePortImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getHardwarePort()
		 * @generated
		 */
		EClass HARDWARE_PORT = eINSTANCE.getHardwarePort();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__OWNER = eINSTANCE.getHardwarePort_Owner();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_PORT__CONNECTED_TO = eINSTANCE.getHardwarePort_ConnectedTo();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.SoftwareConnectorImpl <em>Software Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.SoftwareConnectorImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getSoftwareConnector()
		 * @generated
		 */
		EClass SOFTWARE_CONNECTOR = eINSTANCE.getSoftwareConnector();

		/**
		 * The meta object literal for the '<em><b>Can ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONNECTOR__CAN_ID = eINSTANCE.getSoftwareConnector_CanID();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_CONNECTOR__CONNECTED_TO = eINSTANCE.getSoftwareConnector_ConnectedTo();

		/**
		 * The meta object literal for the '{@link ernest.architecture.impl.HardwareConnectorImpl <em>Hardware Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.impl.HardwareConnectorImpl
		 * @see ernest.architecture.impl.ArchitecturePackageImpl#getHardwareConnector()
		 * @generated
		 */
		EClass HARDWARE_CONNECTOR = eINSTANCE.getHardwareConnector();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE_CONNECTOR__CONNECTED_TO = eINSTANCE.getHardwareConnector_ConnectedTo();

	}

} //ArchitecturePackage
