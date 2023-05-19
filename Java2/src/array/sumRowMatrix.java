package array;

import java.util.Arrays;
import java.util.Scanner;

public class sumRowMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.5, 21.4, 3},
                {4.8, 5.9, 6},
                {7.9, 8, 9}
        };
        System.out.printf("Mảng 2 chiều: \n%s\n ", Arrays.deepToString(matrix));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn tính tổng của cột mấy: ");
        int rowSum = scanner.nextInt();

        }
    }



