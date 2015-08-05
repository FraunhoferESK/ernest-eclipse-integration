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
package de.fraunhofer.esk.ernest.core.cdt.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.Preferences;

import de.fraunhofer.esk.ernest.core.cdt.Activator;
import de.fraunhofer.esk.ernest.core.cdt.DefinedConstants;

public class CDTPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage, DefinedConstants, CDTPreferenceConstants {
	private Text directoryInc;
	private Text directoryLib;
	private Button debugButton, releaseButton;

	public CDTPreferencePage() {
		super();
		setDescription(PREF_PAGE_DESCRIPTION);
	}

	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected Control createContents(Composite parent) {
		final Preferences preferences = InstanceScope.INSTANCE
				.getNode(Activator.PLUGIN_ID);

		final Composite container = new Composite(parent, SWT.NULL);
		container.setBounds(parent.getBounds());

		final DirectoryDialog dlg = new DirectoryDialog(container.getShell());

		GridLayout layout = new GridLayout(2, false);
		layout.verticalSpacing = 15;
		container.setLayout(layout);

		/* LibGroup */
		Group libGroup = new Group(container, SWT.NONE);
		libGroup.setText("Select Library Directory ");
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.horizontalSpan = 2;
		libGroup.setLayoutData(data);
		libGroup.setLayout(new RowLayout(SWT.HORIZONTAL));

		directoryLib = new Text(libGroup, SWT.BORDER);
		directoryLib.setText(preferences.get(CDT_LIBRARY_PATH,
				DEFAULT_LIBRARY_PATH));
		RowData rowData = new RowData();
		rowData.width = 350;
		directoryLib.setLayoutData(rowData);

		Button button_directoryLib = new Button(libGroup, SWT.NONE);
		button_directoryLib.setText("Browse");
		button_directoryLib.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}

			@Override
			public void mouseDown(MouseEvent e) {
				directoryLib.setText(dlg.open());
			}

			@Override
			public void mouseUp(MouseEvent e) {
				directoryLib.setText(dlg.open());
			}

		});

		/* IncludeGroup */
		Group includeGroup = new Group(container, SWT.NONE);
		includeGroup.setText("Select Include Directory ");
		data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.horizontalSpan = 2;
		includeGroup.setLayoutData(data);
		includeGroup.setLayout(new RowLayout(SWT.HORIZONTAL));

		directoryInc = new Text(includeGroup, SWT.BORDER);
		directoryInc.setText(preferences.get(CDT_INCLUDE_PATH,
				DEFAULT_INCLUDE_PATH));
		rowData = new RowData();
		rowData.width = 350;
		directoryInc.setLayoutData(rowData);

		Button button_directoryInc = new Button(includeGroup, SWT.NONE);
		button_directoryInc.setText("Browse");
		button_directoryInc.addMouseListener(new MouseListener() {

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}

			@Override
			public void mouseDown(MouseEvent e) {
				directoryInc.setText(dlg.open());
			}

			@Override
			public void mouseUp(MouseEvent e) {
				directoryInc.setText(dlg.open());
			}

		});

		/* ConfigGroup */
		Group configGroup = new Group(container, SWT.NONE);
		configGroup.setText("Select Configuration ");
		data = new GridData(SWT.FILL, SWT.FILL, true, false);
		data.horizontalSpan = 2;
		configGroup.setLayoutData(data);
		configGroup.setLayout(new RowLayout(SWT.HORIZONTAL));

		debugButton = new Button(configGroup, SWT.RADIO);
		debugButton.setText("Debug");
		releaseButton = new Button(configGroup, SWT.RADIO);
		releaseButton.setText("Release");

		if (preferences.getBoolean(CDT_ISDEBUGCONFIG, DEFAULT_ISDEBUGCONFIG)) {
			debugButton.setSelection(true);
			releaseButton.setSelection(false);
		} else {
			debugButton.setSelection(false);
			releaseButton.setSelection(true);
		}

		return null;
	}

	@Override
	public boolean performOk() {
		performApply();
		return true;
	}

	@Override
	protected void performApply() {
		final Preferences preferences = InstanceScope.INSTANCE
				.getNode(Activator.PLUGIN_ID);

		preferences.put(CDT_INCLUDE_PATH, directoryInc.getText());
		preferences.put(CDT_LIBRARY_PATH, directoryLib.getText());

		if (debugButton.getSelection())
			preferences.putBoolean(CDT_ISDEBUGCONFIG, true);
		else
			preferences.putBoolean(CDT_ISDEBUGCONFIG, false);
	}

	@Override
	protected void performDefaults() {
		directoryInc.setText(DEFAULT_INCLUDE_PATH);
		directoryLib.setText(DEFAULT_LIBRARY_PATH);
		debugButton.setSelection(DEFAULT_ISDEBUGCONFIG);
		releaseButton.setSelection(!DEFAULT_ISDEBUGCONFIG);
	}
}