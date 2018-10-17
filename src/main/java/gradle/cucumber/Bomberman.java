package gradle.cucumber;

public class Bomberman {

    public Cell currentCell;
    public Status status;

    public Bomberman(){
        this.status = new Alive();
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
}
