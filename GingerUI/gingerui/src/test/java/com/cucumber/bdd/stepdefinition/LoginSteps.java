/**
 * 
 */
package com.cucumber.bdd.stepdefinition;

import org.junit.Assert;
import com.spicerack.framework.base.Base;
import com.spicerack.framework.utilities.CucumberUtil;
import com.spicerack.framework.utilities.ReportingUtil;
import com.normal.tests.pages.MyStoreHomePage;
import com.normal.tests.pages.MyStoreLoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Nagesh Phaniraj
 *
 */


public class LoginSteps extends Base {

	public static ReportingUtil report;

	@And("^I ensure home page open$")
	public void i_ensure_home_page_open() throws Throwable {
		CurrentPage = GetInstance(MyStoreHomePage.class);
		Assert.assertTrue("Login Page is not loaded", CurrentPage.As(MyStoreHomePage.class).isLogin());
	}

	@Then("^I click on login link$")
	public void i_click_on_login_link() throws Throwable {
		CurrentPage = GetInstance(MyStoreHomePage.class);
		CurrentPage = CurrentPage.As(MyStoreHomePage.class).clickSignIn();
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password(DataTable table) throws Throwable {
		CucumberUtil.ConvertDataTableToDict(table);
		CurrentPage.As(MyStoreLoginPage.class).login(CucumberUtil.GetCellValue("UserName"),
				CucumberUtil.GetCellValue("Password"));

	}

	@Then("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		CurrentPage = CurrentPage.As(MyStoreLoginPage.class).clickLogin();
	}

	@Then("^I should see user name in on top of the page$")
	public void i_should_see_user_name_in_on_top_of_the_page() throws Throwable {
		Assert.assertTrue("User has logged in", CurrentPage.As(MyStoreHomePage.class).isLoggedIn());
	}

}


