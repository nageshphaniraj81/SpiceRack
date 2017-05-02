/**
 * 
 */
package com.spicerack.framework.controls.elements;

import java.util.Set;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;

/**
 * @author Nagesh Phaniraj
 *
 */
@ImplementedBy(WindowBase.class)
public interface Window{

	String getWindowHandle();
	Set<String> getWindowHandles();
	void switchToWindow(String handleToSwitch);
	
}
