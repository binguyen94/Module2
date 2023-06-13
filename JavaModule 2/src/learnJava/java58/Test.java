package learnJava.java58;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        // Hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for(int i = 0; i< 10; i++){
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Truoc khi chạy for: " + t1);
        System.out.println("Sau khi chạy for: " + t2);
        System.out.println("Thời gian: " + ((t2-t1)/1000) + "s");
        System.out.println("Thời gian: " + ((t2-t1)) + "mls");

        //TimeUnit
        System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 *365) + "s");
        System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");

        //Date
        LocalDate d = LocalDate.now();
        DateTimeFormatter dnow = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d.format(dnow));

        Date d1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(d1));
    }
}
