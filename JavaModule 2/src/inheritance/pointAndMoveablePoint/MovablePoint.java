package inheritance.pointAndMoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public  MovablePoint(){

    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public  float [] getSpeed(){
        return new float[]{getXSpeed(),getYSpeed()};
    }

    @Override
    public String toString() {
        return String.format("%s, speed = (%f,%s)%n",super.toString(), getXSpeed(),getYSpeed());
    }

    public  MovablePoint move(){
        float x = getX();
        float y = getY();
        x += getXSpeed();
        y += getYSpeed();
        setXY(x,y);
        return this;    // Trả về đối tượng đang gọi phương thức move() với x,y mới được côn dồn speed.

    }


}
