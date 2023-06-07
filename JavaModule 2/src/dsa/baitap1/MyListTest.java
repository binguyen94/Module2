package dsa.baitap1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(3,1);
        myList.add(5);
        myList.add(8);
        myList.add(12);
        myList.add(6);

        MyList cloneList = myList.clone();

        System.out.println(cloneList.get(0));
        System.out.println(cloneList.get(1));
        System.out.println(cloneList.get(2));
        System.out.println(cloneList.get(3));
        System.out.println(cloneList.get(4));
        System.out.println(cloneList.get(5));

        cloneList.remove(1);

        System.out.println(cloneList.get(0));
        System.out.println(cloneList.get(1));
        System.out.println(cloneList.get(2));
        System.out.println(cloneList.get(3));
        System.out.println(cloneList.get(4));
    }
}
