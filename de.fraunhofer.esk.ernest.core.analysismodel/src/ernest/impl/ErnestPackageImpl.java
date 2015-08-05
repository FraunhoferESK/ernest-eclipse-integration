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
package ernest.impl;

import ernest.ErnestFactory;
import ernest.ErnestPackage;
import ernest.Model;

import ernest.architecture.ArchitecturePackage;

import ernest.architecture.impl.ArchitecturePackageImpl;

import ernest.architecture.types.TypesPackage;

import ernest.architecture.types.impl.TypesPackageImpl;

import ernest.timingspecification.TimingspecificationPackage;

import ernest.timingspecification.impl.TimingspecificationPackageImpl;

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
public class ErnestPackageImpl extends EPackageImpl implements ErnestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

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
	 * @see ernest.ErnestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErnestPackageImpl() {
		super(eNS_URI, ErnestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ErnestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErnestPackage init() {
		if (isInited) return (ErnestPackage)EPackage.Registry.INSTANCE.getEPackage(ErnestPackage.eNS_URI);

		// Obtain or create and register package
		ErnestPackageImpl theErnestPackage = (ErnestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ErnestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ErnestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArchitecturePackageImpl theArchitecturePackage = (ArchitecturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) instanceof ArchitecturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArchitecturePackage.eNS_URI) : ArchitecturePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		TimingspecificationPackageImpl theTimingspecificationPackage = (TimingspecificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimingspecificationPackage.eNS_URI) instanceof TimingspecificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimingspecificationPackage.eNS_URI) : TimingspecificationPackage.eINSTANCE);
		TracingPackageImpl theTracingPackage = (TracingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracingPackage.eNS_URI) instanceof TracingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracingPackage.eNS_URI) : TracingPackage.eINSTANCE);

		// Create package meta-data objects
		theErnestPackage.createPackageContents();
		theArchitecturePackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theTimingspecificationPackage.createPackageContents();
		theTracingPackage.createPackageContents();

		// Initialize created meta-data
		theErnestPackage.initializePackageContents();
		theArchitecturePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theTimingspecificationPackage.initializePackageContents();
		theTracingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theErnestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErnestPackage.eNS_URI, theErnestPackage);
		return theErnestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Title() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_StructureModel() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_TimingModel() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_TracingResults() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErnestFactory getErnestFactory() {
		return (ErnestFactory)getEFactoryInstance();
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
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__TITLE);
		createEReference(modelEClass, MODEL__STRUCTURE_MODEL);
		createEReference(modelEClass, MODEL__TIMING_MODEL);
		createEReference(modelEClass, MODEL__TRACING_RESULTS);
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
		TimingspecificationPackage theTimingspecificationPackage = (TimingspecificationPackage)EPackage.Registry.INSTANCE.getEPackage(TimingspecificationPackage.eNS_URI);
		TracingPackage theTracingPackage = (TracingPackage)EPackage.Registry.INSTANCE.getEPackage(TracingPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theArchitecturePackage);
		getESubpackages().add(theTimingspecificationPackage);
		getESubpackages().add(theTracingPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Title(), ecorePackage.getEString(), "title", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_StructureModel(), theArchitecturePackage.getStructureModel(), null, "structureModel", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_TimingModel(), theTimingspecificationPackage.getTimingModel(), null, "timingModel", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_TracingResults(), theTracingPackage.getTracingResults(), null, "tracingResults", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ErnestPackageImpl
