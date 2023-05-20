package array;

import java.util.Arrays;
import java.util.Scanner;

public class sumColMatrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng bạn muốn tạo mảng ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột bạn muốn tạo mảng ma trận: ");
        int cols = scanner.nextInt();
        double [][] matrix = new double[rows][cols];
        System.out.println("Nhập các giá trị trong mảng 2 chiều: ");
        for ( int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j ++){
                System.out.printf("- Matrix[%d][%d]: ",i,j);
                matrix[i][j]= scanner.nextDouble();
            }
        }
        System.out.printf("Mảng 2 chiều đã tạo: %s\n", Arrays.deepToString(matrix));
        System.out.print("Bạn muốn tính phần tử của cột nào: ");
        int column = scanner.nextInt();
        double sum = 0;
        for ( int i = 0 ; i< rows ; i++){
            sum += matrix [i] [column];
        }
        System.out.printf("Tổng các phần tử của cột %d là %.2f",column,sum);
    }
}
