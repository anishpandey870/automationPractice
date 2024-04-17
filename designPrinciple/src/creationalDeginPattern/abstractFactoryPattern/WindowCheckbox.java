package creationalDeginPattern.abstractFactoryPattern;

// Concrete Product: WindowsCheckbox
public class WindowCheckbox implements Checkbox{
    @Override
    public void check() {
        System.out.println("Windows checkbox check.");

    }
}
