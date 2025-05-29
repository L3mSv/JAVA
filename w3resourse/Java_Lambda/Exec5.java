/*
Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface SortList{
    List<String> sort(List<String> list);
}

public class Exec5{
    public static void main(String[] args){

        List<String> list1 = Arrays.asList("a", "c", "b", "v", "e", "w", "t", "y");

        SortList listSorted = (list) -> list.stream().sorted().collect(Collectors.toList());

        List<String> sortedList = listSorted.sort(list1);
        System.out.println("Sorted list: " + sortedList);
    }
}