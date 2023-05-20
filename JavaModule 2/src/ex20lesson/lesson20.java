package ex20lesson;

import java.util.Arrays;
import java.util.Scanner;

//Bài 20: Liệt kê các dòng có tổng lớn nhất
public class lesson20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;
        do {
            System.out.print("Nhập số lượng hàng của ma trận muốn khởi tạo: ");
            rows = scanner.nextInt();
            if (rows <= 0) {
                System.out.print("Số lượng hàng phải lớn hơn 0, xin hãy nhập lại!\n");
            }
        } while (rows <= 0);
        do {
            System.out.print("Nhập số lượng cột của ma trận muốn khởi tạo: ");
            cols = scanner.nextInt();
            if (cols <= 0) {
                System.out.print("Số lượng cột phải lớn hơn 0, xin hãy nhập lại!\n");
            }
        } while (cols <= 0);
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
        System.out.println("Ma trận đã khởi tạo: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("[%d] ", matrix[i][j]);
            }
            System.out.println();
        }
//        System.out.printf("Ma trận đã khởi tạo : %s\n", Arrays.deepToString(matrix));
        System.out.println("Liệt kê các dòng có tổng lớn nhất (tính từ dòng đầu là dòng 0): ");
        int maxSum = -1;
        int count = 0;
        int[] rowMaxArray = new int[rows];
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
                if (sum > maxSum) {
                    maxSum = sum;
                    rowMaxArray[0] = i;
                    count = 1;
                } else if (sum == maxSum) {
                    rowMaxArray[count] = i;
                    count++;

                }
            }
        }
        System.out.printf("Dòng có tổng lớn nhất (%d) là:\n ", maxSum);
        for (int i = 0; i < count; i++) {
            System.out.printf("-Dòng %d\n", rowMaxArray[i]);
        }
    }
}
