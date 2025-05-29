/*
Write a Java program to count the number of strings in a list that start with a specific letter using streams
*/
import java.util.*;


public class Exec5{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.asList("recife", "maceio", "macapa", "fortaleza", "manaus");

        System.out.println("\nEnter a letter: ");
        char letter = scanner.next().charAt(0);

        long countStringsWithSpecificLetter = list.stream()
                                            .filter(string -> string.charAt(0) == letter)
                                            .count();

        System.out.println("\nThe original list: " + list);
        System.out.println("String with the specific letter: " + countStringsWithSpecificLetter);
    }
}