package ex20lesson;

import java.util.Arrays;

//Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố trong mảng 1 chiều các số nguyên
public class ex2 {
    public static void main(String[] args) {
        int[] arr = {1, 42, 5, 23, 3, 5, 7, 71, 81, 91};
        System.out.printf("Mảng : %s\n", Arrays.toString(arr));
        System.out.print("Các vị trí có giá trị là số nguyên tố trong mảng : ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
