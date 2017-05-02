/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;

import com.spicerack.framework.controls.internals.ControlBase;

/**
 * The Class CheckBoxBase.
 *
 * @author Nagesh Phaniraj
 */
public class CheckBoxBase extends ControlBase implements CheckBox {

	/**
	 * Instantiates a new check box base.
	 *
	 * @param element
	 *            the element
	 */
	public CheckBoxBase(WebElement element) {
		super(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.CheckBox#selectCheckBox(org.
	 * openqa.selenium.WebElement)
	 */
	@Override
	public void selectCheckBox(WebElement element) {
		if (!isCheckBoxSelected(element)) {
			getWrappedElement().click();
		} else {
			System.out.println("Checkbox is already selected");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.CheckBox#deselectCheckBox(org.
	 * openqa.selenium.WebElement)
	 */
	@Override
	public void deselectCheckBox(WebElement element) {
		if (isCheckBoxSelected(element)) {
			getWrappedElement().click();
		} else {
			System.out.println("Checkbox is already de-selected");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.CheckBox#isCheckBoxSelected(org
	 * .openqa.selenium.WebElement)
	 */
	@Override
	public boolean isCheckBoxSelected(WebElement element) {
		return getWrappedElement().isSelected();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.CheckBox#isCheckBoxDisplayed(
	 * org.openqa.selenium.WebElement)
	 */
	@Override
	public boolean isCheckBoxDisplayed(WebElement element) {
		return getWrappedElement().isDisplayed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.CheckBox#isCheckBoxEnabled(org.
	 * openqa.selenium.WebElement)
	 */
	@Override
	public boolean isCheckBoxEnabled(WebElement element) {
		return getWrappedElement().isEnabled();
	}

}
