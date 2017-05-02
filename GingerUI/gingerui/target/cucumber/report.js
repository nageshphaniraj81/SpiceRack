$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactUsShop.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "ContactUsFeature",
  "description": "This feature is responsible for testing Contact Us page",
  "id": "contactusfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11091630603,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Check if user is able to submit the feedback successfully",
  "description": "",
  "id": "contactusfeature;check-if-user-is-able-to-submit-the-feedback-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I ensure home page open",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Contact Us link",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Customer Service Contact us page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I select Subject Heading",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Enter Email ID",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Enter Test Message",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Click on Send Link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I see confirmation message on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_ensure_home_page_open()"
});
formatter.result({
  "duration": 325105110,
  "status": "passed"
});
formatter.match({
  "location": "ContactusSteps.i_click_on_Contact_Us_link()"
});
formatter.result({
  "duration": 73712,
  "status": "passed"
});
formatter.match({
  "location": "ContactusSteps.customer_Service_Contact_us_page_should_be_displayed()"
});
formatter.result({
  "duration": 27526,
  "status": "passed"
});
formatter.match({
  "location": "ContactusSteps.i_select_Subject_Heading()"
});
formatter.result({
  "duration": 33590,
  "status": "passed"
});
formatter.match({
  "location": "ContactusSteps.enter_Email_ID()"
});
formatter.result({
  "duration": 22860,
  "status": "passed"
});
formatter.match({
  "location": "ContactusSteps.enter_Test_Message()"
});
formatter.result({
  "duration": 18194,
  "status": "passed"
});
formatter.match({
  "location": "ContactusSteps.click_on_Send_Link()"
});
formatter.result({
  "duration": 22860,
  "status": "passed"
});
formatter.match({
  "location": "ContactusSteps.i_see_confirmation_message_on_the_screen()"
});
formatter.result({
  "duration": 24726,
  "status": "passed"
});
formatter.after({
  "duration": 1581699539,
  "status": "passed"
});
formatter.uri("DressesShop.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "DressesFeature",
  "description": "This feature is responsible for testing all the scenarios of Dresses Page",
  "id": "dressesfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10792205278,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Check Dresses page is displayed correctly",
  "description": "",
  "id": "dressesfeature;check-dresses-page-is-displayed-correctly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I ensure home page open",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on Dresses tab",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Dresses page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_ensure_home_page_open()"
});
formatter.result({
  "duration": 125729423,
  "status": "passed"
});
formatter.match({
  "location": "DressesSteps.i_click_on_Dresses_tab()"
});
formatter.result({
  "duration": 2089532609,
  "status": "passed"
});
formatter.match({
  "location": "DressesSteps.dresses_page_should_be_displayed()"
});
formatter.result({
  "duration": 51959061,
  "status": "passed"
});
formatter.after({
  "duration": 1420995616,
  "status": "passed"
});
formatter.uri("LoginShop.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "LoginFeature",
  "description": "This feature is responsible for testing all the scenarios for Login of application",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10812474691,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Check login with correct username and password",
  "description": "",
  "id": "loginfeature;check-login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I ensure home page open",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on login link",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I enter username and password",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 26
    },
    {
      "cells": [
        "nageshphaniraj2017@gmail.com",
        "test123"
      ],
      "line": 27
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I click on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I should see user name in on top of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_ensure_home_page_open()"
});
formatter.result({
  "duration": 127662731,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_link()"
});
formatter.result({
  "duration": 3037009979,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 232959921,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 3618803756,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see_user_name_in_on_top_of_the_page()"
});
formatter.result({
  "duration": 47803194,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: .login\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.1.0\u0027, revision: \u0027b94c902\u0027, time: \u00272017-02-16 12:21:31 -0800\u0027\nSystem info: host: \u0027NAGESH\u0027, ip: \u002710.0.0.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_65\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{rotatable\u003dfalse, raisesAccessibilityExceptions\u003dfalse, marionette\u003dtrue, appBuildId\u003d20161019084923, version\u003d, platform\u003dXP, proxy\u003d{}, command_id\u003d1, specificationLevel\u003d0, acceptSslCerts\u003dfalse, processId\u003d13368, browserVersion\u003d49.0.2, platformVersion\u003d10.0, XULappId\u003d{ec8030f7-c20a-464f-9b0e-13a3a9e97384}, browserName\u003dfirefox, takesScreenshot\u003dtrue, takesElementScreenshot\u003dtrue, platformName\u003dwindows_nt, device\u003ddesktop, firefox_profile\u003dUEsDBBQACAgIAJZhokoAAAAAAAAAA...}]\nSession ID: a225100f-1de3-4c6c-8e80-b8289d5b063f\n*** Element info: {Using\u003dclass name, value\u003dlogin}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:127)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:93)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:42)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:163)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:457)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:391)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat com.spicerack.framework.controls.api.ControlHandler.invoke(ControlHandler.java:38)\r\n\tat com.sun.proxy.$Proxy23.isDisplayed(Unknown Source)\r\n\tat com.spicerack.framework.controls.internals.ControlBase.isDisplayed(ControlBase.java:125)\r\n\tat com.normal.tests.pages.MyStoreHomePage.isLoggedIn(MyStoreHomePage.java:59)\r\n\tat com.cucumber.bdd.stepdefinition.LoginSteps.i_should_see_user_name_in_on_top_of_the_page(LoginSteps.java:57)\r\n\tat ✽.Then I should see user name in on top of the page(LoginShop.feature:29)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1648488250,
  "status": "passed"
});
formatter.uri("TShirtShop.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "TShirtFeature",
  "description": "This feature is responsible for testing all the scenarios of TShirt Page",
  "id": "tshirtfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10554111173,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Check TShirt page is displayed correctly",
  "description": "",
  "id": "tshirtfeature;check-tshirt-page-is-displayed-correctly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I ensure home page open",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on TShirt tab",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "TShirt page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_ensure_home_page_open()"
});
formatter.result({
  "duration": 131303080,
  "status": "passed"
});
formatter.match({
  "location": "TShirtsSteps.i_click_on_TShirt_tab()"
});
formatter.result({
  "duration": 1815593457,
  "status": "passed"
});
formatter.match({
  "location": "TShirtsSteps.tshirt_page_should_be_displayed()"
});
formatter.result({
  "duration": 54619692,
  "status": "passed"
});
formatter.after({
  "duration": 1404701989,
  "status": "passed"
});
formatter.uri("WomenShop.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "WomenFeature",
  "description": "This feature is responsible for testing all the scenarios of Women Page",
  "id": "womenfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10403718073,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Check Women page is displayed correctly",
  "description": "",
  "id": "womenfeature;check-women-page-is-displayed-correctly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I ensure home page open",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on women tab",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Women page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_ensure_home_page_open()"
});
formatter.result({
  "duration": 127930520,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.i_click_on_women_tab()"
});
formatter.result({
  "duration": 2171246144,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.women_page_should_be_displayed()"
});
formatter.result({
  "duration": 62011424,
  "status": "passed"
});
formatter.after({
  "duration": 1394750863,
  "status": "passed"
});
});