Feature: Login functionality

  As a user of the OpenCart application
  I want to log in to my account
  So that I can access my dashboard and manage my account details

  Scenario: Valid login
    Given I am on the login page
    When I enter valid credentials
    And I click the login button
    Then I should be redirected to the dashboard

  Scenario: Invalid login
    Given I am on the login page
    When I enter invalid credentials
    And I click the login button
    Then I should see an error message