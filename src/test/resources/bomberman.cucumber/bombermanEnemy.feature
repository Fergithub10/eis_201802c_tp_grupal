Feature: Bomberman Enemy behaviour

  # ATDD 3

  Scenario: Bomberman kills Bagulaa and gets the power to throw bombs
    Given a Bomberman that leaves a bomb
    When bagulaa is near and the bomb explodes
    Then bagulaa dies and Bomberman gets the power to throw bombs

  #Scenario: Bomberman kills Bagulaa and throw a new bomb
   # Given a Bomberman that leaves a bomb
    #When bagulaa is near and the bomb explodes
    #And bagulaa dies and Bomberman gets the power to throw bombs
    #And bomberman throws a new bomb
    #Then the last bomb explodes 3 cells from bomberman's position

  # ATDD 4

  Scenario: Bomberman kills Proto Max Jr and gets the power to jump walls
    Given a Bomberman that leaves a bomb
    When proto Max Jr is near and the bomb explodes
    Then proto Max Jr dies and Bomberman gets the power to jump walls


#  Scenario: Bomberman jumps a wall with the power to jump walls
#	Given a bomberman
#	When a bomberman gets the power to jump walls
#	Then a bomberman jumps 1 locker with a wall



    # ATDD 5


  Scenario: Bomberman kills Proto Max Units and gets a power that allows you to jump or throw several bombs at the same time
    Given a Bomberman that leaves a bomb
    When proto Max Units is near and the bomb explodes
    Then proto Max Units dies and Bomberman gets power to jump walls or throw several bombs at the same time

  #  Scenario: Bomberman launches several bombs with the power to throw several bombs
#	Given a bomberman
#	When a bomberman gets the power to throw several bombs
#	Then a bomberman throws 2 bombs simultaneously


#
