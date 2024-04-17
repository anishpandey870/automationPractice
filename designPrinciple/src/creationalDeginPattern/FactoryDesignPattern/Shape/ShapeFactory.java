package creationalDeginPattern.FactoryDesignPattern.Shape;


// Factory class to produce shapes
public class ShapeFactory {
    public  Shape getShape(String shapeType) {

        // Method to get the shape based on input
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

}
