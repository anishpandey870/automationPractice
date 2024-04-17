package creationalDeginPattern.abstractFactoryPattern;

// Concrete Product: MacOSButton
public class MacOSButton implements Button{
    @Override
    public void click() {
        System.out.println("MacOS button clicked.");

    }
}
