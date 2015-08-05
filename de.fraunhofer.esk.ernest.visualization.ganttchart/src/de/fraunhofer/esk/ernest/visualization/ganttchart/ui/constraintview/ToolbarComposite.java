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
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Slider;


import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.ColorManager;

/**
 * Toolbar that is displayed at the bottom of the Visualization View.
 * Provides a slider for the timeline and Buttons to zoom in and out. 
 * 
 */
public class ToolbarComposite extends Composite {
	/** The toolbar's time axis. */
	private TimeAxis timeaxis;
	/** Slider to move within the time axis. */
	private Slider slider;
	/** Zoom In on the time axis. */
	private Button zoomIn;
	/** Zoom Out of the time axis. */
	private Button zoomOut;
	/** Instance that contains informations about the formatting of the View. */
	private TimelineFormat format = null;
	/**
	 * Factor that determines how much the user zooms the time axis when
	 * clicking a button. It determines how much the scaleRatio should change
	 * when zooming.
	 */
	private double scaleFactor = 1.5f;
	/**
	 * Stores the minimum Height of this toolbar.
	 * <p>
	 * The height of the toolbar depends on whether a {@link TimeAxis} should be
	 * displayed or not.
	 */
	private int minHeight = 0;
	/**
	 * Zooming has the side effect of reducing the size of the visible part of
	 * the time axis.<br>
	 * The selection of the Slider is given as an Integer value. As soon as the
	 * visible part of the time axis drops under 1.0, sliding breaks as the time
	 * axis jumps to far.<br>
	 * Solution: Change the precision of the Slider, so we always see every part
	 * of the time axis when sliding through.<br>
	 * Therefore this coefficient is calculated to enable a switch in precision.
	 */
	private int sliderCoefficient = 1;
	
	/**
	 * Constructs a {@link ToolbarComposite}.
	 * 
	 * @param parent the parent {@link Composite}
	 * @param style the style to use
	 * @param timelineFormat format information for the time line
	 */
	public ToolbarComposite(Composite parent, int style,
			TimelineFormat timelineFormat) {
		super(parent, style);
		this.format = timelineFormat;
		
		// Init Layout
		GridData data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = false;
		data.horizontalAlignment = SWT.FILL;
		data.verticalAlignment = SWT.TOP;
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.marginWidth = 0;
		
		setLayout(layout);
		setLayoutData(data);
		setBackground(ColorManager.BACKGROUND_DEFAULT);

		// create ZoomIn Button
		data = new GridData();
		data.horizontalAlignment = SWT.FILL;
		data.verticalAlignment = SWT.BEGINNING;
		data.widthHint = (PortCanvas.COLUMN_NAME_WIDTH - 5) / 2;
		zoomIn = new Button(this, SWT.PUSH);
		zoomIn.setText("+");
		zoomIn.setLayoutData(data);
		zoomIn.setBackground(ColorManager.BACKGROUND_DEFAULT);
		zoomIn.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				format.setScaleRatio(format.getScaleRatio() * scaleFactor);
				updateSlider();
				
				zoomOut.setEnabled(true);				
				
				getParent().setRedraw(false);
				getParent().setRedraw(true);
			}
		});
		
		// create ZoomOut Button
		data = new GridData();
		data.horizontalAlignment = SWT.FILL;
		data.verticalAlignment = SWT.BEGINNING;
		data.widthHint = (PortCanvas.COLUMN_NAME_WIDTH - 5) / 2;
		zoomOut = new Button(this, SWT.PUSH);
		zoomOut.setText("-");
		zoomOut.setLayoutData(data);
		zoomOut.setBackground(ColorManager.BACKGROUND_DEFAULT);
		zoomOut.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				format.setScaleRatio(format.getScaleRatio() / scaleFactor);
				
				updateSlider();
				
				getParent().setRedraw(false);
				getParent().setRedraw(true);
			}	
		});
		
		// create the slider
		data = new GridData();
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		data.horizontalAlignment = SWT.FILL;
		data.verticalAlignment = SWT.BEGINNING;
		
		slider = new Slider(this, SWT.HORIZONTAL);
		slider.setLayoutData(data);
		slider.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				format.setTimeAxisOffset(getSliderPosition());
				getParent().setRedraw(false);
				getParent().setRedraw(true);
			}
		});
		
		// listener that is called when the View is resized
		addControlListener(new ControlListener() {
			
			@Override
			public void controlResized(ControlEvent e) {
				// Set the new Width of the Time line (should always have the
				// width of the View minus the nameColumn Width)
				format.setTimelineWidth(getClientArea().width
						- PortCanvas.COLUMN_NAME_WIDTH);

				// is only executed the first time (when the view is
				// opened/eclipse is started with an active view)
				if (format.getScaleRatio() <= 0.0f) {
					// Set the Scale Ratio, the ratio is calculated such that
					// the whole time line will fill the Views width
					format.setScaleRatio(format.getTimelineWidth()
							/ format.getHighestEventValue());
				}
				// Set the maximum Zoom Out Factor (move this one line higher if
				// it shouldn't always occur on resize)
				format.setFillScaleRatio(format.getTimelineWidth()
						/ format.getHighestEventValue());
				updateSlider();
			}
			
			@Override
			public void controlMoved(ControlEvent e) {
				
			}
		});

		// init the format and Slider
		format.setTimelineWidth(getClientArea().width
				- PortCanvas.COLUMN_NAME_WIDTH);
		format.setScaleRatio(0.0f);
		format.setFillScaleRatio(0.0f);
		updateSlider();
	}
	
	/**
	 * Show or hide the time axis.
	 * 
	 * @param visible if true, the toolbar's time axis will be made visible
	 */
	public void showTimeAxis(boolean visible) {
		GridLayout layout = (GridLayout) getLayout();
		
		if (!visible) {
			// No Time Axis, meaning Height is smaller and we have a small
			// Margin (looks better)
			minHeight = 35;
			layout.marginHeight = 5;

			if (timeaxis != null) {
				timeaxis.dispose();
				timeaxis = null;
			}
		} else {
			// With Time Axis, Height is bigger and we don't want a Margin, so
			// the time axis is at the border
			minHeight = 55;
			layout.marginHeight = 0;

			if (timeaxis == null) {
				timeaxis = new TimeAxis(this, TimeAxis.SWT_DEFAULTSTYLE, 
						format);
				timeaxis.moveAbove(null);
			}
			// the other time axis are all in group composites. groups have a
			// border width which can not be got through method calls. (if it is
			// possible then replace the 3 with the actual width). we set the
			// border width to be in line with the time lines. thats a
			// workaround for a problem that may be addressed at a later time.
			timeaxis.setBorder(5);
			((GridData) timeaxis.getLayoutData()).horizontalSpan = 3;
		}
	}
	
	/**
	 * Returns the Slider Position.
	 * 
	 * @return value of the current slider position
	 */
	public double getSliderPosition() {
		return 1.0f * slider.getSelection() / sliderCoefficient;
	}
	
	/**
	 * Returns the {@link #minHeight} of this Toolbar.
	 * @return the {@link #minHeight}
	 */
	public int getMinHeight() {
		return minHeight;
	}
	
	/**
	 * Updates the Slider values to fit with the time line values. This should
	 * typically be called after Zooming In/Out and if the View was resized.
	 */
	public void updateSlider() {
		// backup the old sliderCoefficient, reset the current
		int oldMaximum = slider.getMaximum();
		sliderCoefficient = 1;
		// calculate the maximum value of the slider
		double value = format.getHighestEventValue()
				- (format.getTimelineWidth() / format.getScaleRatio());
		// calculate sliderCoefficient so we always have a big enough value as
		// the maximum
		// this is done to have a smoother scrolling experience, when scrolling
		// with high zooming factors
		while (sliderCoefficient * format.getTimelineWidth()
				/ format.getScaleRatio() < 10) {
			sliderCoefficient *= 10;
		}
		
		// set maximum, factor in the coefficient, must at least be 1 or the
		// value won't be set
		slider.setMaximum((int) (value * sliderCoefficient) + 1);
		// modify the current selection if the coefficient changed, otherwise
		// there would be heavy time line jumps
		// on coefficient changes
		slider.setSelection((int) (slider.getSelection() * (1.0f * slider
				.getMaximum() / oldMaximum)));
		format.setTimeAxisOffset(getSliderPosition());
		// clicking on the main part of the slider triggers page jumps, will
		// jump nearly one page forward/backward
		slider.setPageIncrement((int) (1.0f * sliderCoefficient
				* format.getTimelineWidth() / format.getScaleRatio()));
	}
}
