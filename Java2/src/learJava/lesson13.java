package learJava;

import java.util.Arrays;

//Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
public class lesson13 {
    public static void main(String[] args) {
        int[] arrA = {2, 4, 5, 6, 8};
        int[] arrB = {2, 4, 7, 9, 5, 6, 8};
        System.out.printf("Mảng A : %s\n", Arrays.toString(arrA));
        System.out.printf("Mảng B : %s\n", Arrays.toString(arrB));
        System.out.println("Hãy cho biết tất cả các phần tử trong mảng A có nằm trong mảng B không?");
//        boolean isAllAInB = true;
//        for (int i = 0; i < arrA.length; i++) {
//            boolean isInB = false;
//            for (int j = 0; j < arrB.length; j++) {
//                if (arrA[i] == arrB[j]) {
//                    isInB = true;
//                    break;
//                }
//            }
//            if(!isInB){
//                isAllAInB = false;
//                break;
//            }
//        }
//        if(isAllAInB){
//            System.out.println("Câu trả lời là: Có");
//        }else{
//            System.out.println("Câu trả lời là: Không");
//        }
        int count = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {
                    count++;
                }
            }

        }
        if (count == arrA.length) {
            System.out.println("Có");
        } else {
            System.out.println("Không");
        }
    }
}
