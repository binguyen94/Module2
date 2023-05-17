package learnJava;

//Tính trung bình cộng các số dương trong mảng 1 chiều các số thực
public class lesson2 {
    static float[] arr = {1.4f, -5.5f, 6, 8, 9, 2, 12};

    public static void main(String[] args) {
        System.out.println(averagePositiveNumbers(arr));

    }

    public static float averagePositiveNumbers(float[] arr) {
        double average;
        int count = 0;
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sum += arr[i];
                count++;
            }

        }
        average = (float) sum / count;
        return (float) average;
    }
}
