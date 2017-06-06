/**
 * 
 */
package com.normal.tests.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.spicerack.framework.controls.elements.Button;
import com.spicerack.framework.controls.elements.Dropdown;
import com.spicerack.framework.controls.elements.HyperLink;
import com.spicerack.framework.controls.elements.TextBox;
import com.spicerack.framework.frameworkutilities.JavaScriptUtil;
import com.spicerack.framework.initialization.BasePage;

// TODO: Auto-generated Javadoc
/**
 * The Class MyStoreContactUspage.
 *
 * @author Nagesh Phaniraj
 */
public class MyStoreContactUspage extends BasePage{
	
	/** The js. */
	static JavaScriptUtil js;

	/**
	 * Instantiates a new my store contact uspage.
	 */
	public MyStoreContactUspage(){
		super();
		js = new JavaScriptUtil();
	}
	
	/** The txt contact us header. */
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/h1[@class='page-heading bottom-indent']")
	public TextBox txtContactUsHeader;
	
	/** The lnk contact us. */
	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	public HyperLink lnkContactUs;
	
	/** The select contact. */
	@FindBy(how = How.ID, using = "id_contact")
	public Dropdown selectContact;
	
	/** The txt email. */
	@FindBy(how = How.ID, using = "email")
	public TextBox txtEmail;
	
	/** The txt message. */
	@FindBy(how = How.ID, using = "message")
	public TextBox txtMessage;
	
	/** The btn submit. */
	@FindBy(how = How.ID_OR_NAME, using = "submitMessage")
	public Button btnSubmit;
	
	/** The txt successmessage. */
	@FindBy(how = How.XPATH, using = "//div[@id='center_column']/p[@class='alert alert-success']")
	public TextBox txtSuccessmessage;
	
	/**
	 * Checks if is header message displayed.
	 *
	 * @return true, if is header message displayed
	 */
	public boolean isHeaderMessageDisplayed(){
		return txtContactUsHeader.isDisplayed();
	}
	
	/**
	 * Select customer service.
	 *
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public void selectCustomerService() throws InterruptedException{
		selectContact.selectItemByIndex(1);
		Thread.sleep(2000);
	}
	
	/**
	 * Check selected option.
	 *
	 * @param optionToCheck
	 *            the option to check
	 * @return true, if successful
	 */
	public boolean checkSelectedOption(String optionToCheck){
		if(selectContact.getSelectedOptionValue().equals(optionToCheck))
		return true;
		else
	    return false;
	}
	
	/**
	 * Gets the selected option text.
	 *
	 * @return the selected option text
	 */
	public String getSelectedOptionText(){
		return selectContact.getSelectedOptionValue();
	}
	
	/**
	 * Enter email.
	 *
	 * @param strEmail
	 *            the str email
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public void enterEmail(String strEmail) throws InterruptedException{
		js.ScrollToViewElement(txtEmail);
		txtEmail.enterText(strEmail);
		Thread.sleep(2000);
	}
	
	/**
	 * Enter message.
	 *
	 * @param strMessage
	 *            the str message
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public void enterMessage(String strMessage) throws InterruptedException{
		js.ScrollToViewElement(txtMessage);
		txtMessage.enterText(strMessage);
		Thread.sleep(2000);
	}
	
	/**
	 * Click submit.
	 *
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public void clickSubmit() throws InterruptedException{
		js.ScrollToViewElement(btnSubmit);
		btnSubmit.click();
		Thread.sleep(2000);
	}
	
	/**
	 * Checks if is success message displayed.
	 *
	 * @return true, if is success message displayed
	 * @throws InterruptedException
	 *             the interrupted exception
	 */
	public boolean isSuccessMessageDisplayed() throws InterruptedException{
		js.ScrollToViewElement(txtSuccessmessage);
		return txtSuccessmessage.isDisplayed();
	}
	
	
}
