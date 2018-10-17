package gradle.cucumber;

public class Enemy extends Included {

    public Enemy(){

    }

    @Override
    public void changeStatus(Bomberman bomberman) {
        bomberman.setStatus(new Die());
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
        return this.status;
    }
}
