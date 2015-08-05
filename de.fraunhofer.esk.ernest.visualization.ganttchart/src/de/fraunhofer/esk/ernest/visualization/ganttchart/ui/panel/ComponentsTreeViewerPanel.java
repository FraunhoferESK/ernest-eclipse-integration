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
package de.fraunhofer.esk.ernest.visualization.ganttchart.ui.panel;

import java.util.ArrayList;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.ComponentsTree;
import de.fraunhofer.esk.ernest.visualization.ganttchart.data.ComponentsTreeContentProvider;
import de.fraunhofer.esk.ernest.visualization.ganttchart.data.ComponentsTreeLabelProvider;
import de.fraunhofer.esk.ernest.visualization.ganttchart.data.Node;
import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.views.ConstraintView;
import ernest.architecture.Element;
import ernest.architecture.impl.PortImpl;
import ernest.architecture.impl.StructureModelImpl;

/**
 * This class display a window to show all our components in a Tree. This is
 * used in the ViewListcomponents.
 * 
 */
public final class ComponentsTreeViewerPanel {

	/** The CheckboxTreeViewer to display. */
	private CheckboxTreeViewer treeViewer = null;

	/** The Singleton instance of the data <code>ComponentsTree</code>. */
	private static volatile ComponentsTreeViewerPanel singletonObject = null;

	private Menu analysisMenu;

	/**
	 * Singleton pattern.
	 */
	private ComponentsTreeViewerPanel() {
	}

	/**
	 * Returns (and creates) the single instance of this singleton.
	 * 
	 * @return the singleton instance
	 */
	public static ComponentsTreeViewerPanel getInstance() {
		// Singleton pattern
		if (singletonObject == null) {
			singletonObject = new ComponentsTreeViewerPanel();
		}

		return singletonObject;
	}

	/**
	 * Initializes the the {@link ComponentsTreeViewerPanel} to show a tree of
	 * the model in the given file.
	 * 
	 * @param composite
	 *            the parent {@link Composite}
	 * @param file
	 *            path to the file containing the model to show
	 * @return the initialized {@link ComponentsTreeViewerPanel}
	 */
	public static ComponentsTreeViewerPanel initTreeViewerPanel(
			final Composite composite, final String file) {
		getInstance().createTree(composite, file);
		return singletonObject;
	}

	/**
	 * Create the components tree to be displayed.
	 * 
	 * @param composite
	 *            the parent {@link Composite}
	 * @param file
	 *            path to the file containing the model to show
	 */
	private void createTree(final Composite composite, final String file) {

		// Create Layout for the Components View
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		composite.setLayout(gridLayout);

		// Cascade menu button
		final Button bg = new Button(composite, SWT.PUSH | SWT.FLAT);
		bg.setText("Menu");

		// fill the tree with the de.fraunhofer.esk.ernest.visualization.ganttChart.data and set up the properties
		ComponentsTree.getInstance().fillTree(file);
		final Tree checkTree = new Tree(composite, SWT.CHECK);
		checkTree.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// filler
		new Label(composite, SWT.BOLD);

		// Tree View, used in the older Versions of the visualization view. Made
		// the View only invisible and added the cascade menu instead.
		checkTree.setVisible(false);
		treeViewer = new CheckboxTreeViewer(checkTree);
		treeViewer.setContentProvider(new ComponentsTreeContentProvider());
		treeViewer.setLabelProvider(new ComponentsTreeLabelProvider());
		treeViewer.setInput(ComponentsTree.getInstance().getNodes());
		treeViewer.collapseAll();

		// Create Constraint View, which is displayed inside the components view
		final ConstraintView conView = new ConstraintView();
		final Composite conContainer = new Composite(composite, SWT.NONE);
		conContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
		conView.createPartControl(conContainer);

		// Add a listener to the CheckboxTreeViewer: when the user checks a
		// checkbox in the tree, check all its children
		treeViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				// If the item is checked . . .
				if (event.getChecked()) {
					// . . . check all its children
					treeViewer.setSubtreeChecked(event.getElement(), true);

					/* Update Constraint View */
					conView.refresh();
				} else {
					treeViewer.setSubtreeChecked(event.getElement(), false);
				}

				/* Update Constraint View */
				conView.refresh();
			}
		});

		/* Add Menu */
		final Menu menu = new Menu(bg);
		bg.setMenu(menu);
		bg.addMouseListener(new MouseListener() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}

			@Override
			public void mouseDown(MouseEvent e) {
				Point loc = bg.getLocation();
				Rectangle rect = bg.getBounds();

				Point mLoc = new Point(loc.x - 1, loc.y + rect.height);

				menu.setLocation(composite.getDisplay().map(bg.getParent(),
						null, mLoc));
				menu.setVisible(true);

			}

			@Override
			public void mouseUp(MouseEvent e) {
			}

		});

		fillMenu(conView, menu);

	}

	/**
	 * Fill Menu tree style.
	 * <p>
	 * This Works cause the Tree looks like this:
	 * <p>
	 * <li>First Element is Always the Model</li>
	 * <li>The Elements on the next level are the different analyses</li>
	 * <li>The third level contains the constraints for their analysis</li>
	 * <p>
	 * Tree shouldn't change during runtime
	 * 
	 * @param conView the constraint view
	 * @param menu the menu
	 */
	private void fillMenu(final ConstraintView conView, final Menu menu) {
		treeViewer.expandAll();

		TreeItem treeitem = treeViewer.getTree().getItem(0); // the first item
																// is always the
																// model

		// now get the Analysis
		int analysisCount = treeitem.getItemCount(); // number of all analysis
		for (int i = 0; i < analysisCount; i++) {
			TreeItem analysisItem = treeitem.getItem(i);
			int constraintCount = analysisItem.getItemCount(); // number of all
																// constraints
																// for the
																// specific
																// analysis
			MenuItem analysisMenuItem = new MenuItem(menu, SWT.CASCADE);

			analysisMenu = new Menu(menu);
			analysisMenuItem.setMenu(analysisMenu);
			analysisMenuItem.setText(analysisItem.getText().substring(
					analysisItem.getText().indexOf(" ") + 1));

			for (int j = 0; j < constraintCount; j++) {
				final int analysisIndex = i;
				final int constraintIndex = j;
				TreeItem constraintItem = analysisItem.getItem(j);
				final MenuItem constraint = new MenuItem(analysisMenu,
						SWT.CHECK);
				constraint.setText(constraintItem.getText().substring(
						constraintItem.getText().indexOf(" ") + 1));
				constraint.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {

						treeViewer.expandAll();

						TreeItem selectionItem = treeViewer.getTree()
								.getItem(0); // model
						// analysis
						selectionItem = selectionItem.getItem(analysisIndex);
						// constraint
						selectionItem = selectionItem.getItem(constraintIndex);

						if (constraint.getSelection()) {
							treeViewer.setSubtreeChecked(
									selectionItem.getData(), true);
						} else {
							treeViewer.setSubtreeChecked(
									selectionItem.getData(), false);
						}
						treeViewer.refresh();

						conView.refresh();
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);
					}

				});
			}

			/* Select all Constraint Button */
			final MenuItem allConstraintItem = new MenuItem(analysisMenu,
					SWT.PUSH);
			allConstraintItem.setText("Select all");
			allConstraintItem.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					for (int i = 0; i < analysisMenu.getItemCount() - 2; i++) {
						if (!analysisMenu.getItem(i).getSelection()) {
							analysisMenu.getItem(i).setSelection(true);
							analysisMenu.getItem(i).notifyListeners(
									SWT.Selection, new Event());
						}
					}
				}

			});

			/* Deselect all Constraint Button */
			final MenuItem deallConstraintItem = new MenuItem(analysisMenu,
					SWT.PUSH);
			deallConstraintItem.setText("Deselect all");
			deallConstraintItem.addSelectionListener(new SelectionAdapter() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					for (int i = 0; i < analysisMenu.getItemCount() - 2; i++) {
						if (analysisMenu.getItem(i).getSelection()) {
							analysisMenu.getItem(i).setSelection(false);
							analysisMenu.getItem(i).notifyListeners(
									SWT.Selection, new Event());
						}
					}
				}

			});
		}

		/* Select all Analysis Button */
		final MenuItem allMenuItem = new MenuItem(menu, SWT.PUSH);
		allMenuItem.setText("Select all");
		allMenuItem.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				for (int j = 0; j < menu.getItemCount() - 2; j++) {
					menu.getItem(j)
							.getMenu()
							.getItem(menu.getItem(j).getMenu().getItemCount()
										- 2)
							.notifyListeners(SWT.Selection, new Event());
				}
			}

		});
		/* Deselect all Analysis Button */
		final MenuItem deallMenuItem = new MenuItem(menu, SWT.PUSH);
		deallMenuItem.setText("Deselect all");
		deallMenuItem.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				for (int j = 0; j < menu.getItemCount() - 2; j++) {
					menu.getItem(j)
							.getMenu()
							.getItem(menu.getItem(j).getMenu().getItemCount()
										- 1)
							.notifyListeners(SWT.Selection, new Event());
				}
			}

		});
	}

	/**
	 * 
	 * @return the {@link #treeViewer}
	 */
	public CheckboxTreeViewer getTreeViewer() {
		return treeViewer;
	}

	/**
	 * Update the tree viewer with the component tree.
	 */
	public void update() {
		getTreeViewer().setInput(ComponentsTree.getInstance().getNodes());
		if (analysisMenu != null) {
			analysisMenu.getItem(analysisMenu.getItemCount() - 1).setSelection(false);
			analysisMenu.getItem(analysisMenu.getItemCount() - 1).notifyListeners(SWT.Selection, new Event());
			analysisMenu.getItem(analysisMenu.getItemCount() - 2).setSelection(true);
			analysisMenu.getItem(analysisMenu.getItemCount() - 2).notifyListeners(SWT.Selection, new Event());
		}
	}

	/**
	 * 
	 * @return array with all checked elements in the {@link #treeViewer}
	 */
	public static Object[] getCheckedElement() {
		if (getInstance().treeViewer == null) {
			return new Object[0];
		}
		return getInstance().getTreeViewer().getCheckedElements();
	}

	/**
	 * return the selected components that are not PortImpl contained on the
	 * StructureModel This components must be visualize if they have constraints
	 * associated to them.
	 * 
	 * @return ArrayList<Object>
	 */
	public static ArrayList<Element> getSelectedComponents() {

		ArrayList<Element> objSelectedObjects = new ArrayList<Element>();
		Object[] checkedElements = getCheckedElement();

		if (checkedElements != null) {
			for (int i = 0; i < checkedElements.length; i++) {
				Object object = ((Node) checkedElements[i]).getObject();
				if ((object instanceof StructureModelImpl)
						|| (object instanceof PortImpl)) {
					// do nothing
					continue;
				} else if (object instanceof Element) {
					objSelectedObjects.add((Element) object);
				}
			}
		}
		return objSelectedObjects;
	}

}
