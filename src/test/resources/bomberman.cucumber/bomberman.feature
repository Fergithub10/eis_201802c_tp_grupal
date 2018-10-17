Feature: Gradle-Cucumber integration

  # ATDD 1

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

   # ATDD 2

  Scenario: A bomb is lauched with a time of 3 second and destroy walls of melanin
    Given As a bomb with a time of 3 seconds
    When  it explodes and there are melinin walls
    Then  destroy 3 walls of melanin

  Scenario: A bomb is lauched with a time of 3 second and destroy an enemy
    Given As a bomb with a time of 3 seconds
    When  it explodes and there is an enemy
    Then  kill the enemy by the blast  wave

  Scenario: A bomb is lauched with a time of 3 seconds and there is a metal wall
    Given As a bomb with a time of 3 seconds
    When  it explodes and there are metal walls
    Then  it does not destroy the metal wall
