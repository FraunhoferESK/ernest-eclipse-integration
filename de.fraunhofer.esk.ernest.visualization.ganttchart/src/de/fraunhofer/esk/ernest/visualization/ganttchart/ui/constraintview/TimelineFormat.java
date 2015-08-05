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

import java.util.ArrayList;

import org.eclipse.ui.part.ViewPart;

import de.fraunhofer.esk.ernest.visualization.ganttchart.editor.views.ConstraintView;

/**
 * Holds Informations for use in every Canvas that displays a time axis.
 * <p>
 * This is a Singelton that for example contains Scaling Ratio, Width etc.<br>
 * Also provides Transformations between Time values and Coordinate on the time
 * axis.<br>
 * 
 */
public class TimelineFormat {
	/** Ratio at which the time axis is currently scaled. */
	private double scaleRatio = 0.0f;
	/**
	 * Ratio at which all Events can be displayed without scrolling. Resembles a
	 * maximum zoom out value.
	 */
	private double fillScaleRatio = 0.0f;
	/** the current width of the time axis/time line in pixel. */
	private int widthTimeline = 1;
	/**
	 * The highest time value of all events that are currently loaded. Serves as
	 * an internal indicator which value the fillScaleRatio should have.
	 */
	private double highestEventValue = 0.0f;
	/**
	 * Indicates if every component should have a time axis. If this is set to
	 * false than the toolbar will have a time axis.
	 */
	private boolean showAllTimeAxis = false;
	/**
	 * The current offset of the time axis. This is the first value that is
	 * visible on the time axis.
	 */
	double offset = 0.0f;
	/**
	 * Values that indicate that a Label is drawn on the time axis. This are NOT
	 * coordinates, but real time values.
	 * <p>
	 * To get coordinates call {@link #transformToCoordinate(double)} or
	 * {@link #transformToCoordinate(double, int)} with a desired offset.
	 */
	private double[] labelMarkers;
	/**
	 * The distance between two Labels on a time axis. Is a value and NOT a
	 * coordinate.
	 */
	private double labelPitch;
	/** References the View that was registered to this format class. */
	private ViewPart view = null;
	
	/** Default Constructor. */
	public TimelineFormat() {
		
	}

	/** 
	 * Returns the {@link #scaleRatio}.
	 * @return the {@link #scaleRatio}
	 */
	public double getScaleRatio() {
		return scaleRatio;
	}

	/**
	 * Sets the {@link #scaleRatio}.
	 * @param scaleRatio the new {@link #scaleRatio}
	 */
	public void setScaleRatio(double scaleRatio) {
		this.scaleRatio = scaleRatio;
		updateLabelMarkers();
	}

	/**
	 * Returns the {@link #fillScaleRatio}.
	 * @return the {@link #fillScaleRatio}
	 */
	public double getFillScaleRatio() {
		return fillScaleRatio;
	}

	/** 
	 * Sets the {@link #fillScaleRatio}.
	 * @param fillScaleRatio the new {@link #fillScaleRatio} */
	public void setFillScaleRatio(double fillScaleRatio) {
		this.fillScaleRatio = fillScaleRatio;
	}

	/**
	 * Returns the {@link #widthTimeline}.
	 * @return the {@link #widthTimeline}
	 */
	public int getTimelineWidth() {
		return widthTimeline;
	}

	/** 
	 * Sets the {@link #widthTimeline}.
	 * @param width the new {@link #widthTimeline}
	 */
	public void setTimelineWidth(int width) {
		this.widthTimeline = width;
		updateLabelMarkers();
	}

	/** 
	 * Returns the {@link #widthTimeline} in time value space.
	 * @return {@link #widthTimeline} converted to time value.
	 */
	public double getWidthTimeValues() {
		return transformToValue(getTimelineWidth()) - getTimeAxisOffset();
	}

	/** 
	 * Returns the {@link #highestEventValue}.
	 * @return the {@link #highestEventValue}
	 */
	public double getHighestEventValue() {
		return highestEventValue;
	}

	/**
	 * Checks if the parameter is higher than the current
	 * {@link #highestEventValue}, and if it's the case replaces the current
	 * value with the new one.
	 * @param newValue a possibly new {@link #highestEventValue}
	 */
	public void setHighestEventValue(double newValue) {
		if (newValue + newValue / 10 > this.highestEventValue) {
			this.highestEventValue = newValue + newValue / 10;
		}
	}

	/** 
	 * Returns whether every Component should display a time axis.
	 * @return true, if every component should display a time axis
	 */
	public boolean isShowAllTimeAxis() {
		return showAllTimeAxis;
	}

	/**
	 * Sets {@link #showAllTimeAxis}.
	 * @param showAllTimeAxis true to display axis for all, false otherwise
	 */
	public void setShowAllTimeAxis(boolean showAllTimeAxis) {
		this.showAllTimeAxis = showAllTimeAxis;
	}
	
	/**
	 * Returns the currently visible start position of the time axis.<p>
	 *  
	 * @return double value indicating the starting position of the time axis
	 */
	public double getTimeAxisOffset() {
		return offset;
	}
	
	/**
	 * Sets the currently visible start position of the time axis.<p>
	 * 
	 * @param offset value indicating the starting position of the time axis
	 */
	public void setTimeAxisOffset(double offset) {
		this.offset = offset;
		updateLabelMarkers();
	}
	
	/**
	 * Returns an array containing time values.
	 * This time values indicate where labels on the time axis should appear.
	 * 
	 * @return array with time values
	 */
	public double[] getLabelMarkers() {
		return this.labelMarkers;
	}
	
	/**
	 * Returns the distance between two labels.
	 * 
	 * @return distance between two labels
	 */
	public double getLabelPitch() {
		return this.labelPitch;
	}
	
	/**
	 * Transform a time value into a Coordinate of the time line.
	 * <p>
	 * Scaling is factored in as well as the position of the slider in the
	 * ToolbarComposite.
	 * 
	 * @param value
	 *            a time value
	 * @return the coordinate for the time value
	 */
	public int transformToCoordinate(double value) {
		double coord = (value * getScaleRatio())
				- (getTimeAxisOffset() * getScaleRatio());
		return (int) coord;
	}
	
	/**
	 * Similar to {@link #transformToCoordinate(double)} but adds the offset to
	 * the coordinate before returning the value
	 * 
	 * @param value
	 *            a time value
	 * @param offset
	 *            the offset the coordinate should have
	 * @return the coordinate for the time value
	 */
	public int transformToCoordinate(double value, int offset) {
		return offset + transformToCoordinate(value);
	}
	
	/**
	 * Transform a Coordinate of the time line into a time value.<p>
	 * 
	 * @param coordinate the coordinate on the time line
	 * @return the time value
	 */
	public double transformToValue(int coordinate) {
		return (coordinate + (getTimeAxisOffset() * getScaleRatio()))
				/ getScaleRatio();
	}
	
	/**
	 * Register the given ConstraintView.
	 * <p>
	 * That will be the only valid View for which other classes can request an
	 * update.
	 * 
	 * @param constraintAnalysesView the view
	 */
	public void registerView(ViewPart constraintAnalysesView) {
		this.view = constraintAnalysesView;
	}
	
	/**
	 * Updates the View.
	 * <p>
	 * Enables every Component that holds a TimelineFormat Object to send a
	 * render request to the View. Rendering will only be done if the Layout
	 * changed.
	 */
	public void updateView() {
		if (view instanceof ConstraintView) {
			((ConstraintView) view).updateView();
		} else if (view instanceof ConstraintView) {
			((ConstraintView) view).updateView();
		} else {
			return;
		}
	}	
	
	/**
	 * Calculate where label markers should be placed on the time axis.
	 */
	public void updateLabelMarkers() {
		// Array that holds factors which indicate how much spacing lies between
		// labels
		double[] labelFactor = { 0.1, 0.25, 0.5, 1, 1, 1, 1, 2.5, 2.5, 2.5 };
		// width for which the labelFactors were defined
		double referenceWidth = 600.0f;
		
		// get the span of values on the time line
		double indexIndicator = getWidthTimeValues();
		// at startup the value may be negative or Infinite, in that case we
		// don't calculate anything
		if (indexIndicator <= 0.0f
				|| indexIndicator == Double.POSITIVE_INFINITY) {
			return;
		}
		 
		// "normalize" the indicator, we want time labels that are independent
		// of the width of the View. as our labelFactors are based around a
		// width of 600 pixel, we need to scale the indicator.
		indexIndicator *= (referenceWidth / getTimelineWidth());
		// multiply factor to get the correct scaling
		double power = 1.0f;
		
		// depending on the width we choose a label factor our goal is to get a
		// value between 1 and 9, that will be the index for the array power
		// stores the scaling of the original width
		while (indexIndicator < 1.0f) {
			indexIndicator *= 10.0f;
			power /= 10.0f;
		}
		while (indexIndicator > 10.0f) {
			indexIndicator /= 10.0f;
			power *= 10.0f;
		}
		
		// round the value, now we got the index
		int labelFactorIndex = ((int) (indexIndicator + 0.5f));
		if (labelFactorIndex >= 10) {
			labelFactorIndex = 1;
			power *= 10.0f;
		}
		// choose factor and don't forget the power as a result we get the space
		// between two time labels of the original width
		labelPitch = (labelFactor[labelFactorIndex] * power);
		
		// this is the first Label that could be on the time axis, everything
		// before this is not visible on the time axis
		double startValue = ((int) (getTimeAxisOffset() / labelPitch))
				* labelPitch;
		
		// now move from the start to the end of the time axis and calculate
		// label values
		ArrayList<Double> valueList = new ArrayList<Double>();
		for (double d = startValue; d <= startValue + getWidthTimeValues()
				+ labelPitch; d += labelPitch) {
			valueList.add(d);
		}
		
		this.labelMarkers = new double[valueList.size()];
		int i = 0;
		for (Double value : valueList) {
			this.labelMarkers[i++] = value.doubleValue();
		}
	}
}
