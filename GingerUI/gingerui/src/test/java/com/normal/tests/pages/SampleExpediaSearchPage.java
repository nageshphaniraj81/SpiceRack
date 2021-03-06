/*
 * 
 */
package com.normal.tests.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


// TODO: Auto-generated Javadoc
/**
 * The Class SampleExpediaSearchPage.
 */
public class SampleExpediaSearchPage {
	
	/** The element. */
	public static WebElement element = null;
	
	/** The log. */
	static Logger log = Logger.getLogger(SampleExpediaSearchPage.class);
	
	/**
	 * Origin text box.
	 *
	 * @param driver
	 *            the driver
	 * @return the web element
	 */
	public static WebElement originTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-origin"));
		log.info("Origin textbox element found ");
		return element;
	}
	
	/**
	 * Fill origin text box.
	 *
	 * @param driver
	 *            the driver
	 * @param origin
	 *            the origin
	 */
	public static void fillOriginTextBox(WebDriver driver,String origin){
		element = originTextBox(driver);
		element.sendKeys(origin);
		log.info("Entered origin city as"+origin);
	}
	
	/**
	 * Destination text box.
	 *
	 * @param driver
	 *            the driver
	 * @return the web element
	 */
	public static WebElement destinationTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	/**
	 * Fill destination text box.
	 *
	 * @param driver
	 *            the driver
	 * @param origin
	 *            the origin
	 */
	public static void fillDestinationTextBox(WebDriver driver,String origin){
		element = destinationTextBox(driver);
		element.sendKeys(origin);
		log.info("Entered destination city as"+origin);
	}

	/**
	 * Departure date text box.
	 *
	 * @param driver
	 *            the driver
	 * @return the web element
	 */
	public static WebElement departureDateTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	/**
	 * Fill departure date text box.
	 *
	 * @param driver
	 *            the driver
	 * @param origin
	 *            the origin
	 */
	public static void fillDepartureDateTextBox(WebDriver driver,String origin){
		element = departureDateTextBox(driver);
		element.sendKeys(origin);
		log.info("Entered departure date as"+origin);
	}
	
	/**
	 * Return date text box.
	 *
	 * @param driver
	 *            the driver
	 * @return the web element
	 */
	public static WebElement returnDateTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	/**
	 * Fill return date text box.
	 *
	 * @param driver
	 *            the driver
	 * @param origin
	 *            the origin
	 */
	public static void fillReturnDateTextBox(WebDriver driver,String origin){
		element = returnDateTextBox(driver);
		element.sendKeys(origin);
		log.info("Entered return date  as"+origin);
	}
	
	/**
	 * Search button.
	 *
	 * @param driver
	 *            the driver
	 * @return the web element
	 */
	public static WebElement searchButton(WebDriver driver){
		element = driver.findElement(By.id("search-button"));
		return element;
	}
	
	/**
	 * Click on search button.
	 *
	 * @param driver
	 *            the driver
	 */
	public static void clickOnSearchButton(WebDriver driver){
		element = searchButton(driver);
		element.click();
	}
	
	/**
	 * Navigate to flights tab.
	 *
	 * @param driver
	 *            the driver
	 */
	public static void navigateToFlightsTab(WebDriver driver){
		//driver.findElement(By.id("header-history")).click();
		element = element.findElement(By.id("tab-flight-tab"));
		element.click();
	}
	
	/**
	 * Clear all fields.
	 *
	 * @param driver
	 *            the driver
	 */
	public static void clearAllFields(WebDriver driver){
		driver.findElement(By.id("flight-origin")).clear();
		driver.findElement(By.id("flight-departing")).clear();
		driver.findElement(By.id("flight-destination")).clear();
		driver.findElement(By.id("flight-returning")).clear();
	}
}
