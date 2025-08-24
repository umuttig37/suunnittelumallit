package abstract_factory;

class CheckboxA extends UIElement {
    public CheckboxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[x] CheckboxA: " + text);
    }
}
