package ex20lesson;

import java.util.Arrays;

//Đếm số dương chia hết cho 7 trong mảng
public class lesson8 {
    static int[] arr = {1, -5, 21, 8, -9, 35, 12};

    public static void main(String[] args) {
        System.out.println("Mảng cho trước : \n" + Arrays.toString(arr));
        System.out.println("Số lượng số dương trong mảng chia hết cho 7 là : " +  countPositiveNumbersDivisibleBy7(arr));
    }
    public static int countPositiveNumbersDivisibleBy7 (int [] arr){
        int count = 0;
        for ( int i = 0; i < arr.length; i++){
            if ( arr[i] >= 0 && arr[i]%7 == 0){
                count ++;
            }
        }
        return count;
    }
}
