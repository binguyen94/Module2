package com.codegym;

import static javafx.scene.input.KeyCode.B;
import static javax.print.attribute.standard.MediaSizeName.A;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i < 5) {
            if (i % 3 != 0) {
                i++;
                continue;
            }
            System.out.println("Hello");
            i++;
        }

    }
}
