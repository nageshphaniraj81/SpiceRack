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
Feature: ContactUsFeature
  This feature is responsible for testing Contact Us page

  Scenario: Check if user is able to submit the feedback successfully
    And I ensure home page open
    When I click on Contact Us link
    Then Customer Service Contact us page should be displayed
    When I select Subject Heading
    And Enter Email ID
    And Enter Test Message
    And Click on Send Link
    Then I see confirmation message on the screen
