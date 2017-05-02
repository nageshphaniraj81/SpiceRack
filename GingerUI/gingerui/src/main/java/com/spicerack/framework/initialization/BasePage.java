package com.spicerack.framework.initialization;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by Nagesh Phaniraj
 */
public class BasePage extends Base {

	public BasePage() {
		PageFactory.initElements(DriverContext.Driver, this);

	}

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
