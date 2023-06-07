package learnJava.java31;

import learnJava.java31.java31BillCofffee;

public class java31BillCofffeeMain {
    public static void main(String[] args) {
        java31BillCofffee bill1 = new java31BillCofffee("Trung Nguyên", 150000,2);
        java31BillCofffee bill2 = new java31BillCofffee("Đà Lạt Coffee", 120000,6.5);
        System.out.println("Tổng tiền của bill1 là: " + bill1.totalPrice());
        System.out.println("Tổng tiền của bill2 là: " + bill2.totalPrice());
        System.out.println("Bill này có lớn hơn 3 kg không: " + bill1.checkMassLarger(3));
        System.out.println("Bill này có lớn hơn 3 kg không: " + bill2.checkMassLarger(3));
        System.out.println("Bill này có lớn hơn 500k không: " + bill1.checkTotalPriceLarger500k());
        System.out.println("Bill này có lớn hơn 500k không: " + bill2.checkTotalPriceLarger500k());
        System.out.println("Bill này được giảm giá: " + bill1.disCountWithBillUp500k(10) );
        System.out.println("Bill này được giảm giá: " + bill2.disCountWithBillUp500k(10) );
        System.out.println("Tổng tiền sau khi giảm giá: " + bill1.priceAfterDiscount(10));
        System.out.println("Tổng tiền sau khi giảm giá: " + bill2.priceAfterDiscount(10));

    }
}
