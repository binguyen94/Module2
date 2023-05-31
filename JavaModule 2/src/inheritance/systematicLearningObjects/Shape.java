package inheritance.systematicLearningObjects;

public class Shape {
    public String color = "green";
    public Boolean filled = true;

    public Shape() {

    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "A Shape with color of " + this.color + " and" + (this.filled ? " filled" : " not Filled");
    }

}
