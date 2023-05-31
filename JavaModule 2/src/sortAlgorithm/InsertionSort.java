package sortAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    static double[] list = {5.3, 4.5, 2.5, 7.8, 2.9, 4.8};

    public static void main(String[] args) {
        double[] sortedList = insertionSortArray(list);
        System.out.println(Arrays.toString(sortedList));

    }

    public static double[] insertionSortArray(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
