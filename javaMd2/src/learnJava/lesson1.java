package learnJava;
// Tính tổng các giá trị lớn hơn giá trị đứng liền trước nó trong mảng 1 chiều các số thực
public class lesson1 {
    static int[] arr={1, 5, 6, 8, 9, 2, 12};

    public static void main(String[] args) {
        System.out.println(sumBehindValuesLargerFirstValue(arr));

    }
    public static int sumBehindValuesLargerFirstValue(int[] arr) {
        int sum = 0;
        for ( int i = 1; i < arr.length ; i++){

            if ( arr[i] > arr[i-1]){
                sum += arr[i];
            }
        }
        return sum;
    }
}
