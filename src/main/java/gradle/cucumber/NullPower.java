package gradle.cucumber;

public class NullPower implements Power {
    @Override
    public String identity() {
        return null;
    }
}
