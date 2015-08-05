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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressConstants;

/**
 * Handler that is responsible for the Preferred Analyses Menu Entry in the ERNEST Menu.<br
 * Preferred Analyses are stored in the Preference Store.<p>
 *
 * The handler is responsible for the following:
 * - check which analyses should be shown (on a file extension basis)
 * - Load Preferences and activate checkbox for analyses that are preferred
 * - Let the User choose which analyses to start
 * - delete the old settings in the preference store and store the checked ones
 * - start analyses
 *
 *
 */
public class SelectedAnalysesHandler implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// at first we need to see which analyses can be shown in the dialog, so which file extension has the selection. See which files where selected when the Handler was started
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
								.getActivePage().getSelection();
		if (selection != null) {
			// list for all analyses that are to be shown in the list
			ArrayList<AnalysisType> validAnalyses = new ArrayList<AnalysisType>();
			// go through all analyses and see which one matches the extension of the selection (one or more files)
			for(AnalysisType a : AnalysisType.getAnalyses()){
				if(ERNESTHandlerUtil.selectionToFile(selection, true, a.getExtension().split(",")) != null) {
				    validAnalyses.add(a);
				}
			}
			
			if (validAnalyses.size() > 0) {

				// load preferred analyses into the menu (activate checkbox)
				IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
				// list of the checked analyses
				ArrayList<AnalysisType> preferredAnalyses = new ArrayList<AnalysisType>();
				for(AnalysisType a : validAnalyses) {
					// getBoolean also returns false if the key is not stored, thats exactly what we want
					if(prefStore.getBoolean(a.getClassname())) {
					    preferredAnalyses.add(a);
					}
				}
	
				// Start ListDialog with checkboxes
				// Create the dialog window
			    ListSelectionDialog listviewer = new ListSelectionDialog(HandlerUtil.getActiveShell(event),
						validAnalyses,
						new ArrayContentProvider(),
						// only show the name of the analyses
						new LabelProvider(){
							@Override
							public String getText(Object element) {
								AnalysisType a = (AnalysisType) element;
								return a.getName();
							}
						},
						"Select Analyses:");
	
			    // preferred ones are checked at the beginning
			    listviewer.setInitialElementSelections(preferredAnalyses);

			    if (listviewer.open() == Window.OK) {
					// get what the user has chosen
				    Object[] results = listviewer.getResult();
				    ArrayList<AnalysisType> selectedAnalyses = new ArrayList<AnalysisType>();
				    if(results != null && results.length > 0) {
				    	for(Object obj : results) {
				    		AnalysisType a = (AnalysisType)obj;
				    		selectedAnalyses.add(a);
				    	}
		
				    	// Store the preferred analyses
				    	// so uncheck old ones, check the new ones
				    	for(AnalysisType a : preferredAnalyses) {
				    		prefStore.setValue(a.getClassname(), false);
						}
				    	for(AnalysisType a : selectedAnalyses) {
				    		prefStore.setValue(a.getClassname(), true);
				    	}
		
				    	// start all selected analyses
				    	AnalysisType[] tmpAnalysisTypeArray = selectedAnalyses.toArray(new AnalysisType[selectedAnalyses.size()]);
		
				    	HashSet<String> extensions = new HashSet<String>();
				    	for(AnalysisType a : selectedAnalyses) {
				    		extensions.addAll(Arrays.asList(a.getExtension().split(",")));
				    	}
				    	String[] extensionsArray = extensions.toArray(new String[extensions.size()]);
				    	
				    	Collection<IFile> analysisFiles = ERNESTHandlerUtil.selectionToFiles(selection, -1, true, extensionsArray);
				    	String[] fileArray = new String[analysisFiles.size()];
				    	int i = 0;
					    // Now start a Job for every selected file
						for (IFile analysisFile : analysisFiles) {
							// Get the Filename of the Resource (including Path)
							String file = analysisFile.getFullPath().toString();
							
							fileArray[i++] = file;
						}
		
						// create a job and schedule
						Job job = new AnalysisJob(tmpAnalysisTypeArray, fileArray);
						job.setUser(true);
						job.setProperty(IProgressConstants.KEEP_PROPERTY, true);
						job.schedule();
				    } else {
						MessageDialog
						.openError(HandlerUtil.getActiveShell(event),
								"ERNEST Analysis",
								"No analysis selected.");
				    }
			    } else {
			    	// user pressed cancel, do nothing.
			    }
		    }
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().getSelection();
		for(AnalysisType a : AnalysisType.getAnalyses()){
			if(ERNESTHandlerUtil.selectionToFile(selection, true, a.getExtension().split(",")) != null) {
			    return true;
			}
		}
		return false;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}
}
