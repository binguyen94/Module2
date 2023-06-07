package learnJava.java11;

import java.util.Scanner;

public class java11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ta có a = ");
        int a = scanner.nextInt();
        System.out.println(" Ta có b = ");
        int b = scanner.nextInt();

        int sum = a + b ;
        System.out.println("Tổng: \n" + a  + " + " +b +" = " + sum );

        int sub = a - b ;
        System.out.println("Hiệu: \n" + a  + " + " +b +" = " + sub );

        int multi = a * b ;
        System.out.println("Phép nhân: \n" + a  + " * " +b +" = " + multi );

        float div = (float) a / b ;
        System.out.println("Phép chia: \n" + a  + " / " +b +" = " + div );

        int sur = a % b ;
        System.out.println("Phép tính lấy số dư: \n" + a  + " % " +b +" = " + sur );



    }
}
