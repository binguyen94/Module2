package learnJava;

public class java30MyDate {
    private int day;
    private int month;
    private int year;

    public java30MyDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }
    public void printDay(){
        System.out.println("Day: " + this.day);
    }
    public void printMonth(){
        System.out.println("Day: " + this.month);
    }
    public void printYear(){
        System.out.println("Day: " + this.year);
    }
    public void printMyDate(){
        System.out.println("MyDate: " + this.day + "-"+ this.month + "-" + this.year);
    }
}
