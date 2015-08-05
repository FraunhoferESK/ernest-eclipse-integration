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
package de.fraunhofer.esk.ernest.core.analysis.framework.preferences;


import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class NestedPreferencePage extends PreferencePage implements IWorkbenchPreferencePage
{
	public NestedPreferencePage() {
		super();
		setDescription("Preferences for the ERNEST Analysis Framework");
		noDefaultAndApplyButton();
	}


	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected Control createContents(Composite parent) {
		
		final Composite container = new Composite(parent, SWT.NULL);
		container.setLayout(new FillLayout());		
		
		
		return null;
	}


		
		

	
}
