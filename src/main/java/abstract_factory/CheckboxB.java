package abstract_factory;

class CheckboxB extends UIElement {
    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[ ] CheckboxB: " + text);
    }
}
