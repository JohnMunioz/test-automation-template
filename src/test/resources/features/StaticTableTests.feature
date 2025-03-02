@Test
Feature: Test different actions on the Static Table page.

Rule: The user can return values from the static table and validate them.

Background: Navigate to the Table app.
    Given I navigate to the static table

Scenario: As a Test Enginner, I want to retrieve a value from a static table.
    Then I can return the value I wanted

  
  Scenario: As a Test Enginner, I want to validate the static table is displayed.
    Then I can validate the table is displayed
