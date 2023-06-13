package testM2.view;

import codegym.model.Customer;
import testM2.service.UserService;
import testM2.utils.FileUtils;
import testM2.utils.ValidateUtils;

import java.util.List;
import java.util.Scanner;

public class UserManager {
    private static final int INPUT_USER_ADD = 1;
    private static final int INPUT_USER_EDIT = 2;
    private Scanner scanner = new Scanner(System.in);
    private List<User> users;

    public UserManager() {

        UserService users = new UserService();
    }


    public void launcher() {
        boolean checkActionMenu;
        do {
            checkActionMenu = true;
            System.out.println("===================================================");
            System.out.println("|| Chào mừng bạn đến với Menu Quản lý Khách hàng ||");
            System.out.println("|| --------------------------------------------- ||");
            System.out.println("|| Nhấn 1: Xem toàn bộ thông tin các User        ||");
            System.out.println("|| Nhấn 2: Thêm User mới                         ||");
            System.out.println("|| Nhấn 3: Sửa User                              ||");
            System.out.println("|| Nhấn 4: Xóa User                              ||");
            System.out.println("===================================================");
            int actionMenu = Integer.parseInt(scanner.nextLine());
            switch (actionMenu) {
                case 1:
                    showUsers(users);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
            boolean repeatMenu;
            do {
                repeatMenu = true;
                System.out.println("Ban có muốn tiếp tục hay không: ");
                System.out.println("Nhập 1. Tiếp tục");
                System.out.println("Nhập 2. Kết thúc");
                int actionMenuContinue = Integer.parseInt(scanner.nextLine());
                switch (actionMenuContinue) {
                    case 1:
                        checkActionMenu = true;
                        repeatMenu = false;
                        break;
                    case 2:
                        checkActionMenu = false;
                        repeatMenu = false;
                        break;
                    default:
                        System.out.println("Không đúng lệnh, vui lòng nhập lại:");
                }
            } while (repeatMenu);
        } while (checkActionMenu);
    }


    private void inputUser(int ACTION, User user) {
        String strACTION = ACTION == INPUT_USER_ADD ? "" : "mới";
        inputNameUser(strACTION, ACTION, user);


        System.out.printf("Chọn giới tính %s của User: \n", strACTION);
        for (Egender e : Egender.values()) {

        }
        String gender = scanner.nextLine();

    }




    public void inputNameUser(String strACTION, int ACTION, User user) {
        if (ACTION == INPUT_USER_ADD) {
            do {
                System.out.printf("Nhập tên %s của User", strACTION);
                String name = scanner.nextLine();
                if (!ValidateUtils.isValidCustomerName(name)) {
                    if (name.equals("")) {
                        break;
                    }
                    System.out.println("Tên không hợp lệ. Tên phải bắt đầu là kí tự và từ 8-20 kí tự, không chứa số");
                } else {
                    user.setName(name);
                    break;
                }
            } while (true);
        }
    }

    public void showUsers(List<User> users) {
        System.out.printf("%-10s | %-20s | %-20s | %-10s | %-10s | %-10s\n",
                "ID", "NAME", "ADDRESS", "GENDER", "DoB");
        for (int i = 0; i < users.size(); i++) {
            User item = users.get(i);
            System.out.printf("%-10s | %-20s | %-20s | %-10s | %-10s | %-10s\n",
                    item.getId(), item.getName(), item.getAddress(), item.geteGender(), item.geteRole(), item.getDob());
        }
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.launcher();
    }


}
