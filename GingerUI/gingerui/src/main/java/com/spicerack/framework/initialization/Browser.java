/*
 * 
 */
package com.spicerack.framework.initialization;

import org.openqa.selenium.WebDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class Browser.
 */
public class Browser extends Base {
	
	/** The driver. */
	private WebDriver _driver;
	
	/**
	 * Instantiates a new browser.
	 *
	 * @param driver
	 *            the driver
	 */
	public Browser(WebDriver driver){
		_driver = driver;
	}

	/**
	 * Go to URL.
	 *
	 * @param url
	 *            the url
	 */
	public void goToURL(String url) {
		_driver.get(url);
	}

	/**
	 * Maximize.
	 */
	public void maximize() {
		_driver.manage().window().maximize();
	}

	/**
	 * Full screen.
	 */
	public void fullScreen() {
		_driver.manage().window().fullscreen();
	}

}
