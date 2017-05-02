/**
 * 
 */
package com.spicerack.framework.frameworkutilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.spicerack.framework.initialization.DriverContext;

/**
 * @author Nagesh Phaniraj
 *
 */
public class MouseOperationsUtil {
	
	private static Actions action;
	
	public MouseOperationsUtil(){
		action = new Actions(DriverContext.Driver);
	}
	
	public void moveToElement(WebElement element){
		action.moveToElement(element).perform();
	}
	
	public void moveToElementAndClick(WebElement element){
		action.moveToElement(element).click().perform();
	}
	
	public void dragAndDropElement(WebElement fromElement,WebElement toElement){
		action.clickAndHold(fromElement).perform();
		action.moveToElement(toElement).perform();
		action.release().perform();
	}
	
	public void dragSliderControl(WebElement sliderElement,int xOffset,int yOffset ){
		action.dragAndDropBy(sliderElement, xOffset, yOffset).perform();
	}
	
	

}
