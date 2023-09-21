package Design_Patterns.Design_Patterns.Structural_Design_Patterns.Composite.Shapes;

public class Triangle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color "+fillColor);
    }

}