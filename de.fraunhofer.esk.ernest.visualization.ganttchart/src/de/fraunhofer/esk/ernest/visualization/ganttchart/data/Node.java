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

/**
 * The Class Node is the base element of the Tree.
 * 
 */
public class Node {

	/** The name of the Node. */
	private String name = "";

	/** The object. */
	private Object object;

	/** The Children. */
	private Vector<Node> subCategories;

	/** The parent. */
	private Node parent;

	/**
	 * Constructor to create a new Node.
	 * 
	 * @param name The name of the Node.
	 * @param parent The parent.
	 * @param object The object.
	 */
	public Node(final String name, final Node parent, final Object object) {

		if (name != null) { this.name = name; }
		this.parent = parent;
		this.object = object;

		if (parent != null) { parent.addSubCategory(this); }
	}

	/**
	 * Return the subCategories associate to this Node.
	 * 
	 * @return Vector<Node> List of subCategories.
	 */
	public Vector<Node> getSubCategories() {
		return subCategories;
	}

	/**
	 * Add SubCategories to a Node.
	 * 
	 * @param subcategory subCategory to add
	 */
	private void addSubCategory(final Node subcategory) {
		if (subCategories == null) {
			subCategories = new Vector<Node>();
		}

		if (!subCategories.contains(subcategory)) {
			subCategories.add(subcategory);
		}
	}

	/**
	 * Return the Name associate to this Node.
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Return the parent associate to this Node.
	 * 
	 * @return Node
	 */
	public Node getParent() {
		return parent;
	}

	/**
	 * Return the Object associate to this Node.
	 * 
	 * @return Object
	 */
	public Object getObject() {
		return object;
	}
}
