package abstract_factory;

class TextFieldB extends UIElement {
    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("┌─ " + text + " ─┐");
    }
}