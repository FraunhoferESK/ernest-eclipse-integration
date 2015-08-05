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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ernest.Model;
import ernest.architecture.Connector;
import ernest.architecture.FModule;
import ernest.architecture.Module;
import ernest.architecture.StructureModel;
import ernest.timingspecification.Constraint;

/**
 * This class creates the Vector<Node> nodes for the Tree from a file.
 * 
 */
public final class ComponentsTree {

	/** The ResourceSet for the Tree. */
	private ResourceSet resourceSet;
	/** The Resource for the Tree. */
	private Resource modelResource;
	/** The model for the tree. */
	private ernest.Model model;
	/** The Vector<Node> for the tree. */
	private Vector<Node> nodes = new Vector<Node>();

	/** The Singleton instance of the data <code>ComponentsTree</code>. */
	private static volatile ComponentsTree singletonObject = null;

	/**
	 * Singleton pattern.
	 */
	private ComponentsTree() {
	}

	/**
	 * Gets the singleton object of this class.
	 * 
	 * @return the singleton object.
	 */
	public static ComponentsTree getInstance() {
		if (singletonObject == null) {
			singletonObject = new ComponentsTree();
		}
		return singletonObject;
	}

	/**
	 * 
	 * @return The model for the tree.
	 */
	public ernest.Model getModel() {
		return model;
	}

	/**
	 * This method provide the de.fraunhofer.esk.ernest.visualization.ganttChart.data for the Tree of Components.
	 * 
	 * @param file
	 *            The file with the model.
	 */
	public void fillTree(final String file) {

		if (file == null) {
			return;
		}
		// Create the ResourceSet
		resourceSet = new ResourceSetImpl();

		// Load the File into the ResourceSet
		URI fileuri = URI.createPlatformResourceURI(file, false);
		modelResource = resourceSet.getResource(fileuri, true);
		if (modelResource == null) {
			return;
		}

		// read the first element -> ModelImpl
		if (modelResource.getContents().get(0) instanceof Model) {
			model = (Model) modelResource.getContents().get(0);
			nodes = new Vector<Node>();
		}

		createAnalysisElements();
	}

	/**
	 * Create the nodes for the Model.<br>
	 * 
	 */
	private void createAnalysisElements() {
		Node actual = new Node(model.getTitle(), null, model);
		nodes.add(actual);

		StructureModel structModel = model.getStructureModel();

		createAnalysisNodes(structModel, actual);
	}

	/**
	 * Create the analysis nodes with their constraints<br>
	 * for the structureModel.
	 * <p>
	 * 
	 * @param structureModel {@link StructureModel} to create nodes for.
	 * @param parent Parent for created nodes.
	 */
	private void createAnalysisNodes(final StructureModel structureModel,
			final Node parent) {

		// Contains the names of the available analyses found in the constraints
		TreeSet<String> availableAnalyses = new TreeSet<String>();

		// Contains the name of the analysis and the map for the associated
		// constraints.
		// The Map contains the constraint name and the constraint object.
		TreeMap<String, TreeMap<String, Object>> constraintMap =
								new TreeMap<String, TreeMap<String, Object>>();

		// Loop into Modules, look for constraints
		for (Module module : structureModel.getModules()) {

			if (module instanceof FModule) {

				ArrayList<Constraint> list = VisualizationUtil
						.getConstraintsForComponent(module, model);
				if (list.size() > 0) {
					for (Constraint constraint : list) {
						String analysisName = constraint.eClass().getName();
						availableAnalyses.add(analysisName);

						TreeMap<String, Object> constraintList;
						if (constraintMap.containsKey(analysisName)) {
							constraintList = constraintMap.get(analysisName);
						} else {
							constraintList = new TreeMap<String, Object>();
						}
						constraintList.put(constraint.getName(), module);
						constraintMap.put(analysisName, constraintList);
					}
				}
			}
		}

		// Loop into Connectors, look for constraints
		for (Connector connector : structureModel.getConnectors()) {

			ArrayList<Constraint> list = VisualizationUtil
					.getConstraintsForComponent(connector, model);
			if (null != list && list.size() > 0) {
				for (Constraint constraint : list) {
					String analysisName = constraint.eClass().getName();
					availableAnalyses.add(analysisName);

					TreeMap<String, Object> constraintList;
					if (constraintMap.containsKey(analysisName)) {
						constraintList = constraintMap.get(analysisName);
					} else {
						constraintList = new TreeMap<String, Object>();
					}
					constraintList.put(constraint.getName(), connector);
					constraintMap.put(analysisName, constraintList);
				}
			}
		}

		// create Nodes for the constraints and analyses found
		for (String analysis : availableAnalyses) {
			Node other = new Node(analysis, parent, "null"); // the last value
																// can't be
																// null, but
																// isn't really
																// used
																// afterwards

			for (Entry<String, Object> entry : constraintMap.get(analysis)
					.entrySet()) {
				new Node(entry.getKey(), other, entry.getValue());
			}
		}
	}

	/**
	 * Return the input nodes.
	 * 
	 * @return The input nodes.
	 */
	public Collection<Node> getNodes() {
		return nodes;
	}

}
