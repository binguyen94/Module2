package ex20lesson;

import java.util.Arrays;

// Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
public class ex1 {
    public static void main(String[] args) {
        int[] arr = {3515, 1, 54324, 133, 2, 54, 234, 153};
        System.out.printf("Mảng 1 chiều : %s\n", Arrays.toString(arr));
        System.out.print("Các giá trị là số lẻ trong mảng là : ");
        for (int i = 0; i < arr.length; i++) {
            if (checkOddNumber(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static boolean checkOddNumber(int number) {
        String numToString = String.valueOf(number);
        for (int i = 0; i < numToString.length(); i++) {
            if (Integer.parseInt(String.valueOf(numToString.charAt(i))) % 2 == 0) {
                return false;
            }
        }
        return true;
    }
//    public static void oddNumbers(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = true;
//            String changeElementToString = String.valueOf(arr[i]);
//            for (int j = 0; j < changeElementToString.length(); j++) {
//                int a = Integer.parseInt(String.valueOf(changeElementToString.charAt(j)));
//                if (a % 2 == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag == true) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }

}

