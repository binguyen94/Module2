package learnJava.java62;

import java.util.Scanner;
import java.util.Stack;

public class java62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<>();
        System.out.print("Nhập vào một chuỗi: ");
        String s = scanner.nextLine();
        for(int i = 0; i < s.length(); i++){
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("Chuỗi đảo ngược: ");
        for(int i = 0; i < s.length();i++){
            System.out.print(stackChuoi.pop());
        }
        System.out.println();

        //Ví dụ chuyển từ hệ thập phân sang nhị phân

        Stack<String> stackSoDu = new Stack<>();
        System.out.print("Nhập 1 số nguyên dương từ bàn phím: ");
        int x = Integer.parseInt(scanner.nextLine());
        while (x > 0){
            int soDu = x% 2;
            System.out.println(soDu);
            stackSoDu.push(soDu +"");
            x = x/2;
        }
        System.out.print("Số nhị phân là: ");
        int n = stackSoDu.size();
        for(int i =0; i<n; i++){
            System.out.print(stackSoDu.pop());
        }
    }
}
