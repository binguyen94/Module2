package learnJava;

public class java31BillCofffee {
    private String nameCf ;
    private double priceOneKg;
    private  double mass;

    public java31BillCofffee ( String nameCf , double priceOnekg , double mass ){
        this.nameCf = nameCf;
        this.priceOneKg = priceOnekg;
        this.mass = mass;
    }
    public double totalPrice() {
        return this.priceOneKg * this.mass;
    }
    public boolean checkMassLarger(double mass){
        return this.mass > mass;
    }
    public boolean checkTotalPriceLarger500k(){
        return this.totalPrice()> 500000;
    }
    public double disCountWithBillUp500k(double x){
        if (this.totalPrice()>500000){
            return (x/100) * this.totalPrice();
        }else{
            return 0;
        }
    }
    public  double priceAfterDiscount(double x){
        return this.totalPrice() - this.disCountWithBillUp500k(x);
    }

}
