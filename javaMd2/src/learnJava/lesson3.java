package learnJava;

import java.util.Arrays;

public class lesson3 {
    static int[] list = {3, 9, 6, 8, 9, 2, 12};


    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveNumberToFirstArrays(list, 3)));
    }

    public static int[] moveNumberToFirstArrays(int[] list, int number) {
        int temp = 0;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[j] % number == 0) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    break;
                }
            }
        }
        return list;
    }
}


