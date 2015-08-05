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
package de.fraunhofer.esk.ernest.core.analysis.analyses;

/**
 * Class representing time as used in TADL. The time is stored as a floating
 * point precision value along with a CseCodeType value indicating the unit,
 * in which the Time value is stored.
 *
 */

public final class Time implements Cloneable, Comparable<Time> {
	/**
	 * Subset of the code types defined in AUTOSAR, MSR / ASAM which
	 * are used in TADL. The CseCodeType {@code ARBITRARY} was added
	 * to allow the comparison of {@code Time.INFINITY}, {@code Time.ZERO}
	 * with any other CseCodeType.
	 */
	public enum CseCodeType {
		/**
		 * Specifies that the value is store in 1 microsecond units.
		 */
		ONE_USEC,

		/**
		 * Specifies that the value is store in 10 microseconds units.
		 */
		TEN_USEC,

		/**
		 * Specifies that the value is store in 100 microseconds units.
		 */
		HUNDRED_USEC,

		/**
		 * Specifies that the value is store in 1 millisecond units.
		 */
		ONE_MSEC,

		/**
		 * Specifies that the value is store in 10 milliseconds units.
		 */
		TEN_MSEC,

		/**
		 * Specifies that the value is store in 100 milliseconds units.
		 */
		HUNDRED_MSEC,

		/**
		 * Specifies that the value is store in 1 second units.
		 */
		ONE_SEC,

		/**
		 * Specifies that the value is store in 10 seconds units.
		 */
		TEN_SEC,

		/**
		 * Specifies that the value is store in 1 minute units.
		 */
		ONE_MIN,

		/**
		 * Specifies that the value is store in 1 hour units.
		 */
		ONE_HOUR,

		/**
		 * Specifies that the value is store in 1 day units.
		 */
		ONE_DAY,

		/**
		 * Specifies that the value is stored in arbitrary units. Arbitrary
		 * units can be compared with every other CseCodeType unit. Other
		 * Units can only be compared with the same CseCodeType.
		 */
		ARBITRARY
	}

	/**
	 * A constant holding a {@code CseCodeType.ARBITRARY} type positive
	 * infinite value.
	 */
	public static final Time INFINITY = new Time(Float.POSITIVE_INFINITY,
			CseCodeType.ARBITRARY);

	/**
	 * A constant holding a {@code CseCodeType.ARBITRARY} type zero value.
	 */
	public static final Time ZERO = new Time(0, CseCodeType.ARBITRARY);

	private final CseCodeType timeUnit;	// Field storing the Time CseCodeType
	private final float value;			// Field storing the Time value

	/**
	 * Allocates a {@code Time} object and initializes it so that it
	 * represents the given time value associated with the given time
	 * unit.
	 *
	 * @param value		the time value in specific time units
	 * @param timeUnit	the time unit according to {@code Time.CseCodeType}
	 */
	public Time(float value, CseCodeType timeUnit) {
		this.timeUnit = timeUnit;
		this.value = value;
	}

	/**
	 * Returns the {@code Time.CseCodeType} which determines the unit in
	 * which the {@code Time} object value is stored.
	 *
	 * @return the CseCodeType of the Time object
	 */
	public CseCodeType getTimeUnit() {
		return this.timeUnit;
	}

	/**
	 * Returns the time value of the {@code Time} object.
	 *
	 * @return the value of the Time object
	 */
	public float getValue() {
		return this.value;
	}

	public static float convertToUnit(CseCodeType destUnit,
			CseCodeType srcUnit, float value) {

		if (srcUnit.compareTo(destUnit) <= 0) {
			switch (srcUnit) {
			case ONE_USEC:
				if (destUnit == srcUnit) { break; }
				value /= 10;
			case TEN_USEC:
				if (destUnit == srcUnit) { break; }
				value /= 10;
			case HUNDRED_USEC:
				if (destUnit == srcUnit) { break; }
				value /=10;
			case ONE_MSEC:
				if (destUnit == srcUnit) { break; }
				value /= 10;
			case TEN_MSEC:
				if (destUnit == srcUnit) { break; }
				value /= 10;
			case HUNDRED_MSEC:
				if (destUnit == srcUnit) { break; }
				value /=10;
			case ONE_SEC:
				if (destUnit == srcUnit) { break; }
				value /= 60;
			case ONE_MIN:
				if (destUnit == srcUnit) { break; }
				value /= 60;
			case ONE_HOUR:
				if (destUnit == srcUnit) { break; }
				value /= 24;
			case ONE_DAY:
			case ARBITRARY:
				break;
			case TEN_SEC:
				break;
			default:
				break;
			}
		} else {
			switch (srcUnit) {
			case ONE_DAY:
				if (destUnit == srcUnit) { break; }
				value *= 24;
			case ONE_HOUR:
				if (destUnit == srcUnit) { break; }
				value *= 60;
			case ONE_MIN:
				if (destUnit == srcUnit) { break; }
				value *= 60;
			case ONE_SEC:
				if (destUnit == srcUnit) { break; }
				value *=10;
			case HUNDRED_MSEC:
				if (destUnit == srcUnit) { break; }
				value *= 10;
			case TEN_MSEC:
				if (destUnit == srcUnit) { break; }
				value *= 10;
			case ONE_MSEC:
				if (destUnit == srcUnit) { break; }
				value *=10;
			case HUNDRED_USEC:
				if (destUnit == srcUnit) { break; }
				value *= 10;
			case TEN_USEC:
				if (destUnit == srcUnit) { break; }
				value *= 10;
			case ONE_USEC:
			case ARBITRARY:
				break;
			case TEN_SEC:
				break;
			default:
				break;
			}
		}

		return value;
	}

	/**
	 * Arithmetic add operation allowing to add {@code Time} objects. The
	 * objects are converted according to their {@code Time.CseCodeType} value
	 * and the type of the called object will remain.
	 *
	 * @param	summand {@code Time} object to add
	 * @return	a new allocated {@code Time} object initialized with the sum
	 * 			of the objects
	 */
	public Time add(Time summand) {
		// Converting to same unit
		float value = convertToUnit(this.timeUnit,
				summand.timeUnit, summand.value);

		return new Time(this.value + value, this.timeUnit);
	}

	/**
	 * Arithmetic subtract operation allowing to subtract {@code Time} objects.
	 * The objects are converted according to their {@code Time.CseCodeType}
	 * value and the type of the called object will remain.
	 *
	 * @param	subtrahend {@code Time} object to subtract
	 * @return	a new allocated {@code Time} object initialized with the sum of
	 * 			the objects
	 */
	public Time substract(Time subtrahend) {
		float value = convertToUnit(this.timeUnit,
				subtrahend.timeUnit, subtrahend.value);

		return new Time(this.value - value, this.timeUnit);
	}

	/**
	 * Return a copy of the object.
	 *
	 * @see		java.lang.Cloneable
	 */
	@Override
	public Time clone() {
		return new Time(this.value, this.timeUnit);
	}

	/**
	 * Compare function to implement the {@code java.lang.Comparable} interface.
	 *
	 * @see			java.lang.Comparable
	 */
	@Override
	public int compareTo(Time timeObj) {
		float value = convertToUnit(this.timeUnit, timeObj.timeUnit,
				timeObj.value);

		return Double.compare(this.value, value);
	}

	/**
	 * Function returning the maximum time value giving the arguments. A
	 * {@code null} argument is interpreted as an object with no value.
	 *
	 * @param timeObjA		the first {@code Time} object to compare
	 * @param timeObjB		the second {@code Time} object to compare
	 * @return				the bigger {@code Time} objects of the arguments
	 */
	static public Time max(Time timeObjA, Time timeObjB) {
		// Checking for null reference
		if (timeObjA == null) {
			return timeObjB;
		} else if (timeObjB == null) {
			return timeObjA;
		}

		// Determining the maximum
		if (timeObjA.compareTo(timeObjB) < 0) {
			return timeObjB;
		} else {
			return timeObjA;
		}
	}

	/**
	 * Function returning the minimum time value giving the arguments. A
	 * {@code null} argument is interpreted as an object with no value.
	 *
	 * @param timeObjA		the first {@code Time} object to compare
	 * @param timeObjB		the second {@code Time} object to compare
	 * @return				the smaller {@code Time} objects of the arguments
	 */
	static public Time min(Time timeObjA, Time timeObjB) {
		// Checking for null reference
		if (timeObjA == null) {
			return timeObjB;
		} else if (timeObjB == null) {
			return timeObjA;
		}

		// Determining the minimum
		if (timeObjA.compareTo(timeObjB) > 0) {
			return timeObjB;
		} else {
			return timeObjA;
		}
	}
}
