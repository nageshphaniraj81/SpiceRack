/**
 * 
 */
package com.normal.tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.spicerack.framework.controls.elements.Button;
import com.spicerack.framework.controls.elements.ButtonBase;
import com.spicerack.framework.controls.elements.Dropdown;
import com.spicerack.framework.controls.elements.DropdownBase;
import com.spicerack.framework.controls.elements.HyperLink;
import com.spicerack.framework.controls.elements.HyperLinkBase;
import com.spicerack.framework.controls.elements.TextBox;
import com.spicerack.framework.controls.elements.TextBoxBase;
import com.spicerack.framework.frameworkutilities.JavaScriptUtil;
import com.spicerack.framework.initialization.BasePage;

/**
 * @author Nagesh Phaniraj
 *
 */
public class MyStoreContactUspage extends BasePage{
	
	static JavaScriptUtil js;

	public MyStoreContactUspage(){
		super();
		js = new JavaScriptUtil();
	}
	
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/h1[@class='page-heading bottom-indent']")
	public WebElement txtContactUsHeader;
	
	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	public WebElement lnkContactUs;
	
	@FindBy(how = How.ID, using = "id_contact")
	public WebElement selectContact;
	
	@FindBy(how = How.ID, using = "email")
	public WebElement txtEmail;
	
	@FindBy(how = How.ID, using = "message")
	public WebElement txtMessage;
	
	@FindBy(how = How.ID_OR_NAME, using = "submitMessage")
	public WebElement btnSubmit;
	
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/p[@class='alert alert-success']")
	public WebElement txtSuccessmessage;
	
	public boolean isHeaderMessageDisplayed(){
		return txtContactUsHeader.isDisplayed();
	}
	
	public void selectCustomerService() throws InterruptedException{
		Dropdown contactDropdown = new DropdownBase(selectContact);
		contactDropdown.selectItemByIndex(1);
		Thread.sleep(2000);
	}
	
	public boolean checkSelectedOption(String optionToCheck){
		Dropdown contactDropdown = new DropdownBase(selectContact);
		if(contactDropdown.getSelectedOptionValue().equals(optionToCheck))
		return true;
		else
	    return false;
	}
	
	public String getSelectedOptionText(){
		Dropdown contactDropdown = new DropdownBase(selectContact);
		return contactDropdown.getSelectedOptionValue();
	}
	
	public void enterEmail(String strEmail) throws InterruptedException{
		TextBox email = new TextBoxBase(txtEmail);
		js.ScrollToViewElement(email);
		email.enterText(strEmail);
		Thread.sleep(2000);
	}
	
	public void enterMessage(String strMessage) throws InterruptedException{
		TextBox message = new TextBoxBase(txtMessage);
		js.ScrollToViewElement(txtMessage);
		message.enterText(strMessage);
		Thread.sleep(2000);
	}
	
	public void clickSubmit() throws InterruptedException{
		Button submit = new ButtonBase(btnSubmit);
		js.ScrollToViewElement(submit);
		submit.click();
		Thread.sleep(2000);
	}
	
	public boolean isSuccessMessageDisplayed() throws InterruptedException{
		js.ScrollToViewElement(txtSuccessmessage);
		return txtSuccessmessage.isDisplayed();
	}
	
	
}