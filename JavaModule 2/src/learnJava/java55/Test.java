package learnJava.java55;

import java.util.Arrays;

public class Test {
    public static int[] reverse(int[] arr){
        int[] newArr = new int[arr.length];
        int index = 0;
        for ( int i = arr.length-1; i>=0; i--){
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] a = new int[]{1, 8, 2, 6, 4, 5, 7, 9};
        int[] b = new int[15];


        System.out.println("Mảng a ban đầu: " + Arrays.toString(a));
        //Hàm sắp xếp tăng dần
        Arrays.sort(a);
        System.out.println("Mảng a sau khi sắp xếp : " +Arrays.toString(a));

        //Hàm tìm kiếm
        System.out.println(Arrays.binarySearch(a,4));
        System.out.println(Arrays.binarySearch(a,-1));

        //Hàm điền giá trị
        Arrays.fill(b,5);
        System.out.println("b sau khi điền giá trị" + Arrays.toString(b));

        //Hàm sắp xếp giảm dần
        Arrays.sort(a);
        a = Test.reverse(a);
        System.out.println("a sau khi giảm dần: " + Arrays.toString(a));

    }
}
