package dsa;

import java.util.HashSet;
import java.util.Set;

public class demo {
    public static void main(String[] args) {
        Set<Integer> sets1 = new HashSet<>();
        sets1.add(5);
        sets1.add(7);
        sets1.add(5);       // trung lap roi
        sets1.add(3);
        sets1.add(1);
        sets1.add(-5);
        sets1.add(18);
        sets1.add(20008);

        // vì sao ko dùng fon int cho SET được: vì ko có phương thức sets1.get(i)
        for (Integer x : sets1) {
            System.out.println(x);
        }
    }
}
