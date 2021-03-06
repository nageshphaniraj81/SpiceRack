/**
 * 
 */
package com.spicerack.framework.controls.elements;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;

/**
 * The Interface TextBox.
 *
 * @author Nagesh Phaniraj
 */
@ImplementedBy(TextBoxBase.class)
public interface TextBox extends Control {

	/**
	 * Clear text.
	 */
	void clearText();

	/**
	 * Enter text.
	 *
	 * @param text
	 *            the text
	 */
	void enterText(String text);

	/**
	 * Gets the text value.
	 *
	 * @return the text value
	 */
	String getTextValue();

}
