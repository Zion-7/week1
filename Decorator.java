public abstract class Decorator implements Nameable {
public Nameable nameabe;

    public Decorator(Nameable nameable) {
        this.nameabe = nameable;
    }
    public String correctName() {
        return nameabe.correctName();
    }
}