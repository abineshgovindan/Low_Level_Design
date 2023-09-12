package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.radius = 50;
        circle.x = 5;
        circle.y = 10;
        circle.color = "Red";

        shapes.add(circle);
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.h = 25;
        rectangle.w = 15;
        rectangle.color = "Black";
        shapes.add(rectangle);
//        System.out.println(anotherCircle.color);
//        System.out.println(circle.color);
//        anotherCircle.color = "White";
//        System.out.println("========================");
//        System.out.println(anotherCircle.color);
//        System.out.println(circle.color);

    }
}
