package learnJava;

public class java35Book {
    private String nameBook;
    private double price;
    private int yearBook;
    private java35Author Author;

    public java35Book(String nameBook, double price, int yearBook, java35Author author) {
        this.nameBook = nameBook;
        this.price = price;
        this.yearBook = yearBook;
        Author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

    public java35Author getAuthor() {
        return Author;
    }

    public void setAuthor(java35Author author) {
        Author = author;
    }

    public void printNameBook(){
        System.out.println(this.nameBook);
    }
    public boolean checkYearBook(java35Book otherBook){
        return this.yearBook == otherBook.yearBook;
    }

    public  double priceAfterSale(double x){
        return this.price * (1- x/100);
    }
}
