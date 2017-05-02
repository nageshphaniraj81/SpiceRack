/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;
import com.spicerack.framework.controls.internals.ControlBase;

/**
 * The Class TextBoxBase.
 *
 * @author Nagesh Phaniraj
 */
public class TextBoxBase extends ControlBase implements TextBox {

	/**
	 * Instantiates a new text box base.
	 *
	 * @param element
	 *            the element
	 */
	public TextBoxBase(WebElement element) {
		super(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.TextBox#enterText(java.lang.
	 * String)
	 */
	@Override
	public void enterText(String text) {
		getWrappedElement().sendKeys(text);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.TextBox#getTextValue()
	 */
	@Override
	public String getTextValue() {
		return getWrappedElement().getText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.TextBox#clearText()
	 */
	@Override
	public void clearText() {
		getWrappedElement().clear();
	}

}
