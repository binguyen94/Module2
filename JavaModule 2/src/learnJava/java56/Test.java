package learnJava.java56;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "Hello, tôi là NTN";

        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        String s2 = "Hello, Tôi là lập trình viên";
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));

        String s3 = "Nguyen Thien Nhan";
        String[] d = s3.split(" ");
        for(String world : d){
            System.out.println(world);
        }
        System.out.println(Arrays.toString(d));
        System.out.println("Tên: " + d[d.length-1]);
    }
}
