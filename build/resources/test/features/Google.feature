Feature: Test Google search functionality

  Scenario: As a user I enter a search criteria and see the search results in Google
    Given I am on the Google search page
    When I enter a search criterias
    And click on the search button
    Then the results match the criteria

