/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;

import com.spicerack.framework.controls.api.ImplementedBy;

/**
 * The Interface Frame.
 *
 * @author Nagesh Phaniraj
 */
@ImplementedBy(FrameBase.class)
public interface Frame {

	/**
	 * Switch to frame.
	 *
	 * @param element
	 *            the element
	 */
	void switchToFrame(WebElement element);

	/**
	 * Switch to parent frame.
	 */
	void switchToParentFrame();
}
