/*
 * 
 */
package com.spicerack.framework.initialization;

import com.spicerack.framework.controls.api.ControlFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class Base.
 */
public class Base {
 
 /** The Current page. */
 public static BasePage CurrentPage;
 
 /**
	 * Gets the instance.
	 *
	 * @param <TPage>
	 *            the generic type
	 * @param page
	 *            the page
	 * @return the t page
	 */
 public <TPage extends BasePage> TPage GetInstance(Class<TPage> page){
	 Object obj = ControlFactory.initElements(DriverContext.Driver, page);
	 return page.cast(obj);
 }
}
