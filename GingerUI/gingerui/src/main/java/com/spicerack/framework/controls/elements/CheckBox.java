/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;


/**
 * The Interface CheckBox.
 *
 * @author Nagesh Phaniraj
 */
@ImplementedBy(CheckBoxBase.class)
public interface CheckBox extends Control {

	/**
	 * Select check box.
	 *
	 * @param element
	 *            the element
	 */
	void selectCheckBox(WebElement element);

	/**
	 * Deselect check box.
	 *
	 * @param element
	 *            the element
	 */
	void deselectCheckBox(WebElement element);

	/**
	 * Checks if is check box selected.
	 *
	 * @param element
	 *            the element
	 * @return true, if is check box selected
	 */
	boolean isCheckBoxSelected(WebElement element);

	/**
	 * Checks if is check box displayed.
	 *
	 * @param element
	 *            the element
	 * @return true, if is check box displayed
	 */
	boolean isCheckBoxDisplayed(WebElement element);

	/**
	 * Checks if is check box enabled.
	 *
	 * @param element
	 *            the element
	 * @return true, if is check box enabled
	 */
	boolean isCheckBoxEnabled(WebElement element);

}
