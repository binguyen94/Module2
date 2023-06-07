package debug.thuchanh1;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Ta có phương trình: 'a * x + b = 0' , vui lòng nhập giá trị a và b");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("Phương trình có nghiệm: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("Phương trình vô số nghiệm");
            } else {
                System.out.print("Phương trình vô nghiệm!");
            }
        }
    }
}
