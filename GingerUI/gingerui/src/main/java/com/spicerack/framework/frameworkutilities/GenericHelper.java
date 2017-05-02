/*
 * 
 */
package com.spicerack.framework.frameworkutilities;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * The Class GenericHelper. There are some useful methods that can be used from
 * the class to generate web elements by passing locator and type
 */
public class GenericHelper {

	/** The driver. */
	WebDriver driver;

	/**
	 * Instantiates a new generic helper.
	 *
	 * @param driver
	 *            the driver
	 */
	public GenericHelper(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Gets the element.
	 *
	 * @param locator
	 *            the locator string used to identify objects
	 * @param type
	 *            the type can be id,name,xpath,css,classname,tagname linktext
	 *            and partial link text
	 * @return the element
	 */
	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found with id: " + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("name")) {
			System.out.println("Element found with name: " + locator);
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("css")) {
			System.out.println("Element found with css: " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			System.out.println("Element found with classname: " + locator);
			return this.driver.findElement(By.className(locator));
		} else if (type.equals("tagname")) {
			System.out.println("Element found with tagname: " + locator);
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("linktext")) {
			System.out.println("Element found with link text: " + locator);
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			System.out.println("Element found with partial link text: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else {
			System.out.println("Locator type not supported");
			return null;
		}
	}

	/**
	 * Gets the element list.
	 *
	 * @param locator
	 *            the locator
	 * @param type
	 *            the type can be id,name,xpath,css,classname,tagname linktext
	 *            and partial link text
	 * @return the element list
	 */
	public List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> elementList = new ArrayList<WebElement>();
		if (type.equals("id")) {
			elementList = this.driver.findElements(By.id(locator));
		} else if (type.equals("name")) {
			elementList = this.driver.findElements(By.name(locator));
		} else if (type.equals("xpath")) {
			elementList = this.driver.findElements(By.xpath(locator));
		} else if (type.equals("css")) {
			elementList = this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			elementList = this.driver.findElements(By.className(locator));
		} else if (type.equals("tagname")) {
			elementList = this.driver.findElements(By.tagName(locator));
		} else if (type.equals("linktext")) {
			elementList = this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			elementList = this.driver.findElements(By.partialLinkText(locator));
		} else {
			System.out.println("Locator type not supported");
		}
		if (elementList.isEmpty()) {
			System.out.println("Element not found with " + type + ": " + locator);

		} else {
			System.out.println("Element found with " + type + ": " + locator);
		}
		return elementList;
	}

	/**
	 * Checks if is element present.
	 *
	 * @param locator
	 *            the locator
	 * @param type
	 *            the type can be id,name,xpath,css,classname,tagname linktext
	 *            and partial link text
	 * @return true, if is element present
	 */
	public boolean isElementPresent(String locator, String type) {
		List<WebElement> elementList = getElementList(locator, type);
		if (elementList.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
