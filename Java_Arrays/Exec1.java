/*
 Write a Java program to sort a numeric array and a string array.
*/
import java.util.*;

public class Exec1{
    public static void main(String[] args)
    {
        int[] arrayNum = {1, 432, 54, 0, 2};
        String[] arrayString = {"carro", "zebra", "tornado", "planeta"};

        Arrays.sort(arrayNum);
        Arrays.sort(arrayString);

        System.out.println(Arrays.toString(arrayNum));
        System.out.println(Arrays.toString(arrayString));
    }
}