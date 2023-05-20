package ex20lesson;

import java.util.Arrays;
import java.util.Scanner;

//Bài 17: Liệt kê các dòng giảm dần trong ma trận
public class lesson18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hàng ma trận muốn khời tạo: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số lượng cột ma trận muốn khời tạo: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
        System.out.printf("Ma trận đã khởi tạo: %s\n", Arrays.deepToString(matrix));
        System.out.println("Liệt kê các dòng giảm dần trong ma trận (dòng đầu gọi là dòng 0):");
        for (int i = 0; i < rows; i++) {
            boolean flag = true;
            for (int j = 0; j < cols - 1; j++) {
                if (matrix[i][j] <= matrix[i][j + 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.printf("- Ma trận có dòng giảm dần nằm ở dòng %d\n", i);
            }

        }
    }
}
