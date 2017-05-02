/*
 * 
 */
package com.spicerack.framework.controls.elements;

import com.spicerack.framework.controls.api.ImplementedBy;
import com.spicerack.framework.controls.internals.Control;

// TODO: Auto-generated Javadoc
/**
 * The Interface HyperLink.
 *
 * @author Nagesh Phaniraj
 */

@ImplementedBy(HyperLinkBase.class)
public interface HyperLink extends Control {

	/**
	 * Click link.
	 */
	void ClickLink();

	/**
	 * Gets the url text.
	 *
	 * @return the string
	 */
	String GetUrlText();

	/**
	 * Check url text contains.
	 *
	 * @param containsText
	 *            the contains text
	 * @return true, if successful
	 */
	boolean CheckUrlTextContains(String containsText);
}
