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
package de.fraunhofer.esk.ernest.core.generator.preferences.simulation;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.osgi.service.prefs.Preferences;

import de.fraunhofer.esk.ernest.core.generator.preferences.Activator;
import de.fraunhofer.esk.ernest.core.generator.preferences.DefinedConstants;
import ernest.util.TraceReaderFactory;

/**
 * This class represents a preference page which is used by the ERNEST Generator.<p>
 * 
 * This page is used to modify preferences only. Meanwhile they are stored<br>
 * in the preference store.<p>
 * The Preferences Stored are: <br>
 * - a TraceModel <br>
 * - the duration <br>
 *
 */
public class SimulationPreferencePage extends PreferencePage implements IWorkbenchPreferencePage, DefinedConstants, SimulationPreferenceConstants {

	private DateTime dateTime;
	private Combo combo;
	private String traceSelection;
	
	public SimulationPreferencePage() {
		super();
		setDescription(SIMPAGE_DESCRIPTION);
		setTitle(SIMPAGE_TITLE);
		noDefaultAndApplyButton();
	}
	
	@Override
	public void init(IWorkbench workbench) {	
	}

	@Override
	protected Control createContents(final Composite parent) {
		
		final GridLayout gridParent = new GridLayout();
		gridParent.numColumns=1;
		gridParent.marginWidth = 20;
		parent.setLayoutData(gridParent);
		
		final Composite container = new Composite(parent, SWT.NULL);
		final GridLayout mainGridLayout = new GridLayout();
		mainGridLayout.verticalSpacing=20;
		mainGridLayout.horizontalSpacing=20;
		mainGridLayout.marginTop=30;
		mainGridLayout.marginBottom=30;
		mainGridLayout.marginLeft=15;
		container.setLayout(mainGridLayout);
		
		final Composite subContainer1 = new Composite(container, SWT.NULL);
		final GridLayout subGridLayout1 = new GridLayout();
		subGridLayout1.numColumns = 2;
		subContainer1.setLayout(subGridLayout1);
		
		final Composite subContainer2 = new Composite(container, SWT.NULL);
		final GridLayout subGridLayout2 = new GridLayout();
		subGridLayout2.numColumns = 3;
		subContainer2.setLayout(subGridLayout2);
		
		
		final Label traceLabel = new Label(subContainer1, SWT.NULL);
		traceLabel.setText(SIMPAGE_TRACETEXT);
		traceLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		combo = new Combo(subContainer1, SWT.NULL | SWT.DROP_DOWN);
		for (String name : TraceReaderFactory.getTraceReaders()) {
			combo.add(name);
		}
		combo.setText(getModelName());
		combo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				traceSelection = combo.getItem( combo.getSelectionIndex()).toString();				
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				traceSelection = combo.getItem( combo.getSelectionIndex()).toString();				
			}
			
		});
		
		
		final Label durationLabel = new Label(subContainer2, SWT.NULL);
		durationLabel.setText(SIMPAGE_TIMETEXT);
		durationLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		dateTime = new DateTime(subContainer2, SWT.BORDER | SWT.TIME);
		dateTime.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		int seconds = getTime();
		dateTime.setSeconds(seconds%60);
		dateTime.setMinutes(seconds%3600/60);
		dateTime.setHours(seconds/3600);		
		
		final Label inputLabel = new Label(subContainer2, SWT.NULL);
		inputLabel.setText("(HH,MM,SS)");
		durationLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		final Composite subContainer3 = new Composite(parent, SWT.NULL);
		final GridLayout subGridLayout3 = new GridLayout();
		subGridLayout3.marginRight = 30;
		subContainer3.setLayout(subGridLayout3);
		
		final Label noteLabel = new Label(subContainer3, SWT.NULL);
		noteLabel.setText("Note: Changes on this page need a re-generation of the simulation to take effect");
		noteLabel.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false));
							
		return null;
	}


	public static String getTrace() {
		final Preferences preferences = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		return  preferences.get(SIMPREF_MODELNAME, SIMPAGE_BinaryTraceNAME);
	}
	private String getModelName() {
		final Preferences preferences = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		return  preferences.get(SIMPREF_MODELNAME, SIMPAGE_BinaryTraceNAME);
	}
	/**
	 * 
	 * @return time in seconds
	 */
	public static int getTime() {
		final Preferences preferences = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		return preferences.getInt(SIMPREF_MODELTIME, 5);
	}
		
	
	@Override
	public boolean performOk()	{
		/* Save Page and return */
		final Preferences preferences = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);	
		if(traceSelection!=null) {
			preferences.put(SIMPREF_MODELNAME, traceSelection);
			preferences.putInt(SIMPREF_MODELSELEC, combo.getSelection().y );
		}
		if(dateTime!=null)
			preferences.putInt(SIMPREF_MODELTIME, dateTime.getHours()*3600 + dateTime.getMinutes()*60 + dateTime.getSeconds());
		
		return true;		
	}
}