/**
 * 
 */
package com.spicerack.framework.controls.elements;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;

/**
 * The Interface Button.
 *
 * @author Nagesh Phaniraj
 */
@ImplementedBy(ButtonBase.class)
public interface Button extends Control {

	/**
	 * Perform click.
	 */
	void performClick();

	/**
	 * Gets the button text.
	 *
	 * @return the button text
	 */
	String getButtonText();

	/**
	 * Perform submit.
	 */
	void performSubmit();

}
