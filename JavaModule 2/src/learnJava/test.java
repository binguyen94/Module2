package learnJava;

import java.io.CharArrayReader;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        StringBuilder x = new StringBuilder("abc");
        StringBuilder y = new StringBuilder("abc");
        x.append(y);

        System.out.print(x);
    }
}

