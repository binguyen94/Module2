package array;

import java.util.Arrays;

public class FindMinMaxInArray {
    //    public static void main(String[] args) {
//        int []arr = {4, 12, 7, 8, 1, 6, 9};
//        int index = minValue(arr);
//        System.out.println("The smallest element in the array is: " + arr[index]);
//    }
//    public static int minValue(int[] array) {
//        int index = 0;
//        for ( int i = 1; i < array.length; i++){
//            if(array[i] < array[index] ) {
//                index = i;
//            }
//        }
//        return index;
//    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 12, 55, 255, 2, 41, 24};
        System.out.printf("Mảng cho trước : \n%s\n", Arrays.toString(arr));
        minValue(arr);
        System.out.println();
        maxValue(arr);
    }

    public static void minValue(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                minIndex = i;
                min = arr[i];
            }
        }
        System.out.printf("Giá trị nhỏ nhất trong mảng là : %d nằm ở vị trí %d ", min, minIndex);
    }

    public static void maxValue(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.printf("Giá trị lớn nhất trong mảng là : %d nằm ở vị trí %d ", max, maxIndex);
    }
}
