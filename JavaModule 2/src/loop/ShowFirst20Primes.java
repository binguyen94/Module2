package loop;

import java.util.Scanner;



public class ShowFirst20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nguyên tố cần in ra màn hình: ");
        int size = scanner.nextInt();
//        int num = 2;
//        int count = 0;
//        while (count < size) {
//            if (isPrime(num)) {
//                System.out.print(num + " ");
//                count++;
//            }
//            num++;
//        }
        int count = 0;
        for ( int num= 2;  count < size ; num++){
            if ( isPrime(num)){
                System.out.print( num + " ");
                count++;
            }
        }
    }
        public static boolean isPrime ( int number){
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

