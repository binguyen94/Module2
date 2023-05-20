package ex20lesson;

import java.util.Arrays;

//Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
public class ex6 {
    public static void main(String[] args) {
        int[] arrA = {4, 12, 5};
        int[] arrB = {123, 43, 2, 123, 42, 12, 4, 52, 5};
        System.out.printf("Mảng A : %s\n", Arrays.toString(arrA));
        System.out.printf("Mảng B : %s\n", Arrays.toString(arrB));
        System.out.println("Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không");
        int count = 0;
        int []arrC = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j] && arrA[i] != arrC[i]) {
                    arrC[i] = arrA[i];
                    count ++;
                }
            }
        }

        if (count == arrA.length ) {
            System.out.println("Câu trả lời là CÓ");
        } else {
            System.out.println("Câu trả lời là KHÔNG");
        }
    }
}

