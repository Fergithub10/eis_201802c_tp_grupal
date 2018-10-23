package gradle.cucumber;

import java.util.List;

public class ThrowBomb extends Included implements Power{

    @Override
    public void changeStatus(Bomberman bomberman) {

        bomberman.addPower(this);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void destroy() {

    }

    @Override
    public ContentStatus getStatus() {
        return null;
    }

    @Override
    public String identity() {
        return "ThrowBomb";
    }

    @Override
    public void putBomb(Cell currentCell, List<Bomb> bomb, Casillero casillero, Integer i) {
        casillero.getCellByDistance(i).setContent(bomb.get(0));
    }

    @Override
    public void jumpWall(Casillero casillero, Bomberman bomberman) {

    }
}
