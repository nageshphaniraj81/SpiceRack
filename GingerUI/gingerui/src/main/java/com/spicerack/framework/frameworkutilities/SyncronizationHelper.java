package com.spicerack.framework.frameworkutilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncronizationHelper {
	WebDriver driver;

	public SyncronizationHelper(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		try {
			System.out.println("Waiting for maximum of : " + timeout + " for the element to be available");
			// Explicit wait
			WebDriverWait wait = new WebDriverWait(this.driver, timeout);

			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

			System.out.println("Element appeared on the web page");

		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}
		return element;
	}

	public void clickWhenReady(By locator, int timeout) {

		try {
			WebElement element = null;
			System.out.println("Waiting for maximum of : " + timeout + " for the element to be clickable");
			// Explicit wait
			WebDriverWait wait = new WebDriverWait(this.driver, timeout);

			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			// To click on the element
			element.click();

			System.out.println("Element clicked on the web page");

		} catch (Exception e) {
			System.out.println("Element not appeared on the web page");
		}

	}
}
