/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;

import com.spicerack.framework.controls.internals.ControlBase;

/**
 * The Class RadioButtonBase.
 *
 * @author Nagesh Phaniraj
 */
public class RadioButtonBase extends ControlBase implements RadioButton {

	/**
	 * Instantiates a new radio button base.
	 *
	 * @param element
	 *            the element
	 */
	public RadioButtonBase(WebElement element) {
		super(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.RadioButton#clickRadioButton(
	 * org.openqa.selenium.WebElement)
	 */
	@Override
	public void clickRadioButton(WebElement element) {
		getWrappedElement().click();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.RadioButton#
	 * isRadioButtonSelected(org.openqa.selenium.WebElement)
	 */
	@Override
	public boolean isRadioButtonSelected(WebElement element) {
		return getWrappedElement().isSelected();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.RadioButton#
	 * isRadioButtonDisplayed(org.openqa.selenium.WebElement)
	 */
	@Override
	public boolean isRadioButtonDisplayed(WebElement element) {
		return getWrappedElement().isDisplayed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.RadioButton#
	 * isRadioButtonEnabled(org.openqa.selenium.WebElement)
	 */
	@Override
	public boolean isRadioButtonEnabled(WebElement element) {
		return getWrappedElement().isEnabled();
	}

}
