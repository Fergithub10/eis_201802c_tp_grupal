Feature: Gradle-Cucumber integration

  Scenario: Bomberman can move to empty cell

    Given As a bomberman
    When I see an empty cell
    Then I can move to that cell

  Scenario: Bomberman can't move to cell with a wall
    Given As a bomberman
    When I see a cell with a wall
    Then I can't move to that cell

  Scenario: Bomberman dies when he tries to move to a cell with an enemy
    Given As a bomberman
    When I see a cell with an enemy
    Then bomberman dies