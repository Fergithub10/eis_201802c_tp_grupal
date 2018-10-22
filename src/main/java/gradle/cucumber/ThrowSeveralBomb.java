package gradle.cucumber;

public class ThrowSeveralBomb extends  Included implements Power{
    @Override
    public String identity() {
        return "ThrowSeveralBomb";
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
