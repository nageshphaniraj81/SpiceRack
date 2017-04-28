/**
 * 
 */
package com.spicerack.testcases;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.spicerack.framework.base.BrowserType;
import com.spicerack.framework.base.DriverContext;
import com.spicerack.framework.base.InitilizeFramework;
import com.spicerack.framework.utilities.ExcelUtil;
import com.spicerack.framework.utilities.LogUtil;
import com.spicerack.framework.utilities.ReportingUtil;
import com.spicerack.pages.MyStoreDressesPage;
import com.spicerack.pages.MyStoreHomePage;
import com.spicerack.pages.MyStoreLoginPage;
import com.spicerack.pages.MyStoreTShirtPage;
import com.spicerack.pages.MyStoreWomenPage;

import jxl.read.biff.BiffException;

/**
 * @author Nagesh Phaniraj
 *
 */
public class SampleShoppingTest extends InitilizeFramework {

	// URL of the page to be navigated
	private String baseURL = "http://automationpractice.com";
	private String dataSheet = "D:\\SpiceRack\\GingerUI\\gingerui\\src\\test\\java\\com\\spicerack\\Resources\\TestData.xls";
    static final Logger logger = LogManager.getLogger(SampleShoppingTest.class);
    private ReportingUtil report;

	
	@BeforeTest
	public void initialize() {

		// Logging code using logUtil (Framework) & Log4j
		LogUtil logutil = new LogUtil();
		logutil.CreateLogFile();
		logutil.Write("Framework Initilize");
		logger.trace("Entering initialization.");
		
		// Browser Initialization 
		InitalizeBrowser(BrowserType.Firefox);
	    DriverContext.Browser.goToURL(baseURL);

	    // Initialize reporting
	    report = new ReportingUtil("Sample Shopping Test Optimized");
	    report.logInfo("Browser Started");
	    
		// Data driven testing
	    try {
			@SuppressWarnings("unused")
			ExcelUtil util = new ExcelUtil(dataSheet);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	 // Logging code using  Log4j
	    logger.trace("Exiting initialization.");
	    
	    // Extent Report logging
	    report.logInfo("Initialization Complete");
	    
	} 

	@Test
	public void testSignIn() throws InterruptedException {

		
		CurrentPage = GetInstance(MyStoreHomePage.class);
		CurrentPage = CurrentPage.As(MyStoreHomePage.class).clickSignIn();

		Thread.sleep(4000);
		
		// Reading data from Excel sheet
		CurrentPage.As(MyStoreLoginPage.class).login(ExcelUtil.ReadCell("Username",1),ExcelUtil.ReadCell("Password", 1));
		Thread.sleep(4000);
		
		report.logPass("Logged into the website");
	}

	@Test(dependsOnMethods = "testSignIn")
	public void testWomenPage() {

		CurrentPage = GetInstance(MyStoreWomenPage.class);
		CurrentPage.As(MyStoreWomenPage.class).switchToWomenTab();
		CurrentPage.As(MyStoreWomenPage.class).waitTillPageLoad();
		Assert.assertEquals(CurrentPage.As(MyStoreWomenPage.class).isTitleDisplayed(), true);
		report.logPass("Women Page is displayed");
	}

	@Test(dependsOnMethods = "testSignIn")
	public void testDressesPage() {

		CurrentPage = GetInstance(MyStoreDressesPage.class);
		CurrentPage.As(MyStoreDressesPage.class).switchToDressesTab();
		CurrentPage.As(MyStoreDressesPage.class).waitTillPageLoad();
		Assert.assertEquals(CurrentPage.As(MyStoreDressesPage.class).isTitleDisplayed(), true);
		report.logPass("Dresses Page is displayed");

	}

	@Test(dependsOnMethods = "testSignIn")
	public void testTShirtPage() {

		CurrentPage = GetInstance(MyStoreTShirtPage.class);
		CurrentPage.As(MyStoreTShirtPage.class).switchToTShirtsTab();
		CurrentPage.As(MyStoreTShirtPage.class).waitTillPageLoad();
		Assert.assertEquals(CurrentPage.As(MyStoreTShirtPage.class).isTitleDisplayed(), false);
		report.logFail("TShirts page is displayed");

	}
	
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		report.takeScreenshotOnFailure(testResult);

	}

	@AfterTest
	public void cleanUp() throws InterruptedException {

		CurrentPage = GetInstance(MyStoreHomePage.class);
		CurrentPage = CurrentPage.As(MyStoreHomePage.class).clickSignOff();
		Thread.sleep(4000);
		DriverContext.Driver.quit();
		Thread.sleep(4000);	
		report.closeReporting();
	}

}
