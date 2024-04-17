package creationalDeginPattern.abstractFactoryPattern;

// Concrete Product: WindowsButton
public class WindowButton implements Button{
    @Override
    public void click() {
        System.out.println("Windows button clicked.");

    }
}
