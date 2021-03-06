/**
 * 
 */
package com.spicerack.framework.frameworkutilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.spicerack.framework.initialization.DriverContext;

/**
 * The Class JavaScriptUtil helps in performing some of the tasks that are difficult
 * or cannot be performed by Selenium WebDriver in-build methods
 *
 * @author Nagesh Phaniraj
 */
public class JavaScriptUtil {
	
	/** The js. */
	private static JavascriptExecutor js;
	
	/**
	 * Instantiates a new java script util.
	 */
	public JavaScriptUtil(){
		js = (JavascriptExecutor)DriverContext.Driver;
	}
	
	/**
	 * Launch page.
	 *
	 * @param url
	 *            the url
	 */
	public void launchPage(String url){
		js.executeScript("window.location = "+"'"+url+"'"+";");
	}
	
	/**
	 * Scroll up.
	 *
	 * @param pixels
	 *            the pixels
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public void scrollUp(int pixels) throws InterruptedException{
		js.executeScript("window.scrollBy(0, -1900);");
		Thread.sleep(2000);
	}
	
	/**
	 * Scroll down.
	 *
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public void scrollDown() throws InterruptedException{
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
	}
	
	/**
	 * Scroll to view element.
	 *
	 * @param element
	 *            the element
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public void ScrollToViewElement(WebElement element) throws InterruptedException{
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
	}
}
