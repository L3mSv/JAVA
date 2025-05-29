/*
Write a Java program to find duplicate values in an array of integer values.
*/
import java.util.*;

public class Exec12{
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 4, 5, 6};
        boolean duplicate = false;

        for(int i = 1; i < array.length; ++i)
        {
            if(array[i] == array[i - 1])
                duplicate = true;
        }

        System.out.println("The array: " + Arrays.toString(array));

        if(duplicate)
        {
            System.out.println("\nThe list have duplicates values");
        }
        else
            System.err.println("\nThe list haven't duplicates values");
    }
}