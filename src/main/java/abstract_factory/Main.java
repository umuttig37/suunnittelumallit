package abstract_factory;

public class Main {
    public static void main(String[] args) {
        // can choose style factory a/b saa valita tyylin a/b
        UIFactory factory = new AFactory();

        UIElement button = factory.createButton("OK");
        UIElement textField = factory.createTextField("Enter name");
        UIElement checkbox = factory.createCheckbox("Accept terms");

        button.display();
        textField.display();
        checkbox.display();

        System.out.println("\ndynamically here");
        button.setText("Submit");
        textField.setText("Enter email");
        checkbox.setText("Subscribe");

        button.display();
        textField.display();
        checkbox.display();
    }
}
