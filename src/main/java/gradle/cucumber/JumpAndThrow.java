package gradle.cucumber;

public class JumpAndThrow extends Included implements Power {
    @Override
    public String identity() {
        return "JumpAndThrow";
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
