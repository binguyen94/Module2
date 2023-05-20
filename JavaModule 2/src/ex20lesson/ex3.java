package ex20lesson;

import java.util.Arrays;

//Bài 3: Đếm số lượng giá trị tận cùng bằng 5 trong mảng
public class ex3 {
    public static void main(String[] args) {
        int[] arr = {31, 23, 35, 45, 13, 25, 55, 65, 23, 55, 55};
        System.out.printf("Mảng : %s\n", Arrays.toString(arr));
        System.out.print("Số lượng giá trị tận cùng bằng 5 trong mảng là : ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isNumberHas5BeHind(arr[i])) {
                count++;
            }
        }
        System.out.print(count);
    }

    public static boolean isNumberHas5BeHind(int number) {
        String numberToString = String.valueOf(number);
        if (Integer.parseInt(String.valueOf(numberToString.charAt(numberToString.length() - 1))) != 5) {
            return false;
        } else {
            return true;
        }
    }
//        return number % 10 == 5;              // cách 2 kiểm tra số tận cuối cùng bằng 5
//    }
}
