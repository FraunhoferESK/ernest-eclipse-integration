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

import org.eclipse.swt.widgets.Composite;

import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.ComponentGroup;
import de.fraunhofer.esk.ernest.visualization.ganttchart.ui.constraintview.TimelineFormat;

/**
 * Interface that can be implemented to provide UI Elements.
 * <p>
 * in that way different layouts can be created with the use of different
 * Factories.
 * 
 */
public interface IVisualizationFactory {
	/**
	 * Create UI elements.
	 * 
	 * @param parent
	 *            the composite that serves as parent
	 * @param format
	 *            the format of the timeline
	 * @return list of created UI Elements.
	 */
	ArrayList<ComponentGroup> createUI(Composite parent,
			TimelineFormat format);
}
