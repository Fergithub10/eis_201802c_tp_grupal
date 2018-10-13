package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BombermanStepdefs {

    private Bomberman bomberman;
    private Cell cell;


    @Given("^As a bomberman")
    public void as_a_bomberman() throws Throwable {
        this.bomberman = new Bomberman();
    }

    @When("^I see an empty cell$")
    public void i_see_empty_cell() throws Throwable {
        this.cell = new Cell(null);
    }

    @When("^I see a cell with an enemy$")
    public void iMoveToACellWithAnEnemy() throws Throwable {

    }

    @When("^I see a cell with a wall$")
    public void iSeeACellWithAWall() throws Throwable {
        this.cell = new Cell(new Wall());
    }

    @Then("^I can move to that cell$")
    public void i_can_move_cell() throws Throwable {
        assertTrue(this.bomberman.puedeMover(this.cell));
    }

    @Then("^I can't move to that cell$")
    public void iCanTMoveToThatCell() throws Throwable {
        assertFalse(this.bomberman.puedeMover(this.cell));
    }

    @Then("^bomberman dies$")
    public void bombermanDies() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
