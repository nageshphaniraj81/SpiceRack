package com.spicerack.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Nagesh Phaniraj
 */
public class BasePage {

	public BasePage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}

}
