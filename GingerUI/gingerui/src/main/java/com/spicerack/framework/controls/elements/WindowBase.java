/**
 * 
 */
package com.spicerack.framework.controls.elements;

import java.util.Set;

import com.spicerack.framework.initialization.DriverContext;

/**
 * @author Nagesh Phaniraj
 *
 */
public class WindowBase implements Window {

	/**
	 * @param element
	 */
	public WindowBase() {
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.Window#getWindowHandle()
	 */
	@Override
	public String getWindowHandle() {	
		return DriverContext.Driver.getWindowHandle();
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.Window#getWindowHandles()
	 */
	@Override
	public Set<String> getWindowHandles() {
		return DriverContext.Driver.getWindowHandles();
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.Window#switchToWindow(java.lang.String)
	 */
	@Override
	public void switchToWindow(String handleToSwitch) {
		DriverContext.Driver.switchTo().window(handleToSwitch);
	}

}
