package ex20lesson;

import java.util.Arrays;
import java.util.Scanner;

//Bài 15: Kiểm tra một cột ma trận có giảm dần hay không
public class lesson15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hàng ma trận muốn tạo: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số lượng cột ma trận muốn tạo: ");
        int cols = scanner.nextInt();
        int [][]matrix = new int[rows][cols];
        for ( int i = 0; i < rows; i++){
            for ( int j = 0; j < cols ; j++){
                 matrix[i][j]  = (int) (Math.random() *100 + 1);
            }
        }
        System.out.printf("Ma trận tạo sẵn với kích thước bạn nhập là : %s\n", Arrays.deepToString(matrix));
        System.out.print("Bạn muốn kiểm tra cột nào (tính cột đầu tiên là 0): ");
        int column = scanner.nextInt();
        boolean flag = true;
        for ( int i = 0 ; i < rows-1 ; i++ ){
            if(matrix[i][column] < matrix [i + 1][column]){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.printf("Cột %d là giảm dần",column);
        }else{
            System.out.printf("Cột %d là không giảm dần",column);
        }
    }
}
