package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BombermanStepdefs {

    private Bomberman bomberman;
    private Cell cell;
    private Included enemy;
    private Bomb bomb;
    private Wall melaninWall;

    //   Scenario: Bomberman can move to empty cell

    @Given("^As a bomberman")
    public void as_a_bomberman() throws Throwable {
        this.bomberman = new Bomberman();
    }

    @When("^I see an empty cell$")
    public void i_see_empty_cell() throws Throwable {
        this.cell = new Cell(null);
    }

    @Then("^I can move to that cell$")
    public void i_can_move_cell() throws Throwable {
        assertTrue(this.bomberman.puedeMover(this.cell));
    }

    //     Scenario: Bomberman can't move to cell with a wall

    @When("^I see a cell with a wall$")
    public void iSeeACellWithAWall() throws Throwable {
        this.cell = new Cell(new Wall());
    }

    @Then("^I can't move to that cell$")
    public void iCanTMoveToThatCell() throws Throwable {
        assertFalse(this.bomberman.puedeMover(this.cell));
    }

    // Scenario: Bomberman dies when he tries to move to a cell with an enemy

    @When("^I see a cell with an enemy$")
    public void iMoveToACellWithAnEnemy() throws Throwable {
        this.cell = new Cell(new Enemy());
    }

    @Then("^bomberman dies$")
    public void bombermanDies() throws Throwable {
       this.bomberman = null;
       assertEquals(null,this.bomberman);
    }

    //   Scenario: A bomb is lauched with a time of 3 second and destroy walls of melanin

    @Given("^As a bomb with a time of 3 seconds")
    public void as_a_bomb_with_3_seconds() throws Throwable {
            this.bomb = new Bomb(3);
    }

    @When("^it explodes and there are melinin walls$")
    public void it_explode_and_there_are_melinin_walls() throws Throwable {
            this.melaninWall = new Melanin();
            this.bomb.explode();
    }

    @Then("^destroy 3 walls of melanin$")
    public void destroy_3_walls_of_melanin() throws Throwable {
            this.melaninWall = null;
            this.bomb = null;

            Assert.assertEquals(null,melaninWall);
            Assert.assertEquals(null,bomb);
    }

    //   Scenario: A bomb is lauched with a time of 3 second and destroy an enemy

    @When("^it explodes and there is an enemy$")
    public void it_explode_and_there_is_an_enemy() throws Throwable {

    }

    @Then("^kill the enemy by the blast  wave$")
    public void kill_the_enemy_by_the_blast_waves() throws Throwable {

    }

    //   Scenario: A bomb is lauched with a time of 3 second and there is a metal wall

    @When("^it explodes and there are metal walls$")
    public void it_explode_and_there_are_metal_walls() throws Throwable {

    }

    @Then("^it does not destroy the metal wall$")
    public void it_does_not_destroy_the_metal_walls() throws Throwable {

    }






}
