//package array;

//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Remove2 {
//    public static void main(String[] args) {
//        int[] arr = {4, 12, 7, 8, 1, 6};
//        System.out.printf("Mảng ban đầu: %s\n", Arrays.toString(arr));
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhập phần tử muốn xóa trong mảng: ");
//        int element = scanner.nextInt();
//        arr = removeElement(element, arr);
//        System.out.printf("Mảng sau khi xóa phần tử: %s", Arrays.toString(arr));
//    }
//
//    public static int[] removeElement(int element, int[] array) {
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (element == array[i]) {
//                index = i;
//                break;
//            }
//        }
//        if (index == -1) {
//            System.out.println("Phần tử bạn muốn xóa không có trong mảng");
//            return array;
//        }
//        for (int i = index; i < array.length - 1; i++) {
//            array[i] = array[i + 1];
//        }
//        int[] newArr = Arrays.copyOf(array, array.length - 1);
//        System.out.printf("Phần tử bạn muốn xóa có trong mảng và nằm tại vị trí %d\n", index);
//        return newArr;
//    }
//}

