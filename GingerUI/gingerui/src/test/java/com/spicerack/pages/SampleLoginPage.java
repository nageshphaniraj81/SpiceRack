package com.spicerack.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.spicerack.framework.base.BasePage;
/**
 * @author Nagesh Phaniraj
 *
 */
public class SampleLoginPage extends BasePage{
	
	public SampleLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.NAME, using = "UserName")
	public WebElement txtUserName;
	
	@FindBy(how = How.NAME, using = "Password")
	public WebElement txtPassword;
	
	@FindBy(how = How.NAME, using = "Login")
	public WebElement btnLogin;
	
	public void login(String userName, String Password){
		
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(Password);
		btnLogin.submit();

	}

}
