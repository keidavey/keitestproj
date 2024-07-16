Feature: Upload File

  @RunTest
  Scenario: User uploads a file
    Given a user is on the "https://practice.expandtesting.com/upload" page
    When the user chooses a file
    Then the file is uploaded
