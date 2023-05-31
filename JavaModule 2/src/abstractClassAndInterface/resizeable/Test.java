package abstractClassAndInterface.resizeable;

//import abstractClassAndInterface.comparable.Circle;

import inheritance.systematicLearningObjects.Circle;
import inheritance.systematicLearningObjects.Rectangle;
import inheritance.systematicLearningObjects.Square;

public class Test {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"indigo",false);

        for(Circle circle : circles) {
            circle.resize(50);
            System.out.println(circle);
        }

        System.out.println("---------");

        Rectangle[] rectangles = new Rectangle[3];
        rectangles [0] = new Rectangle();
        rectangles [1] = new Rectangle(2.4,4.2);
        rectangles [2] = new Rectangle(1.2,2.4,"yellow",false);

        for (Rectangle rectangle : rectangles) {
            rectangle.resize(50);
            System.out.println(rectangle);
        }

        System.out.println("-----------------");

        Square[] squares = new Square[3];
        squares [0] = new Square();
        squares [1] = new Square(2.2);
        squares[2] = new Square(2.6,"blue",true);

        for ( Square square : squares) {
            square.resize(50);
            System.out.println(square);
        }


    }

}
