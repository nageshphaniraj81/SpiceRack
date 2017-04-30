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
public class MyStoreLoginPage extends BasePage {
	
	public MyStoreLoginPage(){
		super();
	}
	
	@FindBy(how = How.ID, using = "email")
	public WebElement txtUserName;
	
	@FindBy(how = How.ID, using = "passwd")
	public WebElement txtPassword;
	
	@FindBy(how = How.ID, using = "SubmitLogin")
	public WebElement btnSignIn;


	public void login(String email,String password){
		txtUserName.clear();
		txtUserName.sendKeys(email);
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public MyStoreHomePage clickLogin() throws InterruptedException{
		btnSignIn.click();
		Thread.sleep(3000);
		return GetInstance(MyStoreHomePage.class);
	}

}
