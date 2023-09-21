package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Composite;

import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Composite.Shapes.Circle;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Composite.Shapes.Shape;
import Design_Patterns.Design_Patterns.Structural_Design_Patterns.Composite.Shapes.Triangle;

public class Client {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();

        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");
        drawing.clear();
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");

    }
}
