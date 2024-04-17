package creationalDeginPattern.abstractFactoryPattern;


// Abstract Factory: GUIFactory
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
