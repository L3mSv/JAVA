/*
Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
*/
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;


interface FilterOddOrEven{
    List<Integer> filter(List<Integer> list);
}

public class Exec4{
    public static void main(String[] args) {
        
        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        FilterOddOrEven filterEven = (list) -> list.stream().filter(num -> num%2 == 0).collect(Collectors.toList());
        FilterOddOrEven filterOdd = (list) -> list.stream().filter(num -> num%2 != 0).collect(Collectors.toList());

        System.out.println("Original List: " + listNumbers.toString());
        System.out.println("Even numbers: " + filterEven.filter(listNumbers));
        System.out.println("Odd numbers: " + filterOdd.filter(listNumbers));
    }
}