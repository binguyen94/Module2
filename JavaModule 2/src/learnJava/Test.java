package learnJava;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Test a1 = new Test();
        Test a2 = new Test(2, 2);
        Test a3 = new Test(4, 6, 5);
        System.out.println(a1.x + " , " + a1.y + " , " + a1.z);
        System.out.println(a2.x + " , " + a2.y + " , " + a2.z);
        System.out.println(a3.x + " , " + a3.y + " , " + a3.z);
    }
    public int x, y, z;
    public Test() {
       this.x = 1;
       this.y = 2;
       this.z = 5;
    } // Hàm khởi tạo ko tham số
    public Test(int x, int y) {
//        this(1, 2, 3);
        this.x = 2;
        this.y = 4;
        this.z = 3;
    }
    public Test(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
