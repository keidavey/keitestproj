Feature: Practice One

  @RunTest
  Scenario: Table Scenario
    Given a user is on the "https://cosmocode.io/automation-practice-webtable/" page
    When the user verifies the title of the table is "List of Countries, Capitals, Currencies and Languages"
    And verifies the table headers "Visited", "Countries", "Capital(s)", "Currency", and "Primary Language(s)"
    And the user clicks the visited checkbox for Afghanistan and Andorra
    Then the checkboxes are selected