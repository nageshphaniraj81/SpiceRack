/**
 * 
 */
package com.spicerack.framework.frameworkutilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.spicerack.framework.initialization.DriverContext;

/**
 * The Class MouseOperationsUtil.
 * Useful methods to perform mouse operations
 *
 * @author Nagesh Phaniraj
 */
public class MouseOperationsUtil {
	
	/** The action. */
	private static Actions action;
	
	/**
	 * Instantiates a new mouse operations util.
	 */
	public MouseOperationsUtil(){
		action = new Actions(DriverContext.Driver);
	}
	
	/**
	 * Move to element.
	 *
	 * @param element
	 *            the element
	 */
	public void moveToElement(WebElement element){
		action.moveToElement(element).perform();
	}
	
	/**
	 * Move to element and click.
	 *
	 * @param element
	 *            the element
	 */
	public void moveToElementAndClick(WebElement element){
		action.moveToElement(element).click().perform();
	}
	
	/**
	 * Drag and drop element.
	 *
	 * @param fromElement
	 *            the from element
	 * @param toElement
	 *            the to element
	 */
	public void dragAndDropElement(WebElement fromElement,WebElement toElement){
		action.clickAndHold(fromElement).perform();
		action.moveToElement(toElement).perform();
		action.release().perform();
	}
	
	/**
	 * Drag slider control.
	 *
	 * @param sliderElement
	 *            the slider element
	 * @param xOffset
	 *            the x offset
	 * @param yOffset
	 *            the y offset
	 */
	public void dragSliderControl(WebElement sliderElement,int xOffset,int yOffset ){
		action.dragAndDropBy(sliderElement, xOffset, yOffset).perform();
	}
	
	

}
