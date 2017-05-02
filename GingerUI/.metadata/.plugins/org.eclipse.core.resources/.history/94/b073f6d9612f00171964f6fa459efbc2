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

/**
 * @author Nagesh Phaniraj
 *
 */
public class MyStoreLoginPage extends BasePage {

	@FindBy(how = How.ID, using = "email")
	public WebElement txtUserName;
	
	@FindBy(how = How.ID, using = "passwd")
	public WebElement txtPassword;
	
	@FindBy(how = How.ID, using = "SubmitLogin")
	public WebElement btnSignIn;


	public void login(String email,String password){
		TextBox txtUser = new TextBoxBase(txtUserName);
		txtUser.clearText();
		txtUser.enterText(email);
		TextBox txtPwd = new TextBoxBase(txtPassword);
		txtPwd.clearText();
		txtPwd.enterText(password);
	}

	
	public MyStoreHomePage clickLogin() throws InterruptedException{
	
		Button btnSubmit = new ButtonBase(btnSignIn);
		btnSubmit.performClick();
		Thread.sleep(3000);
		return GetInstance(MyStoreHomePage.class);
	}

}
