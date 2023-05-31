package sortAlgorithm;

import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 7, 3, 6};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println("Array after iteration " + i + ": " + Arrays.toString(arr));
        }
    }
}
