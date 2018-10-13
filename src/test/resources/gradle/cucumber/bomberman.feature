Feature: Bomberman tests

  Scenario: Bomberman moves to empty cell
    Given As a bomberman
    When I see an empty cell
    Then I can move to that cell
