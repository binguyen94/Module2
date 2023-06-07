package dsa.thuchanh1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
            listInteger.add(1);
            listInteger.add(2);
            listInteger.add(3);
            listInteger.add(3);
            listInteger.add(4);
        System.out.println("Phần tử thu 4: " + listInteger.get(4));
        System.out.println("Phần tử thứ 1: " + listInteger.get(1));
        System.out.println("Phần tử thứ 2: " + listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("element 6: " +listInteger.get(6));
        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
