package com.spicerack.testcases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.spicerack.pages.SampleLoginPage;

public class SampleLoginTest {

	// Global variable declaration
	private WebDriver driver;
	private String baseURL = "http://executeautomation.com/demosite/Login.html";

	@Before
	public void initialize() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to(baseURL);
	}

	@Test
	public void login() {

		SampleLoginPage login = new SampleLoginPage(driver);
		login.login("admin", "admin");

	}

}