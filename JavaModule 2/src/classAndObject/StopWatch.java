package classAndObject;

public class StopWatch {
    private long starTime;
    private long endTime;

    public StopWatch (){
        starTime = System.currentTimeMillis();
    }
    public void star() {
        starTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - starTime;
    }
    public long getStarTime() {
        return starTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.star();
        // 10
//        int[] arr = Sort.createArray(100000, 1000, 10);
//        Sort.selectionSort(arr);

        stopWatch.stop();
        System.out.println("Thoi gian da troi qua: " + stopWatch.getElapsedTime());
    }


}
