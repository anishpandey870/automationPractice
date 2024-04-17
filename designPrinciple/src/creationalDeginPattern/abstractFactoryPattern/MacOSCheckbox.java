package creationalDeginPattern.abstractFactoryPattern;

// Concrete Product: MacOSCheckbox
public class MacOSCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println("MacOs checkbox check.");

    }
}
