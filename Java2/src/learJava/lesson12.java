package learJava;

import java.util.Arrays;

//Kiểm tra mảng có tăng dần hay không
public class lesson12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.printf("Mảng 1 chiều: %s\n", Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Mảng này ko tăng dần");
                return;
            }
        }
        System.out.println("Mảng này tăng dần");
    }
}

