package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class Bomberman {

    public Cell currentCell;
    public Status status;
    private Power powers;

    public Bomberman(){
        this.status = new Alive();
        this.powers = null;
    }

    public boolean canMove(Cell cell) {
        return cell.isEmpty();
    }

    public void move(Cell cell){
        this.currentCell = cell;
        this.updateStatus();
    }

    private void updateStatus(){
        this.currentCell.getContent().changeStatus(this);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean isDead(){
        return this.status.isDead();
    }

    public boolean isInAnEmptyCell() {
        return this.currentCell.isEmpty();
    }

    public void setCell(Cell cell) { this.currentCell = cell; }

    public void putBomb(Bomb bomb ) {
        this.currentCell.setContent(bomb);
        bomb.setCell(this.currentCell);
    }

    public void putBomb(Bomb bomb, int i, Casillero casillero ) {
        this.currentCell.setContent(bomb);
        bomb.setCell(this.currentCell);
    }

    public void addPower(Power power) {

        this.powers = power;
    }

    public boolean powerIncluded(Power power) {
       /*TODO mejorar busqueda*/
        return true; //this.powers.size() != 0 ;
    }

    public void throwBomb(Bomb bomb, int i, Casillero casillero) {
        casillero.getCellByDistance(i).setContent(bomb);
    }

    public Power getPowers() {
        return powers;
    }
}
