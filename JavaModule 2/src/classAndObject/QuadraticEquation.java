package classAndObject;

import java.util.Scanner;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;
    private final double delta;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        delta = Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }
//
//    public double getDiscriminant() {
//        return delta = Math.pow(this.b, 2) - (4 * this.b * this.c);
//
//    }
    public  String display(){
        return "Phương trình bậc hai có a = " + this.a + ", b = " + this.b + ", c = "+ this.c ;
    }
    public double getRoot1() {
        if (delta >= 0) {
            return (-(this.b) + Math.sqrt(delta)) / (2 * this.a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (delta >= 0) {
            return (-(this.b) - Math.sqrt(delta)) / (2 * this.a);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập vào giá trị b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập vào giá trị c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println(equation.display());
        if (equation.getRoot1() == 0 && equation.getRoot2() == 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (equation.getRoot1() == equation.getRoot2()) {
            System.out.printf("Phương trình có 1 nghiệm là : x = %d", Math.round(equation.getRoot1()));
        } else {
            System.out.printf("Phương trình có 2 nghiệm phân biệt là : x1 = %.6f và x2 = %.5f", equation.getRoot1(), equation.getRoot2());
        }
    }
}


