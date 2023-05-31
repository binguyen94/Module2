package cleanCodeAndRefactoring;

import java.util.Scanner;

public class Refactoring1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị đầu: ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá trị thứ hai: ");
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phép tính: ");
        System.out.println("ADDITION = ");
        System.out.println("SUBTRACTION");
        System.out.println("MULTIPLICATION");
        System.out.println("DIVISION");
        char operator = scanner.next().charAt(0);
        calculate(first,second,operator);

    }

    //    public static int calculate(int firstOperand, int secondOperand, char operator) {
//        switch (operator) {
//            case '+':
//                return firstOperand + secondOperand;
//            case '-':
//                return firstOperand - secondOperand;
//            case '*':
//                return firstOperand * secondOperand;
//            case '/':
//                if (secondOperand != 0)
//                    return firstOperand / secondOperand;
//                else
//                    throw new RuntimeException("Can not divide by 0");
//            default:
//                throw new RuntimeException("Unsupported operation");
//        }
//    }


    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';



    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return firstOperand - secondOperand;
            case MULTIPLICATION:
                return firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }


}
