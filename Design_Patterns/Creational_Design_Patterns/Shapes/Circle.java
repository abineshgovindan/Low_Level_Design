package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Shapes;

public class Circle extends Shape {
    public int radius;

    public Circle(){

    }

    Circle(Circle target){
        super(target);
        if(target != null){
            this.radius = target.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public boolean equals(Circle object2){
        if(!(object2 instanceof  Circle)
                || !(super.equals(object2) ))
            return false;
        Circle circle2 =  (Circle) object2;
        return object2.radius == radius;

    }
}
