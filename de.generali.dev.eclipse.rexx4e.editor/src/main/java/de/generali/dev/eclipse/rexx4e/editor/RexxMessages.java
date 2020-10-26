/**
 *  Copyright (c) 2020 Generali Deutschland AG - Team Informatik
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Markus Holzem <markus.holzem@generali.com>
 */
package de.generali.dev.eclipse.rexx4e.editor;

import org.eclipse.osgi.util.NLS;

/**
 * RexxMessages initializes the message constants from the properties file.
 */
public class RexxMessages
{// extends NLS {
	private static final String BUNDLE_NAME = "de.generali.dev.eclipse.rexx4e.editor.RexxMessages";//$NON-NLS-1$

	private RexxMessages() {
		// Do not instantiate
	}

	public static String REXX_PLUGIN_STARTED;
	public static String REXX_PLUGIN_STOPPED;
	public static String REXX_PLUGIN_INTERNAL_ERROR;
	public static String REXX_PLUGIN_CONNECTION_STARTED;
	public static String REXX_PLUGIN_CONNECTION_STOPPED;
	public static String REXX_PLUGIN_PORT_NUMBER_ERROR;
	public static String REXX_PLUGIN_SERVER_STARTED;
	public static String REXX_PLUGIN_SERVER_STOPPED;
	public static String REXX_PLUGIN_ENV_LS4REXX_JAVA_HOME_MISSING_ERROR;
	public static String REXX_PLUGIN_ENV_LS4REXX_JAR_MISSING_ERROR;
	static {
		NLS.initializeMessages(BUNDLE_NAME, RexxMessages.class);
	}
}
