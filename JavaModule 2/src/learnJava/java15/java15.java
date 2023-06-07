package learnJava.java15;

import java.util.Scanner;

public class java15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bạn muốn kiểm tra chẵn hay lẻ: ");
        int numb = scanner.nextInt();

        String result = (numb%2 == 0)?" là số chẵn " :  " là số lẻ" ;
        System.out.println(numb + result);
    }
}
