/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import org.testng.Assert;

import com.normal.tests.pages.MyStoreWomenPage;
import com.spicerack.framework.initialization.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// TODO: Auto-generated Javadoc
/**
 * The Class WomenSteps.
 *
 * @author Nagesh Phaniraj
 */
public class WomenSteps extends Base {

	/**
	 * I click on women tab.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@When("^I click on women tab$")
	public void i_click_on_women_tab() throws Throwable {
		CurrentPage = GetInstance(MyStoreWomenPage.class);
		CurrentPage.As(MyStoreWomenPage.class).switchToWomenTab();
		CurrentPage.As(MyStoreWomenPage.class).waitTillPageLoad();
	}

	/**
	 * Women page should be displayed.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@Then("^Women page should be displayed$")
	public void women_page_should_be_displayed() throws Throwable {
		// Check if the page is loaded correctly
		Assert.assertEquals(CurrentPage.As(MyStoreWomenPage.class).isTitleDisplayed(), true);
	}
}
