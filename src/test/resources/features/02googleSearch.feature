@regression
@Priority2

Feature: Google search  functionality

Agile story: User should be able to use google search feature.

    @titleVerify
  Scenario: Search page default tittle verification
    When User is on the google main page
    Then User should see tittle is Google

   @tittleAfterSearch
  Scenario: Search for apple in the search box
    #When User is on the google main page
    When user input apple in the search box
    Then user should see the tittle is apple - Google Search


