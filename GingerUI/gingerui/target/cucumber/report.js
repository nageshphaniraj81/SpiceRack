$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DressesShop.feature");
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
  "duration": 11848412112,
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
  "duration": 366036755,
  "status": "passed"
});
formatter.match({
  "location": "DressesSteps.i_click_on_Dresses_tab()"
});
formatter.result({
  "duration": 2491684535,
  "status": "passed"
});
formatter.match({
  "location": "DressesSteps.dresses_page_should_be_displayed()"
});
formatter.result({
  "duration": 156916149,
  "status": "passed"
});
formatter.after({
  "duration": 1644774655,
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
  "duration": 10813415686,
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
  "duration": 43025441,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_login_link()"
});
formatter.result({
  "duration": 3058475112,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_username_and_password(DataTable)"
});
formatter.result({
  "duration": 264940685,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 3468369601,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see_user_name_in_on_top_of_the_page()"
});
formatter.result({
  "duration": 73706447,
  "status": "passed"
});
formatter.after({
  "duration": 1657500714,
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
  "duration": 10607853786,
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
  "duration": 44808526,
  "status": "passed"
});
formatter.match({
  "location": "TShirtsSteps.i_click_on_TShirt_tab()"
});
formatter.result({
  "duration": 1985173149,
  "status": "passed"
});
formatter.match({
  "location": "TShirtsSteps.tshirt_page_should_be_displayed()"
});
formatter.result({
  "duration": 46324288,
  "status": "passed"
});
formatter.after({
  "duration": 1450938102,
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
  "duration": 11611314053,
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
  "duration": 38041480,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.i_click_on_women_tab()"
});
formatter.result({
  "duration": 2186949142,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.women_page_should_be_displayed()"
});
formatter.result({
  "duration": 129394964,
  "status": "passed"
});
formatter.after({
  "duration": 1524151425,
  "status": "passed"
});
});