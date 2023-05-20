package ex20lesson;

import java.util.Scanner;

// Đếm số nguyên tố trong mảng
public class lesson9 {
    //    static int[] arr = {1, -5, 21, 8, -9, 35, 12};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập size của mảng : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập các phẩn tử cho mảng");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        System.out.println("Số lượng nguyên tố trong mảng là : " + count);
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
