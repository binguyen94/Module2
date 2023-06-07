package learnJava.java27;

import java.util.Scanner;

//Vi dụ Array
public class java27a {
    public static void main(String[] args) {
        double[] arr1;
        arr1 = new double[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử cho mảng 1");
            arr1[i] = scanner.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];

        }
        System.out.println("Tổng của giá trị vừa cho trong mảng 1 là " + sum);
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

}
