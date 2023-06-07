package learnJava.java63;

import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new PriorityQueue<String>();

        danhSachSV.offer("Nhan1");
        danhSachSV.offer("Han1");
        danhSachSV.offer("Nan1");
        danhSachSV.offer("Nhan2");

        while (true){
            String ten = danhSachSV.poll();
            if (ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
