Feature: I can find a text inside the list

@List
Scenario Outline: Scenario Outline name: As a Test Enginner, I want to validate that a text is present inside the list
    Given I navigate to the list page
    When I search <state> in the list
    Then I can find <text> in the list

    Examples:
        | state | text   | 
        | C     | Cindy  | 
        | B     | Bob    |
        | A     | Alice  |