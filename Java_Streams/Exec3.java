/*
Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
*/
import java.util.*;


public class Exec3{
    public static void main(String[] args)
    {
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5,6,7);



        int sumEven = listNumbers.stream()
                        .mapToInt(Integer :: intValue)
                        .filter(numberEven -> numberEven%2 == 0)
                        .sum();

        int sumOdd = listNumbers.stream()
                        .mapToInt(Integer :: intValue)
                        .filter(numberOdd -> numberOdd%2 != 0)
                        .sum();


        System.out.println("\nThe list: " + listNumbers);
        System.out.println("\nEven Sum: " + sumEven);
        System.out.println("Odd Sum: " + sumOdd);
                        
    }
}