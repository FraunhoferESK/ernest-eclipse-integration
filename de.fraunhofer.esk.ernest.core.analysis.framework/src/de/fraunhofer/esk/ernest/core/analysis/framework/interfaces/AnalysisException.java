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
package de.fraunhofer.esk.ernest.core.analysis.framework.interfaces;

/**
 * AnalysisException has to be thrown if an error occures while an {@link IAnalysis} is
 * being prepared and initialized.
 *
 *
 */
public class AnalysisException extends Exception {
	private static final long serialVersionUID = 1L;

	public AnalysisException() {
		super();
	}

	/**
	 * Initializes a new AnalysisException.
	 *
	 * @param msg text that describes the error, this text will be visible for the user
	 */
	public AnalysisException(String msg) {
		super(msg);
	}

}
