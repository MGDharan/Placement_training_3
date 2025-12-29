interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Factory {
    static Shape getShape(String type) {
        if (type.equals("circle"))
            return new Circle();
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Shape s = Factory.getShape("circle");
        s.draw();
    }
}
