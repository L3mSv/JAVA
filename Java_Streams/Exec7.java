/*
Write a Java program to find the maximum and minimum values in a list of integers using streams.
*/
import java.util.*;

public class Exec7{
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

        int maximum = list.stream()
                        .max(Comparator.comparingInt(Integer :: intValue))
                        .orElseThrow(() -> new NoSuchElementException("List is empty"));

        int minimum = list.stream()
                        .min(Comparator.comparingInt(Integer :: intValue))
                        .orElseThrow(() -> new NoSuchElementException("List is empty"));

        System.out.println("\nThe original list: " + list);
        System.out.println("\nMaximum value: " + maximum);
        System.out.println("Minimum value: " + minimum);

    }

}