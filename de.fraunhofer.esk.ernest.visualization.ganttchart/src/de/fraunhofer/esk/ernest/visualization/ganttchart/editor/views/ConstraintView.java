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

import java.util.ArrayList;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.ComponentsTree;
import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.ColorManager;
import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.ERNESTVisualizationFactory;
import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.IVisualizationFactory;
import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.Activator;


import de.fraunhofer.esk.ernest.visualization.ganttchart.preferences.PreferenceConstants;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.ComponentGroup;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.ConstraintCanvas;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.PortCanvas;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.TimelineFormat;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.ToolbarComposite;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.panel.ComponentsTreeViewerPanel;

/**
 * Displays Informations regarding the Constraints of the ERNEST Model.
 * 
 */
public class ConstraintView extends ViewPart {
	/** The ID of the {@link ViewPart}. */
	public static final String ID = "de.fraunhofer.esk.ernest.visualization.ganttChart.editor.views.ConstraintView";
	/** List containing all Components to display. */
	private ArrayList<ComponentGroup> components;
	
	/** The timeline format. */
	private TimelineFormat format;
	
	/** Composite that belongs to the View. We don't mess with this. */
	private Composite parentFromView;
	/**
	 * Composite that is parent to the SashForm in the View. This is a child of
	 * parentFromView.
	 */
	private Composite parentComposite;
	/**
	 * Sash that splits the Components and the Toolbar. scrolledComposite and
	 * toolbarComposite are children.
	 */
	private SashForm sash;
	/**
	 * Composite that is responsible for scroll support within the
	 * ComponentsComposite.
	 */
	private ScrolledComposite scrolledComposite;
	/**
	 * Composite that holds the ComponentGroups. Is the only child of
	 * {@link #scrolledComposite}.
	 */
	private Composite componentComposite;
	/** Instance of the ToolbarComposite. */
	private	ToolbarComposite toolbar;
	
	/**
	 * Just create the basic elements that are needed.
	 * @param parent the created elements' parent component
	 */
	@Override
	public void createPartControl(final Composite parent) {
		this.parentFromView = parent;
		components = new ArrayList<ComponentGroup>();
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = false;
		data.horizontalAlignment = SWT.FILL;
		
		parent.setLayout(layout);
		parent.setLayoutData(data);
		
		// initialize ColorManager
		ColorManager.loadPreferences(Activator.getDefault()
				.getPreferenceStore());
		parent.setBackground(ColorManager.BACKGROUND_DEFAULT);
	}
	
	/**
	 * Creates all UI Elements that are necessary for a Visualization.
	 */
	private void createGroups() {
		components = new ArrayList<ComponentGroup>();
		// reinitialize ColorManager
		ColorManager.loadPreferences(Activator.getDefault()
				.getPreferenceStore());

		// Register this Instance in the TimelineFormat class, so other classes
		// can send an update request
		format = new TimelineFormat();
		format.registerView(this);
		format.setShowAllTimeAxis(Activator.getDefault().getPreferenceStore()
				.getBoolean(PreferenceConstants.ID_SHOWALLTIMEAXES));

		// Set Size of the UI Elements
		PortCanvas.scaleSize(Activator.getDefault().getPreferenceStore()
				.getInt(PreferenceConstants.ID_SIZE_UIELEMENTS));
		ConstraintCanvas.scaleSize(Activator.getDefault().getPreferenceStore()
				.getInt(PreferenceConstants.ID_SIZE_UIELEMENTS));
		
		// create parentComposite; this is our parent for all other elements.
		// we don't use the parent from the View, as there were complications
		// destroying groups before re-creation
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		data.horizontalAlignment = SWT.FILL;
		data.verticalAlignment = SWT.FILL;		
		
		parentComposite = new Composite(parentFromView, SWT.NONE);
		parentComposite.setLayout(layout);
		parentComposite.setLayoutData(data);
		parentComposite.setBackground(ColorManager.BACKGROUND_DEFAULT);	

		// create SashForm, the separator between toolbar and scrolledComposite
		sash = new SashForm(parentComposite, SWT.VERTICAL);
		sash.setLayoutData(GridDataFactory.copyData(data));
		
		// create scrolledComposite; it is JUST responsible for scrolling.
		// No Layout may be set, instead another composite with the contents has
		// to be set.
		scrolledComposite = new ScrolledComposite(sash, SWT.V_SCROLL);
		scrolledComposite.setLayoutData(GridDataFactory.copyData(data));
		// listener for resize
		scrolledComposite.addControlListener(new ControlListener() {
			
			@Override
			public void controlResized(ControlEvent e) {
				componentComposite.setSize(scrolledComposite.getSize());
				
			}
			
			@Override
			public void controlMoved(ControlEvent e) {		
			}
		});
				
		// create componentComposite, holds all elements created in the Factory
		componentComposite = new Composite(scrolledComposite, SWT.NONE);
		layout = new GridLayout();
		layout.numColumns = 1;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		
		componentComposite.setLayout(layout);
		componentComposite.setBackground(ColorManager.BACKGROUND_DEFAULT);
		componentComposite.setLayoutData(GridDataFactory.copyData(data));
		// listener for resize
		componentComposite.addControlListener(new ControlListener() {
			
			@Override
			public void controlResized(ControlEvent e) {
				// setting the minimum size tells the ScrolledComposite when to
				// show scrollbars
				scrolledComposite.setMinSize(componentComposite.computeSize(
						SWT.DEFAULT, SWT.DEFAULT));
			}
			
			@Override
			public void controlMoved(ControlEvent e) {
			}
		});
		
		// Create UI Elements through a factory
		IVisualizationFactory factory = new ERNESTVisualizationFactory(
				ComponentsTree.getInstance().getModel(),
				ComponentsTreeViewerPanel.getSelectedComponents());
		components = factory.createUI(componentComposite, format);
		// we skip the rest if no component was created 
		if (components.isEmpty()) { return; }
		
		// create ToolbarComposite 	
		toolbar = new ToolbarComposite(sash, SWT.NONE, format);
		
		// initialize scrolledComposite
		scrolledComposite.setContent(componentComposite);
		scrolledComposite.setExpandVertical(true);

		// Listener that handles resize and move of the View. It is in
		// particular responsible for updating the SashForms weights, so that
		// the toolbar is always aligned with the scrolledComposite.
		parentComposite.addControlListener(new ControlListener() {
			
			@Override
			public void controlResized(ControlEvent e) {
				updateView();
			}
			
			@Override
			public void controlMoved(ControlEvent e) {				
			}
		});
		
		// create time axis (will call updateView)
		updateTimeAxis();
	}

	@Override
	public void setFocus() {
		if (scrolledComposite != null) {
			scrolledComposite.setFocus();
		}
	}

	/**
	 * Dispose all current Composites and create new ones.
	 * Is used when a new Selection in the TreeViewerPanel has been made.
	 */
	public void refresh() {
		if (components != null) {
			components = null;
		}
		
		if (parentComposite != null) {
			parentComposite.dispose();
			parentComposite = null;
		}
		
		createGroups();
		
		parentComposite.layout();
		parentFromView.layout();
	}
	
	/**
	 * Returns the Toolbar of this ConstraintView.
	 * @return toolbar
	 */
	public ToolbarComposite getToolbarComposite() {
		return toolbar;
	}
	
	/**
	 * Updates the View.
	 * This should be called after layout changes happened.
	 */
	public void updateView() {
		componentComposite.layout();
		scrolledComposite.setMinSize(componentComposite.computeSize(
				SWT.DEFAULT, SWT.DEFAULT));

		// Calculate Height weights of the children of the sash (ScrolledComp
		// and Toolbar)
		// the children's height will be a percentage of the size of the View
		if (parentFromView.getClientArea().height > 0) {
			int weightToolbar;
			if (scrolledComposite.getMinHeight() > parentFromView
					.getClientArea().height - toolbar.getMinHeight()) {
				weightToolbar = (100 * toolbar.getMinHeight())
						/ parentFromView.getClientArea().height;
			} else {
				weightToolbar = (100 * (parentFromView.getClientArea().height
						- scrolledComposite.getMinHeight() - 5))
						/ parentFromView.getClientArea().height;
			}
			
			//make sure weightToolbar stays in range 0-100
			if (weightToolbar > 100) {
				weightToolbar = 100;
			} else if (weightToolbar < 0) {
				weightToolbar = 0;
			}
			sash.setWeights(new int[] { 100 - weightToolbar, weightToolbar });
		}
	}
	
	/**
	 * Toggle the time axis.
	 * <p>
	 * Toggles between the following states:<br>
	 * <li>Show a time axis at the bottom of every component, not in the
	 *     toolbar</li>
	 * <li>Show one time axis at the top of the toolbar, not in the 
	 *     components</li>
	 */
	public void toggleTimeAxis() {
		format.setShowAllTimeAxis(!format.isShowAllTimeAxis());
		Activator
				.getDefault()
				.getPreferenceStore()
				.setValue(PreferenceConstants.ID_SHOWALLTIMEAXES,
						format.isShowAllTimeAxis());
		updateTimeAxis();		
	}
	
	/**
	 * Creates and destroys time axis elements, depending on the current option
	 * selected in {@link #format}.
	 * <p>
	 */
	public void updateTimeAxis() {
		boolean isShowAllTimeAxis = format.isShowAllTimeAxis();

		for (ComponentGroup g : components) {
			g.showTimeAxis(isShowAllTimeAxis);
		}

		toolbar.showTimeAxis(!isShowAllTimeAxis);
		
		updateView();
	}
}
