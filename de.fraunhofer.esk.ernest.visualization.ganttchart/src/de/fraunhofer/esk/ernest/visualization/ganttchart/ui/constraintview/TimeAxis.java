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

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.ColorManager;

/**
 * Represents a time axis. A line with increasing numbers and ticks. 
 */
public class TimeAxis extends Canvas {
	/** Default Style of this Canvas. */
	public static final int SWT_DEFAULTSTYLE = SWT.DOUBLE_BUFFERED;
	/** Number of Lines between two long Lines with Label. */
	private static final int NUM_LINES = 10;
	/**
	 * Width of Border. Serves as an Offset to shift the Time Axis right or
	 * left.
	 */
	private int borderWidth = 0;
	
	/** Instance that contains informations about the formatting of the View. */
	private TimelineFormat format = null;

	/**
	 * Constructor for a TimeAxis.
	 * 
	 * @param parent the parent {@link Composite}
	 * @param style the style to use
	 * @param tlFormat informations about the formatting
	 */
	public TimeAxis(Composite parent, int style, TimelineFormat tlFormat) {
		super(parent, style);
		this.format = tlFormat;
		
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = false;
		data.horizontalAlignment = SWT.FILL;
		data.heightHint = 22;
		
		setLayoutData(data);
		setBackground(ColorManager.BACKGROUND_DEFAULT);
		
		// listener for draw events
		addPaintListener(new CanvasPaintListener());
	}

	private final class CanvasPaintListener implements PaintListener {
		@Override
		public void paintControl(PaintEvent e) {
			GC gc = e.gc;

			gc.setForeground(ColorManager.TEXTCOLOR);
			// Horizontal Line that indicates the time axis
			gc.drawLine(
					PortCanvas.COLUMN_NAME_WIDTH + borderWidth,
					0,
					PortCanvas.COLUMN_NAME_WIDTH + format.getTimelineWidth(),
					0);

			double[] values = format.getLabelMarkers();
			for (double value : values) {
				int x = format.transformToCoordinate(value,
						PortCanvas.COLUMN_NAME_WIDTH + borderWidth);

				// draw a long line, and format the label
				gc.drawLine(x, 0, x, 10);
				Point size = gc.textExtent(String.format("%.4f", value));

				// 0.0 label should not be moved, as this would cause clipping
				// issues
				if (value == 0.0f) {
					size.x = 0;
				}
				// the label is centered around the line
				gc.drawText(String.format("%.4f", value), x - size.x / 2,
						10);

				// draw short lines between two labels
				for (int i = 1; i < NUM_LINES; i++) {
					x = format.transformToCoordinate(
							value + i * (format.getLabelPitch() / NUM_LINES),
							PortCanvas.COLUMN_NAME_WIDTH + borderWidth);
					if (x >= PortCanvas.COLUMN_NAME_WIDTH
							&& x <= format.getTimelineWidth()
									+ PortCanvas.COLUMN_NAME_WIDTH) {
						gc.drawLine(x, 0, x, 5);
					}
				}
			}
			gc.fillRectangle(0, 0, PortCanvas.COLUMN_NAME_WIDTH - 1, 22);
		}
	}

	/**
	 * Set the border width (of the GroupComponent).
	 * <p>
	 * Needed for a TimeAxis in the toolbar to be aligned with the time lines in
	 * all components.
	 * 
	 * @param width
	 *            width of the border
	 */
	public void setBorder(int width) {
		this.borderWidth = width;
	}
}
