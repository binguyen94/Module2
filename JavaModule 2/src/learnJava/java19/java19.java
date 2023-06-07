package learnJava.java19;

import java.util.Scanner;

//Kiểm tra thứ
public class java19 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một số để kiếm tra thứ :");
        n = scanner.nextInt();

        switch (n) {
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sau");
                break;
            case 7:
                System.out.println("Thứ bảy");
                break;
            case 8:
                System.out.println("Chủ Nhật ");
                break;
            default:
                System.out.println("Số nhập lại sai, xin hãy nhập lại");
                break;
        }
    }
}
