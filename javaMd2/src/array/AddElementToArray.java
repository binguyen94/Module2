package array;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6};
        int x, index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lần chèn ");
        x = scanner.nextInt();
        System.out.println("Nhập vị trí index cần chèn số vừa nhập vào mảng");
        index = scanner.nextInt();
        if (index <= -1 && index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (index == i) {
                    arr[i] = x;
                }
            }

        }

    }
}
