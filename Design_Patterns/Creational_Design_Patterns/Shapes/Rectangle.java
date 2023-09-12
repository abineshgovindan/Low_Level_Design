package Design_Patterns.Design_Patterns.Creational_Design_Patterns.Shapes;

public class Rectangle extends Shape{
    public int w;
    public int h;
    public Rectangle(){

    }
    Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.w = target.w;
            this.h = target.h;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    public boolean equals(Object object2){
        if(!(object2 instanceof Rectangle) || !(super.equals(object2))) return false;
        Rectangle rectangle2 = (Rectangle) object2;
        return rectangle2.h == h && rectangle2.w == w;
    }
}
