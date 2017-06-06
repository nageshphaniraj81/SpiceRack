/*
 * 
 */
package com.spicerack.framework.initialization;

import org.openqa.selenium.support.PageFactory;

// TODO: Auto-generated Javadoc
/**
 * Created by Nagesh Phaniraj.
 */
public class BasePage extends Base {

	/**
	 * As.
	 *
	 * @param <TPage>
	 *            the generic type
	 * @param pageInstance
	 *            the page instance
	 * @return the t page
	 */
	@SuppressWarnings("unchecked")
	public <TPage extends BasePage> TPage As(Class<TPage> pageInstance) {
		try {
			return (TPage) this;
		} catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}

}
