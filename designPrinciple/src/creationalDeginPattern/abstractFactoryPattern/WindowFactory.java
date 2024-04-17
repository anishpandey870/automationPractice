package creationalDeginPattern.abstractFactoryPattern;

// Concrete Factory for Windows
public class WindowFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
