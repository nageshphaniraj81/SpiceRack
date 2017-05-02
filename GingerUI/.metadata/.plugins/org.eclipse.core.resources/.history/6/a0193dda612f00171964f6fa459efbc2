package com.spicerack.framework.initialization;

import org.openqa.selenium.WebDriver;

public class Browser extends Base {
	
	private WebDriver _driver;
	
	public Browser(WebDriver driver){
		_driver = driver;
	}

	public void goToURL(String url) {
		_driver.get(url);
	}

	public void maximize() {
		_driver.manage().window().maximize();
	}

	public void fullScreen() {
		_driver.manage().window().fullscreen();
	}

}
