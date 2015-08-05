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
package de.fraunhofer.esk.ernest.core.analysis.framework;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

/**
 * The Entry point of this Plug-In. Menu that holds all registered Analyses.
 * <p>
 * This provides a Context Menu Entry for every Analysis. Also registers the
 * Menu Entries with a Command.
 * <p>
 * Internal Menu that theoretically can be used outside of this Plug-In.<br>
 * The use at another location is not tested and should typically throw a
 * ClassNotFoundException.
 *
 */
public class AnalysisMenu extends CompoundContributionItem {

	public AnalysisMenu() {
	}

	public AnalysisMenu(String id) {
		super(id);
	}


	/**
	 * This method creates the menu.
	 */
	@Override
	protected IContributionItem[] getContributionItems() {
		final IContributionItem menu[] = new IContributionItem[1];
		
		//Checks on the selected item before adding contributions could be performed by using
		//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection()
		
		CommandContributionItemParameter contributionItemParameter = new CommandContributionItemParameter(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow(), null, "de.fraunhofer.esk.ernest.core.analysis.framework.selectedanalyses", SWT.PUSH);
		contributionItemParameter.label = "Run Analyses";
		CommandContributionItem commandci = new CommandContributionItem(contributionItemParameter);
		menu[0] = commandci;

		return menu;
	}
}
