package learnJava.java38;

public class java38Computer {
    private java38Manufacturer manufacturer;
    private java38Date date;
    private double price;
    private int warranty;

    public java38Computer(java38Manufacturer manufacturer, java38Date date, double price, int warranty) {
        this.manufacturer = manufacturer;
        this.date = date;
        this.price = price;
        this.warranty = warranty;
    }

    public java38Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(java38Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public java38Date getDate() {
        return date;
    }

    public void setDate(java38Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public boolean cheaperOtherComputer(java38Computer otherPrice){
        return this.price < otherPrice.price;
    }

    public String getNameNation(){
        return this.manufacturer.getNameNation();
    }
}
