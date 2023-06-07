package learnJava.java63;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayInput {
    public static void main(String[] args)
    {
        String obj  = "abcdefgh";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0); // c [abcdefgh]
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 1, 4); // [bcde]
        int i;
        int j;
        try
        {
            while((i = input1.read()) == (j = input2.read()))
            {
                System.out.print((char)i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
