/*
Write a Java program to find the maximum and minimum value of an array.
*/
import java.util.*;

public class Exec10{
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 435, 645, 76, 76, 3, 342, 54};
        int minimum = Arrays.stream(array).min().getAsInt();
        int maximum = Arrays.stream(array).max().getAsInt();

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

    }
}