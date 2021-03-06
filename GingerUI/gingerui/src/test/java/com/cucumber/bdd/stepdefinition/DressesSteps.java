/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import org.testng.Assert;

import com.normal.tests.pages.MyStoreDressesPage;
import com.spicerack.framework.initialization.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// TODO: Auto-generated Javadoc
/**
 * The Class DressesSteps.
 *
 * @author Nagesh Phaniraj
 */
public class DressesSteps extends Base {
	
	/**
	 * I click on dresses tab.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@When("^I click on Dresses tab$")
	public void i_click_on_Dresses_tab() throws Throwable {
		// Get instance of Page
		CurrentPage = GetInstance(MyStoreDressesPage.class);
		CurrentPage.As(MyStoreDressesPage.class).switchToDressesTab();
		CurrentPage.As(MyStoreDressesPage.class).waitTillPageLoad();
	}

	/**
	 * Dresses page should be displayed.
	 *
	 * @throws Throwable
	 *             the throwable
	 */
	@Then("^Dresses page should be displayed$")
	public void dresses_page_should_be_displayed() throws Throwable {
		Assert.assertEquals(CurrentPage.As(MyStoreDressesPage.class).isTitleDisplayed(), true);
	}

}
