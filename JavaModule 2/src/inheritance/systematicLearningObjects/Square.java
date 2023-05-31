package inheritance.systematicLearningObjects;

import abstractClassAndInterface.colorable.Colorable;
import abstractClassAndInterface.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable{
    public Square(){

    }
    public Square ( double side){
        super(side,side);
    }
    public Square ( double side, String color, boolean filled){
        super( side,side, color , filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double length){
        setSide(length);
    }
    @Override
    public String toString(){
        return "A Square with side=" + Math.ceil(getSide()*100)/100 + ", which is a subclass of " + super.toString();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void howToColor() {
        setColor("Color all four sides");
        System.out.println(getColor());
    }
}


