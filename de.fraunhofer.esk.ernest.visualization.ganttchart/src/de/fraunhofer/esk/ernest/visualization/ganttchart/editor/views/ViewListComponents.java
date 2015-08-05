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
package de.fraunhofer.esk.ernest.visualization.ganttchart.editor.views;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.ComponentsTree;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.panel.ComponentsTreeViewerPanel;


/**
 * This class provides the methods to create a View that contains a Tree.
 * The information to create the tree is provided by an XML file. 
 * <p>
 * This view contains an action called "visualization". The behavior of this
 * action is defined in the class <code>VisualizationAction</code>.
 */

public class ViewListComponents extends ViewPart {

	/** The ID of the view as specified by the extension. */
	public static final String ID = "de.fraunhofer.esk.ernest.visualization.ganttchart.editor.views.ViewListComponents";
	
	/** The file selected that contains the information to create the Tree. */
	private String filePath;
	
	/** The AnalysisTreeViewerPanel. */
	private ComponentsTreeViewerPanel treeViewerPanel;
	
	/** The CheckboxTreeViewer. */
	private CheckboxTreeViewer treeViewer;
	
	/** Label for Errors. */
	private Label smsError;
	
	/** Parent of UI Elements. */
	private Composite parentComposite;
	
	
	/**
	 * The constructor.
	 */
	public ViewListComponents() {
		//nothing
	}
	
	/**
	 * Load the components tree from the given file.
	 * 
	 * @param file The file with the component model. 
	 */
	public void refresh(String file) {
		filePath = file;
		if (filePath != null && smsError != null) {
			smsError.dispose();
			smsError = null;
			createTree();
		}

		ComponentsTree.getInstance().fillTree(file);
		treeViewerPanel.update();
		parentComposite.layout();
	}
	
	/**
	 * Create the basic tree that can be filled with the loaded components. 
	 */
	private void createTree() {
		try {
			//Create the tree to display
			treeViewerPanel = ComponentsTreeViewerPanel.initTreeViewerPanel(
					parentComposite, filePath);
			treeViewer = treeViewerPanel.getTreeViewer();

			// Create the help context id for the viewer's control
			PlatformUI.getWorkbench().getHelpSystem()
					.setHelp(treeViewer.getControl(), "de.fraunhofer.esk.ernest.visualization.ganttChart.editor.viewer");
			
		} catch (Exception e) {
			smsError = new Label(parentComposite, SWT.CENTER);
			smsError.setText("Unable to create tree from the file " + filePath);
		}
	}
	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 * @param parent the created parts' parent
	 */
	public void createPartControl(final Composite parent) {
		parentComposite = parent;
		if (filePath == null) {
			smsError = new Label(parent, SWT.CENTER);
			smsError.setText("No file selected");
		}
	}
	
	@Override
	public void setFocus() {

	}
}