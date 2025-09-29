interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() { System.out.println("Drawing Circle"); }
}

class Square implements Shape {
    public void draw() { System.out.println("Drawing Square"); }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if ("CIRCLE".equalsIgnoreCase(type)) return new Circle();
        if ("SQUARE".equalsIgnoreCase(type)) return new Square();
        throw new IllegalArgumentException("Unknown shape type");
    }
}

public class FactoryShapeDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("CIRCLE").draw();
        factory.getShape("SQUARE").draw();
    }
}