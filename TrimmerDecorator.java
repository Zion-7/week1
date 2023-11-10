public class TrimmerDecorator extends Decorator {
    public TrimmerDecorator(Nameable nameable) {
        super(nameable);
    }

    public String correctName() {
        String name = nameabe.correctName();
        if (name.length() > 9) {
            return name.substring(0, 9);
        }
        return name;
    }
}