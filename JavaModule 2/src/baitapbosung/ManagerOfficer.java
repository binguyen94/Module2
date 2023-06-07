package baitapbosung;

import java.util.Arrays;
import java.util.Scanner;

public class ManagerOfficer {
    public Scanner scanner = new Scanner(System.in);
    private Officer[] officers;

    public ManagerOfficer() {
        officers = new Officer[5];

        officers[0] = new Worker(1, "Nhân", 18, "Nam", "26 Tịnh Tâm", 2);
        officers[1] = new Engineer(2, "Nhật", 19, "Nam", "24 Lê Lợi", "Bằng ĐH Tài Chính");
        officers[2] = new Staff(3, "Hiếu", 18, "Nam", "55 Đặng Tất", "lau nhà");
        officers[3] = new Staff(4, "Minh", 19, "Nam", "25 Lê Duẩn", "Quét nhà");
        officers[4] = new Staff(5, "Mai", 20, "Nữ", "28 Tịnh Tâm", "Phục vụ");


        System.out.println("Thêm mới 1 cán bộ");
        System.out.println("Bạn muốn thêm mới cán bộ bộ phận nào: ");
        System.out.println("Nhập 1: Worker");
        System.out.println("Nhập 2: Engineer");
        System.out.println("Nhập 3: Staff");

        int actionMenu = Integer.parseInt(scanner.nextLine());
        String address = null;
        String gender = null;
        String name = null;
        Officer officer = null;
        int age = 0;
        switch (actionMenu) {
            case 1:
                officer = new Worker();
                inputBasicInfo(officer);

                System.out.println("Nhập level: ");
                int level = Integer.parseInt(scanner.nextLine());
                officers = addOfficer(officer);
                break;
            case 2:
                officer = new Engineer();
                inputBasicInfo(officer);
                System.out.println("Nhập bằng cấp: ");
                String branch = scanner.nextLine();

                officers = addOfficer(officer);
                break;
            case 3:
                officer = new Staff();
                inputBasicInfo(officer);
                System.out.println("Nhập công việc: ");
                String task = scanner.nextLine();

                officers = addOfficer(officer);
                break;
        }

    }

    public static void main(String[] args) {
        ManagerOfficer managerOfficer = new ManagerOfficer();

    }

    private void showOffices(Officer[] officers) {
        for (Officer officer : officers) {
            System.out.println(officer);
        }
    }

    private void inputBasicInfo(Officer officer) {
        officer.setId(System.currentTimeMillis());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        officer.setName(name);
        officer.setAge(age);
        officer.setGender(gender);
        officer.setAddress(address);
    }

    private Officer[] addOfficer(Officer officer) {
        Officer[] officersNew = Arrays.copyOf(officers, officers.length + 1);
        officersNew[officers.length - 1] = officer;

        return officersNew;
    }

}
