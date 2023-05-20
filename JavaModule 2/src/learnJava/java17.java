package learnJava;

import java.util.Scanner;

// Giải phương trình bậc 1
public class java17 {
    public static void main(String[] args) {
        System.out.println("Phương trình ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ta có a = " );
        double a = scanner.nextDouble();
        System.out.println("Ta có b = " );
        double b = scanner.nextDouble();


        double x = -b /a ;
        if ( a == 0) {
               if ( b == 0) {
                   System.out.println("Phương trình trên có vô số nghiệm");
               } else {
                   System.out.println("Phương trình trên vô nghiệm");
               }
        } else {
            System.out.println("Phương trình có một nghiệm là " + x);
        }
    }
}
