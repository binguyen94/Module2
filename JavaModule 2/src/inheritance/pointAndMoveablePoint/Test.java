package inheritance.pointAndMoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point points = new Point(3.5f,2.5f);
        MovablePoint movablePoint = new MovablePoint(2.2f,1.2f,4.3f,5.6f);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
