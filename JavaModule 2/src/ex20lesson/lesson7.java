package ex20lesson;

import java.util.Arrays;

//Hãy liệt kê các vị trí mà giá trị tại đó là số chính phương trong mảng 1 chiều các số nguyên
public class lesson7 {
    static int[] arr = {1, 2, 4, 8, 9, 2, 12};

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu " + Arrays.toString(arr));
        System.out.print("Vị trí mà giá trị tại đó là số chính phương trong mảng 1 chiều các số nguyên : ");
        listPerfectSquareValue(arr);
    }
    public static void listPerfectSquareValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPerfectSquareValue(arr[i])) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPerfectSquareValue(int number) {
        int i = (int) Math.sqrt(number);
        return i * i == number;
    }
}
