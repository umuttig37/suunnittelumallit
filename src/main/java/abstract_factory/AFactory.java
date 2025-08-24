package abstract_factory;

class AFactory extends UIFactory {
    @Override
    public UIElement createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public UIElement createTextField(String text) {
        return new TextFieldA(text);
    }

    @Override
    public UIElement createCheckbox(String text) {
        return new CheckboxA(text);
    }
}
