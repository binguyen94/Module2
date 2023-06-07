package debug.baitap1;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;


    public Triangle ( double side1, double side2, double side3) throws IllegalTriangleException {
        if ( side1 < 0 || side2 < 0 || side3 <= 0){
            throw new IllegalTriangleException (" Cạnh tam giác phải không được bé hơn 0 ");
        }else {
            if ( side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1 ){
                throw new IllegalTriangleException("3 cạnh tam giác không hợp lệ");
            }
        }
    }


}
