package learnJava;

import java.util.Arrays;

//Hãy xác định số lượng phần tử kề nhau mà cả 2 đều chẵn
public class lesson10 {
    static int[] arr = {1, 5, 6, 8, 9, 2, 12};
    public static void main(String[] args) {
        System.out.println("Mảng : " + Arrays.toString(arr));
        System.out.println("Số lượng phần tử kề nhau mà cả 2 đều chẵn trong mảng là : " + countEvenNeighbors(arr));
    }
    public static int countEvenNeighbors(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
