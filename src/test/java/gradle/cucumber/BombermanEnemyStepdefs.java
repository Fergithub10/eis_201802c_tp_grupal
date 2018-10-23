package gradle.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BombermanEnemyStepdefs {

    private Bomberman bomberman;
    private Bomb bomb;
    private Bagulaa bagulaa;
    private ProtoMaxJr protoMaxJr;
    private ProtoMaxUnits protoMaxUnits;
    private Casillero casillero;
    private Cell celda0;
    private Cell celda1;
    private Cell celda2;
    private ThrowBomb throwBomb;
    private JumpWall jumpWall;
    private ThrowSeveralBomb manyBombs;


    @Given("^a Bomberman that leaves a bomb$")
    public void a_bomberman_that_leaves_a_bomb() throws Throwable {

        this.bomberman = new Bomberman();
        this.bomb = new Bomb(3);
        this.celda0 = new Cell(new EmptyContent(), 0);
        this.celda1 = new Cell(new EmptyContent(), 1);
        this.celda2 = new Cell(new EmptyContent(), 2);

        // El bomberman no debería implementar Included? Para asignarlo a una celda.
        this.bomberman.setCell(celda0);

        List<Cell> cells = new ArrayList<Cell>();
        cells.add(celda0);
        cells.add(celda1);
        cells.add(celda2);

        this.casillero = new Casillero(cells);
        ArrayList<Bomb> bombs= new ArrayList<Bomb>();
        bombs.add(bomb);

        this.bomberman.putBomb(bombs, 0, this.casillero);
    }

    @When("^bagulaa is near and the bomb explodes$")
    public void bagulaa_is_near_and_the_bomb_explodes() throws Throwable {
        this.bagulaa = new Bagulaa();
        this.bagulaa.setCell(this.celda1);
        celda1.setContent(bagulaa);
        this.bomb.explode(this.casillero);
    }

    @Then("^bagulaa dies and Bomberman gets the power to throw bombs$")
    public void bagulaa_dies_and_bomberman_gets_power_throw_bombs() throws Throwable {
        this.bomberman.move(this.celda1);
        assertTrue(this.bagulaa.isDead());
        assertTrue(this.bomberman.getPowers().identity() == "ThrowBomb");
    }

    @When("^proto Max Jr is near and the bomb explodes$")
    public void proto_max_jr_is_near_and_the_bomb_explodes() throws Throwable {
        this.protoMaxJr = new ProtoMaxJr();
        this.protoMaxJr.setCell(this.celda1);
        celda1.setContent(protoMaxJr);
        this.bomb.explode(this.casillero);
    }

    @Then("^proto Max Jr dies and Bomberman gets the power to jump walls$")
    public void proto_max_jr_dies_and_Bomberman_gets_the_power_to_jump_walls() throws Throwable {
        this.bomberman.move(this.celda1);
        assertTrue(this.protoMaxJr.isDead());
        assertTrue(this.bomberman.getPowers().identity() == "JumpWall");
    }


    @When("^proto Max Units is near and the bomb explodes$")
    public void proto_Max_Units_is_near_and_the_bomb_explodes() throws Throwable {
        this.protoMaxUnits = new ProtoMaxUnits();
        this.protoMaxUnits.setCell(this.celda1);
        this.celda1.setContent(this.protoMaxUnits);
        this.bomb.explode(this.casillero);
    }

    @Then("^proto Max Units dies and Bomberman gets power to jump walls or throw several bombs at the same time$")
    public void proto_max_units_dies_and_Bomberman_gets_power_to_jump_walls_or_throw_several_bombs_at_the_same_time() throws Throwable {
        this.bomberman.move(this.celda1);
        assertTrue(this.protoMaxUnits.isDead());
        assertTrue(this.bomberman.getPowers().identity() == "ThrowSeveralBomb");
    }

    @And("^bomberman throws a new bomb$")
    public void bombermanThrowsANewBomb() throws Throwable {
        this.celda0 = new Cell(new EmptyContent(), 0);
        this.celda1 = new Cell(new EmptyContent(), 1);
        this.celda2 = new Cell(new EmptyContent(), 2);

        this.bomb = new Bomb(3);

        List<Cell> cells = new ArrayList<Cell>();
        cells.add(celda0);
        cells.add(celda1);
        cells.add(celda2);

        this.casillero = new Casillero(cells);

       this.bomberman.throwBomb(this.bomb, 3, casillero);
    }

    @Then("^the last bomb explodes (\\d+) cells from bomberman's position$")
    public void theLastBombExplodesCellsFromBombermanSPosition(int distance) throws Throwable {
        this.bomb.explode(this.casillero);
        assertTrue(this.casillero.getCellByDistance(distance).destroyContent());
    }
}
