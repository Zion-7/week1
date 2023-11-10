public abstract class Decorator implements Nameable {
public Nameable nameable;

    public Decorator(Nameable nameable) {
        this.nameable = nameable;
    }
    public String correctName() {
        return nameable.getCorrectName();
    }
}