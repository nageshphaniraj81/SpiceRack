package com.spicerack.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InitilizeFramework extends Base {

	public void InitalizeBrowser(BrowserType browserType) {

		WebDriver driver = null;

		switch (browserType) {
		case Firefox: {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		case Chrome: {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Seleniumite\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		case IE: {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Seleniumite\\lib\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		}
		// To set the driver 
		DriverContext.setDriver(driver);
		
		// To set the browser
		DriverContext.Browser = new Browser(driver);

	}

}
