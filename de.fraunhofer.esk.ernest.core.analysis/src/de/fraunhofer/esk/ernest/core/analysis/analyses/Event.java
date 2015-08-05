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
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Class representing a single TADL event. An event contains dynamics, which is
 * a list of {@code Time} objects indicating the time the event occurred. *
 */

public class Event {
	private ArrayList<Time> dynamics = new ArrayList<Time>();

	/**
	 * Allocate an {@code Event} object and register it internally.
	 */
	public Event() {
	}

	public Event(ArrayList<Time> timeList, HashMap<Integer, TreeSet<Long>> eventMap)
	{
		this.dynamics = timeList;
	}

	/**
	 * Add a {@code Time} value to the event's dynamics
	 *
	 * @param occurred
	 *            the time the event occurred
	 */
	public void triggered(Time occurred) {
		this.dynamics.add(occurred);
	}

	/**
	 * Get the list of all occurrences of the event (dynamics)
	 *
	 * @return a list of {@code Time} objects representing the occurrences
	 */
	public ArrayList<Time> getDynamics() {
		return this.dynamics;
	}

	/**
	 * Set the dynamics of the event as a presampled list.
	 *
	 * @param dynamics
	 *            list of {@code Time} objects the event occurred
	 */
	public void setDynamics(ArrayList<Time> dynamics) {
		this.dynamics = dynamics;
	}

	public void addEventTime(Time time)
	{
		this.dynamics.add(time);
	}
}
