/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;

/**
 * The Interface RadioButton.
 *
 * @author Nagesh Phaniraj
 */
@ImplementedBy(RadioButtonBase.class)
public interface RadioButton extends Control {

	/**
	 * Click radio button.
	 *
	 * @param element
	 *            the element
	 */
	void clickRadioButton(WebElement element);

	/**
	 * Checks if is radio button selected.
	 *
	 * @param element
	 *            the element
	 * @return true, if is radio button selected
	 */
	boolean isRadioButtonSelected(WebElement element);

	/**
	 * Checks if is radio button displayed.
	 *
	 * @param element
	 *            the element
	 * @return true, if is radio button displayed
	 */
	boolean isRadioButtonDisplayed(WebElement element);

	/**
	 * Checks if is radio button enabled.
	 *
	 * @param element
	 *            the element
	 * @return true, if is radio button enabled
	 */
	boolean isRadioButtonEnabled(WebElement element);
}
