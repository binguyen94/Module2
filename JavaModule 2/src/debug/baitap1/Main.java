package debug.baitap1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = false;
        do {
            flag = false;
            try {
                System.out.println("Nhập vào kích thước cạnh 1 của tam giác");
                double side1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập vào kích thước cạnh 2 của tam giác");
                double side2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập vào kích thước cạnh 3 của tam giác");
                double side3 = Double.parseDouble(scanner.nextLine());

                Triangle triangle = new Triangle(side1, side2, side3);

            } catch (IllegalTriangleException e) {
                System.out.println("3 cạnh tam giác không hợp lệ");
                flag = true;
            }
        }while (flag);
    }
}
