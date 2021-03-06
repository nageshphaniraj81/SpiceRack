#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: LoginFeature
  This feature is responsible for testing all the scenarios for Login of application

  Scenario: Check login with correct username and password
    And I ensure home page open
    Then I click on login link
    When I enter username and password
      | UserName                     | Password |
      | nageshphaniraj2017@gmail.com | test123  |
    Then I click on Login button
    Then I should see user name in on top of the page
