package learnJava;

import java.util.Scanner;

//Giải phương trình bậc 2
public class java18 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2: ax2 + bx + c = 0");
        System.out.println("Ta có a = ");
        a = scanner.nextDouble();
        System.out.println("Ta có b = ");
        b = scanner.nextDouble();
        System.out.println("Ta có c =");
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("Điều kiện phương trình a phải khác 0, xin nhập lại giá trị đúng");
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép là x1 = x2 =" + x1);
            } else  {
                x1 = (-b + Math.sqrt(delta))/ 2 *a;
                x2 = (-b - Math.sqrt(delta))/ 2 *a;
                System.out.printf("Phương trình có 2 nghiệm phân biệt là x1 = %.2f và x2 = %.2f",x1,x2);
            }
        }
    }
}