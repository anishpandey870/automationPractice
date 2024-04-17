package creationalDeginPattern.abstractFactoryPattern;

public class Application {
    private GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }
    public void createUI(){
        Button button= factory.createButton();
        button.click();
        Checkbox checkbox= factory.createCheckbox();
        checkbox.check();
    }
    public static void main(String[] args) {
        // Create an application for Windows
        Application windowsApp = new Application(new WindowFactory());
        windowsApp.createUI();

        // Create an application for MacOS
        Application macOSApp = new Application(new MacOSFactory());
        macOSApp.createUI();
    }
}
