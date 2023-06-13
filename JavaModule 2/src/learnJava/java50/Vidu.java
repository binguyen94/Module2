package learnJava.java50;

public class Vidu {
    public static void main(String[] args) {
        String s1 = "nhan.vn";
        String s2 = "NHAN.vn";
        String s3 = "nhan.vn";

        //Hàm equals -> so sánh 2 chuỗi giống nhau, có phân biệt chữ hoa thường
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        //Hàm equalsIgnoreCase -> k phân biệt hoa thường
        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));

        //Nếu so sánh mật khẩu khi đăng nhập user thì dùng
        // ignoreCase hay euqals thôi ?
        // Theo mình sẽ dùng equals

        //Hàm compareTo -> so sánh >  < =
        String sv1 = "Nguyễn Thiện A";
        String sv2 = "Nguyễn Thiện B";
        String sv3 = "Nguyễn Thiện ";
        String sv4 = "Nguyễn Thiện A";

        System.out.println("sv1 compareTo sc2: " + sv1.compareTo(sv2));
        System.out.println("sv1 compareTo sc3: " + sv1.compareTo(sv3));
        System.out.println("sv1 compareTo sc4: " + sv1.compareTo(sv4));

        // Hàm compareToIgnoreCase -> Tương tự compareTo, ko phân biệt hoa thường
        String sv5 = "Nguyễn Thiện A";
        String sv6 = "Nguyễn Thiện a";
        String sv7 = "Nguyễn Thiện ";
        String sv8 = "Nguyễn Thiện A";

        System.out.println("sv5 compareTo sc6: " + sv5.compareToIgnoreCase(sv6));
        System.out.println("sv5 compareTo sc7: " + sv5.compareToIgnoreCase(sv7));
        System.out.println("sv5 compareTo sc8: " + sv5.compareToIgnoreCase(sv8));

        //Hàm regionMatches -> so sánh 1 đoạn
        String r1 = "Nhan.vn";
        String r2 = "Nan.n";
        boolean check = r1.regionMatches(2,r2,1,2);
        System.out.println(check);

        //0934 122 123
        //0708 122 345

        //Hàm starWith --> Hàm kiểm tra chuỗi bắt đầu bằng...
        String sdt = "0344361094";
        System.out.println(sdt.startsWith("034"));
        System.out.println(sdt.startsWith("037"));

        //Hàm endWith --> Hàm kiểm tra chuỗi bắt đầu bằng...
        String tenFile1 = "I love you.JPG";
        String tenFile2 = "Hoc.PDF";

        if(tenFile1.endsWith(".JPG")){
            System.out.println("File 1 là đuôi JPG");
        } else if (tenFile1.endsWith(".PDF")) {
            System.out.println("File 1 là đuôi PDF");
        }
        if(tenFile2.endsWith(".JPG")){
            System.out.println("File 2 là đuôi JPG");
        } else if (tenFile2.endsWith(".PDF")) {
            System.out.println("File 2 là đuôi PDF");
        }
    }
}
