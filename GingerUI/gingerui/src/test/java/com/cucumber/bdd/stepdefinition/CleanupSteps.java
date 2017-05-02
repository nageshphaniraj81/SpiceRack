/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import com.spicerack.framework.initialization.DriverContext;
import com.spicerack.framework.initialization.InitilizeFramework;

import cucumber.api.java.After;

// TODO: Auto-generated Javadoc
/**
 * The Class CleanupSteps.
 *
 * @author Nagesh Phaniraj
 */
public class CleanupSteps extends InitilizeFramework  {
	
	/**
	 * Clean up.
	 *
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	@After
	public void cleanUp() throws InterruptedException {
//		// Get instance of Page
		DriverContext.Driver.quit();		
	}
}
