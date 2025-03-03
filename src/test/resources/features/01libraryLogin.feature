
Feature: User should log in

  Agile story: Checking login page

  @login
  Scenario: Trying log in
    When user is on the login page
    And user input username
    And user input password
    Then user should see the invalid credential message

