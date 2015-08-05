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

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

import de.fraunhofer.esk.ernest.visualization.ganttchart.data.constraintview.IVisualizationFactory;
import ernest.Model;
import ernest.architecture.Connector;
import ernest.architecture.Element;
import ernest.architecture.FModule;
import ernest.architecture.HardwareConnector;
import ernest.architecture.Module;
import ernest.architecture.Port;
import ernest.architecture.SoftwareConnector;
import ernest.architecture.impl.ConnectorImpl;
import ernest.architecture.impl.ModuleImpl;
import ernest.timingspecification.Constraint;
import ernest.timingspecification.ConstraintValidation;
import ernest.timingspecification.DelayConstraint;
import ernest.timingspecification.EventConstraint;
import ernest.tracing.TracingResults;
import ernest.util.TraceReader;

/**
 * Utility class that loads data from the model.
 * <p>
 * Subclasses of {@link IVisualizationFactory} should always use the methods of
 * this class, instead of direct access to the model. Changes in the model
 * should be reflected in this class, to furthermore ensure functionality.
 * 
 */
public abstract class VisualizationUtil {

	/**
	 * Reads the name of a component from the model and returns it.
	 * 
	 * @param component
	 *            the component from the model
	 * @return the name of the component
	 */
	public static String getComponentName(Object component) {
		// get the class name, which is always ...Impl, and get rid of the Impl
		String classname = component.getClass().getSimpleName();
		classname = classname.replaceAll("Impl", " ");

		// depending on the class we call another method to get the name
		if (component instanceof Module) {
			classname += ((ModuleImpl) component).getName();
		} else if (component instanceof Connector) {
			classname += ((ConnectorImpl) component).getName();
		}

		return classname;
	}

	/**
	 * Searches for constraints in a model that are connected to a given
	 * component. As Constraint and Component are not directly linked within the
	 * model, the method reads the ports connected to the component and
	 * subsequently looks for constraints that include at least one of the ports
	 * read.
	 * 
	 * @param component to get the constraints for
	 * @param model to get the constraints from
	 * @return The list of constraints, never null
	 */
	public static ArrayList<Constraint> getConstraintsForComponent(
			Element component, Model model) {
		// list of found constraints
		ArrayList<Constraint> constraints = new ArrayList<Constraint>();
		// components port list
		List<String> portNames = null;

		// get the ports belonging to the component
		if (component instanceof FModule) {
			portNames = asStringList(((FModule) component).getPorts());
		} else if (component instanceof SoftwareConnector) {
			portNames = asStringList(((SoftwareConnector) component)
					.getConnectedTo());
		} else if (component instanceof HardwareConnector) {
			portNames = asStringList(((HardwareConnector) component)
					.getConnectedTo());
		} else {
			return new ArrayList<Constraint>();
		}

		// port list of the constraint
		ArrayList<Port> constraintPorts;
		/*
		 * go through the constraint list for every constraint do the following:
		 * - Read the Ports - Compare Ports with Component Ports
		 */
		for (Constraint constraint : model.getTimingModel().getConstraints()) {
			if(!constraint.getConstValid().isEmpty()){
				constraintPorts = new ArrayList<Port>();
	
				// read all ports of the constraint
				if (constraint instanceof EventConstraint) {
					// only one port
					constraintPorts.add(((EventConstraint) constraint).getPort());
				} else if (constraint instanceof DelayConstraint) {
					// two lists, stimulus and response
					constraintPorts.addAll(((DelayConstraint) constraint)
							.getResponse());
					constraintPorts.addAll(((DelayConstraint) constraint)
							.getStimulus());
				}
	
				boolean found = false;
				// compare the constraint ports and component ports
				for (Port constP : constraintPorts) {
					for (String compPortName : portNames) {
						if (constP.toString().compareTo(compPortName) == 0) {
							// add the port and break to the next constraint
							constraints.add(constraint);
							found = true;
							break;
						}
					}
					if (found) { break; }
				}
			}
		}
		return constraints;
	}
	
	/**
	 * Calls toString for each element and adds it to a new list.
	 * 
	 * @param list The list with elements.
	 * @return The list with strings.
	 */
	private static ArrayList<String> asStringList(Collection<?> list) {
		ArrayList<String> result = new ArrayList<String>(list.size());
		for (Object o : list) {
			result.add(o.toString());
		}
		return result;
	}

	/**
	 * Returns the name of the given constraint.
	 * 
	 * @param constraint
	 *            the constraint class within the model
	 * @return the name of the constraint
	 */
	public static String getConstraintName(Object constraint) {
		String name = ((Constraint) constraint).getName();
		if (name != null) {
			return name;
		} else {
			return constraint.getClass().getSimpleName()
					.replaceAll("Impl", " ");
		}
	}

	/**
	 * Reads data from the model, that indicates relevant data for a constraint.
	 * <br>
	 * This should be time intervals that for example should be highlighted
	 * (i.e. green color).<br>
	 * The returning array is of type Point2D.Double. That type can store two
	 * double values, x and y.<br>
	 * x stands for X1 (start of the time interval), y stands for X2 (end of the
	 * time interval).<br>
	 * 
	 * @param constraint
	 *            the constraint of interest
	 * @param model
	 *            the model in which to look
	 * @return array containing value pairs
	 */
	public static Point2D.Double[] getConstraintInformations(Object constraint,
			Model model) {
		ArrayList<Point2D.Double> greenAreas = new ArrayList<Point2D.Double>();
		for (ConstraintValidation constValid : ((Constraint) constraint)
				.getConstValid()) {
			if (constValid.isSatisfied()) {
				Double start = constValid.getStarttime();
				Double ende = constValid.getEndtime();
				greenAreas.add(new Point2D.Double(start, ende));
			}
		}
		return greenAreas.toArray(new Point2D.Double[greenAreas.size()]);
	}

	/**
	 * Like {@link #getConstraintInformations(Object, Model)} this reads data
	 * from the model.<br>
	 * The only difference is that this method should read time intervals that
	 * indicates errors for a constraint. (i.e. intervals that should be
	 * highlighted with a red color)<br>
	 * The return type matches that of getConstraintInformations. See there for
	 * informations regarding the return type.<br>
	 * 
	 * @param constraint
	 *            the constraint of interest
	 * @param model
	 *            the model in which to look
	 * @return array containing value pairs
	 */
	public static Point2D.Double[] getConstraintErrors(Object constraint,
			Model model) {
		ArrayList<Point2D.Double> redAreas = new ArrayList<Point2D.Double>();
		for (ConstraintValidation constValid : ((Constraint) constraint)
				.getConstValid()) {
			Double start = 0.0;
			Double ende = 0.0;
			if (!constValid.isSatisfied()) {
				if (constValid.getStarttime() == 0) {
					start = constValid.getEndtime()
							- ((DelayConstraint) constraint)
									.getMaximumLatency();
					ende = constValid.getEndtime();
				} else if (constValid.getEndtime() == 0) {
					start = constValid.getStarttime();
					ende = constValid.getStarttime()
							+ ((DelayConstraint) constraint)
									.getMaximumLatency();
				} else {
					start = constValid.getStarttime();
					ende = constValid.getEndtime();
				}
			}
			redAreas.add(new Point2D.Double(start, ende));
		}
		return redAreas.toArray(new Point2D.Double[redAreas.size()]);
	}

	/**
	 * Returns all ports of a constraint.
	 * 
	 * @param constraint
	 *            the constraint class from within the model
	 * @return list of ports
	 */
	public static ArrayList<Port> getPortsOfConstraint(Constraint constraint) {

		ArrayList<Port> portlist = new ArrayList<Port>();
		if (constraint instanceof EventConstraint) {
			portlist.add(((EventConstraint) constraint).getPort());
		} else if (constraint instanceof DelayConstraint) {
			DelayConstraint delay = ((DelayConstraint) constraint);
			for (Port p : delay.getStimulus()) {
				portlist.add(p);
			}
			for (Port p : delay.getResponse()) {
				portlist.add(p);
			}
		}
		return portlist;
	}

	/**
	 * Returns the name of a port (for a given Constraint). If the Constraint is
	 * a PortDelayConstraint, this method will return the name plus information
	 * if this port is stimulus or response.
	 * 
	 * @param port
	 *            the port in the model
	 * @param constraint
	 *            indicates if the port is part of a portdelay, in which case
	 *            the name will have stimulus or response as an addition. if
	 *            null, this parameter is ignored and just the name is returned.
	 * @return name of the port
	 */
	public static String getPortName(Object port, Object constraint) {
		if (constraint == null || constraint instanceof EventConstraint) {
			return ((Port) port).getName();
		} else if (constraint instanceof DelayConstraint) {
			DelayConstraint delay = ((DelayConstraint) constraint);
			for (Port p : delay.getStimulus()) {
				if (port.toString().compareTo(p.toString()) == 0) {
					return ((Port) port).getName() + " (Stimulus)";
				}
			}
			for (Port p : delay.getResponse()) {
				if (port.toString().compareTo(p.toString()) == 0) {
					return ((Port) port).getName() + " (Response)";
				}
			}
		}
		return "";
	}

	/**
	 * Reads all Event Occurrences for a port that are stored in the model.
	 * Iterates over the list of EventOccurences inside the model, and searches
	 * for events that happened for the given port. Attention: The port
	 * comparison uses the toString() method of a port, only this gave the
	 * correct result
	 * 
	 * @param port
	 *            the port for which events should be searched
	 * @param model
	 *            the model in which to search
	 * @return double array containing the Timestamps of all found events
	 */
	public static double[] getEvents(Object port, Model model) {
		double[] occurenceEvents = null;
		ArrayList<Double> occurences = null;
		occurences = new ArrayList<Double>();

		TracingResults tracingResults = model.getTracingResults();
			
		if (tracingResults.getTrace() != null) {
			TraceReader reader = tracingResults.getTrace().getTraceReader();
			
			if (reader != null) {
				SortedSet<Long> events = reader.getEvents().get(port);
				for(Long event : events) {
					occurences.add((double) event);
				}
			}
			
		}		
		
		// sort the values in an ascending order
		Collections.sort(occurences);
		
		// copy the list to an array
		occurenceEvents = new double[occurences.size()];
		for (int i = 0; i < occurences.size(); i++) {
			occurenceEvents[i] = occurences.get(i).doubleValue();
		}

		return occurenceEvents;
	}

	/**
	 * Returns a list of time values for a given
	 * port that indicate Events where errors occurred.
	 * 
	 * @param port
	 *            the port for which to get the events
	 * @param model
	 *            the model in which to look
	 * @return double array containing time values
	 */
	public static double[] getErrorEvents(Object port, Model model) {
		ArrayList<Double> errorEvents = new ArrayList<Double>();
		for (Constraint constraint : model.getTimingModel().getConstraints()) {
			if (constraint instanceof EventConstraint) {
				EventConstraint evConst = (EventConstraint) constraint;
				if (evConst.getPort() == port) {
					for (ConstraintValidation constValid 
							: evConst.getConstValid()) {
						if (!constValid.isSatisfied()) {
							errorEvents.add(constValid.getStarttime());
						}
					}
				}
			}
		}
		double[] returnlist = new double[errorEvents.size()];
		for (int i = 0; i < errorEvents.size(); i++) {
			returnlist[i] = errorEvents.get(i);
		}
		return returnlist;
	}
	
	/**
	 * Private constructor. Utility class not meant to be instantiated.
	 */
	private VisualizationUtil() { }

}
