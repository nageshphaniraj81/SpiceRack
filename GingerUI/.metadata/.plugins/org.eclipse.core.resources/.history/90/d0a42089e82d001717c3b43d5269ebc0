/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import java.io.IOException;

import com.spicerack.framework.base.DriverContext;
import com.spicerack.framework.base.InitilizeFramework;
import com.spicerack.framework.config.ConfigReader;
import com.spicerack.framework.config.Settings;
import cucumber.api.java.Before;

/**
 * @author Nagesh Phaniraj
 *
 */
public class InitializeSteps extends InitilizeFramework {
	
	@Before
	public void initialize() throws IOException {
		
		// Initializing configuration Settings
		ConfigReader.populateSetting();
		
		// Browser Initialization 
		InitalizeBrowser(Settings.Browser);
		DriverContext.Browser.goToURL(Settings.BaseURL);
	} 

}
