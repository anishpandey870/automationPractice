package creationalDeginPattern.FactoryDesignPattern.Shape;


// Concrete implementation of Shape  Square
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside square draw() method.");
    }
}
