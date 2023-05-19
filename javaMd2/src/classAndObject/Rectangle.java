package classAndObject;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng : ");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài : ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Hình chủ nhật có : " + rectangle.display());
        System.out.println("Diện tích hình chữ nhật là : " + rectangle.getArea());
        System.out.println("Chi vi hình chữ nhật là : " + rectangle.getPerimeter());

    }
    double width,height;
    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle {" + "width =" + width + ", height=" + height + "}";
    }

}
