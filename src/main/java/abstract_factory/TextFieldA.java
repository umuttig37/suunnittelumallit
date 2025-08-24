package abstract_factory;

class TextFieldA extends UIElement {
    public TextFieldA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("| TextFieldA: " + text + " |");
    }
}

