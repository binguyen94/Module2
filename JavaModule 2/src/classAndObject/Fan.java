package classAndObject;

public class Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan ();
        fan2.setSpeed(Fan.MEDIUM);
        fan1.getRadius();
        fan2.getColor();
        fan2.isOn();

        System.out.println("Fan 1 : \n" + fan1.toString());
        System.out.println("Fan 2 : \n" + fan2.toString());
    }
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5 ;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
    public Fan (){

    }
    public String toString(){
        if(isOn()) {
            return "-Fan (on)\n-Speed: " + this.speed + "\n-Color: " + this.color + "\n-Radius: " + this.radius;
        }else{
            return "-Fan (off)\n-Speed: " +this.speed +"\n-Color: " + this.color +"\n-Radius: " + this.radius ;
        }
    }

}
