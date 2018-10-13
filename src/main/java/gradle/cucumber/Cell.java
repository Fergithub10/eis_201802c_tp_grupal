package gradle.cucumber;

public class Cell {
    public Wall content;

    public Cell(Wall wall) {
        this.content = wall;
    }

    public boolean isEmpty() {
        return this.content == null;
    }
}
