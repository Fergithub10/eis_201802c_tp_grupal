package gradle.cucumber;

public class JumpWall extends Included implements Power{
    @Override
    public String identity() {
        return "JumpWall";
    }

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
}
