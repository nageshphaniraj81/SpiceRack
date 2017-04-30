/**
 * 
 */
package com.normal.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.base.BasePage;

/**
 * @author Nagesh Phaniraj
 *
 */
public class MyStoreHomePage extends BasePage {
	
	public MyStoreHomePage(){
		super();
	}
	
	@FindBy(how = How.CLASS_NAME, using = "login")
	public WebElement lnkSignIn;
	
	@FindBy(how = How.CLASS_NAME, using = "logout")
	public WebElement lnkSignOff;
	
	@FindBy(how = How.XPATH, using = ".//header[@id='header']//div[2]//a[@class='account']/span[contains(text(),'Nagesh Phaniraj')]")
	public WebElement lnkloginUser;
	
	
	public MyStoreLoginPage clickSignIn() throws InterruptedException{
		lnkSignIn.click();
		Thread.sleep(3000);
		return GetInstance(MyStoreLoginPage.class);
	}
	
	public MyStoreHomePage clickSignOff() throws InterruptedException{
		lnkSignOff.click();
		Thread.sleep(3000);
		return GetInstance(MyStoreHomePage.class);
	}

	public boolean isLogin(){
		return lnkSignIn.isDisplayed();
	}
	
	public boolean isLoggedIn(){
		return lnkloginUser.isDisplayed();
	}

}
