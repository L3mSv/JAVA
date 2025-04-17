/*
Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
*/
import java.util.*;
import java.util.stream.Collectors;

public class Exec6{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("blue", "red", "black", "green", "yellow", "orange", "purple");

        List<String> listSortAscend = list.stream()
                                            .sorted()
                                            .collect(Collectors.toList());

        List<String> listSortDescend = list.stream()
                                            .sorted(Comparator.reverseOrder())
                                            .collect(Collectors.toList());


        System.out.println("\nThe original list: " + list);
        System.out.println("\nlist sorted Ascend: " + listSortAscend);
        System.out.println("list sorted Descend: " + listSortDescend);
    }
}