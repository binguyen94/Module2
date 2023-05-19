package array;

import java.util.Scanner;

public class FindMaxElement {
//        public static void main(String[] args) {
//        int size;
//        int[] array;
//        Scanner scanner = new Scanner(System.in);
//        do {
//            System.out.println("Enter a size:");
//            size = scanner.nextInt();
//            if ( size > 20)
//                System.out.println("Size should not exceed 20");
//        } while (size > 20);
//        array = new int[size];
//        int i = 0;
//        while (i < array.length) {
//            System.out.println("Enter element" + (i + 1) + " : ");
//            array[i] = scanner.nextInt();
//            i++;
//        }
//        int max = array[0];
//        int index = 1;
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] > max) {
//                max = array[j];
//                index = j + 1;
//            }
//        }
//        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số lượng kho lưu trữ tài sản: ");
        int size = scanner.nextInt();
        if (size > 20) {
            System.out.println("Xin lỗi, tối đa chỉ được 20 kho!");
            return;
        }
        int maxAsset = 0;       //nên dùng maxAsset = Integer.MIN_VALUE
        int indexMaxAsset = -1;
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập vào tài sản kho vị trí %d : ", i);
            int asset = scanner.nextInt();
            while (asset < 0) {
                System.out.println("Tài sản bạn vừa nhập không hợp lệ! Xin hãy nhập lại. ");
                System.out.printf("Nhập vào tài sản kho vị trí  %d : ", i);
                asset = scanner.nextInt();
            }
            if (asset > maxAsset) {
                maxAsset = asset;
                indexMaxAsset = i;
            }
        }
            System.out.printf("Giá trị tài sản lớn nhất của kho lưu trữ là %d nằm ở vị trí %d", maxAsset, indexMaxAsset);
        }
    }


