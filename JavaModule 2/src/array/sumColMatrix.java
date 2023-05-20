package array;

import java.util.Scanner;

public class sumColMatrix {
    public static void main(String[] args) {
//        double[][] matrix = {
//                {1.5, 21.4, 3},
//                {4.8, 5.9, 6},
//                {7.9, 8, 9}
//        };
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số cột mảng 2 chiều muốn tạo: ");
        int cols = scanner.nextInt();
        System.out.printf("Nhập số hàng mảng 2 chiều muốn tạo: ");
        int rows = scanner.nextInt();
        System.out.println("Mảng 2 chiều tạo sẵn: ");
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 0 + (99 - 0) * Math.random();
                System.out.printf("[%.2f] ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.print("Bạn muốn tính cột thứ mấy trong mảng: ");
        int column = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][column];
        }
        System.out.printf("Tổng của cột bạn chọn là %.2f", sum);
    }
}





