package learnJava.java63;

import java.util.ArrayDeque;
import java.util.Deque;

public class ViduDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offer("Nhan1");
        danhSachSV.offer("Nhan2");
        danhSachSV.offer("Nan1");
        danhSachSV.offer("Han1");
        danhSachSV.offerLast("Nhan3");
        danhSachSV.offerFirst("Nhan4");

        while (true){
            String ten = danhSachSV.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
