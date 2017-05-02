/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import com.spicerack.framework.initialization.DriverContext;
import com.spicerack.framework.initialization.InitilizeFramework;

import cucumber.api.java.After;

/**
 * @author Nagesh Phaniraj
 *
 */
public class CleanupSteps extends InitilizeFramework  {
	
	@After
	public void cleanUp() throws InterruptedException {
//		// Get instance of Page
		DriverContext.Driver.quit();		
	}
}
