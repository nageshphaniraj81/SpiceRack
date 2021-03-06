/**
 * 
 */
package com.normal.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.controls.elements.Button;
import com.spicerack.framework.controls.elements.ButtonBase;
import com.spicerack.framework.controls.elements.TextBox;
import com.spicerack.framework.controls.elements.TextBoxBase;
import com.spicerack.framework.initialization.BasePage;

// TODO: Auto-generated Javadoc
/**
 * The Class MyStoreLoginPage.
 *
 * @author Nagesh Phaniraj
 */
public class MyStoreLoginPage extends BasePage {

	/** The txt user name. */
	@FindBy(how = How.ID, using = "email")
	public WebElement txtUserName;
	
	/** The txt password. */
	@FindBy(how = How.ID, using = "passwd")
	public WebElement txtPassword;
	
	/** The btn sign in. */
	@FindBy(how = How.ID, using = "SubmitLogin")
	public WebElement btnSignIn;


	/**
	 * Login.
	 *
	 * @param email
	 *            the email
	 * @param password
	 *            the password
	 */
	public void login(String email,String password){
		TextBox txtUser = new TextBoxBase(txtUserName);
		txtUser.clearText();
		txtUser.enterText(email);
		TextBox txtPwd = new TextBoxBase(txtPassword);
		txtPwd.clearText();
		txtPwd.enterText(password);
	}

	
	/**
	 * Click login.
	 *
	 * @return the my store home page
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public MyStoreHomePage clickLogin() throws InterruptedException{
	
		Button btnSubmit = new ButtonBase(btnSignIn);
		btnSubmit.performClick();
		Thread.sleep(3000);
		return GetInstance(MyStoreHomePage.class);
	}

}
