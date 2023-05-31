package inheritance.systematicLearningObjects;

import abstractClassAndInterface.resizeable.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(double radius) {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + getRadius() + ", which is a subclass of" + super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() * (1 + percent / 100));
    }


}
