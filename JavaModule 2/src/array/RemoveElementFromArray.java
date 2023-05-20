package array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6};
        System.out.printf("Mảng ban đầu: %s\n", Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử muốn xóa trong mảng: ");
        int element = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                System.out.printf("Phần tử bạn muốn xóa có trong mảng và nằm tại vị trí %d", i);
                int[] newArr = removeElement(element, arr);
                System.out.printf("\nMảng sau khi xóa phần tử : %s ", Arrays.toString(newArr));
                break;
            } else if (i == arr.length - 1) {
                System.out.println("Phần tử bạn muốn xóa không có trong mảng");
            }
        }

    }

    public static int[] removeElement(int element, int[] array) {
        int[] newArr = new int[array.length];
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                index_del = i;
            }
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index_del) {
                newArr[j] = array[i];
                j++;
            }
        }
        return newArr;
    }
}
