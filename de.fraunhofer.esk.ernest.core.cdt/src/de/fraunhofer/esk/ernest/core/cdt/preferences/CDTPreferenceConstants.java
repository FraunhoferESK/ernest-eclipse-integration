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
package de.fraunhofer.esk.ernest.core.cdt.preferences;

public interface CDTPreferenceConstants 
{
	/* Other predefined values */
	public final String ERNEST_INCLUDE_VARIABLE = "ERNEST_INCLUDE_PATH";
	public final String ERNEST_LIBRARY_VARIABLE = "ERNEST_LIBRARY_PATH";
	public final String ERNEST_INCLUDES_PLUGIN = "de.fraunhofer.esk.ernest.simulation.includes";
	public final String FALLBACK_LIBRARY_PATH = "${eclipse_home}/ernest/lib";
	public final String FALLBACK_INCLUDE_PATH = "${eclipse_home}/ernest/include";
	
	/* Default settings */
	// the trailing slash "/" is needed, so CDT will not prepend the path with "../"
	public final String DEFAULT_LIBRARY_PATH = "${"+ERNEST_LIBRARY_VARIABLE+"}/";
	public final String DEFAULT_INCLUDE_PATH = "${"+ERNEST_INCLUDE_VARIABLE+"}/";
	public final boolean DEFAULT_ISDEBUGCONFIG = false;
	
	/* Actual setting IDs for the preference store */
	public final String CDT_LIBRARY_PATH = "de.fraunhofer.esk.ernest.core.cdt.librarypath";
	public final String CDT_INCLUDE_PATH = "de.fraunhofer.esk.ernest.core.cdt.bibpath";
	public final String CDT_ISDEBUGCONFIG = "de.fraunhofer.esk.ernest.core.cdt.isdebugconfig";
}
