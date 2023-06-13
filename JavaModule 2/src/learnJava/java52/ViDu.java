package learnJava.java52;

public class ViDu {
    public static void main(String[] args) {
        String s1 = "Nhan";
        String s2 = ".vn";
        String s3 = s1 + s2;
        //Hàm concat -> nối chuỗi
        String s4 = s1.concat(s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        //Hàm replace -> thay thế
        String s5 = "Nhan.vn";
        String s6 = s5.replaceAll("Nhan", "Minh");
        System.out.println("s6 = " + s6);

        //toLowerCase -> chuyển về viết thường
        //toLowerCase -> chuyển về viết hoa
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println(s7);
        System.out.println(s8);

        //trim() -> xóa khoảng trắng thừa ở đầu cuối chuỗi
        String s9 = "    Hello NTN     ";
        System.out.println(s9);
        System.out.println(s9.trim());

        //subString -> cắt chuỗi con
        String s10 = "Hello NTN";
        String s11 = s10.substring(6);
        String s12 = s10.substring(6,7);
        System.out.println(s11);
        System.out.println(s12);

    }
}
