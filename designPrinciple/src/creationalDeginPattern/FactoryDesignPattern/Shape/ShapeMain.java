package creationalDeginPattern.FactoryDesignPattern.Shape;

public class ShapeMain {
    public static void main(String[] args) {

        ShapeFactory shapeFactory=new ShapeFactory();
        // Get an object of circle and call its draw method
       Shape circle= shapeFactory.getShape("circle");
       circle.draw();

        // Get an object of Rectangle and call its draw method
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // Get an object of Square and call its draw method
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

    }
}
