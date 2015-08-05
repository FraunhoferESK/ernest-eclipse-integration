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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.Activator;

/**
 * Responsible to store default values in the PreferenceStore.
 *
 */
public class VisualizationPreferenceInitializer extends
		AbstractPreferenceInitializer {
	
	/**
	 * The preference store for this UI plug-in.
	 */
	private IPreferenceStore store;
	
	@Override
	public void initializeDefaultPreferences() {
		this.store = Activator.getDefault().getPreferenceStore();		
		
		storeColor(PreferenceConstants.ID_BACKGROUND_DEFAULT, Display
				.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		storeColor(PreferenceConstants.ID_BACKGROUND_HEADER, Display
				.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
		storeColor(PreferenceConstants.ID_BACKGROUND_HEADER_HIGHLIGHT, Display
				.getCurrent().getSystemColor(SWT.COLOR_INFO_BACKGROUND));
		storeColor(PreferenceConstants.ID_EVENT, Display.getCurrent()
				.getSystemColor(SWT.COLOR_BLACK));
		storeColor(PreferenceConstants.ID_EVENT_ERRORS, Display.getCurrent()
				.getSystemColor(SWT.COLOR_RED));
		storeColor(PreferenceConstants.ID_CONSTRAINT_INFO, Display.getCurrent()
				.getSystemColor(SWT.COLOR_GREEN));
		storeColor(PreferenceConstants.ID_CONSTRAINT_ERROR, Display
				.getCurrent().getSystemColor(SWT.COLOR_RED));
		storeColor(PreferenceConstants.ID_LINECOLOR, Display.getCurrent()
				.getSystemColor(SWT.COLOR_GRAY));
		storeColor(PreferenceConstants.ID_TEXTCOLOR, Display.getCurrent()
				.getSystemColor(SWT.COLOR_BLACK));
		
		store.setDefault(PreferenceConstants.ID_SHOWALLTIMEAXES, false);
		store.setDefault(PreferenceConstants.ID_SIZE_UIELEMENTS, 100);
	}
	
	/**
	 * Write color for specified id to preference store.
	 * @param id The preference id.
	 * @param color The color to write.
	 */
	private void storeColor(String id, Color color) {
		String testColor = color.getRed() + "," + color.getGreen() + ","
				+ color.getBlue();
		store.setDefault(id, testColor);
	}

}
