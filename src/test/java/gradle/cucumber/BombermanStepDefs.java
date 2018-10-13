package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BombermanStepDefs {
    @Given("^As a bomberman$")
    public void asABomberman() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I see an empty cell$")
    public void iSeeAnEmptyCell() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I can move to that cell$")
    public void iCanMoveToThatCell() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
