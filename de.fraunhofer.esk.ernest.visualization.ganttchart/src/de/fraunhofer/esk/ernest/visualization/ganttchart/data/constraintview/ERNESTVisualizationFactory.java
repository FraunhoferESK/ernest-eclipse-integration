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
package de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.VisualizationUtil;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.ComponentGroup;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.ConstraintComposite;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.PortCanvas;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.TimelineFormat;
import ernest.Model;
import ernest.architecture.Element;
import ernest.timingspecification.Constraint;

/**
 * This Factory creates all UI Elements that contain Informations from the
 * model.
 * <p>
 * Constructor gets a list of objects to display and the model containing this
 * objects.<br>
 * {@link #createUI(Composite)} constructs the UI Elements on the given
 * Composite.<br>
 * The layout is as follows:<br>
 * <list>
 * <li>creates a ComponentGroup (group object)<br>
 * <li>create Constraints within the group (add header data like informations
 * and errors)<br>
 * <li>add Ports to the Constraint (with informations about events and errors)
 * <p>
 * Access to the model is delegated to {@link VisualizationUtil}.
 * 
 */
public class ERNESTVisualizationFactory implements IVisualizationFactory {
	/** model that contains the components in {@link #elements}. */
	private Model model;
	/** list containing all components that should be displayed. */
	private ArrayList<Element> elements;

	/**
	 * Constructor.
	 * 
	 * @param model model that contains the components in {@link #elements}
	 * @param objects list containing all components that should be displayed
	 */
	public ERNESTVisualizationFactory(Model model, ArrayList<Element> objects) {
		this.model = model;
		this.elements = objects;
	}

	/**
	 * Creates all UI Elements.
	 * <p>
	 * A UI Element is created for every Object in {@link #elements}.<br>
	 * 
	 * @param parent
	 *            the composite that serves as parent
	 * @param format
	 *            the format of the timeline
	 * @return list of created UI Elements.
	 */
	@Override
	public ArrayList<ComponentGroup> createUI(Composite parent,
			TimelineFormat format) {
		ArrayList<ComponentGroup> list = new ArrayList<ComponentGroup>();
		// create a label and return in case the objects list is empty
		if (elements.isEmpty()) {
			Label label = new Label(parent, SWT.NONE);
			label.setText("No Selected Items");
			return list;
		}

		ComponentGroup group = null;
		// create a Component UI for every object
		for (Element component : elements) {
			// create Component
			group = createComponent(component, parent, format);

			// can be null if no constraint was found for the component
			if (group != null) {
				list.add(group);
			}
		}

		// in case no given component has a constraint
		if (list.isEmpty()) {
			Label label = new Label(parent, SWT.NONE);
			label.setText("No Selected Item has a Constraint.");
		}

		return list;
	}

	/**
	 * Creates a Component UI.
	 * <p>
	 * This includes a ComponentGroup and all subelements like constraints and
	 * ports.<br>
	 * Returns null if the Component has no Constraint attached to him.<br>
	 * 
	 * @param component
	 *            the component within the model
	 * @param parent
	 *            the parent Composite
	 * @param format
	 *            the format of the timeline
	 * @return the created UI Element
	 */
	private ComponentGroup createComponent(Element component, Composite parent,
			TimelineFormat format) {
		// first get all constraint for the component
		ArrayList<Constraint> list = VisualizationUtil
				.getConstraintsForComponent(component, model);
				
		// do nothing if no constraints where found
		if (list.isEmpty()) { return null; }

		// create a ComponentGroup
		String analysisName = list.get(0).eClass().getName();
		ComponentGroup group = new ComponentGroup(parent,
				ComponentGroup.SWT_GROUPSTYLE, analysisName, component, format);

		// create a constraint UI for every found constraint
		for (Constraint constraint : list) {
			createConstraint(constraint, group);
		}

		return group;
	}

	/**
	 * Creates a Constraint UI.
	 * <p>
	 * This includes all subelements (ports).<br>
	 * 
	 * @param constraint
	 *            the constraint within the model
	 * @param group
	 *            group which is the parent
	 * @return the created Constraint UI
	 */
	private ConstraintComposite createConstraint(Constraint constraint,
			ComponentGroup group) {
		// create ConstraintComponent
		ConstraintComposite conComp = group.createConstraint(constraint);
		// add Informations
		conComp.addHeaderInformations(VisualizationUtil
				.getConstraintInformations(constraint, model));
		// add Error Informations
		conComp.addHeaderErrors(VisualizationUtil.getConstraintErrors(
				constraint, model));

		// create a Port UI for every port
		for (Object port : VisualizationUtil.getPortsOfConstraint(constraint)) {
			createPort(port, conComp, constraint);
		}

		return conComp;
	}

	/**
	 * Create a Port UI.
	 * <p>
	 * This is just a PortCanvas. Has no subelemets.<br>
	 * 
	 * @param port
	 *            the port within the model
	 * @param conComp
	 *            composite which is parent
	 * @param constraint
	 *            indicates if the port is part of a portdelay, in which case
	 *            the name will have stimulus or response as an addition. if
	 *            null, just the ports name is used.
	 * @return the created Port UI
	 */
	private PortCanvas createPort(Object port, ConstraintComposite conComp,
			Object constraint) {
		conComp.addPort(VisualizationUtil.getPortName(port, constraint),
				VisualizationUtil.getEvents(port, model),
				VisualizationUtil.getErrorEvents(port, model), port);

		return null;
	}

}
