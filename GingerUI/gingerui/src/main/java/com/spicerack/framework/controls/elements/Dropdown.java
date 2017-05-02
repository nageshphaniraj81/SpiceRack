/**
 * 
 */
package com.spicerack.framework.controls.elements;

import java.util.List;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;

/**
 * @author Nagesh Phaniraj
 *
 */
@ImplementedBy(DropdownBase.class)
public interface Dropdown extends Control{
	
	void selectItemByIndex(int index);
	void selectItemByValue(String value);
	void selectItemByVisibleText(String visibleText);
	@SuppressWarnings("rawtypes")
	List getAllOptions();
	String getSelectedOptionValue();

}
