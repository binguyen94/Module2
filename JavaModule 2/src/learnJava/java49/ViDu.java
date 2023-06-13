package learnJava.java49;

import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Nhập vào một chuỗi: ");
        s = scanner.nextLine();
        System.out.println("-------");

        //Hàm length() --> lấy độ dài của chuỗi
        System.out.println(s.length());
        int doDai = s.length();

        //Hàm charAt() -> lấy ra 1 ký tự tại vị trí
        for(int i = 0; i<doDai; i++){
            System.out.println("Vi trí " + i + " là : " + s.charAt(i));
        }

        //Hàm getChars(vtri bat dau,vt ket thuc,mảng,vitri bat dauluu mảng)
        char [] arrChar = new char[100];
        s.getChars(0,4,arrChar,0);
        for(int i =0; i<arrChar.length;i++){
            System.out.println("Giá trị của mảng tại " + i + " là " + arrChar[i]);
        }

        //Hàm getBytes -> có 3 cách, lấy ra giá trị của các ký tự thành 1 mảng.
        byte[] arrBytes = s.getBytes();
        for(byte b : arrBytes){
            System.out.println(b);
        }
    }
}
