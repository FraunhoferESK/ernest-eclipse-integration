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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import de.fraunhofer.esk.ernest.core.cdt.GenerateSimulationProject;
import de.fraunhofer.esk.ernest.core.cdt.DefinedConstants;
import de.fraunhofer.esk.ernest.core.generator.core.Generator;

/**
 * Wizard which is started by {@link GenAction} class.<p>
 * Opens WizardPage for the User to Select Project Name, Path and ToolChains.<br>
 * Afterwards calls {@link GenerateSimulationProject} to create the Project.<br>
 * And the wizard also has a method to fill the created Project with the simulation code. <br>
 *
 */
public class GenerateSimulationWizard extends Wizard implements INewWizard, DefinedConstants
{
	/* Initializes */
	private GenerateSimulationWizardPage page;
	private final IFile file;

	/* Constructor */
	public GenerateSimulationWizard(IFile file)
	{
		super();
		this.setNeedsProgressMonitor(true);
		this.file=file;
	}

	/*
	 * Adds pages to the GenerateSimulationWizard.
	 * Using the Wizard.addPage(WizardPage) method.
	 */
	@Override
	public void addPages() {
		super.addPages();
		this.page = new GenerateSimulationWizardPage(UI_WIZARDPAGE_NAME, this.file);
		this.addPage(this.page);
		}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 *
	 * performFinish
	 * - Invokes the progress monitor
	 * - Generates the project
	 * - Executes the Generator
	 */
	@Override
	public boolean performFinish() {
		/* Initializing */
		final String projName = this.page.getProjName();
		final String projPath = this.page.getLocation() + "/" + this.page.getProjName();
		final String projTool = "MinGW GCC";

		/* If Project/Folder with this name already exists in path, ask override question (message dialog) */
		if( new java.io.File(projPath).exists()	)	{
			final MessageDialog dg = new MessageDialog(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
					UI_USERMSG_TITLE,
					null,
					UI_USERMSG_EXISTQST,
					MessageDialog.QUESTION, new String[] {IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL},
					0
					);
			/* override dialog returns
			 * in case "yes" 0
			 * in case "no" 1
			 */
			if(dg.open() == 1) {
			    return false;
			}
		}

		/*
		 * ProgressMonitor, work parted in
		 * 70% GenerateSimulationProject
		 * 30% runGenerator
		 */
		try {
			this.getContainer().run(true, true, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
				{
					monitor.beginTask(UI_MONITOR_MAINTASKNAME, 100000);
					/* Generate Project */
					if(! new GenerateSimulationProject().createSimulationProj(projName, projPath, monitor, 70000, projTool)) {
					    return;
					}
					if(monitor.isCanceled()) {
					    return;
					}


					/* Execute Generator */
					try {
						GenerateSimulationWizard.this.runGenerator(GenerateSimulationWizard.this.file, projPath, monitor, 30000);
					} catch (CoreException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}

					/* End Monitor */
					monitor.done();


				}
			});
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return true;
	}

	/*
	 * Initializes this creation wizard using the passed workbench and object selection.
	 * This method is called after the no argument constructor and before other methods are called.
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Starts the Generator from Package de.fraunhofer.esk.ernest.core.generator
	 * and generates the code in the given path
	 *
	 * Created own instance of generateAndWrite() to use the progress monitor
	 *
	 * @param file
	 * @param path
	 * @param progress
	 * @param work
	 * @throws CoreException
	 * @throws IOException
	 */
	private void runGenerator(final IFile file, final String path, final IProgressMonitor progress, final int work) throws CoreException, IOException {

		progress.subTask(UI_MONITOR_GENERATOR);

		Generator theGenerator = new Generator(file, path);
		theGenerator.generateAndWrite(progress, work);

		/* Refresh Project */
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
