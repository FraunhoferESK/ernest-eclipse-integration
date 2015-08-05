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

import java.util.Vector;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * This class provides the content for the tree in FileTree.
 * 
 */
public class ComponentsTreeContentProvider implements ITreeContentProvider {

	/**
	 * Gets the children of the specified object.
	 * 
	 * @param node
	 *            the parent object
	 * @return Object[]
	 */
	public Object[] getChildren(final Object node) {
		Vector<Node> subcats = ((Node) node).getSubCategories();

		if (subcats == null) { return new Object[0]; }

		return subcats.toArray();
	}

	/**
	 * Gets the parent of the specified object.
	 * 
	 * @param node
	 *            the object
	 * @return Object
	 */
	public Object getParent(final Object node) {
		return ((Node) node).getParent();
	}

	/**
	 * Returns whether the passed object has children.
	 * 
	 * @param parentNode
	 *            the parent object
	 * @return boolean
	 */
	public boolean hasChildren(final Object parentNode) {
		return ((Node) parentNode).getSubCategories() != null;
	}

	/**
	 * Gets the root element(s) of the tree.
	 * 
	 * @param input
	 *            the input data
	 * @return Object[]
	 */
	@SuppressWarnings("unchecked")
	public Object[] getElements(final Object input) {
		if (input != null && input instanceof Vector) {
			return ((Vector<Node>) input).toArray();
		}
		return new Object[0];
	}

	/**
	 * Disposes any created resources.
	 */
	public void dispose() {
		// Nothing to dispose
	}

	/**
	 * Called when the input changes.
	 * 
	 * @param viewer
	 *            the viewer
	 * @param oldInput
	 *            the old input
	 * @param newInput
	 *            the new input
	 */
	public void inputChanged(final Viewer viewer, final Object oldInput,
			final Object newInput) {
		// Nothing to change
	}
}