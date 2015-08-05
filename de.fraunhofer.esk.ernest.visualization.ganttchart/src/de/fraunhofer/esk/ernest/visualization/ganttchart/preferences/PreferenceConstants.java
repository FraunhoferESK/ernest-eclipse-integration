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
package de.fraunhofer.esk.ernest.visualization.ganttchart.preferences;

/**
 * Constants with names used to store and load preference values.
 * 
 */
public final class PreferenceConstants {
	/** Name of the default background color preference. */
	public static final String ID_BACKGROUND_DEFAULT =
			"COLOR_BACKGROUND_DEFAULT";
	/** Name of the header background color preference. */
	public static final String ID_BACKGROUND_HEADER = "COLOR_BACKGROUND_HEADER";
	/** Name of the header background highlight color preference. */
	public static final String ID_BACKGROUND_HEADER_HIGHLIGHT =
			"COLOR_BACKGROUND_HEADER_HIGHLIGHT";
	/** Name of the event color preference. */
	public static final String ID_EVENT = "COLOR_EVENT";
	/** Name of the error event color preference. */
	public static final String ID_EVENT_ERRORS = "COLOR_EVENT_ERRORS";
	/** Name of the constraint info color preference. */
	public static final String ID_CONSTRAINT_INFO = "COLOR_CONSTRAINT_INFO";
	/** Name of the constraint error color preference. */
	public static final String ID_CONSTRAINT_ERROR = "COLOR_CONSTRAINT_ERROR";
	/** Name of the line color preference. */
	public static final String ID_LINECOLOR = "COLOR_LINE";
	/** Name of text color preference. */
	public static final String ID_TEXTCOLOR = "COLOR_TEXT";

	/** Name of the show all time axes preference. */
	public static final String ID_SHOWALLTIMEAXES = "PREF_SHOW_ALL_TIMEAXES";
	/** Name of the ui element size preference. */
	public static final String ID_SIZE_UIELEMENTS = "PREF_SIZE_UI_ELEMENTS";

	/** No instances of this class should be created. */
	private PreferenceConstants() {
	}
}
