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

import ernest.architecture.types.TriggerPolicyKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.Behavior#getBody <em>Body</em>}</li>
 *   <li>{@link ernest.architecture.Behavior#getTriggerPolicy <em>Trigger Policy</em>}</li>
 *   <li>{@link ernest.architecture.Behavior#getTriggerCondition <em>Trigger Condition</em>}</li>
 *   <li>{@link ernest.architecture.Behavior#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getBehavior()
 * @model
 * @generated
 */
public interface Behavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see ernest.architecture.ArchitecturePackage#getBehavior_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link ernest.architecture.Behavior#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Trigger Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link ernest.architecture.types.TriggerPolicyKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Policy</em>' attribute.
	 * @see ernest.architecture.types.TriggerPolicyKind
	 * @see #setTriggerPolicy(TriggerPolicyKind)
	 * @see ernest.architecture.ArchitecturePackage#getBehavior_TriggerPolicy()
	 * @model
	 * @generated
	 */
	TriggerPolicyKind getTriggerPolicy();

	/**
	 * Sets the value of the '{@link ernest.architecture.Behavior#getTriggerPolicy <em>Trigger Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Policy</em>' attribute.
	 * @see ernest.architecture.types.TriggerPolicyKind
	 * @see #getTriggerPolicy()
	 * @generated
	 */
	void setTriggerPolicy(TriggerPolicyKind value);

	/**
	 * Returns the value of the '<em><b>Trigger Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Condition</em>' attribute.
	 * @see #setTriggerCondition(String)
	 * @see ernest.architecture.ArchitecturePackage#getBehavior_TriggerCondition()
	 * @model
	 * @generated
	 */
	String getTriggerCondition();

	/**
	 * Sets the value of the '{@link ernest.architecture.Behavior#getTriggerCondition <em>Trigger Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Condition</em>' attribute.
	 * @see #getTriggerCondition()
	 * @generated
	 */
	void setTriggerCondition(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ernest.architecture.Operation#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see ernest.architecture.ArchitecturePackage#getBehavior_Operation()
	 * @see ernest.architecture.Operation#getBehavior
	 * @model opposite="behavior"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link ernest.architecture.Behavior#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Behavior
