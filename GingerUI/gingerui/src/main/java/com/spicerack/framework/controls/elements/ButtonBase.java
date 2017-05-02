/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;
import com.spicerack.framework.controls.internals.ControlBase;

/**
 * The Class ButtonBase.
 *
 * @author Nagesh Phaniraj
 */
public class ButtonBase extends ControlBase implements Button {

	/**
	 * Instantiates a new button base.
	 *
	 * @param element
	 *            the element
	 */
	public ButtonBase(WebElement element) {
		super(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.Button#performClick()
	 */
	@Override
	public void performClick() {
		getWrappedElement().click();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.Button#getButtonText()
	 */
	@Override
	public String getButtonText() {
		return getWrappedElement().getText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.Button#performSubmit()
	 */
	@Override
	public void performSubmit() {
		getWrappedElement().submit();
	}

}
