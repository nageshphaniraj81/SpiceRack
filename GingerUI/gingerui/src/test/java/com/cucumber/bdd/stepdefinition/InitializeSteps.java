/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import java.io.IOException;

import com.spicerack.framework.configuration.ConfigReader;
import com.spicerack.framework.configuration.Settings;
import com.spicerack.framework.initialization.DriverContext;
import com.spicerack.framework.initialization.InitilizeFramework;

import cucumber.api.java.Before;

// TODO: Auto-generated Javadoc
/**
 * The Class InitializeSteps.
 *
 * @author Nagesh Phaniraj
 */
public class InitializeSteps extends InitilizeFramework {
	
	/**
	 * Initialize.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Before
	public void initialize() throws IOException {
		
		// Initializing configuration Settings
		ConfigReader.populateSetting();
		
		// Browser Initialization 
		InitalizeBrowser(Settings.Browser);
		DriverContext.Browser.goToURL(Settings.BaseURL);
	} 

}
