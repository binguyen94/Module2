package inheritance.circleAndCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5,"Yellow");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(2.5,"Blue", 4.5);
        System.out.println(cylinder.toString());
    }
}
