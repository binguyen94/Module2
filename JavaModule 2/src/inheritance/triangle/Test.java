package inheritance.triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước cạnh 1:");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập kích thước cạnh 2:");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập kích thước cạnh 3:");
        double side3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập màu hình chữ nhật:");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(side1,side2,side3);
        System.out.println("Hình chữ nhật có màu: " + color);
        System.out.println("Hình chữ nhật có chu vi: " + triangle.getPerimeter());
        System.out.println("Hình chữ nhật có diện tích: " + triangle.getArea());
    }
}
