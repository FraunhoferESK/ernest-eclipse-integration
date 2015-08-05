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
package de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.graphics.Color;

import de.fraunhofer.esk.ernest.visualization.ganttchart.preferences.PreferenceConstants;

/**
 * The ColorManager is responsible for holding all relevant color values that
 * are used during the visualization.
 * <p>
 * All values are stored in a PreferenceStore, and are loaded with
 * {@link #loadPreferences(IPreferenceStore)}.<br>
 * This has to be called before the Visualization View creates any component.
 * 
 */
public abstract class ColorManager {
	/** Background color. */
	public static Color BACKGROUND_DEFAULT;
	/** Background color for the header of a constraint. */
	public static Color BACKGROUND_HEADER;
	/** Background color on mouseOver for the header of a constraint. */
	public static Color BACKGROUND_HEADER_HIGHLIGHT;
	/** Color for an event of a port. */
	public static Color EVENT;
	/** Color indicating error event of a port. */
	public static Color EVENT_ERRORS;
	/** Highlight for an informations area in the constraint header. */
	public static Color CONSTRAINT_INFO;
	/** Highlight for an errors area in the constraint header. */
	public static Color CONSTRAINT_ERROR;
	/** Color of Lines. */
	public static Color LINECOLOR;
	/** Color of text and the time axis. */
	public static Color TEXTCOLOR;

	/** A storage for color de.fraunhofer.esk.ernest.visualization.ganttChart.preferences. */ 
	private static IPreferenceStore store;

	/**
	 * Loads the preferences from the {@link IPreferenceStore}.
	 * 
	 * @param store The preferences to load.
	 */
	public static void loadPreferences(IPreferenceStore store) {
		ColorManager.store = store;

		BACKGROUND_DEFAULT =
				loadColor(PreferenceConstants.ID_BACKGROUND_DEFAULT);
		BACKGROUND_HEADER = 
				loadColor(PreferenceConstants.ID_BACKGROUND_HEADER);
		BACKGROUND_HEADER_HIGHLIGHT =
				loadColor(PreferenceConstants.ID_BACKGROUND_HEADER_HIGHLIGHT);
		EVENT = loadColor(PreferenceConstants.ID_EVENT);
		EVENT_ERRORS =
				loadColor(PreferenceConstants.ID_EVENT_ERRORS);
		CONSTRAINT_INFO = 
				loadColor(PreferenceConstants.ID_CONSTRAINT_INFO);
		CONSTRAINT_ERROR =
				loadColor(PreferenceConstants.ID_CONSTRAINT_ERROR);
		LINECOLOR = 
				loadColor(PreferenceConstants.ID_LINECOLOR);
		TEXTCOLOR = 
				loadColor(PreferenceConstants.ID_TEXTCOLOR);
	}

	/**
	 * Load the color from the specified color id. 
	 * 
	 * @param id Color in the form "r,g,b"
	 * @return The {@link Color} for the given id.
	 */
	private static Color loadColor(String id) {
		String colorString = store.getString(id);
		String[] colors = colorString.split(",");
		colors[0] = colors[0].trim();
		colors[1] = colors[1].trim();
		colors[2] = colors[2].trim();
		if (colors.length == 3) {
			return new Color(null, Integer.parseInt(colors[0]),
					Integer.parseInt(colors[1]), Integer.parseInt(colors[2]));
		} else {
			return null;
		}
	}

	/**
	 * Need not be instantiated.
	 */
	private ColorManager() {
	}
}
