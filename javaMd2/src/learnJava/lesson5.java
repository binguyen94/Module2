package learnJava;

import java.util.Scanner;

//Hãy liệt kê các số trong mảng 1 chiều các số thực thuộc đoạn [x, y] cho trước
public class lesson5 {
    static double[] arr = {1.5, 5, 6, 8.5, 9, 2, 12};

    public static void main(String[] args) {
        listArrayKnowXY(arr);
    }

    public static double[] listArrayKnowXY(double[] arr) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhỏ nhất trong đoạn muốn liệt kê x = ");
        x = scanner.nextInt();
        System.out.print("Nhập số lớn nhất trong đoạn muon liệt kê y = ");
        y = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (x <= arr[i] && arr[i] <= y) {
                System.out.print(arr[i] + " ");
            }
        }
        return arr;
    }
}



