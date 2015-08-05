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

import java.awt.geom.Point2D;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.ColorManager;

/**
 * Represents the Header of a ConstraintComposite. Hold Information like the
 * name of the constraint as well as a time line.
 * 
 */
public class ConstraintCanvas extends Canvas {
	/** Default Style of the Canvas. */
	public static final int SWT_DEFAULTSTYLE = SWT.BORDER | SWT.DOUBLE_BUFFERED;
	/** Specifies the Width of the Name Label. */
	private static final int COLUMN_NAME_WIDTH = PortCanvas.COLUMN_NAME_WIDTH;
	
	/** Specifies the Height of the Canvas. */
	private static int rowHeight = 24;
	
	/**
	 * Instance that contains informations about the formatting of the time
	 * line.
	 */
	private TimelineFormat format = null;
	/** Name of the Constraint. */
	private String constraintName = null; 
	/**
	 * Array for Errors.
	 * <p>
	 * Every Point will be drawn on the Time Axis, but will be displayed as a
	 * Rectangle where x represents x1 and y represents x2. The height will be
	 * filled automatically.
	 */
	private Point2D.Double[] errors = null;
	/**
	 * Array for Informations. <p>
	 * Will be drawn like {@link #errors}.
	 */
	private Point2D.Double[] informations = null;
	
	/** Background Color. */
	private Color bgColor = ColorManager.BACKGROUND_HEADER;
	/** Color for an Area containing an Error. */
	private Color errorColor = ColorManager.CONSTRAINT_ERROR;
	/** Color for Areas that are given in {@link #informations}. */
	private Color infoColor = ColorManager.CONSTRAINT_INFO;
	/** Color to fill the Time line with. */
	private Color fillColor = PlatformUI.getWorkbench().getDisplay()
			.getSystemColor(33);
	/**
	 * Indicating if the time lines background should be filled with
	 * <code>fillColor</code>.
	 */
	private static boolean fillBackground = false;
	
	
	/**
	 * Standard Constructor for ConstraintCanvas.
	 * <p>
	 * 
	 * @param parent
	 *            the composite this canvas is a child of
	 * @param style
	 *            SWT style of this Canvas. Use {@link #SWT_DEFAULTSTYLE} for
	 *            the defaults.
	 * @param constraintName
	 *            name of the constraint
	 * @param timelineFormat
	 *            format information of the time line
	 */
	public ConstraintCanvas(Composite parent, int style, String constraintName,
			TimelineFormat timelineFormat) {
		super(parent, style);
		this.format = timelineFormat;
		
		initLayout();
		setBackground(bgColor);
		
		if (constraintName != null) {
			this.constraintName = constraintName;
		} else {
			this.constraintName = "";
		}
		
		// listener that displays time values when hovering over the time line, 
		// and highlights the Constraint when the mouse is within its bounds
		addMouseTrackListener(new CanvasMouseTrackListener());

		// Listener for all rendering
		addPaintListener(new CanvasPaintListener());
	}
	
	private final class CanvasMouseTrackListener implements MouseTrackListener {
		@Override
		public void mouseHover(MouseEvent e) {
			// Coordinate within the time line
			int coord = e.x - COLUMN_NAME_WIDTH;
			// transform the coordinate into a value
			double value = format.transformToValue(coord);
			// smaller then 0 means that the mouse is hovering above the
			// name column
			if (coord >= 0) {
				setToolTipText(String.format("%.4f", value));
			} else {
				setToolTipText(getConstraintName());
			}
			
		}
	
		@Override
		public void mouseExit(MouseEvent e) {
			setBackground(bgColor);
			
		}
	
		@Override
		public void mouseEnter(MouseEvent e) {
			setBackground(ColorManager.BACKGROUND_HEADER_HIGHLIGHT); 
		}
	}

	private final class CanvasPaintListener implements PaintListener {
		@Override
		public void paintControl(PaintEvent event) {
			GC gc = event.gc;
			// backup color values
			Color foreground = gc.getForeground();
			Color background = gc.getBackground();
			
			// Draw the Name of the Constraint (vertically centered)
			if (getConstraintName() != null) {
				String name = getConstraintName();
				gc.setForeground(ColorManager.TEXTCOLOR);
		    	Point size = event.gc.textExtent(name);					
				int offset = Math.max(0, (rowHeight - size.y) / 2);
				
				// Clip the Name if it is to long for the Column
				if (size.x > COLUMN_NAME_WIDTH) {
					float f = (1.0f * name.length() / size.x)
							* COLUMN_NAME_WIDTH * 0.8f;
					name = name.substring(0, (int) f) + "...";
				}
				gc.drawText(name, 5, 0 + offset);
			}
			
			// Fill background of the time line
			if (fillBackground) {
				gc.setBackground(fillColor);
				gc.fillRectangle(COLUMN_NAME_WIDTH, 0,
						format.getTimelineWidth(), rowHeight);
			}
			
			// Draw the Separator between the Name Column and the Time Axis
			gc.setForeground(ColorManager.LINECOLOR);
			gc.drawLine(COLUMN_NAME_WIDTH - 1, event.y, 
					COLUMN_NAME_WIDTH - 1, event.y + event.height);
				
			// draw lines for where the labels on the time axis are
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
			
			// Draw rectangles for events that are indicated in the informations
			// array
			gc.setBackground(infoColor);
			if (informations != null) {
				paintPoints(gc, informations);
			}
			
			// Draw rectangles for events that are indicated in the errors array
			// (will draw over informations rectangles)
			gc.setBackground(errorColor);
			if (errors != null) {
				paintPoints(gc, errors);
			}
			// restore colors
			gc.setForeground(background);
			gc.setBackground(foreground);
		  }

		/**
		 * Paint a list of points on the canvas. Used for informations and
		 * errors.
		 * 
		 * @param gc used to paint on the canvas
		 * @param pointList list of points to paint
		 */
		private void paintPoints(GC gc, Point2D.Double[] pointList) {
			for (Point2D.Double infoPoint : pointList) {
				// transform the value on the time line into a coordinate on
				// the canvas
				int x = format.transformToCoordinate(infoPoint.x,
						COLUMN_NAME_WIDTH);
				int y = format.transformToCoordinate(infoPoint.y,
						COLUMN_NAME_WIDTH);

				// only draw when the part of the time axis is visible
				if (y <= COLUMN_NAME_WIDTH
						|| x >= format.getTimelineWidth() + COLUMN_NAME_WIDTH) {
					continue;
				}
				// some clipping has to be done
				// clip the beginning of the bar
				if (x < COLUMN_NAME_WIDTH) {
					x = COLUMN_NAME_WIDTH;
				}
				// clip the end of the bar
				if (y > format.getTimelineWidth() + COLUMN_NAME_WIDTH) {
					y = format.getTimelineWidth() + COLUMN_NAME_WIDTH;
				}
				// should always be visible, even if zoomFactor is small in
				// which case x == y is possible
				// so width should at least be 1
				if (y - x <= 0) {
					y = x + 1;
				}
				gc.fillRectangle(x, 0, y - x, rowHeight);
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
	 * Sets additional Informations that should be displayed on the time axis.
	 * @param informations array containing informations to display
	 */
	public void setInformations(Point2D.Double[] informations) {
		this.informations = informations;
	}
	
	/**
	 * Returns additional Informations that are displayed on the time axis.
	 * @return array containing informations that are displayed
	 */
	public Point2D.Double[] getInformations() {
		return this.informations;
	}
	
	/**
	 * Sets error informations that should be displayed on the time axis.
	 * @param errors array containing errors that should be displayed
	 */
	public void setErrors(Point2D.Double[] errors) {
		this.errors = errors;
	}
	
	/**
	 * Returns error informations that are displayed on the time axis.
	 * @return array containing errors that are displayed
	 */
	public Point2D.Double[] getErrors() {
		return errors;
	}
	
	/**
	 * Returns the name of the constraint.
	 * <p>
	 * Returns an empty string if name was not defined at initialization / was
	 * null in constructor.
	 * 
	 * @return string containing the name of the constraint.
	 */
	public String getConstraintName() {
		return constraintName;
	}

	/**
	 * Returns the {@link TimelineFormat} set in this Canvas.
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
	 * Scales the size of a ConstraintCanvas, particularly the Height.
	 * @param scale scale in percent
	 */
	public static void scaleSize(int scale) {
		rowHeight = 24 * scale / 100;
	}
}
