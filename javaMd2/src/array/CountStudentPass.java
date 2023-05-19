package array;

import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Nhập số lượng sinh viên trong danh sách");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Số lượng sinh viên ko vượt quá 30");
            }
        } while (size > 30);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập số điểm cho sinh viên %d :", i + 1);
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.printf("Số lượng sinh viên đậu trong danh sách là : %d", count);
    }
}
