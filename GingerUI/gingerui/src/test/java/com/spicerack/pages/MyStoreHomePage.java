/**
 * 
 */
package com.spicerack.pages;

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
	
	public MyStoreLoginPage clickSignIn(){
		lnkSignIn.click();
		return GetInstance(MyStoreLoginPage.class);
	}
	
	public MyStoreHomePage clickSignOff(){
		lnkSignOff.click();
		return GetInstance(MyStoreHomePage.class);
	}

}