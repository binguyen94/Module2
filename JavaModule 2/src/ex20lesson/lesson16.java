package ex20lesson;

import java.util.Arrays;
import java.util.Scanner;

//Bài 16: Kiểm tra ma trận có tồn tại số lẻ hay không
public class lesson16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hàng cho ma trận muốn khởi tạo: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số lượng cột cho ma trận muốn khởi tạo: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Nhập phần tử matrix[%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        System.out.printf("Mảng 2 chiều đã tạo: %s\n", Arrays.deepToString(matrix));
        System.out.println("Ma trận có tồn tại số lẻ hay không?");
        boolean flag = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] % 2 != 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) {
            System.out.println("Câu trả lời là KHÔNG");
        } else {
            System.out.println("Câu trả lời là CÓ");
        }
    }
}
