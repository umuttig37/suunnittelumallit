package abstract_factory;

public abstract class UIElement {
    protected String text;

    public UIElement(String text) {
        this.text = text;
    }

    public abstract void display();

    public void setText(String newText) {
        this.text = newText;
    }
}
