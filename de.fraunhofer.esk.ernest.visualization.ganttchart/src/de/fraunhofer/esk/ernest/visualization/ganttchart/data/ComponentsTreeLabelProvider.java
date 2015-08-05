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
package de.fraunhofer.esk.ernest.visualization.ganttchart.data;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.Activator;
import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.views.ViewListComponents;

/**
 * This class provides the labels and icons for the file tree.
 * 
 */
public class ComponentsTreeLabelProvider implements ILabelProvider {

	/** Image for model tree node. */
	private Image model;
	/** Image for module tree node. */
	private Image module;
	/** Image for structuremodel tree node. */
	private Image structuremodel;

	/**
	 * Constructor.
	 */
	public ComponentsTreeLabelProvider() {
		// Create the images
		try {
			model = new Image(null, Activator.class.getResourceAsStream(
					"../icons/Model.gif"));
			module = new Image(null, Activator.class.getResourceAsStream(
					"../icons/Module.gif"));
			structuremodel = new Image(null, Activator.class
					.getResourceAsStream("../icons/StructureModel.gif"));
		} catch (Exception e) {
			System.out.println("Error " + e);
		}

	}

	@Override
	public void addListener(ILabelProviderListener listener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {

		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {

	}

	@Override
	public Image getImage(final Object element) {

		
		if (element instanceof Node) {			
			Node node = (Node) element;
			if (null == node.getObject()) {
				return null;
			}
			
			String className = node.getObject().getClass().getSimpleName();
			className = className.replaceAll("Impl", "");
			if ((className.compareToIgnoreCase("model") == 0)) {
				return model;
			}
			if ((className.compareToIgnoreCase("structuremodel") == 0)) {
				return structuremodel;
			}

			return module; // use this as default symbol for analysis and
							// constraint, cause with the component analysis
							// view the module image isn't used anymore

		} else {
			return null;
		}

	}

	@Override
	public String getText(final Object element) {
		
		if (element instanceof Node) {
			Node node = (Node) element;

			// To avoid null pointer exceptions the method uses in this case
			// simply the node name.
			IWorkbench workbench = PlatformUI.getWorkbench();
			if (workbench.getActiveWorkbenchWindow().getActivePage()
					.getActivePart() instanceof ViewListComponents) {
				if (null != node.getName() && node.getName().length() != 0) {
					return node.getName();
				} else {
					return node.getObject().getClass().getSimpleName()
							.replaceAll("Impl", "");
				}
			}
			
			String className = node.getObject().getClass().getSimpleName();
			className = className.replaceAll("Impl", "");						
			return className + " " + node.getName();
			
		} else {
			return "noElement";
		}
	}

}
