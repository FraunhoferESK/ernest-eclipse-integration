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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sched Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ernest.architecture.types.TypesPackage#getSchedType()
 * @model
 * @generated
 */
public enum SchedType implements Enumerator {
	/**
	 * The '<em><b>Fixed Priority Preemptive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY_PREEMPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED_PRIORITY_PREEMPTIVE(0, "FixedPriorityPreemptive", "FixedPriorityPreemptive"),

	/**
	 * The '<em><b>Earliest Deadline First</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EARLIEST_DEADLINE_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	EARLIEST_DEADLINE_FIRST(1, "EarliestDeadlineFirst", "EarliestDeadlineFirst"),

	/**
	 * The '<em><b>Round Robin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN_VALUE
	 * @generated
	 * @ordered
	 */
	ROUND_ROBIN(2, "RoundRobin", "RoundRobin"),

	/**
	 * The '<em><b>FPPRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FPPRM_VALUE
	 * @generated
	 * @ordered
	 */
	FPPRM(3, "FPPRM", "FPPRM");

	/**
	 * The '<em><b>Fixed Priority Preemptive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fixed Priority Preemptive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED_PRIORITY_PREEMPTIVE
	 * @model name="FixedPriorityPreemptive"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_PRIORITY_PREEMPTIVE_VALUE = 0;

	/**
	 * The '<em><b>Earliest Deadline First</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Earliest Deadline First</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EARLIEST_DEADLINE_FIRST
	 * @model name="EarliestDeadlineFirst"
	 * @generated
	 * @ordered
	 */
	public static final int EARLIEST_DEADLINE_FIRST_VALUE = 1;

	/**
	 * The '<em><b>Round Robin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Round Robin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROUND_ROBIN
	 * @model name="RoundRobin"
	 * @generated
	 * @ordered
	 */
	public static final int ROUND_ROBIN_VALUE = 2;

	/**
	 * The '<em><b>FPPRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FPPRM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FPPRM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FPPRM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Sched Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SchedType[] VALUES_ARRAY =
		new SchedType[] {
			FIXED_PRIORITY_PREEMPTIVE,
			EARLIEST_DEADLINE_FIRST,
			ROUND_ROBIN,
			FPPRM,
		};

	/**
	 * A public read-only list of all the '<em><b>Sched Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SchedType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sched Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sched Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SchedType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sched Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SchedType get(int value) {
		switch (value) {
			case FIXED_PRIORITY_PREEMPTIVE_VALUE: return FIXED_PRIORITY_PREEMPTIVE;
			case EARLIEST_DEADLINE_FIRST_VALUE: return EARLIEST_DEADLINE_FIRST;
			case ROUND_ROBIN_VALUE: return ROUND_ROBIN;
			case FPPRM_VALUE: return FPPRM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SchedType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SchedType
