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
package de.fraunhofer.esk.ernest.core.generator.preferences.simulation;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.Preferences;

import de.fraunhofer.esk.ernest.core.generator.preferences.*;


/**
* Class used to initialize default preference values.
*/
public class SimulationPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		final Preferences preferences = InstanceScope.INSTANCE.getNode(Activator.PLUGIN_ID);	
		
		preferences.put("de.fraunhofer.esk.ernest.core.generator.preferences.modelname", "BinaryTrace");
		preferences.putInt("de.fraunhofer.esk.ernest.core.generator.preferences.time", 5);
		
	}

}
