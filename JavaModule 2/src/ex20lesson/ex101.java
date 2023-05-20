package ex20lesson;

import java.lang.reflect.Array;
import java.util.Arrays;

// Hãy liệt kê các giá trị có toàn chữ số chẵn trong mảng 1 chiều các số nguyên
public class ex101 {

    public static void main(String[] args) {
        int[] arr = {33, 12, 34, 53, 44, 68, 246, 213};
        System.out.printf("Mảng 1 chiều : %s ", Arrays.toString(arr));
        System.out.print("Các giá trị có toàn chữ số chẵn trong mảng 1 chiều các số nguyên trên là : ");
        for (int i = 0; i < arr.length ; i++){
            if ( isEvenNumber(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static boolean isEvenNumber(int number){
        String numberToString = String.valueOf(number);
        for ( int i = 0 ; i< numberToString.length(); i++){
            if ( Integer.parseInt(String.valueOf(numberToString.charAt(i)))%2 != 0){
                return false;
            }
        }
        return true;
    }
}

