/*
 * 
 */
package com.spicerack.framework.controls.elements;

import org.openqa.selenium.WebElement;

import com.spicerack.framework.controls.internals.ControlBase;

/**
 * The Class HyperLinkBase.
 *
 * @author Nagesh Phaniraj
 */

public class HyperLinkBase extends ControlBase implements HyperLink {

	/**
	 * Instantiates a new hyper link base.
	 *
	 * @param element
	 *            the element
	 */
	public HyperLinkBase(WebElement element) {
		super(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.HyperLink#ClickLink()
	 */
	@Override
	public void ClickLink() {
		getWrappedElement().click();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.HyperLink#GetUrlText()
	 */
	@Override
	public String GetUrlText() {
		return getWrappedElement().getText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.HyperLink#CheckUrlTextContains(
	 * java.lang.String)
	 */
	@Override
	public boolean CheckUrlTextContains(String containsText) {
		if (getWrappedElement().getText().contains(containsText))
			return true;
		else
			return false;
	}
}
