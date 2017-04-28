/**
 * 
 */
package com.spicerack.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.spicerack.framework.base.BrowserType;
import com.spicerack.framework.base.DriverContext;
import com.spicerack.framework.base.InitilizeFramework;
import com.spicerack.pages.MyStoreDressesPage;
import com.spicerack.pages.MyStoreHomePage;
import com.spicerack.pages.MyStoreLoginPage;
import com.spicerack.pages.MyStoreTShirtPage;
import com.spicerack.pages.MyStoreWomenPage;

/**
 * @author Nagesh Phaniraj
 *
 */
public class SampleShoppingTest extends InitilizeFramework {

	// URL of the page to be navigated
	private String baseURL = "http://automationpractice.com";

	@BeforeTest
	public void initialize() {
		InitalizeBrowser(BrowserType.Firefox);
	    DriverContext.Browser.goToURL(baseURL);
	} 

	@Test
	public void testSignIn() throws InterruptedException {

		CurrentPage = GetInstance(MyStoreHomePage.class);
		CurrentPage = CurrentPage.As(MyStoreHomePage.class).clickSignIn();
		Thread.sleep(4000);
		CurrentPage.As(MyStoreLoginPage.class).login("nageshphaniraj2017@gmail.com", "test123");
		Thread.sleep(4000);
	}

	@Test(dependsOnMethods = "testSignIn")
	public void testWomenPage() {

		CurrentPage = GetInstance(MyStoreWomenPage.class);
		CurrentPage.As(MyStoreWomenPage.class).switchToWomenTab();
		CurrentPage.As(MyStoreWomenPage.class).waitTillPageLoad();
		Assert.assertEquals(CurrentPage.As(MyStoreWomenPage.class).isTitleDisplayed(), true);
	}

	@Test(dependsOnMethods = "testSignIn")
	public void testDressesPage() {

		CurrentPage = GetInstance(MyStoreDressesPage.class);
		CurrentPage.As(MyStoreDressesPage.class).switchToDressesTab();
		CurrentPage.As(MyStoreDressesPage.class).waitTillPageLoad();
		Assert.assertEquals(CurrentPage.As(MyStoreDressesPage.class).isTitleDisplayed(), true);

	}

	@Test(dependsOnMethods = "testSignIn")
	public void testTShirtPage() {

		CurrentPage = GetInstance(MyStoreTShirtPage.class);
		CurrentPage.As(MyStoreTShirtPage.class).switchToTShirtsTab();
		CurrentPage.As(MyStoreTShirtPage.class).waitTillPageLoad();
		Assert.assertEquals(CurrentPage.As(MyStoreTShirtPage.class).isTitleDisplayed(), true);

	}

	@AfterTest
	public void cleanUp() throws InterruptedException {

		CurrentPage = GetInstance(MyStoreHomePage.class);
		CurrentPage = CurrentPage.As(MyStoreHomePage.class).clickSignOff();
		Thread.sleep(4000);
		DriverContext.Driver.quit();
		Thread.sleep(4000);
	}

}