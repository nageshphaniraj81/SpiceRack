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
 * The Class MyStoreHomePage.
 *
 * @author Nagesh Phaniraj
 */
public class MyStoreHomePage extends BasePage {
	
	/**
	 * Instantiates a new my store home page.
	 */
	public MyStoreHomePage(){
		super();
	}
	
	/** The lnk sign in. */
	@FindBy(how = How.CLASS_NAME, using = "login")
	public WebElement lnkSignIn;
	
	/** The lnk sign off. */
	@FindBy(how = How.CLASS_NAME, using = "logout")
	public WebElement lnkSignOff;
	
	/** The lnklogin user. */
	@FindBy(how = How.XPATH, using = ".//header[@id='header']//div[2]//a[@class='account']/span[contains(text(),'Nagesh Phaniraj')]")
	public WebElement lnkloginUser;
	
	/** The lnk contact us. */
	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	public WebElement lnkContactUs;
	
	
	/**
	 * Click sign in.
	 *
	 * @return the my store login page
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public MyStoreLoginPage clickSignIn() throws InterruptedException{
		HyperLink signIn = new HyperLinkBase(lnkSignIn);
		signIn.ClickLink();
		Thread.sleep(3000);
		return GetInstance(MyStoreLoginPage.class);
	}
	
	/**
	 * Click sign off.
	 *
	 * @return the my store home page
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public MyStoreHomePage clickSignOff() throws InterruptedException{
		HyperLink signOff = new HyperLinkBase(lnkSignOff);
		signOff.ClickLink();
		Thread.sleep(3000);
		return GetInstance(MyStoreHomePage.class);
	}
	
	/**
	 * Click contact us.
	 *
	 * @return the my store contact uspage
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public MyStoreContactUspage clickContactUs() throws InterruptedException{
		HyperLink contactUs = new HyperLinkBase(lnkContactUs);
		contactUs.ClickLink();
		Thread.sleep(6000);
		return GetInstance(MyStoreContactUspage.class);
	}

	/**
	 * Checks if is login.
	 *
	 * @return true, if is login
	 */
	public boolean isLogin(){
		HyperLink signIn = new HyperLinkBase(lnkSignIn);
		signIn.ClickLink();
		return signIn.isDisplayed();
	}
	
	/**
	 * Checks if is logged in.
	 *
	 * @return true, if is logged in
	 */
	public boolean isLoggedIn(){
		HyperLink signOff = new HyperLinkBase(lnkloginUser);
		return signOff.isDisplayed();
	}

}
