package ex20lesson;

import java.util.Arrays;

//Bài 5: Kiểm tra mảng có giảm dần hay không
public class ex5 {
    public static void main(String[] args) {
        int[] arr = {45, 12, 6, 4, 2, 1};
        System.out.printf("Mảng : %s\n", Arrays.toString(arr));
        if (isDecrease(arr)) {
            System.out.println("Đây là mảng giảm dần");
        } else {
            System.out.println("Đây ko phải là mảng giảm dần");
        }

    }

    public static boolean isDecrease(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
