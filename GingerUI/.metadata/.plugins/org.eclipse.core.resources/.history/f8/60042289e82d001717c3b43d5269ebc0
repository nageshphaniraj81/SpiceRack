/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import org.testng.Assert;

import com.spicerack.framework.base.Base;
import com.normal.tests.pages.MyStoreWomenPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Nagesh Phaniraj
 *
 */
public class WomenSteps extends Base {

	@When("^I click on women tab$")
	public void i_click_on_women_tab() throws Throwable {
		CurrentPage = GetInstance(MyStoreWomenPage.class);
		CurrentPage.As(MyStoreWomenPage.class).switchToWomenTab();
		CurrentPage.As(MyStoreWomenPage.class).waitTillPageLoad();
	}

	@Then("^Women page should be displayed$")
	public void women_page_should_be_displayed() throws Throwable {
		// Check if the page is loaded correctly
		Assert.assertEquals(CurrentPage.As(MyStoreWomenPage.class).isTitleDisplayed(), true);
	}
}
