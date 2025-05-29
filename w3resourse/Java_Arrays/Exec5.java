/*
Write a Java program to test if an array contains a specific value.
*/
import java.util.*;

public class Exec5{
    public static void main(String[] args) {
        String[] array = new String[]{"cachorro", "gato", "gaivota", "lobo", "tigre", "burro"};

        System.out.println("Enter a value to search in array: ");
        Scanner scanner = new Scanner(System.in);
        String value =  scanner.nextLine();

        boolean found = false;
        for(String element: array)
        {
            if(element.contains(value))
            {
                System.out.println("The value " + value + " was found in array!");
                found = true;
            }
        }

        if(found == false)
            System.out.println("\nThe value " + value + " wasn't in array!");
        

    }
}