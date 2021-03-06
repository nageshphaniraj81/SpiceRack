/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;

import com.spicerack.framework.initialization.DriverContext;

/**
 * The Class FrameBase.
 *
 * @author Nagesh Phaniraj
 */
public class FrameBase implements Frame {

	/**
	 * Instantiates a new frame base.
	 */
	public FrameBase() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.Frame#switchToFrame(org.openqa.
	 * selenium.WebElement)
	 */
	@Override
	public void switchToFrame(WebElement element) {
		DriverContext.Driver.switchTo().frame(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.Frame#switchToParentFrame()
	 */
	@Override
	public void switchToParentFrame() {
		DriverContext.Driver.switchTo().parentFrame();
	}

}
