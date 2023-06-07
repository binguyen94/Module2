package learnJava.java36;

public class java36Movie {
    private String nameMovie;
    private int yearBorn;
    private java36Manufacturer manufacturer;
    private double priceTicket;
    private java36Date date;

    public java36Movie(String nameMovie, int yearBorn, java36Manufacturer manufacturer, double priceTicket, java36Date date) {
        this.nameMovie = nameMovie;
        this.yearBorn = yearBorn;
        this.manufacturer = manufacturer;
        this.priceTicket = priceTicket;
        this.date = date;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public java36Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(java36Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    public java36Date getDate() {
        return date;
    }

    public void setDate(java36Date date) {
        this.date = date;
    }

    public boolean priceCheaperOtherPhim(java36Movie priceOtherMovie){
        return this.priceTicket < priceOtherMovie.priceTicket ;
    }

    public String getNameManu(){
        return this.manufacturer.getNameManufacturer();
    }

    public double priceAfterSale(double x){
        return this.priceTicket * (1-x/100);
    }
}
