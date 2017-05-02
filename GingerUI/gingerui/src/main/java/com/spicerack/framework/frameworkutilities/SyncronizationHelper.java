/*
 * 
 */
package com.spicerack.framework.frameworkutilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spicerack.framework.initialization.DriverContext;

/**
 * The Class SyncronizationHelper.
 * Useful methods for custom syncronization 
 */
public class SyncronizationHelper {

	/**
	 * Instantiates a new syncronization helper.
	 *
	 * @param driver
	 *            the driver
	 */
	public SyncronizationHelper() {
	}

	/**
	 * Wait for element.
	 *
	 * @param locator
	 *            the locator
	 * @param timeout
	 *            the timeout
	 * @return the web element
	 */
	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for maximum of : " + timeout + " for the element to be available");

			WebDriverWait wait = new WebDriverWait(DriverContext.Driver, timeout);

			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

			System.out.println("Element appeared on the web page");

		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}
		return element;
	}

	/**
	 * Click when ready.
	 *
	 * @param locator
	 *            the locator
	 * @param timeout
	 *            the timeout
	 */
	public void clickWhenReady(By locator, int timeout) {

		try {
			WebElement element = null;
			System.out.println("Waiting for maximum of : " + timeout + " for the element to be clickable");
	
			WebDriverWait wait = new WebDriverWait(DriverContext.Driver, timeout);

			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			
			// To click on the element
			element.click();

			System.out.println("Element clicked on the web page");

		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}

	}
}
