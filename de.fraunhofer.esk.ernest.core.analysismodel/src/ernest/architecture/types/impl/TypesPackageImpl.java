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
package ernest.architecture.types.impl;

import ernest.ErnestPackage;

import ernest.architecture.ArchitecturePackage;

import ernest.architecture.impl.ArchitecturePackageImpl;

import ernest.architecture.types.ImplementationKind;
import ernest.architecture.types.PortKind;
import ernest.architecture.types.SchedType;
import ernest.architecture.types.TriggerPolicyKind;
import ernest.architecture.types.TypesFactory;
import ernest.architecture.types.TypesPackage;
import ernest.architecture.types.VisibilityKind;

import ernest.impl.ErnestPackageImpl;

import ernest.timingspecification.TimingspecificationPackage;

import ernest.timingspecification.impl.TimingspecificationPackageImpl;

import ernest.tracing.TracingPackage;

import ernest.tracing.impl.TracingPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implementationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerPolicyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

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
	 * @see ernest.architecture.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ErnestPackageImpl theErnestPackage = (ErnestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ErnestPackage.eNS_URI) instanceof ErnestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ErnestPackage.eNS_URI) : ErnestPackage.eINSTANCE);
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		TimingspecificationPackageImpl theTimingspecificationPackage = (TimingspecificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimingspecificationPackage.eNS_URI) instanceof TimingspecificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimingspecificationPackage.eNS_URI) : TimingspecificationPackage.eINSTANCE);
		TracingPackageImpl theTracingPackage = (TracingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracingPackage.eNS_URI) instanceof TracingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracingPackage.eNS_URI) : TracingPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theErnestPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theTimingspecificationPackage.createPackageContents();
		theTracingPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theErnestPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theTimingspecificationPackage.initializePackageContents();
		theTracingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortKind() {
		return portKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedType() {
		return schedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImplementationKind() {
		return implementationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerPolicyKind() {
		return triggerPolicyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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

		// Create enums
		portKindEEnum = createEEnum(PORT_KIND);
		schedTypeEEnum = createEEnum(SCHED_TYPE);
		implementationKindEEnum = createEEnum(IMPLEMENTATION_KIND);
		triggerPolicyKindEEnum = createEEnum(TRIGGER_POLICY_KIND);
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
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

		// Initialize enums and add enum literals
		initEEnum(portKindEEnum, PortKind.class, "PortKind");
		addEEnumLiteral(portKindEEnum, PortKind.IN);
		addEEnumLiteral(portKindEEnum, PortKind.OUT);
		addEEnumLiteral(portKindEEnum, PortKind.IN_OUT);

		initEEnum(schedTypeEEnum, SchedType.class, "SchedType");
		addEEnumLiteral(schedTypeEEnum, SchedType.ROUND_ROBIN);
		addEEnumLiteral(schedTypeEEnum, SchedType.EARLIEST_DEADLINE_FIRST);
		addEEnumLiteral(schedTypeEEnum, SchedType.FIXED_PRIORITY_PREEMPTIVE);
		addEEnumLiteral(schedTypeEEnum, SchedType.FPPRM);

		initEEnum(implementationKindEEnum, ImplementationKind.class, "ImplementationKind");
		addEEnumLiteral(implementationKindEEnum, ImplementationKind.PROVIDED);
		addEEnumLiteral(implementationKindEEnum, ImplementationKind.REQUIRED);

		initEEnum(triggerPolicyKindEEnum, TriggerPolicyKind.class, "TriggerPolicyKind");
		addEEnumLiteral(triggerPolicyKindEEnum, TriggerPolicyKind.EVENT);
		addEEnumLiteral(triggerPolicyKindEEnum, TriggerPolicyKind.TIME);

		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
	}

} //TypesPackageImpl
