package com.spicerack.framework.base;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.spicerack.framework.config.ConfigReader;

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
