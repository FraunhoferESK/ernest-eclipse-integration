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

import ernest.util.TraceReader;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.tracing.Trace#getName <em>Name</em>}</li>
 *   <li>{@link ernest.tracing.Trace#getReaderExtension <em>Reader Extension</em>}</li>
 * </ul>
 *
 * @see ernest.tracing.TracingPackage#getTrace()
 * @model abstract="true"
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ernest.tracing.TracingPackage#getTrace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ernest.tracing.Trace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reader Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reader Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reader Extension</em>' attribute.
	 * @see #setReaderExtension(String)
	 * @see ernest.tracing.TracingPackage#getTrace_ReaderExtension()
	 * @model required="true"
	 * @generated
	 */
	String getReaderExtension();

	/**
	 * Sets the value of the '{@link ernest.tracing.Trace#getReaderExtension <em>Reader Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reader Extension</em>' attribute.
	 * @see #getReaderExtension()
	 * @generated
	 */
	void setReaderExtension(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ernest.tracing.TraceReader"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='TraceReader reader = <%ernest.util.TraceReaderFactory%>.createTraceReader(getReaderExtension());\r\nreader.setTrace(this);\r\nreturn reader;'"
	 * @generated
	 */
	TraceReader getTraceReader();

} // Trace
