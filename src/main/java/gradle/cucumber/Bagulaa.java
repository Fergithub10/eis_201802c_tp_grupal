package gradle.cucumber;

public class Bagulaa extends Enemy{
    @Override
    public void changeStatus(Bomberman bomberman) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void destroy() {
        this.status = new Destroyed();
        this.cell.setContent(new ThrowBomb());
    }

    @Override
    public ContentStatus getStatus() {
        return this.status;
    }

    @Override
    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
