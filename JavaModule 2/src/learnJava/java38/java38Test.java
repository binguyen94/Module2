package learnJava.java38;

import learnJava.java38.java38Computer;
import learnJava.java38.java38Date;
import learnJava.java38.java38Manufacturer;
import learnJava.java38.java38Nation;

public class java38Test {
    public static void main(String[] args) {
        java38Date date1 = new java38Date(10,11,2012);
        java38Date date2 = new java38Date(10,12,2010);
        java38Date date3 = new java38Date(11,11,2012);

        java38Nation nation1 = new java38Nation("A101","Việt Nam");
        java38Nation nation2 = new java38Nation("A102","Lào");
        java38Nation nation3 = new java38Nation("A103","Campuchia");

        java38Manufacturer manu1 = new java38Manufacturer("Asus",nation1);
        java38Manufacturer manu2 = new java38Manufacturer("Dell",nation2);
        java38Manufacturer manu3 = new java38Manufacturer("Samsung",nation3);

        java38Computer computer1 = new java38Computer(manu1,date1,12000000,12);
        java38Computer computer2 = new java38Computer(manu2,date2,13500000,6);
        java38Computer computer3 = new java38Computer(manu3,date3,10000000,10);

        System.out.println("So sánh giá: ");
        System.out.println("-Máy tính 1 < máy tính 2: " + computer1.cheaperOtherComputer(computer2));
        System.out.println("-Máy tính 1 < máy tính 3: " + computer1.cheaperOtherComputer(computer3));

        System.out.println("\nTên hãng:");
        System.out.println("-Máy tính 1: " + computer1.getNameNation());
        System.out.println("-Máy tính 2: " + computer2.getNameNation());
        System.out.println("-Máy tính 3: " + computer3.getNameNation());
    }
}
