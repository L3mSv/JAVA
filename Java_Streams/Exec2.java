/*
Write a Java program to convert a list of strings to uppercase or lowercase using streams.
*/
import java.util.*;
import java.util.stream.Collectors;

public class Exec2{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("caChorro", "papagAIo", "COala", "coBrA");

        List<String> listUpper = list.stream()
                    .map(String :: toUpperCase)
                    .collect(Collectors.toList());

        List<String> listLower = list.stream()
                                .map(String :: toLowerCase)
                                .collect(Collectors.toList());


        System.err.println("\nThe Origin list: " + list);
        System.out.println("\nThe Upper list: " + listUpper);
        System.out.println("The Lower list: " + listLower);
    }
}