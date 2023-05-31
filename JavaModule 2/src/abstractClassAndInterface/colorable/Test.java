package abstractClassAndInterface.colorable;

import inheritance.systematicLearningObjects.Circle;
import inheritance.systematicLearningObjects.Rectangle;
import inheritance.systematicLearningObjects.Shape;
import inheritance.systematicLearningObjects.Square;

public class Test {
    public static void main(String[] args) {
//        Square[] squares = new Square[3];
//        squares[0] = new Square();
//        squares[1] = new Square(4.5);
//        squares[2] = new Square(2.5, "Blue", true);
//
//
//        for (Square square : squares) {
//            square.howToColor();
//            System.out.println(square);
//        }

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5);
        shapes[1] = new Rectangle(4.3, 7.4);
        shapes[2] = new Square(3);

//        for (Shape shape : shapes) {
//            if (shape instanceof Circle) {
//                System.out.println("Area Circle : " + ((Circle) shape).getArea());
//            } else if (shape instanceof Rectangle) {
//                if (((Rectangle) shape).getWidth() != ((Rectangle) shape).getLength()) {
//                    System.out.println("Area Rectangle: " + ((Rectangle) shape).getArea());
//                } else {
//                    System.out.println("Area Square: " + ((Rectangle) shape).getArea());
//                }
//            }
//        }

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Area Circle : " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle && !(shape instanceof Square)) {
                System.out.println("Area Rectangle: " + ((Rectangle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("Area Square: " + ((Square) shape).getArea());
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();

            }
        }
    }
}
