@yandex

Feature: Yandex search function
  Agile story: check tittle

  Scenario Outline: Check the tittle of search page
    Given user is in the search page of yandex
    And user enter "<searchValue>" into searchbox
    Then user should see tittle contain "<fruit>"
    Examples:
      | searchValue | fruit   |
      | orange      | orange  |
      | apple       | apple   |
      | coconut     | coconut |