package learnJava;

import java.util.Arrays;

// Đảo ngược mảng ban đầu
public class lesson4 {
    static int[] arr = {1, 5, 6, 8, 9, 2, 12};

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu : \n" + Arrays.toString(arr));
        System.out.println("Mảng sau khi đảo ngược: \n" + Arrays.toString(reverseArray(arr)));
    }
    public static int[] reverseArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length/2  ; i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}



