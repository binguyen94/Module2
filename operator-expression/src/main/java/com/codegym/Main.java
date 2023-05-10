package com.codegym;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);   //Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat();    //Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat();   //Nhập chiều dài
        float area = width * height;

        System.out.println("Area is: " + area);
    }
}