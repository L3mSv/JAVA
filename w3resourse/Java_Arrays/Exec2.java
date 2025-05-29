/*
Write a Java program to sum values of an array.
*/
import java.util.*;


public class Exec2{
    public static void main(String[] args) {
        int[] array =  {1, 2, 3, 4};
        int sum = 0;

        for(int num: array)
        {
            sum += num;
        }

        System.out.println("The array: " + Arrays.toString(array));
        System.out.println("Sum: " + sum);
    }
}