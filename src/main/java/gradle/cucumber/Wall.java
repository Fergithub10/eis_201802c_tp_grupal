package gradle.cucumber;

public class Wall extends Included{

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
    }


    public ContentStatus getStatus() {
        return status;
    }

    public void setStatus(ContentStatus status) {
        this.status = status;
    }
}
