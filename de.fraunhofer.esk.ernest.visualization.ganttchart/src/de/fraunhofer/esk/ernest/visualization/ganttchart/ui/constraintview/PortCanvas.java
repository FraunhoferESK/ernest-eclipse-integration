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
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.ColorManager;

/**
 * Canvas that displays the Informations for a port. Has a name column and a
 * time line. This is a subitem of ConstraintComposite.
 * 
 */
public class PortCanvas extends Canvas {
	/** Default Style of the Canvas. */
	public static final int SWT_DEFAULTSTYLE = SWT.DOUBLE_BUFFERED;
	/** Specifies the Width of the Name Label. */
	public static final int COLUMN_NAME_WIDTH = 120;

	/** Specifies the Height of the Canvas. */
	private static int rowHeight = 20;
	
	/** Color of the Background. */
	private Color bgColor = ColorManager.BACKGROUND_DEFAULT;
	/** Color of an Event. */
	private Color eventColor = ColorManager.EVENT;
	/** Color of an Error Event. */
	private Color errorColor = ColorManager.EVENT_ERRORS;
	
	/**
	 * Instance that contains informations about the formatting of the time
	 * line.
	 */
	private TimelineFormat format = null;
	/** Array representing all Events that conform the Constraint. */
	private double[] eventOccurences = null;
	/** Array containing all Events that do not satisfy the Constraint. */
	private double[] eventErrors = null;
	/** Name of the Port. */
	private String portName = "";
	
	
	/**
	 * Standard Constructor for PortCanvas.
	 * <p>
	 * 
	 * @param parent
	 *            the composite this canvas is a child of
	 * @param style
	 *            SWT style of this Canvas. Use {@link #SWT_DEFAULTSTYLE} for
	 *            the defaults.
	 * @param port
	 *            the name of the port this canvas represents
	 * @param timelineFormat
	 *            informations about the formatting of the time line
	 */
	public PortCanvas(Composite parent, int style, String port,
			TimelineFormat timelineFormat) {
		super(parent, style);
		this.format = timelineFormat;
		
		if (port != null) {
			this.portName = port;
		} else {
			this.portName = "";
		}
		
		initLayout();
		setBackground(bgColor);
		
		// the mouse track listener displays a tooltip on the mouse position
		// when hovering (hold the mouse still) over the Time Axis
		addMouseTrackListener(new CanvasMouseTrackListener());	
		
		// responsible for all drawing actions
		addPaintListener(new CanvasPaintListener());
	}
	
	private final class CanvasPaintListener implements PaintListener {
		@Override
		public void paintControl(PaintEvent event) {
			
			GC gc = event.gc;
			
			// draw the name of the port
			if (getPortName() != null) {
		    	String name = getPortName();
				gc.setForeground(ColorManager.TEXTCOLOR);
		    	Point size = gc.textExtent(name);					
				int offset = Math.max(0, (rowHeight - size.y) / 2);
		    	
		    	// Clip the Name if it is to long for the Column
				if (size.x > COLUMN_NAME_WIDTH) {
					float f = (1.0f * name.length() / size.x)
							* COLUMN_NAME_WIDTH * 0.8f;
					name = name.substring(0, (int) f) + "...";
				}
				gc.drawText(name, 5, 0 + offset);
			}
			
			// backup colors
			Color foreground = gc.getForeground();
			Color background = gc.getBackground();
			
			gc.setForeground(ColorManager.LINECOLOR);
			// draw the separator between two rows
			gc.drawLine(event.x, rowHeight - 1, event.x + event.width,
					rowHeight - 1);
			// draw the separator between the name column and the time line
			gc.drawLine(COLUMN_NAME_WIDTH - 1, event.y, COLUMN_NAME_WIDTH - 1,
					event.y + event.height);

			// draw lines where the labels on the time axis are
			if (format.getLabelMarkers() != null) {
				for (double time : format.getLabelMarkers()) {
					int x = format.transformToCoordinate(time,
							COLUMN_NAME_WIDTH);
					if (x >= COLUMN_NAME_WIDTH
							&& x <= format.getTimelineWidth()
									+ COLUMN_NAME_WIDTH && x >= event.x
							&& x <= event.x + event.width) {
						gc.drawLine(x, 2, x, rowHeight / 2 - 2);
						gc.drawLine(x, rowHeight / 2 + 2, x, rowHeight - 3);
					}
				}
			}
			
			// increase the line width so we get a better look at the events
			gc.setLineWidth(2);
			
			// draw all events
			if (eventOccurences != null) {
				gc.setForeground(eventColor);
				paintEvents(event, eventOccurences);
			}

			// draw all event errors in the same way the events where drawn
			if (eventErrors != null) {
				gc.setForeground(errorColor);
				paintEvents(event, eventErrors);
			}
			// restore colors
			gc.setForeground(background);
			gc.setBackground(foreground);
		}

		/**
		 * Paints lines at the given points on the time line.
		 * 
		 * @param pe PaintEvent used to paint the lines.
		 * @param events List of points where to draw.
		 */
		private void paintEvents(PaintEvent pe, double[] events) {
			GC gc = pe.gc;
			
			for (double event : events) {
				// transform the time value into a coordinate on the canvas
				int x = format.transformToCoordinate(event,
						COLUMN_NAME_WIDTH);

				// only draw if the coordinate is within the canvas border,
				// otherwise the time axis shows another area
				if (x >= COLUMN_NAME_WIDTH
						&& x <= format.getTimelineWidth() + COLUMN_NAME_WIDTH
						&& x >= pe.x && x <= pe.x + pe.width) {
					gc.drawLine(x, 1, x, rowHeight - 2);
				}
			}
		}
		
	}

	private final class CanvasMouseTrackListener extends MouseTrackAdapter {
		@Override
		public void mouseHover(MouseEvent e) {
			// Coordinate within the time line
			int coord = e.x - COLUMN_NAME_WIDTH;
			// transform the coordinate into a value
			double value = format.transformToValue(coord);
			// smaller then 0 means that the mouse is hovering above the name
			// column
			if (coord >= 0) {
				setToolTipText(String.format("%.4f", value));
			} else {
				setToolTipText(getPortName());
			}
		}
	}

	/** 
	 * Sets the Layout of the Canvas. 
	 */
	private void initLayout() {
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = false;
		data.horizontalAlignment = SWT.FILL;
		data.heightHint = rowHeight;
		setLayoutData(data);
	}
	
	/**
	 * Return the PortName that is displayed in the Canvas. Returns an empty
	 * string if name was not defined at initialization / was null in
	 * constructor.
	 * 
	 * @return string containing the Name of the Port.
	 */
	public String getPortName() {
		return this.portName;
	}

	/**
	 * Set the Events that should be drawn on this Canvas.
	 * @param events array containing time values
	 */
	public void setEventOccurences(double[] events) {
		this.eventOccurences = events;
		if (events != null  && events.length > 0) {
			format.setHighestEventValue(events[events.length - 1]);
		}
	}
	
	/**
	 * Returns the Events for this Port.
	 * @return array of time values
	 */
	public double[] getEventOccurences() {
		return this.eventOccurences;
	}
	
	/**
	 * Set the Events, which violate the constraint, that should be drawn on
	 * this Canvas.
	 * 
	 * @param events
	 *            array containing time values
	 */
	public void setEventErrors(double[] events) {
		this.eventErrors = events;
		if (events != null && events.length > 0) {
			format.setHighestEventValue(events[events.length - 1]);
		}
	}
	
	/**
	 * Returns the Error Events for this Port.
	 * @return array of time values
	 */
	public double[] getEventErrors() {
		return this.eventErrors;
	}

	/**
	 * Return the {@link TimelineFormat} set for this Canvas.
	 * @return {@link #format}
	 */
	public TimelineFormat getFormat() {
		return format;
	}

	/**
	 * Returns the Height of this Canvas.
	 * 
	 * @return height value
	 */
	public static int getRowHeight() {
		return rowHeight;
	}
	
	/**
	 * Scales the size of a PortCanvas, particularly the Height.
	 * @param scale scale in percent
	 */
	public static void scaleSize(int scale) {
		rowHeight = 20 * scale / 100;
	}
}
