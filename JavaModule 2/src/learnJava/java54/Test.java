package learnJava.java54;

public class Test {
    public static void main(String[] args) {
        Sinhvien sv1 = new Sinhvien(101,"Nguyen Thien Anh","Lop5",8.8);
        Sinhvien sv2 = new Sinhvien(102,"Nguyen Thien Han","Lop5",9.9);
        Sinhvien sv3 = new Sinhvien(103,"Nguyen Thien Minh","Lop5",7.7);

        System.out.println(sv1.compareTo(sv2));
    }
}
