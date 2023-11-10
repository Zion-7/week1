public class CapitalizeDecorator extends Decorator {
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }
    public String correctName() {
        String name = nameae.correctName();
        return name.toLowerCase();
    }
}