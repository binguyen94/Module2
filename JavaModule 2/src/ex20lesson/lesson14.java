package ex20lesson;

import java.util.Arrays;
import java.util.Scanner;

//Bài 14: Kiểm tra ma trận 2 chiều có toàn dương hay không
public class lesson14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng ma trận muốn tạo: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột ma trận muốn tạo: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100 + (-10));
            }
        }
        System.out.printf("Mảng 2 chiều đã tạo : %s\n", Arrays.deepToString(matrix));
        System.out.println("Mảng này có toàn số dương hay không?");
        boolean flag = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] <= 0) {
                flag = false;
                break;
                }
            }
        }
        if ( flag ){
            System.out.println("Câu trả lời là CÓ");
        }else{
            System.out.println("Câu trả lời là KHÔNG");

        }
    }
}
