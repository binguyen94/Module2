package ex20lesson;

import java.util.Arrays;
import java.util.Scanner;

//Bài 18: Tìm số chẵn đầu tiên trong ma trận
public class lesson17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hàng ma trận muốn khời tạo: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số lượng hàng ma trận muốn khời tạo: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
        System.out.printf("Mảng 2 chiều đã tạo: %s\n", Arrays.deepToString(matrix));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.printf("Số chẵn đầu tiên trong ma trận là: %d nằm ở matrix[%d][%d]", matrix[i][j], i, j);
                    return;
                }
            }
        }
    }

}
