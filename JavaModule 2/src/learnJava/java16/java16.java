package learnJava.java16;

import java.util.Scanner;

// Bai tap hình tròn
public class java16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính r của hình tròn :");
        double r = scanner.nextDouble();

        double C = (r * 2) * Math.PI;
        System.out.printf("Chu vi của hình tròn là %.2f \n", C);

        double S = Math.pow(r,2) * Math.PI;
        System.out.printf("Diện tích của hình tròn là %.2f",S);
    }
}
