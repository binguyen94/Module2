package inheritance.circleAndCylinder;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double volumn(){
        return super.AreaCircle() * height;
    }

    @Override
    public String toString() {
//        return "Cylinder:\n- Radius: " + super.getRadius() + "\n-Color " + super.getColor() +"\n-Volumn: " + volumn();
        return String.format("Circle: \n-Radius: %s \n-Color: %s \n Volumn: %s", super.getRadius(),  super.getColor(),Math.ceil(volumn() * 100) / 100 );
    }
}
