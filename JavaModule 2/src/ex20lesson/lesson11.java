package ex20lesson;

import java.util.Arrays;
import java.util.Scanner;

//Kiểm tra mảng có đối xứng không? Có trả về 1, không có trả về 0
public class lesson11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2,};
        System.out.printf("Mảng 1 chiều: %s\n", Arrays.toString(arr));
        System.out.println("Kiểm tra mảng có đối xứng không? Có trả về 1, không có trả về 0");
//        boolean isSymmetric = true;
        for (int i = 0, j = arr.length - 1; i < j ; i++, j--){
            if ( arr[i] != arr[j]){
//                isSymmetric = false;
                System.out.println("Câu trả lời là 0");
                return;
            }
        }
        System.out.println("Câu trả lời là 1");

//         if (isSymmetric){
//             System.out.println("Câu trả lời là 1");
//         }else{
//             System.out.println("Câu trả lời là 0");
//         }
    }

}
