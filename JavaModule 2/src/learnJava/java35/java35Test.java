package learnJava.java35;

import learnJava.java35.java35Author;
import learnJava.java35.java35Book;
import learnJava.java35.java35Date;

public class java35Test {
    public static void main(String[] args) {
        java35Date day1 = new java35Date(11,11,2011);
        java35Date day2 = new java35Date(20,11,2022);
        java35Date day3 = new java35Date(14,12,2022);

        java35Author author1 = new java35Author("NTN",day1);
        java35Author author2 = new java35Author("Nhan",day2);
        java35Author author3 = new java35Author("Bi",day3);

        java35Book book1 = new java35Book("Sách Lập Trình",35000,1994,author1);
        java35Book book2 = new java35Book("Sách Khoa Học",50000,1995,author2);
        java35Book book3 = new java35Book("Sách Giáo Dục",100000,1995,author3);

        book1.printNameBook();
        book2.printNameBook();
        book3.printNameBook();

        System.out.println("So sánh book1 và book3 : " + book1.checkYearBook(book3));
        System.out.println("So sánh book2 và book3 : " + book2.checkYearBook(book3));

        System.out.println("Sách 1 giảm 10%: " + book1.priceAfterSale(10));
        System.out.println("Sách 2 giảm 50%: " + book2.priceAfterSale(50));
        System.out.println("Sách 3 giảm 30%: " + book3.priceAfterSale(30));

    }
}
