package stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DecimailToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số thập phân: ");
        int decimalNum = scanner.nextInt();
        String binaryNum = decimalToBinary(decimalNum);
        System.out.println("Số nhị phân của " + decimalNum + " là: " + binaryNum);
    }

    public static String decimalToBinary(int decimalNum) {
        String binaryNum = "";
        Stack<Integer> stack = new Stack<>();

        // chia liên tiếp cho 2 đến khi số thương bằng 0
        while (decimalNum > 0) {
            stack.push(decimalNum % 2);
            decimalNum /= 2;
        }

        // đảo ngược thứ tự của các số trong Stack
        while (!stack.empty()) {
            binaryNum += stack.pop().toString();
        }

        return binaryNum;
    }
}
