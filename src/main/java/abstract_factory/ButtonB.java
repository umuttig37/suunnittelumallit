    package abstract_factory;

class ButtonB extends UIElement {
    public ButtonB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("╔═ " + text + " ═╗");
    }
}
