package gradle.cucumber;

public class Cell {
    public Included content;

    public Cell(Included wall) {
        this.content = wall;
    }

    public boolean isEmpty() {
        return this.content == null;
    }

    public void setContent(Included included) {
        this.content = included;
    }
}
