package introduction;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year;
//        System.out.println("Enter a year: ");
//        year = scanner.nextInt();
//        if(year % 4 == 0 ){
//            if (year % 100 == 0){
//                if(year % 400 == 0){
//                    System.out.printf("%d is a leap year", year);
//                }else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            }else {
//                System.out.printf("%d is a leap year", year);
//            }
//        }else{
//            System.out.printf("%d is NOT a leap year", year);
//        }
//    }
//}

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year;
//        System.out.println("Enter a year: ");
//        year = scanner.nextInt();
//        boolean isLeapYear = false;
//        if(year % 4 == 0){
//            if(year % 100 == 0){
//                if(year % 400 == 0){
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//
//        if(isLeapYear){
//            System.out.printf("%d is a leap year", year);
//        } else {
//            System.out.printf("%d is NOT a leap year", year);
//        }
//    }
//}
public class LeapYearCaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
