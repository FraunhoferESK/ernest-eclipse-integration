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
package de.fraunhofer.esk.ernest.visualization.ganttchart.editor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import de.fraunhofer.esk.ernest.core.analysis.framework.ERNESTHandlerUtil;
import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.views.ViewListComponents;

/**
 * This class describe the Handler that is called when a file is selected to
 * visualize the constrains.
 * 
 * The file is passed as parameter.
 * 
 * If there is no error in the file, then the view "ViewListComponents" is
 * opened and show the list of components that the user can check to visualize.
 * 
 */
public class OpenListComponentsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Read the parameter witch represents the file path
		IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage();
		ISelection selection = page.getSelection();
		IFile file = ERNESTHandlerUtil.selectionToErnestFile(selection);
		
		if (file != null) {
			String filePathParam = file.getFullPath().toString();
			
			//open and active the ViewListComponents
			try {
				if (!page.isPartVisible(page.findView(ViewListComponents.ID))) {
					// use the Resource Manager View id to open up view
					page.showView(ViewListComponents.ID);
				}
				
				((ViewListComponents) page.findView(ViewListComponents.ID))
						.refresh(filePathParam);
			} catch (Exception e) {
	
				System.err.println("Failed to open the List Components View." + e);
				e.printStackTrace();
			}
		} else {
			MessageDialog
			.openError(HandlerUtil.getActiveShell(event),
					"ERNEST Visualization",
					"No ERNEST model available for the current selection.");
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getSelection();
		return ERNESTHandlerUtil.selectionToErnestFile(selection) != null;
	}
	
}
