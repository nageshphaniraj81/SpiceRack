/**
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;
import com.spicerack.framework.controls.internals.ControlBase;

/**
 * @author Nagesh Phaniraj
 *
 */
public class TextBoxBase extends ControlBase implements TextBox {

	/**
	 * @param element
	 */
	public TextBoxBase(WebElement element) {
		super(element);
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.TextBox#EnterText(java.lang.String)
	 */
	@Override
	public void enterText(String text) {
		getWrappedElement().sendKeys(text);
		
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.TextBox#getTextValue()
	 */
	@Override
	public String getTextValue() {
		return getWrappedElement().getText();
	}

	/* (non-Javadoc)
	 * @see com.spicerack.framework.controls.elements.TextBox#clearText()
	 */
	@Override
	public void clearText() {
		getWrappedElement().clear();
	}

}
