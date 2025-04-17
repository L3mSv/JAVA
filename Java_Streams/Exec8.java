/*
 Write a Java program to find the second smallest and largest elements in a list of integers using streams.
*/
import java.util.*;


public class Exec8{
    public static void main(String[] args) {
        {
            List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

            int smallest = list.stream()
                            .min(Comparator.comparingInt(Integer :: intValue))
                            .orElseThrow(() -> new NoSuchElementException("This list is empty!"));

            int secondSmallest = list.stream()
                                .filter(number -> number != smallest)
                                .min(Comparator.comparingInt(Integer :: intValue))
                                .orElseThrow(() -> new NoSuchElementException("This list is empty!"));

            int largest = list.stream()
                            .max(Comparator.comparingInt(Integer :: intValue))
                            .orElseThrow(() -> new NoSuchElementException("This list is empty!"));

            int secondLargest = list.stream()
                                    .filter(number -> number != largest)
                                    .max(Comparator.comparingInt(Integer :: intValue))
                                    .orElseThrow(() -> new NoSuchElementException("This list is empty!"));

        System.out.println("\nThe original list: " + list);
        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Second largest element: " + secondLargest);
        }
    }
}