/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;

/**
 * @author Nagesh Phaniraj
 *
 */
@ImplementedBy(RadioButtonBase.class)
public interface RadioButton extends Control{

	void clickRadioButton(WebElement element);
	boolean isRadioButtonSelected(WebElement element);
	boolean isRadioButtonDisplayed(WebElement element);
	boolean isRadioButtonEnabled(WebElement element);
}
