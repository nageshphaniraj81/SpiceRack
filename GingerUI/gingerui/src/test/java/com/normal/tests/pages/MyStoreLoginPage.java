/**
 * 
 */
package com.normal.tests.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.controls.elements.Button;
import com.spicerack.framework.controls.elements.TextBox;
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
	public TextBox txtUserNameM;
	
	/** The txt password. */
	@FindBy(how = How.ID, using = "passwd")
	public TextBox txtPasswordM;
	
	/** The btn sign in. */
	@FindBy(how = How.ID, using = "SubmitLogin")
	public Button btnSignInM;


	/**
	 * Login.
	 *
	 * @param email
	 *            the email
	 * @param password
	 *            the password
	 */
	public void login(String email,String password){
		txtUserNameM.enterText(email);
		txtPasswordM.enterText(password);

	}

	
	/**
	 * Click login.
	 *
	 * @return the my store home page
	 * @throws InterruptedException
	 *             the interrupted exception
	 */	
	public MyStoreHomePage clickLogin() throws InterruptedException{
		Thread.sleep(3000);
		btnSignInM.performClick();
		Thread.sleep(3000);
		return GetInstance(MyStoreHomePage.class);
	}

}
