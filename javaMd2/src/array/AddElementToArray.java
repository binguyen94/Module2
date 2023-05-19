package array;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    //    public static void main(String[] args) {
//        int[] arr = {4, 12, 7, 8, 1, 6};
//        int x, index;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số lần chèn ");
//        x = scanner.nextInt();
//        System.out.println("Nhập vị trí index cần chèn số vừa nhập vào mảng");
//        index = scanner.nextInt();
//        if (index <= -1 && index >= arr.length - 1) {
//            System.out.println("Không chèn được phần tử vào mảng");
//        } else {
//            for (int i = 0; i < arr.length; i++) {
//                if (index == i) {
//                    arr[i] = x;
//                }
//            }
//
//        }
//    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6};
        System.out.printf("Mảng ban đầu: %s\n",Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử bạn muốn thêm vào mảng: ");
        int number = scanner.nextInt();
        System.out.print("Nhập vị trí bạn muốn thêm phần tử vừa nhập: ");
        int indexNumber = scanner.nextInt();
        if(indexNumber < 0 || indexNumber > arr.length){
            System.out.println("Vị trí bạn nhập không hợp lệ");
        }else{
            int []newArray = addElementToArray(arr,number,indexNumber);
            System.out.printf("Mảng sau khi thêm phần tử bạn nhập : %s",Arrays.toString(newArray));
        }
    }
    public static int[] addElementToArray(int[] arr, int number, int indexNumber){
        int []newArr = new int[arr.length+1];
        int j = 0;
        for(int i = 0 ;i< arr.length; i++){
            if ( indexNumber == i){
                newArr[j++] = number;
            }
            newArr[j++] = arr[i];
        }
        if(indexNumber == arr.length){
            newArr[j] = number;
            }
            return newArr;
        }
    }

