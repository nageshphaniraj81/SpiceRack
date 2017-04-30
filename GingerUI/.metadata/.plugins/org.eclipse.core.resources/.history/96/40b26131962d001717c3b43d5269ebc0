/**
 * 
 */
package com.spicerack.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.spicerack.framework.base.DriverContext;
import com.spicerack.framework.config.Settings;
import com.spicerack.framework.utilities.ExcelUtil;
import com.spicerack.pages.MyStoreDressesPage;
import com.spicerack.pages.MyStoreHomePage;
import com.spicerack.pages.MyStoreLoginPage;
import com.spicerack.pages.MyStoreTShirtPage;
import com.spicerack.pages.MyStoreWomenPage;

/**
 * @author Nagesh Phaniraj
 *
 */
public class SampleShoppingTest extends InitializeTestCase {

	@Test
	public void testSignIn() throws InterruptedException {

		// Get instance of Page
		CurrentPage = GetInstance(MyStoreHomePage.class);
		CurrentPage = CurrentPage.As(MyStoreHomePage.class).clickSignIn();
		
	    // Log utils log
	    Settings.Logs.Write("Clicked on signin link");

		// Wait till Page load (temporary)
		Thread.sleep(4000);
		
		// Reading data from Excel sheet
		CurrentPage = CurrentPage.As(MyStoreLoginPage.class).login(ExcelUtil.ReadCell("Username",1),ExcelUtil.ReadCell("Password", 1));
		Thread.sleep(4000);
		report.logPass("Logged into the website");
	}

	@Test(dependsOnMethods = "testSignIn")
	public void testWomenPage() {

		// Get instance of Page
		CurrentPage = GetInstance(MyStoreWomenPage.class);
		CurrentPage.As(MyStoreWomenPage.class).switchToWomenTab();
		CurrentPage.As(MyStoreWomenPage.class).waitTillPageLoad();
		
		// Check if the page is loaded correctly
		Assert.assertEquals(CurrentPage.As(MyStoreWomenPage.class).isTitleDisplayed(), true);
		report.logPass("Women Page is displayed");
		
	    // Log utils log
	    Settings.Logs.Write("Woment page is displayed");
	}

	@Test(dependsOnMethods = "testSignIn")
	public void testDressesPage() {

		// Get instance of Page
		CurrentPage = GetInstance(MyStoreDressesPage.class);
		CurrentPage.As(MyStoreDressesPage.class).switchToDressesTab();
		CurrentPage.As(MyStoreDressesPage.class).waitTillPageLoad();
		
		// Check if the page is loaded correctly
		Assert.assertEquals(CurrentPage.As(MyStoreDressesPage.class).isTitleDisplayed(), true);
		report.logPass("Dresses Page is displayed");
		
	    // Log utils log
	    Settings.Logs.Write("Dresses page is displayed");

	}

	@Test(dependsOnMethods = "testSignIn")
	public void testTShirtPage() {

		// Get instance of Page
		CurrentPage = GetInstance(MyStoreTShirtPage.class);
		CurrentPage.As(MyStoreTShirtPage.class).switchToTShirtsTab();
		CurrentPage.As(MyStoreTShirtPage.class).waitTillPageLoad();
		
		// Check if the page is loaded correctly
		Assert.assertEquals(CurrentPage.As(MyStoreTShirtPage.class).isTitleDisplayed(), true);
		report.logPass("TShirts page is displayed");
		
	    // Log utils log
	    Settings.Logs.Write("TShirts page is displayed");

	}
	
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
	report.takeScreenshotOnFailure(testResult);

	}

	@AfterTest
	public void cleanUp() throws InterruptedException {

		// Get instance of Page
		CurrentPage = GetInstance(MyStoreHomePage.class);
		CurrentPage = CurrentPage.As(MyStoreHomePage.class).clickSignOff();
		Thread.sleep(4000);
		DriverContext.Driver.quit();
		Thread.sleep(4000);	
		report.closeReporting();
		
	    // Log utils log
	    Settings.Logs.Write("Cleanup completed");
		
	}

}
