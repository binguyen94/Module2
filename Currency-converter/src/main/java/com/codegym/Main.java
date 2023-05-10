package com.codegym;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        public static void convertCurrency() {
            int rate = 23000;
            int choice = -1;


            boolean checkInputContinue = false;
            Scanner scanner = new Scanner(System.in);
            do {
                checkInputContinue = false;
                System.out.println("Bạn muốn nhập tiền USD hay VND");
                System.out.println("Chọn 1.Nhập USD");
                System.out.println("Chọn 2. Nhập VND");
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2) {
                    System.out.println("Nhập không đúng vui lòng nhập lại");
                    checkInputContinue = true;
                }
            } while (checkInputContinue);


            System.out.println("Nhập vào số tiền USD: ");
            double money = scanner.nextDouble();
            double total = 0;

            switch (choice) {
                case 1:
                    total = money*23000;
                    System.out.printf("%s USD tuong đương với %.0f tiền VND", money, total);
                    break;
                case 2:
                    total = money / 23000;
                    System.out.printf("%s VND tuong đương với %.3f tiền USD", money, total);

            }

        }
        }
    }
}