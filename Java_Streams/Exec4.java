/*
 Write a Java program to remove all duplicate elements from a list using streams.
*/
import java.util.*;
import java.util.stream.Collectors;

public class Exec4{
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 5, 6, 7);

        List<Integer> listWithoutDuplicate = list.stream()
                                                .distinct()
                                                .collect(Collectors.toList());


        System.out.println("\nThe original list: " + list);
        System.out.println("\nthe list without duplicates: " + listWithoutDuplicate);
    }
}