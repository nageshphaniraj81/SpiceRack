/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import org.junit.Assert;

import com.normal.tests.pages.MyStoreContactUspage;
import com.normal.tests.pages.MyStoreHomePage;
import com.spicerack.framework.initialization.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactusSteps.
 *
 * @author Nagesh Phaniraj
 */
public class ContactusSteps extends Base {

	/**
	 * I click on contact us link.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@When("^I click on Contact Us link$")
	public void i_click_on_Contact_Us_link() throws Throwable {
		CurrentPage = GetInstance(MyStoreHomePage.class);
		CurrentPage = CurrentPage.As(MyStoreHomePage.class).clickContactUs();
		
	}

	/**
	 * Customer service contact us page should be displayed.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@Then("^Customer Service Contact us page should be displayed$")
	public void customer_Service_Contact_us_page_should_be_displayed() throws Throwable {
		Assert.assertTrue("Customer Service Contact Page is displayed",CurrentPage.As(MyStoreContactUspage.class).isHeaderMessageDisplayed());
	}

	/**
	 * I select subject heading.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@When("^I select Subject Heading$")
	public void i_select_Subject_Heading() throws Throwable {
		CurrentPage.As(MyStoreContactUspage.class).selectCustomerService();
		Assert.assertTrue("Customer Service not selected", CurrentPage.As(MyStoreContactUspage.class).checkSelectedOption("Customer service"));
	}

	/**
	 * Enter email ID.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@When("^Enter Email ID$")
	public void enter_Email_ID() throws Throwable {
		CurrentPage.As(MyStoreContactUspage.class).enterEmail("nageshphaniraj2017@gmail.com");
	}

	/**
	 * Enter test message.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@When("^Enter Test Message$")
	public void enter_Test_Message() throws Throwable {
		CurrentPage.As(MyStoreContactUspage.class).enterMessage("This is a test message");
	}

	/**
	 * Click on send link.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@When("^Click on Send Link$")
	public void click_on_Send_Link() throws Throwable {
		CurrentPage.As(MyStoreContactUspage.class).clickSubmit();
	}

	/**
	 * I see confirmation message on the screen.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@Then("^I see confirmation message on the screen$")
	public void i_see_confirmation_message_on_the_screen() throws Throwable {
		Assert.assertTrue("Customer Service Contact Page is displayed",CurrentPage.As(MyStoreContactUspage.class).isSuccessMessageDisplayed());
	}

	
}
