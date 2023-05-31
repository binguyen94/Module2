package abstractClassAndInterface.comparable;

public class Circle {
    private double radius;
    private String color;

    private boolean filled;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(){

    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double AreaCircle(){
        return Math.PI * radius * radius;
    }

    public String toString (){
        return "Circle: \n- Radius: " + this.radius + "\n- Color: "+ this.color + "\n-Area: "+  Math.ceil(AreaCircle()*100)/100;
    }
}
