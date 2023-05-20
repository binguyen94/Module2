package ex20lesson;

import java.util.Arrays;

//Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
public class ex4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 41, 4325, 1, 234, 2, 5};
        System.out.printf("Mảng : %s\n", Arrays.toString(arr));
        System.out.println("Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0 ! ");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isNumberHas0(arr[i])) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("-Câu trả lời là 1");
        } else {
            System.out.println("-Câu trả lời là 0");
        }

    }

    public static boolean isNumberHas0(int number) {
        String numberToString = String.valueOf(number);
        for (int i = 0; i < numberToString.length(); i++) {
            if (Integer.parseInt(String.valueOf(numberToString.charAt(i))) != 0) {
                return false;
            }
        }
        return true;
    }

}
