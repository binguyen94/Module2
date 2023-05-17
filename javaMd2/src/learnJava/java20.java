package learnJava;

import java.util.Scanner;

public class java20 {
    public static void main(String[] args) {
        int month, year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn kiểm tra số ngày của tháng: ");
        month = scanner.nextInt();
        System.out.println("Năm muốn kiểm tra :");
        year = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("có 30 ngày");
            case 2:
                if (year % 4 == 0 || year % 400 == 0) {
                    System.out.println("Năm nhuận có 29 ngày ");
                } else {
                    System.out.println("Năm ko nhuận có 28 ngày");
                }
        }

    }
}
