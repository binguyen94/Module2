//package learnJava.java57;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class TaiXiu {
//    public static void main(String[] args) {
//        double taiKhoanNguoiChoi = 5000;
//        Scanner scanner = new Scanner(System.in);
//        int luaChon = 1;
//        do{
//            System.out.println("-------MỜI BẠN LỰA CHỌN-------");
//            System.out.println("Chọn (1) để tiếp tục chơi.");
//            System.out.println("Chọn phím bất kì để thoát. ");
//            luaChon = scanner.nextInt();
//            if(luaChon == 1){
//                System.out.println("---> BẮT ĐẦU CHƠI: ");
//                System.out.println("----> Tài khoản của bạn: " + taiKhoanNguoiChoi +", bạn muốn cược bao nhiêu?");
//                double datCuoc = 0;
//                do{
//                    System.out.println("***** Đặt cược ( 0< số tiền cược <= " + taiKhoanNguoiChoi + ":");
//                    datCuoc = scanner.nextDouble();
//
//                }while (datCuoc <= 0 ||datCuoc > taiKhoanNguoiChoi);
//
//                int luaChonTaiXiu = 0;
//                do{
//                    System.out.println("---- Chọn: 1 <-> Tài hoặc 2 <-> Xỉu");
//                    luaChonTaiXiu = scanner.nextInt();
//
//                } while (luaChonTaiXiu != 1 && luaChonTaiXiu !=2);
//
//                //Tung xúc xắc
//                Random xucXac1 = new Random();
//                Random xucXac2 = new Random();
//                Random xucXac3 = new Random();
//
//                int giaTri1 = xucXac1.nextInt(5) + 1;
//                int giaTri2 = xucXac2.nextInt(5) + 1;
//                int giaTri3 = xucXac3.nextInt(5) + 1;
//                int tong = giaTri1 + giaTri2 + giaTri3;
//
//                //Tính toán kết quả
//
//
//            }
//        }
//    }
//}
