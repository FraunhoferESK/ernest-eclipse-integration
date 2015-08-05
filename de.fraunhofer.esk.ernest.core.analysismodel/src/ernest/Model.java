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
package ernest;

import ernest.architecture.StructureModel;

import ernest.timingspecification.TimingModel;

import ernest.tracing.TracingResults;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.Model#getTitle <em>Title</em>}</li>
 *   <li>{@link ernest.Model#getStructureModel <em>Structure Model</em>}</li>
 *   <li>{@link ernest.Model#getTimingModel <em>Timing Model</em>}</li>
 *   <li>{@link ernest.Model#getTracingResults <em>Tracing Results</em>}</li>
 * </ul>
 *
 * @see ernest.ErnestPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ernest.ErnestPackage#getModel_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ernest.Model#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Structure Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Model</em>' containment reference.
	 * @see #setStructureModel(StructureModel)
	 * @see ernest.ErnestPackage#getModel_StructureModel()
	 * @model containment="true"
	 * @generated
	 */
	StructureModel getStructureModel();

	/**
	 * Sets the value of the '{@link ernest.Model#getStructureModel <em>Structure Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Model</em>' containment reference.
	 * @see #getStructureModel()
	 * @generated
	 */
	void setStructureModel(StructureModel value);

	/**
	 * Returns the value of the '<em><b>Timing Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Model</em>' containment reference.
	 * @see #setTimingModel(TimingModel)
	 * @see ernest.ErnestPackage#getModel_TimingModel()
	 * @model containment="true"
	 * @generated
	 */
	TimingModel getTimingModel();

	/**
	 * Sets the value of the '{@link ernest.Model#getTimingModel <em>Timing Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Model</em>' containment reference.
	 * @see #getTimingModel()
	 * @generated
	 */
	void setTimingModel(TimingModel value);

	/**
	 * Returns the value of the '<em><b>Tracing Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracing Results</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracing Results</em>' containment reference.
	 * @see #setTracingResults(TracingResults)
	 * @see ernest.ErnestPackage#getModel_TracingResults()
	 * @model containment="true"
	 * @generated
	 */
	TracingResults getTracingResults();

	/**
	 * Sets the value of the '{@link ernest.Model#getTracingResults <em>Tracing Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracing Results</em>' containment reference.
	 * @see #getTracingResults()
	 * @generated
	 */
	void setTracingResults(TracingResults value);

} // Model
