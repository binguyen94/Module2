package introduction;

import java.util.Scanner;

public class CurrencyConverter {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        convertCurrency();
    }
    public static void convertCurrency() {
        int rate = 23000;
        int choice = -1;


        boolean checkInputContinue = false;
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
                total = money* rate;
                System.out.printf("%s USD tuong đương với %.0f tiền VND", money, total);
                break;
            case 2:
                total = money / rate;
                System.out.printf("%s VND tuong đương với %.3f tiền USD", money, total);

        }

    }
}

