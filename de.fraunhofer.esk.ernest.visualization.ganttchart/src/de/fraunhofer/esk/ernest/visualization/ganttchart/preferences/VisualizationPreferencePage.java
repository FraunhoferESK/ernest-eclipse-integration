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

import java.util.ArrayList;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;

import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.Activator;
import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.views.ConstraintView;

/**
 * Preference Page for the Visualization Plug-In.
 * 
 */
public class VisualizationPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	/**
	 * List of preference field editors.
	 */
	private ArrayList<FieldEditor> preferenceEditors = 
			new ArrayList<FieldEditor>();
	
	/**
	 * Default constructor.
	 */
	public VisualizationPreferencePage() {
	}

	/**
	 * Calls super constructor.
	 * @see {@link PreferencePage#PreferencePage(String)}
	 */
	public VisualizationPreferencePage(String title) {
		super(title);
	}

	/**
	 * Calls super constructor.
	 * @see {@link PreferencePage#PreferencePage(String,ImageDescriptor)}
	 */
	public VisualizationPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());

	}
	
	/**
	 * Create {@link ColorFieldEditor} and add it to this page.
	 * 
	 * @param id the name of the preference this field de.fraunhofer.esk.ernest.visualization.ganttChart.editor works on
	 * @param text the label text of the field de.fraunhofer.esk.ernest.visualization.ganttChart.editor
	 * @param parent the parent of the field de.fraunhofer.esk.ernest.visualization.ganttChart.editor's control
	 */
	protected void createColorEditor(String id, String text, Composite parent) {
		ColorFieldEditor editor = new ColorFieldEditor(id, text, parent);
		editor.setPage(this);
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		preferenceEditors.add(editor);
	}

	/**
	 * Create {@link IntegerFieldEditor} and add it to this page.
	 * 
	 * @param id the name of the preference this field de.fraunhofer.esk.ernest.visualization.ganttChart.editor works on
	 * @param text the label text of the field de.fraunhofer.esk.ernest.visualization.ganttChart.editor
	 * @param parent the parent of the field de.fraunhofer.esk.ernest.visualization.ganttChart.editor's control
	 */
	protected void createIntEditor(String id, String text, Composite parent) {
		IntegerFieldEditor editor = new IntegerFieldEditor(id, text, parent);
		editor.setPage(this);
		editor.setPreferenceStore(getPreferenceStore());
		editor.load();
		preferenceEditors.add(editor);
	}
	
	@Override
	protected Control createContents(Composite parent) {
		createColorEditor(PreferenceConstants.ID_BACKGROUND_DEFAULT,
				"Background Color", parent);

		createColorEditor(PreferenceConstants.ID_BACKGROUND_HEADER,
				"Background Header", parent);

		createColorEditor(PreferenceConstants.ID_EVENT, 
				"Event Color", parent);

		createColorEditor(PreferenceConstants.ID_EVENT_ERRORS,
				"Event Error Color", parent);

		createColorEditor(PreferenceConstants.ID_CONSTRAINT_INFO,
				"Constraint Info Color", parent);

		createColorEditor(PreferenceConstants.ID_CONSTRAINT_ERROR,
				"Constraint Error Color", parent);

		createColorEditor(PreferenceConstants.ID_TEXTCOLOR, 
				"Text Color", parent);

		createColorEditor(PreferenceConstants.ID_LINECOLOR, 
				"Line Color", parent);

		createIntEditor(PreferenceConstants.ID_SIZE_UIELEMENTS,
				"Size of UI Elements in %", parent);

		return null;
	}
	
	@Override
	protected void performDefaults() {
		for (FieldEditor editor : preferenceEditors) {
			editor.loadDefault();
		}

		super.performDefaults();
	}
	
	@Override
	public boolean performOk() {
		for (FieldEditor editor : preferenceEditors) {
			editor.store();
		}
		
		// we get the ConstraintView of the current active page and reload it to
		// reflect the changes in the preferences
		ConstraintView view = (ConstraintView) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.findView(ConstraintView.ID);
		if (view != null) {
			view.refresh();
		}
		return super.performOk();
	}
}
