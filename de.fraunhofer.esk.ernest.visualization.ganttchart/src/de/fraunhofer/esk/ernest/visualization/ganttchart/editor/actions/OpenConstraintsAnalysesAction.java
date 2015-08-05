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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;

import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.views.ConstraintView;

/**
 * This class describes an {@link Action} to visualize the constraints.
 * 
 */
public class OpenConstraintsAnalysesAction extends Action implements
		IWorkbenchWindowActionDelegate {

	/**
	 * The workbench window.
	 */
	private IWorkbenchWindow window;

	/**
	 * Constructor.
	 * 
	 * @param window the workbench window
	 * @param text this action's text
	 */
	public OpenConstraintsAnalysesAction(final IWorkbenchWindow window,
			final String text) {
		super(text);
		this.window = window;

	}

	/**
	 * Open a new Window with the visualization of the selected information.
	 */
	@Override
	public void run() {

		if (window == null) { return; }

		// get the activate page
		IWorkbenchPage page = window.getActivePage();
		if (page == null) { return; }
		IViewPart view = page.findView(ConstraintView.ID);
		if (view == null) { return; }

		if (!page.isPartVisible(view)) {
			// use the Resource Manager View id to open up view
			try {
				view = page.showView(ConstraintView.ID);
			} catch (PartInitException e) {
				System.err.println("Failed to open the Constrains View " + e);
			}
		}
		// Refresh the View
		if (view instanceof ConstraintView)
			((ConstraintView) view).refresh();
		
		// Set Focus
		page.activate(view);

	}

	@Override
	public void run(final IAction action) {
		// do nothing
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void dispose() {
		// dispose nothing
	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

}
