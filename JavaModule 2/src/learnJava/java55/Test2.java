package learnJava.java55;

import learnJava.java54.Sinhvien;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien(101,"Nguyen Thien Han","Lop5",8.8);
        Sinhvien sv2 = new Sinhvien(102,"Nguyen Thien Anh","Lop5",9.9);
        Sinhvien sv3 = new Sinhvien(103,"Nguyen Thien Minh","Lop5",7.7);

        Sinhvien[] svs = new Sinhvien[]{sv1,sv2,sv3};
        System.out.println("Ban đầu: " + Arrays.toString(svs));
        Arrays.sort(svs);
        String a = Arrays.toString(svs);
        System.out.println("Sau khi sxep: " + a);

        int b = Arrays.binarySearch(svs,sv3);
        System.out.println(b);
    }
}
