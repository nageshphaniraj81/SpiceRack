/**
 * 
 */
package com.spicerack.framework.controls.elements;

import java.util.List;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;

/**
 * The Interface Dropdown.
 *
 * @author Nagesh Phaniraj
 */
@ImplementedBy(DropdownBase.class)
public interface Dropdown extends Control {

	/**
	 * Select item by index.
	 *
	 * @param index
	 *            the index
	 */
	void selectItemByIndex(int index);

	/**
	 * Select item by value.
	 *
	 * @param value
	 *            the value
	 */
	void selectItemByValue(String value);

	/**
	 * Select item by visible text.
	 *
	 * @param visibleText
	 *            the visible text
	 */
	void selectItemByVisibleText(String visibleText);

	/**
	 * Gets the all options.
	 *
	 * @return the all options
	 */
	@SuppressWarnings("rawtypes")
	List getAllOptions();

	/**
	 * Gets the selected option value.
	 *
	 * @return the selected option value
	 */
	String getSelectedOptionValue();

}
