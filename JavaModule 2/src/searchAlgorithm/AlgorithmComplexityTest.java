package searchAlgorithm;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String inputString = scanner.nextLine();
        int[] frequenChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            frequenChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequenChar[j] > max) {
                max = frequenChar[j];
                character = (char) j;
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất là : " + character + " với " + max + "lần");
    }

}

