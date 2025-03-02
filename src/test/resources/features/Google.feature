Feature: Test Google search functionality

  Scenario: As a user I enter a search criteria and see the search results in Google
    Given I am on the Google search page
    When I enter a search criterias
    And click on the search button
    Then the results match the criteria

  Scenario: As a Test Enginner, I try out different actions on a Sandbox page
    Given I navigate to the Sandbox page
    When select a value from the dropdown

  
  Scenario: As a Test Enginner, I want to retrieve a value from a static table
    Given I navigate to the static table
    Then I can return the value I wanted

  
  Scenario: As a Test Enginner, I want to validate the static table is displayed
    Given I navigate to the static table
    Then I can validate the table is displayed

  @Test
  Scenario: As a Test Enginner, I want to validate that a text is present inside the list
    Given I navigate to the list page
    When I search the list
    Then I can find the text in the list
    
   

