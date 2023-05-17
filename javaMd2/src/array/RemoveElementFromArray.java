package array;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6};
        System.out.println("Mảng ban đầu: ");
        showArray(arr);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập phần tử muốn xóa trong mảng:");
        int element = scanner.nextInt();
        for ( int i = 0; i<arr.length; i++){
            if(element == arr[i]){
                System.out.println("Phần tử bạn muốn có trong mảng và nằm tại vị trí " + i );
                int[] newArr = removeElement(element,arr);
                System.out.println("Mảng sau khi xóa phần tử :");
                showArray(newArr);
                break;
            }else if (i == arr.length -1){
                System.out.println("Phần tử bạn muốn xóa khng có trong mảng");
            }
        }

    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static int[] removeElement(int element, int[] array) {
        int[] newArr = new int[array.length];
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                index_del = i;
                break;
            }

        }
        if (index_del == -1) {
            return array;
        }
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index_del) {
                newArr[j] = array[i];
                j++;
            }
        }
        return newArr;
    }


}
