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
package de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.ColorManager;
import ernest.timingspecification.Constraint;

/**
 * Display all Constraints of a single Component.
 * Every Constraint that contains a port of the component will be displayed.
 * 
 */
public class ComponentGroup {
	/** SWT Style of the Group. */
	public static final int SWT_GROUPSTYLE = SWT.FILL | SWT.DOUBLE_BUFFERED;
	
	/** Group Element that serves as a parent for the ConstraintComposites. */
	private Group group;
	/** Canvas on which the Time Axis is drawn. */
	private TimeAxis timeaxis = null;
	
	/** List of Composites that are included in the component group. */
	private ArrayList<ConstraintComposite> constraintComposites;
	/** Name of the Component. */
	private String componentName = "";
	/** 
	 * Object that contains the corresponding Component from within the model.
	 * This is currently not used, but could be in the future 
	 */
	private Object component;
	
	/**
	 * Instance that contains informations about the formatting of the time
	 * line.
	 */
	private TimelineFormat format = null;
	
	/**
	 * Standard Constructor for the component group.<p>
	 * 
	 * @param parent parent composite of the component group
	 * @param style SWT Style of the component group
	 * @param name name of the displayed component
	 * @param component displayed component
	 * @param format time line format informations
	 */
	public ComponentGroup(Composite parent, int style, String name,
			Object component, TimelineFormat format) {
		this.component = component;
		this.componentName = name;
		this.format = format;
		
		GridLayout layoutGroup = new GridLayout();
		layoutGroup.numColumns = 1;
		layoutGroup.marginWidth = 0;
		layoutGroup.marginHeight = 10;
		layoutGroup.verticalSpacing = 0;
		
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = false;
		data.horizontalAlignment = SWT.FILL;
		data.verticalAlignment = SWT.FILL;
	
		group = new Group(parent, style);
		group.setText(componentName);
		group.setLayout(layoutGroup);
		group.setLayoutData(data);
		group.setBackground(ColorManager.BACKGROUND_DEFAULT);
		
		constraintComposites = new ArrayList<ConstraintComposite>();
	}
	
	/**
	 * Creates a new Constraint in this ComponentsGroup, and returns the
	 * ConstraintComposite for further initialization.
	 * 
	 * @param name
	 *            name of the constraint
	 * @param constraint
	 *            object that contains the Component from within the model
	 * @return the ConstraintComposite that was created
	 */
	public ConstraintComposite createConstraint(Constraint constraint) {
		constraintComposites.add(new ConstraintComposite(group, SWT.NONE,
				constraint, format));
		return constraintComposites.get(constraintComposites.size() - 1);
	}
	
	/**
	 * Returns the ConstraintComposite list.
	 * 
	 * @return list of all composites
	 */
	public ArrayList<ConstraintComposite> getConstraints() {
		return constraintComposites;
	}
	
	/**
	 * Returns the time axis of this Group.
	 * @return time axis
	 */
	public TimeAxis getTimeaxis() {
		return timeaxis;
	}
	
	/**
	 * Returns all ConstraintComposites attached to this component.<p>
	 * @return list of composites
	 */
	public ArrayList<ConstraintComposite> getConstraintComposites() {
		return constraintComposites;
	}

	/**
	 * Returns the name of the component.
	 * @return name of the component
	 */
	public String getComponentName() {
		return componentName;
	}

	/**
	 * Returns the component.
	 * @return component within the model
	 */
	public Object getComponent() {
		return component;
	}

	/**
	 * Return the {@link TimelineFormat} set in this group.
	 * @return format class
	 */
	public TimelineFormat getFormat() {
		return format;
	}
	
	/**
	 * Create or destroy the time axis for this ComponentGroup.
	 * 
	 * @param visible true, if a time axis should be visible, false otherwise
	 * @return the created Time Axis
	 */
	public TimeAxis showTimeAxis(boolean visible) {
		if (visible) {
			if (timeaxis == null) {
				timeaxis = new TimeAxis(group, TimeAxis.SWT_DEFAULTSTYLE,
						format);
			}
		} else {
			if (timeaxis != null) {
				timeaxis.dispose();
				timeaxis = null;
			}
		}
		
		return timeaxis;
	}
	
	/**
	 * Disposes all SWT Elements in this group.
	 */
	public void dispose() {
		group.dispose();
	}
}
