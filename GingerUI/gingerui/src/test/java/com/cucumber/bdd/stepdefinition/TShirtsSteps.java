/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import org.testng.Assert;

import com.normal.tests.pages.MyStoreTShirtPage;
import com.spicerack.framework.initialization.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// TODO: Auto-generated Javadoc
/**
 * The Class TShirtsSteps.
 *
 * @author Nagesh Phaniraj
 */
public class TShirtsSteps extends Base {
	
	/**
	 * I click on T shirt tab.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@When("^I click on TShirt tab$")
	public void i_click_on_TShirt_tab() throws Throwable {
		// Get instance of Page
		CurrentPage = GetInstance(MyStoreTShirtPage.class);
		CurrentPage.As(MyStoreTShirtPage.class).switchToTShirtsTab();
		CurrentPage.As(MyStoreTShirtPage.class).waitTillPageLoad();
	}

	/**
	 * Tshirt page should be displayed.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@Then("^TShirt page should be displayed$")
	public void tshirt_page_should_be_displayed() throws Throwable {
		Assert.assertEquals(CurrentPage.As(MyStoreTShirtPage.class).isTitleDisplayed(), true);
	}
}
