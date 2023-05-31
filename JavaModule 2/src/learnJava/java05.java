package learnJava;


import java.text.DecimalFormat;

public class java05 {
    public static void main(String[] args) {
        String fullName = "Nguyễn Thiện Nhân ";
        int old = 18;
        float money = 250000000;
        boolean single = true;
        char codepromo = 'B';

        DecimalFormat formatter = new DecimalFormat("###,###");
        String moneyFomatted = formatter.format(money).replace(",",".");

        System.out.println(" Họ và tên: " + fullName);
        System.out.println(" Tuổi: " + old);
        System.out.println(" Số tiền hiện có trong ví: " + moneyFomatted + " VND");
        System.out.println(" Độc thân: " + single);
        System.out.println(" Biệt danh: " + codepromo);
    }



}
