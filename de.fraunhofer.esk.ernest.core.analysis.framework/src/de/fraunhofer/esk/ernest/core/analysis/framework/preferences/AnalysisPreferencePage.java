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
package de.fraunhofer.esk.ernest.core.analysis.framework.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.fraunhofer.esk.ernest.core.analysis.framework.AnalysisType;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class AnalysisPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	private TableViewer viewer;
	private TableViewerColumn viewerColumn_Name;
	private TableViewerColumn viewerColumn_Ext;
	private TableViewerColumn viewerColumn_Class;

	private Text text_name;
	private Text text_ext;
	private Text text_class;

	private final AnalysisTypeViewerComparator comparator = new AnalysisTypeViewerComparator();

	public static class AnalysisTypeViewerComparator extends ViewerComparator {
		private int colNumber = 0;
		private static final int DESCENDING = 1;
		private int direction = DESCENDING;

		public AnalysisTypeViewerComparator() {
			this.colNumber = 0;
			this.direction = DESCENDING;
		}

		public int getDirection() {
			return this.direction == 1 ? SWT.DOWN : SWT.UP;
		}

		public void setColumn(int colNumber) {
			if (this.colNumber == colNumber) {
				this.direction = 1 - this.direction;
			} else {
				this.colNumber = colNumber;
				this.direction = DESCENDING;
			}
		}

		@Override
		public int compare(Viewer viewer, Object e1, Object e2) {
			AnalysisType a1 = (AnalysisType) e1;
			AnalysisType a2 = (AnalysisType) e2;

			int rc;
			switch (this.colNumber) {
			case 0:
				rc = a1.getName().compareTo(a2.getName());
				break;
			case 1:
				rc = a1.getExtension().compareTo(a2.getExtension());
				break;
			case 2:
				rc = a1.getClassname().compareTo(a2.getClassname());
				break;
			default:
				rc = 0;
				break;
			}

			// If descending order, flip the direction
			if (this.direction == DESCENDING) {
				rc = -rc;
			}

			return rc;
		}
	};

	ISelectionChangedListener changeListener = new ISelectionChangedListener() {

		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			StructuredSelection sel = (StructuredSelection) event.getSelection();
			AnalysisType type = (AnalysisType) sel.getFirstElement();
			AnalysisPreferencePage.this.text_name.setText(type.getName());
			AnalysisPreferencePage.this.text_ext.setText(type.getExtension());
			AnalysisPreferencePage.this.text_class.setText(type.getClassname());
		}
	};

	public AnalysisPreferencePage() {
		super();
		this.setDescription("Options for the ERNEST Analysis Framework");
		this.noDefaultAndApplyButton();
	}

	@Override
	public void init(IWorkbench workbench) {
	}

	@Override
	protected Control createContents(Composite parent) {
		GridLayout gridParent = new GridLayout();
		gridParent.numColumns = 1;
		parent.setLayout(gridParent);

		Label label = new Label(parent, SWT.NULL);
		label.setText("Listing of all registered Analyses:");

		/*
		 * Test implementation of a TableViewer that lists all registered
		 * Analyses
		 */

		this.createTableViewer(parent);

		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.horizontalAlignment = GridData.FILL;
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		separator.setLayoutData(data);

		Composite container = new Composite(parent, SWT.NULL);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 10;
		container.setLayout(gridLayout);

		GridData data_label = new GridData();
		data_label.horizontalSpan = 2;

		GridData data_text = new GridData();
		data_text.horizontalSpan = 8;
		// data_text.verticalAlignment = GridData.BEGINNING;
		data_text.grabExcessHorizontalSpace = true;
		// data_text.grabExcessVerticalSpace = false;
		data_text.horizontalAlignment = GridData.FILL;
		container.setLayoutData(data_text);

		Label label_name = new Label(container, SWT.NULL);
		label_name.setText("Name:");
		label_name.setLayoutData(data_label);
		this.text_name = new Text(container, SWT.NULL);
		this.text_name.setText("Select an Analysis");
		this.text_name.setLayoutData(data_text);
		this.text_name.setEditable(false);

		Label label_ext = new Label(container, SWT.NULL);
		label_ext.setText("Extension:");
		label_ext.setLayoutData(data_label);
		this.text_ext = new Text(container, SWT.NULL);
		this.text_ext.setText("Select an Analysis");
		this.text_ext.setLayoutData(data_text);
		this.text_ext.setEditable(false);

		Label label_class = new Label(container, SWT.NULL);
		label_class.setText("Classname:");
		label_class.setLayoutData(data_label);
		this.text_class = new Text(container, SWT.NULL);
		this.text_class.setText("Select an Analysis");
		this.text_class.setLayoutData(data_text);
		this.text_class.setEditable(false);

		return null;
	}

	private void createTableViewer(Composite parent) {
		this.viewer = new TableViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);

		this.createColums(parent);

		Table table = this.viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.BEGINNING;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = false;
		gridData.horizontalAlignment = GridData.FILL;
		this.viewer.getControl().setLayoutData(gridData);

		this.viewer.addSelectionChangedListener(this.changeListener);
		this.viewer.setContentProvider(new ArrayContentProvider());
		this.viewer.setInput(AnalysisType.getAnalyses());
		this.viewer.setComparator(this.comparator);

		this.viewerColumn_Name.getColumn().pack();
		this.viewerColumn_Ext.getColumn().pack();
		this.viewerColumn_Class.getColumn().pack();
	}

	private void createColums(Composite parent) {
		this.viewerColumn_Name = this.createTableViewerColums("Name", 100, 0);
		this.viewerColumn_Name.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AnalysisType a = (AnalysisType) element;
				return a.getName();
			}
		});

		this.viewerColumn_Ext = this.createTableViewerColums("Extension", 100, 1);
		this.viewerColumn_Ext.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AnalysisType a = (AnalysisType) element;
				return a.getExtension();
			}
		});

		this.viewerColumn_Class = this.createTableViewerColums("Full classname", 100, 2);
		this.viewerColumn_Class.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				AnalysisType a = (AnalysisType) element;
				return a.getClassname();
			}
		});
	}

	private TableViewerColumn createTableViewerColums(final String label, final int bounds, final int colNumber) {
		TableViewerColumn viewerColumn = new TableViewerColumn(this.viewer, SWT.NONE);
		TableColumn column = viewerColumn.getColumn();
		column.setText(label);
		column.setWidth(bounds);
		column.setResizable(true);
		column.setMoveable(true);
		column.addSelectionListener(this.getSelectionAdapter(column, colNumber));
		return viewerColumn;
	}

	private SelectionAdapter getSelectionAdapter(final TableColumn column, final int index) {
		SelectionAdapter selectionAdapter = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AnalysisPreferencePage.this.comparator.setColumn(index);
				int dir = AnalysisPreferencePage.this.comparator.getDirection();
				AnalysisPreferencePage.this.viewer.getTable().setSortDirection(dir);
				AnalysisPreferencePage.this.viewer.refresh();
			}
		};
		return selectionAdapter;
	}
}
