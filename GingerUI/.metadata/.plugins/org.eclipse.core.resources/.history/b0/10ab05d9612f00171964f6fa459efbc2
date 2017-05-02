/**
 * 
 */
package com.spicerack.framework.frameworkutilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.spicerack.framework.initialization.DriverContext;

/**
 * @author Nagesh Phaniraj
 *
 */
public class JavaScriptUtil {
	private static JavascriptExecutor js;
	
	public JavaScriptUtil(){
		js = (JavascriptExecutor)DriverContext.Driver;
	}
	
	public void launchPage(String url){
		js.executeScript("window.location = "+"'"+url+"'"+";");
	}
	
	public long getWindowHeight(){
	  return (long)js.executeScript("return window.innerHeight;");
	}
	
	public long getWindowWidth(){
	  return (long)js.executeScript("return window.innerWidth;");
	}
	
	public void scrollUp(int pixels) throws InterruptedException{
		js.executeScript("window.scrollBy(0, -1900);");
		Thread.sleep(2000);
	}
	
	public void scrollDown() throws InterruptedException{
		js.executeScript("window.scrollBy(0, 1900);");
		Thread.sleep(2000);
	}
	
	public void ScrollToViewElement(WebElement element) throws InterruptedException{
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
	}
}
