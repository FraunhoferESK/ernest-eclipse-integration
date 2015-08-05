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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

import org.eclipse.emf.common.util.EList;

import ernest.Model;
import ernest.architecture.Port;
import ernest.timingspecification.Constraint;
import ernest.tracing.TracingResults;
import ernest.util.TraceReader;

/**
 * Class that provides Utility methods for converting ERNEST Ports to TADL
 * Events.
 * <p>
 * Also provides access to specific data in the model.
 *
 *
 */
public class AnalysisUtil {
	/**
	 * A CseCodeType that is used every time a CseCodeType is needed in the
	 * Plug-In.
	 * <p>
	 *
	 */
	public static final Time.CseCodeType TIMEUNIT = Time.CseCodeType.ONE_MSEC;

	/**
	 * Will convert one {@link Port} into one {@link Event}.
	 * <p>
	 * Iterates over the {@link TracingResults} of a ERNESTModel and stores all
	 * {@link EventOccurrence}, that happened on the given port, as a Event.
	 *
	 * @param port
	 *            the port the Event will be created for
	 * @param eventOcc
	 *            TracingResults of a model
	 * @return Event for the given Port
	 */
	public static Event convertERNESTPortToTADLEvent(Port port, Map<Port,? extends SortedSet<Long>> eventOcc) {
		Event result = new Event();
		SortedSet<Long> eventSet = eventOcc.get(port);
		for (Long entryValue : eventSet) {
		    result.triggered(new Time(entryValue, AnalysisUtil.TIMEUNIT));
		}

		return result;
	}

	/**
	 * Will convert a List of ports into a List of Events.
	 * <p>
	 * Iterates over a List of Ports and uses the convertERNESTPortToTADLEvent
	 * method on every port to create a List of Event objects.
	 *
	 * @param ports
	 *            a list of {@link Port} objects
	 * @param eventOcc
	 *            TracingResults of a model
	 * @return a list of {@link Event} objects
	 */
	public static ArrayList<Event> convertERNESTPortListToTADLEventList(
			List<Port> ports, Map<Port,? extends SortedSet<Long>> eventOcc) {
		ArrayList<Event> results = new ArrayList<Event>();

		for (Port port : ports) {
			results.add(convertERNESTPortToTADLEvent(port, eventOcc));
		}

		return results;
	}

	/**
	 * Returns the EventOccurrences list of an ERNEST model.
	 *
	 * @param model
	 *            the model
	 * @return the list of EventOccurrences
	 */
	public static Map<Port, ? extends SortedSet<Long>> getEventOccurrences(Model model) {
		if (null == model.getTracingResults()) {
		    return null;
		}
		TracingResults tracingResults = model.getTracingResults();

		if (tracingResults.getTrace() != null) {
			TraceReader traceReader = tracingResults.getTrace().getTraceReader();
			if (traceReader != null) {
				return traceReader.getEvents();
			}

		}
		return Collections.emptyMap();
	}

	/**
	 * Returns the Constraint list of an ERNEST model.
	 *
	 * @param model
	 *            the model
	 * @return the list of Constraints
	 */
	public static EList<Constraint> getConstraints(Model model) {
		if (null == model.getTimingModel()) {
		    return null;
		}
		return model.getTimingModel().getConstraints();
	}

	/**
	 * Returns a new {@link Time} Object with the given time value.
	 * <p>
	 *
	 * @param time
	 *            the time value
	 * @return new Time object
	 */
	public static Time getTime(float time) {
		return new Time(time, TIMEUNIT);
	}

	/**
	 * Returns a new {@link Time} Object with the given time value.
	 * <p>
	 * double will be converted in float.
	 *
	 * @param time
	 *            the time value
	 * @return new Time object
	 */
	public static Time getTime(double time) {
		return new Time((float) time, TIMEUNIT);
	}
}
