package learnJava;

import java.util.Objects;

public class java32myDateMain {
    public static void main(String[] args) {
        java32MyDate myDate = new java32MyDate(14,10,1994);
        java32MyDate myDate1 = new java32MyDate(33, 22,1999);
        //        System.out.println(myDate.getDay());
//        System.out.println(myDate1.getDay());
//        System.out.println(myDate1.getMonth());
//        myDate1.setMonth(12);
//        myDate1.setDay(4);
//        System.out.println(myDate1.getDay());
//        System.out.println(myDate1.getMonth());s
        System.out.println(myDate);
        System.out.println(myDate1);
        System.out.println(myDate);
        System.out.println("So sánh ngày của myDate và myDate1: " + Objects.equals(myDate, myDate));
        System.out.println("So sánh ngày của myDate và myDate2: " + myDate.equals(myDate));
    }
}
