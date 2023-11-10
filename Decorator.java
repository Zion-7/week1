public abstract class Decorator implements Nameable {
public Nameable nameae;

    public Decorator(Nameable nameable) {
        this.nameae = nameable;
    }
    public String correctName() {
        return nameae.correctName();
    }
}