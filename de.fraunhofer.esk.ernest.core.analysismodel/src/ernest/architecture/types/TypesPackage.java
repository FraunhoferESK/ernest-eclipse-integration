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
package ernest.architecture.types;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see ernest.architecture.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.esk.fraunhofer.de/ERNEST/Architecture/Types/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ernest.architecture.types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = ernest.architecture.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link ernest.architecture.types.PortKind <em>Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.types.PortKind
	 * @see ernest.architecture.types.impl.TypesPackageImpl#getPortKind()
	 * @generated
	 */
	int PORT_KIND = 0;

	/**
	 * The meta object id for the '{@link ernest.architecture.types.SchedType <em>Sched Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.types.SchedType
	 * @see ernest.architecture.types.impl.TypesPackageImpl#getSchedType()
	 * @generated
	 */
	int SCHED_TYPE = 1;

	/**
	 * The meta object id for the '{@link ernest.architecture.types.ImplementationKind <em>Implementation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.types.ImplementationKind
	 * @see ernest.architecture.types.impl.TypesPackageImpl#getImplementationKind()
	 * @generated
	 */
	int IMPLEMENTATION_KIND = 2;

	/**
	 * The meta object id for the '{@link ernest.architecture.types.TriggerPolicyKind <em>Trigger Policy Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.types.TriggerPolicyKind
	 * @see ernest.architecture.types.impl.TypesPackageImpl#getTriggerPolicyKind()
	 * @generated
	 */
	int TRIGGER_POLICY_KIND = 3;

	/**
	 * The meta object id for the '{@link ernest.architecture.types.VisibilityKind <em>Visibility Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ernest.architecture.types.VisibilityKind
	 * @see ernest.architecture.types.impl.TypesPackageImpl#getVisibilityKind()
	 * @generated
	 */
	int VISIBILITY_KIND = 4;


	/**
	 * Returns the meta object for enum '{@link ernest.architecture.types.PortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Kind</em>'.
	 * @see ernest.architecture.types.PortKind
	 * @generated
	 */
	EEnum getPortKind();

	/**
	 * Returns the meta object for enum '{@link ernest.architecture.types.SchedType <em>Sched Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sched Type</em>'.
	 * @see ernest.architecture.types.SchedType
	 * @generated
	 */
	EEnum getSchedType();

	/**
	 * Returns the meta object for enum '{@link ernest.architecture.types.ImplementationKind <em>Implementation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Kind</em>'.
	 * @see ernest.architecture.types.ImplementationKind
	 * @generated
	 */
	EEnum getImplementationKind();

	/**
	 * Returns the meta object for enum '{@link ernest.architecture.types.TriggerPolicyKind <em>Trigger Policy Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Policy Kind</em>'.
	 * @see ernest.architecture.types.TriggerPolicyKind
	 * @generated
	 */
	EEnum getTriggerPolicyKind();

	/**
	 * Returns the meta object for enum '{@link ernest.architecture.types.VisibilityKind <em>Visibility Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Kind</em>'.
	 * @see ernest.architecture.types.VisibilityKind
	 * @generated
	 */
	EEnum getVisibilityKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

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
		 * The meta object literal for the '{@link ernest.architecture.types.PortKind <em>Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.types.PortKind
		 * @see ernest.architecture.types.impl.TypesPackageImpl#getPortKind()
		 * @generated
		 */
		EEnum PORT_KIND = eINSTANCE.getPortKind();

		/**
		 * The meta object literal for the '{@link ernest.architecture.types.SchedType <em>Sched Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.types.SchedType
		 * @see ernest.architecture.types.impl.TypesPackageImpl#getSchedType()
		 * @generated
		 */
		EEnum SCHED_TYPE = eINSTANCE.getSchedType();

		/**
		 * The meta object literal for the '{@link ernest.architecture.types.ImplementationKind <em>Implementation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.types.ImplementationKind
		 * @see ernest.architecture.types.impl.TypesPackageImpl#getImplementationKind()
		 * @generated
		 */
		EEnum IMPLEMENTATION_KIND = eINSTANCE.getImplementationKind();

		/**
		 * The meta object literal for the '{@link ernest.architecture.types.TriggerPolicyKind <em>Trigger Policy Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.types.TriggerPolicyKind
		 * @see ernest.architecture.types.impl.TypesPackageImpl#getTriggerPolicyKind()
		 * @generated
		 */
		EEnum TRIGGER_POLICY_KIND = eINSTANCE.getTriggerPolicyKind();

		/**
		 * The meta object literal for the '{@link ernest.architecture.types.VisibilityKind <em>Visibility Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ernest.architecture.types.VisibilityKind
		 * @see ernest.architecture.types.impl.TypesPackageImpl#getVisibilityKind()
		 * @generated
		 */
		EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

	}

} //TypesPackage
