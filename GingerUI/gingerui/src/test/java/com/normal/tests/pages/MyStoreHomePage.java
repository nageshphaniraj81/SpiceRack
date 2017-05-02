/**
 * 
 */
package com.normal.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.controls.elements.HyperLink;
import com.spicerack.framework.controls.elements.HyperLinkBase;
import com.spicerack.framework.initialization.BasePage;

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
	
	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	public WebElement lnkContactUs;
	
	
	public MyStoreLoginPage clickSignIn() throws InterruptedException{
		HyperLink signIn = new HyperLinkBase(lnkSignIn);
		signIn.ClickLink();
		Thread.sleep(3000);
		return GetInstance(MyStoreLoginPage.class);
	}
	
	public MyStoreHomePage clickSignOff() throws InterruptedException{
		HyperLink signOff = new HyperLinkBase(lnkSignOff);
		signOff.ClickLink();
		Thread.sleep(3000);
		return GetInstance(MyStoreHomePage.class);
	}
	
	public MyStoreContactUspage clickContactUs() throws InterruptedException{
		HyperLink contactUs = new HyperLinkBase(lnkContactUs);
		contactUs.ClickLink();
		Thread.sleep(6000);
		return GetInstance(MyStoreContactUspage.class);
	}

	public boolean isLogin(){
		HyperLink signIn = new HyperLinkBase(lnkSignIn);
		signIn.ClickLink();
		return signIn.isDisplayed();
	}
	
	public boolean isLoggedIn(){
		HyperLink signOff = new HyperLinkBase(lnkSignIn);
		return signOff.isDisplayed();
	}

}
