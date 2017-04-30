/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import org.testng.Assert;

import com.spicerack.framework.base.Base;
import com.normal.tests.pages.MyStoreDressesPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Nagesh Phaniraj
 *
 */
public class DressesSteps extends Base {
	@When("^I click on Dresses tab$")
	public void i_click_on_Dresses_tab() throws Throwable {
		// Get instance of Page
		CurrentPage = GetInstance(MyStoreDressesPage.class);
		CurrentPage.As(MyStoreDressesPage.class).switchToDressesTab();
		CurrentPage.As(MyStoreDressesPage.class).waitTillPageLoad();
	}

	@Then("^Dresses page should be displayed$")
	public void dresses_page_should_be_displayed() throws Throwable {
		Assert.assertEquals(CurrentPage.As(MyStoreDressesPage.class).isTitleDisplayed(), true);
	}

}
