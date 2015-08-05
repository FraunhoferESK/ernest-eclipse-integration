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
package de.fraunhofer.esk.ernest.core.cdt.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import de.fraunhofer.esk.ernest.core.cdt.DefinedConstants;


/**
 * WizardPage which is started by {@link GenerateSimulationWizard} <p>
 * The User chooses the Project Name on this Page. <br>
 * Also the User is able to fill this entry with a default value.<br>
 *
 *
 */
//@SuppressWarnings("restriction")
public class GenerateSimulationWizardPage extends WizardPage implements DefinedConstants//, CDTPreferenceConstants
{
	/* Initialize Text fields, Buttons and more*/
	private Text projName;
	private final String projPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	final private IFile file;

	private boolean hasTextLength = true;

	/* Constructor */
	public GenerateSimulationWizardPage(String pageName, IFile file)	{
		super(pageName);
		this.setTitle(pageName);
		this.setDescription(UI_WIZARDPAGE_DESCRIPTION);
		this.file=file;
	}


	@Override
	public void createControl(Composite parent)
	{
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "de.fraunhofer.esk.ernest.core.cdt.help_general");

		final Composite container = new Composite(parent, SWT.NULL);
		container.setBounds(15, 25, 500, 200);

		final Label name = new Label(container, SWT.NONE);
		name.setText(UI_CONTAINER_ENTERPROJNAME);
		name.setBounds(10,13,70,27);

		this.projName = new Text(container, SWT.BOLD | SWT.BORDER);
		this.projName.setBounds(10, 40, 480, 23);
		this.projName.setText( this.file.getName().substring(0, this.file.getName().lastIndexOf(".")) + "_simProject");		
		
		this.addListeners();
		this.setControl(container);
	}


	private void addListeners() {
		/*
		 * TextBox Name Listener
		 * Checks if project name more than one character
		 */
		this.projName.addModifyListener(new ModifyListener () {
			@Override
			public void modifyText(ModifyEvent e) {
				if(GenerateSimulationWizardPage.this.projName.getText().length() > 1 ) {
				    GenerateSimulationWizardPage.this.hasTextLength=true;
				} else {
				    GenerateSimulationWizardPage.this.hasTextLength=false;
				}
				GenerateSimulationWizardPage.this.setPageComplete(GenerateSimulationWizardPage.this.hasTextLength);
			}
		});
	}

	/*
	 * Returns true if
	 * - The ProjectName length is more than one character
	 * - The path looks like a proper path
	 */
	@Override
	public boolean isPageComplete() 	{
		return (this.hasTextLength);
	}

	/* Getter */
	public String getProjName() {
		return this.projName.getText();
	}
	public String getLocation() {
		return this.projPath;
	}
}