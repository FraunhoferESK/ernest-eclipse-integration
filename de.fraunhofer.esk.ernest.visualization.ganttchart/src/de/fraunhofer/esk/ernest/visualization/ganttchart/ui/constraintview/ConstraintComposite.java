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

import java.awt.geom.Point2D;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.VisualizationUtil;
import ernest.timingspecification.Constraint;

/**
 * A Composite that displays all Informations regarding a specific Constraint.
 * Has a Header and one or more PortCanvas.
 * 
 */
public class ConstraintComposite extends Composite {

	/** Canvas for the Header. Contains Constraint information. */
	private ConstraintCanvas constraintCanvas;
	/** List of Canvas for the Ports. */
	private ArrayList<PortCanvas> portCanvas;
	/**
	 * Instance that contains informations about the formatting of the time
	 * line.
	 */
	private TimelineFormat format = null;
	/** 
	 * Object that contains the Constraint class within the model.
	 */
	private Object constraint;
	
	/**
	 * Value that indicates if the Composite is expanded.
	 * <p>
	 * An expanded ConstraintComposite shows the PortCanvas elements, while an
	 * unexpanded one only shows the Header (ConstraintCanvas).
	 */
	private boolean isExpanded;
	
	/**
	 * Standard Constructor for ConstraintComposite.
	 * <p>
	 * 
	 * @param parent
	 *            the composite this composite is a child of
	 * @param style
	 *            SWT style of this composite.
	 * @param constraint
	 *            the constraint
	 * @param timelineFormat
	 *            format information of the timeline
	 */
	public ConstraintComposite(Composite parent, int style,
			Constraint constraint, TimelineFormat timelineFormat) {
		super(parent, style);
		
		this.constraint = constraint;
		this.format = timelineFormat;
		isExpanded = false;
		portCanvas = new ArrayList<PortCanvas>();
		
		initLayout();
		// create the ConstraintCanvas
		createHeader(VisualizationUtil.getConstraintName(constraint));
		
		// sets the height of this composite to the height of the
		// ConstraintCanvas (so no ports are visible)
		((GridData) getLayoutData()).heightHint = ConstraintCanvas
				.getRowHeight() + 2 * constraintCanvas.getBorderWidth();
	}
	
	/**
	 * Sets the Layout of this Composite.
	 */
	private void initLayout() {
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = false;
		data.horizontalAlignment = SWT.FILL;
		data.heightHint = ConstraintCanvas.getRowHeight();
		
		GridLayout layoutGroup = new GridLayout();
		layoutGroup.numColumns = 1;
		layoutGroup.marginWidth = 0;
		layoutGroup.marginHeight = 0;
		layoutGroup.verticalSpacing = 0;
		setLayout(layoutGroup);
		setLayoutData(data);
	}
	
	/**
	 * Creates the ConstraintCanvas that serves as a Header.<br>
	 * Adds Listeners for mouse events.
	 * 
	 * @param constraintName name of the constraint
	 */
	private void createHeader(String constraintName) {
		constraintCanvas = new ConstraintCanvas(this,
				ConstraintCanvas.SWT_DEFAULTSTYLE, constraintName, format);

		// listener that receives double click events, used to expand the
		// Composite and show ports.
		constraintCanvas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				if (!isExpanded) {
					// expand the Composite by calculating a new height
					expand();
				} else {
					// reduce the Composite to only show the Header
					reduce();
				}
				isExpanded = !isExpanded;
				// Update the View that is registered in TimelineFormat
				format.updateView();
			}
		});
	}
	
	/**
	 * Expands the Composite and shows all Ports.<p>
	 * Has no effect if the Composite is already expanded.
	 */
	public void expand() {
		((GridData) getLayoutData()).heightHint = ConstraintCanvas
				.getRowHeight()
				+ (portCanvas.size() * PortCanvas.getRowHeight())
				+ (2 * constraintCanvas.getBorderWidth());
	}
	
	/** 
	 * Reduce the Composite to only show the Header. <p>
	 * Has no effect if the Composite is already reduced.
	 */
	public void reduce() {
		((GridData) getLayoutData()).heightHint = ConstraintCanvas
				.getRowHeight() + (2 * constraintCanvas.getBorderWidth());
	}
	
	/**
	 * Adds Informations to the Header Time Axis.
	 * 
	 * @param informations
	 *            data containing additional informations to display in the
	 *            header
	 * @see VisualizationUtil#getConstraintInformations(Object, ERNEST.Model)
	 */
	public void addHeaderInformations(Point2D.Double[] informations) {
		constraintCanvas.setInformations(informations);
	}
	
	/**
	 * Adds Error Informations to the Header Time Axis.
	 * @param errors to display in the header
	 * @see VisualizationUtil#getConstraintInformations(Object, ERNEST.Model)
	 */
	public void addHeaderErrors(Point2D.Double[] errors) {
		constraintCanvas.setErrors(errors);
	}
	
	/**
	 * Add a Port to the ConstraintComposite. This will create a
	 * {@link PortCanvas} and set all necessary data.
	 * 
	 * @param portName
	 *            name of the port
	 * @param events
	 *            events that should be displayed
	 * @param errors
	 *            error events that should be displayed
	 * @param port
	 *            object that contains the corresponding Port from within the
	 *            model
	 */
	public void addPort(String portName, double[] events, double[] errors,
			Object port) {
		PortCanvas canvas = new PortCanvas(this, PortCanvas.SWT_DEFAULTSTYLE,
				portName, format);
		canvas.setEventOccurences(events);
		canvas.setEventErrors(errors);
		this.portCanvas.add(canvas);
	}

	/**
	 * Returns the ConstraintCanvas.
	 * @return header of this composite
	 */
	public ConstraintCanvas getConstraintCanvas() {
		return constraintCanvas;
	}

	/**
	 * Returns a list of PortCanvas elements.
	 * @return body of this composite
	 */
	public ArrayList<PortCanvas> getPortCanvas() {
		return portCanvas;
	}

	/**
	 * Return the Constraint within the model.
	 * @return constraint within the model
	 */
	public Object getConstraint() {
		return constraint;
	}

	/**
	 * Returns whether this Composite is expanded.
	 * <p>
	 * An expanded Composite shows Header and Body, while a reduced Composite
	 * only shows the Header.
	 * 
	 * @return true if the composite shows header and body, false otherwise
	 */
	public boolean isExpanded() {
		return isExpanded;
	}

}
