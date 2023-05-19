package array;

import java.util.Scanner;

public class FileElementInArray {
    //    public static void main(String[] args) {
//        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a name's student:");
//        String input_name = scanner.nextLine();
//        boolean isExist = false;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].equals(input_name)) {
//                System.out.println("Position of the student in the list " + input_name + " is: " + i);
//                isExist = true;
//                break;
//            }
//        }
//        if (!isExist) {
//            System.out.println("Not found" + input_name + " in the list.");
//        }
//    }
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên bạn muốn tìm trong danh sách:  ");
        String name = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i])) {
                System.out.printf("Tên sinh viên %s nằm ở vị trí %d trong danh sach ", name, i);
                return;
            }
        }
        System.out.println("Tên sinh viên ko được tìm thấy");
    }
}
