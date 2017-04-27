package com.spicerack.testcases;

import org.testng.annotations.Test;
import com.spicerack.pageObjectClasses.SampleExpediaSearchPage;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class SampleExpediaTest {
	private WebDriver driver;
	private String baseURL;
	static Logger log = Logger.getLogger(SampleExpediaTest.class);

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		baseURL = "https://www.expedia.com/";
		PropertyConfigurator.configure("Log4j.properties");
		driver.get(baseURL);
	}

	@Test
	public void fillBasicInfo() throws InterruptedException {
		Thread.sleep(3000);
    	driver.findElement(By.id("tab-flight-tab")).click();
    	Thread.sleep(3000);
    	SampleExpediaSearchPage.fillOriginTextBox(driver, "New York");
    	SampleExpediaSearchPage.fillDestinationTextBox(driver, "Chicago");
    	SampleExpediaSearchPage.fillDepartureDateTextBox(driver, "30/10/2017");
    	SampleExpediaSearchPage.fillReturnDateTextBox(driver, "02/11/2017");
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
