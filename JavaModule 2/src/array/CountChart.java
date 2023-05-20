package array;

import java.util.Scanner;

public class CountChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi: ");
        String str = scanner.nextLine();
        System.out.println("Bạn muốn đếm ký tự nào");
        char chart = scanner.next().charAt(0);
        int count = 0;
        for ( int i = 0; i < str.length() ; i++){
            if(chart == str.charAt(i)){
                count ++;
            }
        }
        System.out.printf("Số lần xuất hiện của ký thự '%s' là %d lần",chart,count);
    }
}
