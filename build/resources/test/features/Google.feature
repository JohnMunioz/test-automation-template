Feature: Test Google search functionality

  Scenario: As a user I enter a search criteria and see the search results in Google
    Given I am on the Google search page
    When I enter a search criterias
    And click on the search button
    Then the results match the criteria

  @Test
  Scenario: As a Test Enginner, I try out different actions on a Sandbox page
    Given I navigate to the Sandbox page
    When select a value from the dropdown

  @TestGrid
  Scenario: When I run a test on the TestGrid
    Given I navigate to the static table
    Then I can return the value I wanted
    
   

