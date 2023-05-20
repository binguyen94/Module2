package learnJava;

import java.util.Scanner;

public class java09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập Họ và Tên");
        String fullname = scan.nextLine();

        System.out.println("Nhập số báo danh");
        String sbd = scan.nextLine();

        System.out.println("Nhập điểm thi");
        float point = scan.nextFloat();

        System.out.println("Họ và tên: " + fullname);
        System.out.println("Số Báo Danh: " + sbd);
        System.out.println("Điểm thi: " + point);
    }
}
