/*
Write a Java program to reverse an array of integer values.
*/
import java.util.*;

public class Exec11{
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arrayReverse = new int[array.length];

        int count = array.length - 1;
        for(int i = 0; i < array.length; ++i)
        {
            arrayReverse[count--] = array[i];
        }

        System.out.println("The reverse array: " + Arrays.toString(arrayReverse));
    }
}