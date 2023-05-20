package ex20lesson;

import java.util.Arrays;
import java.util.Scanner;

//Bài 19: Tìm số chẵn lớn nhất trong ma trận
public class lesson19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hàng của ma trận muốn khởi tạo: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số lượng cột của ma trận muốn khởi tạo: ");
        int cols = scanner.nextInt();
        int [][] matrix = new int[rows][cols];
        for ( int i = 0; i < rows ; i++){
            for ( int j = 0 ; j < cols ; j ++){
                matrix[i][j] = (int) ( Math.random()*100 + 1);
            }
        }
        System.out.printf("Ma trận đã khởi tạo : %s\n", Arrays.deepToString(matrix));
        System.out.println("Tìm số chẵn lớn nhất trong ma trận: ");
        int maxEven = -1;    // int maxEven = Integer.MIN_VALUE
        int rowMaxEven = -1;
        int colMaxEven = -1;
        for ( int i = 0 ; i < rows ; i++){
            for ( int j = 0; j< cols; j ++){
                if(matrix[i][j]%2 ==0 && matrix[i][j] > maxEven){
                    maxEven = matrix[i][j];
                    rowMaxEven = i;
                    colMaxEven = j;
                }
            }
        }
        if(maxEven != -1 ){
            System.out.printf("- Số chẵn lớn nhất trong ma trận là %d nằm ở matrix[%d][%d]",maxEven,rowMaxEven,colMaxEven);
        }else{
            System.out.println("- Ma trận không có số chẵn nào cả");
        }

    }
}
