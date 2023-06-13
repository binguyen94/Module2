package learnJava.java51;

public class ViDu {
    public static void main(String[] args) {
        String s1 = "Hello, Tôi là NTN Hello";
        String s2 = "Hello";
        String s3 = "Hello 123";
        char c1 = 'ô';
        //Hàm indexOf ( -1 ko tìm thấy , tìm thấy >= 0)
        System.out.println("Vị trí của s2 trong s1 là : " + s1.indexOf(s2));
        System.out.println("Vị trí của s3 trong s1 là : " + s1.indexOf(s3));
        System.out.println("Vị trí của s3 trong s1 là : " + s1.indexOf(" "));

        //Su dụng vị trí bắt đầu (tìm chữ hello đầu tiên, fromdex là từ vị trí của s1
        System.out.println("Vị trí của s2 trong s1 là : " + s1.indexOf(s2,0));

        //Tìm kiếm char
        System.out.println("Vị trí của c1 trong s1 là : " + s1.indexOf(c1));

        //Hàm lastIndexOf -> tìm kiếm từ phải sang trái
        System.out.println("Vị trí của s2 trong s1 (từ phải sang trái) là: " + s1.lastIndexOf(s2));

        //tenFile = "Baitap.excel.lop.xls";
    }
}
