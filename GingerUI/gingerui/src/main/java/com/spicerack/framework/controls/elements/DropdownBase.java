/**
 * 
 */
package com.spicerack.framework.controls.elements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.spicerack.framework.controls.internals.ControlBase;

/**
 * The Class DropdownBase.
 *
 * @author Nagesh Phaniraj
 */
public class DropdownBase extends ControlBase implements Dropdown {

	/** The sel. */
	Select sel;

	/**
	 * Instantiates a new dropdown base.
	 *
	 * @param element
	 *            the element
	 */
	public DropdownBase(WebElement element) {
		super(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.Dropdown#selectItemByIndex(int)
	 */
	@Override
	public void selectItemByIndex(int index) {
		sel = new Select(getWrappedElement());
		sel.selectByIndex(index);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.Dropdown#selectItemByValue(java
	 * .lang.String)
	 */
	@Override
	public void selectItemByValue(String value) {
		sel = new Select(getWrappedElement());
		sel.selectByValue(value);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.Dropdown#
	 * selectItemByVisibleText(java.lang.String)
	 */
	@Override
	public void selectItemByVisibleText(String visibleText) {
		sel = new Select(getWrappedElement());
		sel.selectByVisibleText(visibleText);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spicerack.framework.controls.elements.Dropdown#getAllOptions()
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List getAllOptions() {
		sel = new Select(getWrappedElement());
		return sel.getOptions();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.spicerack.framework.controls.elements.Dropdown#getSelectedOptionValue
	 * ()
	 */
	@Override
	public String getSelectedOptionValue() {
		sel = new Select(getWrappedElement());
		String selectedOption = sel.getFirstSelectedOption().getText();
		return selectedOption;
	}

}
