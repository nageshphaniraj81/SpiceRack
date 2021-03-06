/**
 * 
 */
package com.spicerack.framework.controls.elements;

import java.util.Set;

import com.spicerack.framework.controls.api.ImplementedBy;

/**
 * The Interface Window.
 *
 * @author Nagesh Phaniraj
 */
@ImplementedBy(WindowBase.class)
public interface Window {

	/**
	 * Gets the window handle.
	 *
	 * @return the window handle
	 */
	String getWindowHandle();

	/**
	 * Gets the window handles.
	 *
	 * @return the window handles
	 */
	Set<String> getWindowHandles();

	/**
	 * Switch to window.
	 *
	 * @param handleToSwitch
	 *            the handle to switch
	 */
	void switchToWindow(String handleToSwitch);

}
