package accessModifierStaticMethodProperty.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle(5.5);
        System.out.println(a.getRadius());

        System.out.println("Diện tích hình tròn: " + Math.floor(a.getArea()));

    }


}
