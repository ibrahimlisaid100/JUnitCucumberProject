Feature:
@data
  Scenario: User should be able to see all 12 month in months dropdown
    Given user is on the dropdowns page of practice tool
    Then user should see below months dropdown
    |January|
    |February|
    |March|
    |April|
    |May|
    |June|
    |July|
    |August|
    |September|
    |October|
    |November|
    |December|