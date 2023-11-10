public  class CapitalizeDecorator extends Decorator {
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }
    public String correctName() {
        String name = nameable.getCorrectName();
        return name.toUpperCase();

    }

    @Override
    public String getCorrectName() {
        return correctName();
    }
}