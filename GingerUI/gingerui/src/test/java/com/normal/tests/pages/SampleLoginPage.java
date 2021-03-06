/*
 * 
 */
package com.normal.tests.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.initialization.BasePage;
// TODO: Auto-generated Javadoc

/**
 * The Class SampleLoginPage.
 *
 * @author Nagesh Phaniraj
 */
public class SampleLoginPage extends BasePage{
	
	/**
	 * Instantiates a new sample login page.
	 */
	public SampleLoginPage() {
		super();
	}
	
	/** The txt user name. */
	@FindBy(how = How.NAME, using = "UserName")
	public WebElement txtUserName;
	
	/** The txt password. */
	@FindBy(how = How.NAME, using = "Password")
	public WebElement txtPassword;
	
	/** The btn login. */
	@FindBy(how = How.NAME, using = "Login")
	public WebElement btnLogin;
	
	/**
	 * Login.
	 *
	 * @param userName
	 *            the user name
	 * @param Password
	 *            the password
	 */
	public void login(String userName, String Password){
		
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(Password);
		btnLogin.submit();

	}

}
