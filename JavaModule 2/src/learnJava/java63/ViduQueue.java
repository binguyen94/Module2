package learnJava.java63;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();

        danhSachSV.offer("Nhan1");
        danhSachSV.offer("Nhan2");
        danhSachSV.offer("Nhan3");
        danhSachSV.offer("Nhan4");

        while (true){
            String ten = danhSachSV.poll();
            if(ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
