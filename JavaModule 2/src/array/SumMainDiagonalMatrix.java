package array;

import java.util.Arrays;
import java.util.Scanner;

public class SumMainDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập size của ma trận hình vuông: ");
            size = scanner.nextInt();
            if(size <= 0){
                System.out.println("Kích thước size không hợp lệ");
            }
        }while ( size <= 0);
        double [][] matrix = new double[size][size];
        System.out.println("Ma trận tạo sẵn với size bạn nhập:");
        for ( int i = 0 ; i < size ; i++){
            for ( int j = 0 ; j < size ; j ++){
                matrix [i][j] =  Math.random() * 100 + 1;
                System.out.printf("[%.2f] ", matrix[i][j]);
            }
            System.out.println();
        }
        double sum =0;
        for ( int i = 0 ; i < size ; i++){
            sum += matrix [i] [i];
        }
        System.out.printf("Tổng các phần tử ở đường chéo chính trong ma trận là : %.2f",sum);
    }
}
