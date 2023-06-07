package learnJava.java36;

import learnJava.java36.java36Date;
import learnJava.java36.java36Manufacturer;
import learnJava.java36.java36Movie;

public class java36Test {
    public static void main(String[] args) {
        java36Date day1 = new java36Date(11, 11, 2011);
        java36Date day2 = new java36Date(12, 11, 2011);
        java36Date day3 = new java36Date(13, 11, 2011);

        java36Manufacturer manu1 = new java36Manufacturer("Mavel", "USA");
        java36Manufacturer manu2 = new java36Manufacturer("Fox", "UK");
        java36Manufacturer manu3 = new java36Manufacturer("DC", "UK");

        java36Movie movie1 = new java36Movie("IronMan", 1994, manu1, 45000, day1);
        java36Movie movie2 = new java36Movie("FunnyMan", 1995, manu2, 55000, day2);
        java36Movie movie3 = new java36Movie("BatMan", 1990, manu3, 40000, day3);

        System.out.println("Giá vé movie1 rẻ hơn vé movie2: " + movie1.priceCheaperOtherPhim(movie2));
        System.out.println("Giá vé movie1 rẻ hơn vé movie3: " + movie1.priceCheaperOtherPhim(movie3));

        System.out.println("Tên hãng sản xuất movie1: " + movie1.getNameManu());
        System.out.println("Tên hãng sản xuất movie2: " + movie2.getNameManu());
        System.out.println("Tên hãng sản xuất movie3: " + movie3.getNameManu());

        System.out.println("Giá vé phim movie1 sau khi giảm 10%: " + movie1.priceAfterSale(10));
        System.out.println("Giá vé phim movie2 sau khi giảm 20%: " + movie2.priceAfterSale(20));
        System.out.println("Giá vé phim movie3 sau khi giảm 30%: " + movie3.priceAfterSale(30));
    }
}
