package array;

import java.util.Arrays;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        double[][] matrix = {
                {1.5, 21.4, 3},
                {4.8, 5.9, 6},
                {7.9, 8, 9}
        };
        System.out.printf("Mảng 2 chiều: \n%s\n", Arrays.deepToString(matrix));
        double max = matrix[0][0];
        int rowOfMax = 0;
        int colOfMax = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowOfMax = i;
                    colOfMax = j;
                }
            }
        }
        System.out.printf("Phần tử lớn nhất trong ma trận là %.2f nằm ở matrix[%d][%d] ", max, rowOfMax, colOfMax);
    }
}
