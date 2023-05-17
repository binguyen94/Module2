package learnJava;

import java.util.Arrays;

//Hãy liệt kê các giá trị trong mảng mà thỏa điều kiện lớn hơn giá trị tuyệt đối của giá trị đứng liền sau nó
public class lesson6 {
    static int[] arr = {1, -5, 6, -8, 9, 2, 12};

    public static void main(String[] args) {

        System.out.println("Mảng ban đầu " + Arrays.toString(arr));
        System.out.print("Các giá trị trong mảng mà thỏa điều kiện lớn hơn giá trị tuyệt đối của giá trị đứng liền sau nó : ");
        listValueLargerAbsoluteValueAfter(arr);
    }
    public static void listValueLargerAbsoluteValueAfter( int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > Math.abs(arr[i+1])){
                System.out.println(arr[i] + " ");
            }
        }
    }
}
