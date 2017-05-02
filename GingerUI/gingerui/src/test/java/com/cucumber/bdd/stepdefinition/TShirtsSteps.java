/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import org.testng.Assert;

import com.normal.tests.pages.MyStoreTShirtPage;
import com.spicerack.framework.initialization.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Nagesh Phaniraj
 *
 */
public class TShirtsSteps extends Base {
	@When("^I click on TShirt tab$")
	public void i_click_on_TShirt_tab() throws Throwable {
		// Get instance of Page
		CurrentPage = GetInstance(MyStoreTShirtPage.class);
		CurrentPage.As(MyStoreTShirtPage.class).switchToTShirtsTab();
		CurrentPage.As(MyStoreTShirtPage.class).waitTillPageLoad();
	}

	@Then("^TShirt page should be displayed$")
	public void tshirt_page_should_be_displayed() throws Throwable {
		Assert.assertEquals(CurrentPage.As(MyStoreTShirtPage.class).isTitleDisplayed(), true);
	}
}