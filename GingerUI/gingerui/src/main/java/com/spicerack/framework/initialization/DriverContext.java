/*
 * 
 */
package com.spicerack.framework.initialization;

import org.openqa.selenium.WebDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class DriverContext.
 */
public class DriverContext {
	
	/** The Driver. */
	public static WebDriver Driver;
	
	/** The Browser. */
	public static Browser Browser;

	/**
	 * Sets the driver.
	 *
	 * @param driver
	 *            the driver to set
	 */
	public static void setDriver(WebDriver driver) {
		Driver = driver;
	}
	
	
}
