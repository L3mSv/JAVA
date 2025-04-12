/* 
Write a Java program to create a method that takes a string as input and throws an exception 
if the string does not contain vowels.
*/
import java.util.Scanner;


public class Exec7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String text = scanner.nextLine();

        try {
            VerifyString(text);
            System.out.println("The string contains vowels.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        
    }

    public static void VerifyString(String text)
    {
        if(!text.matches(".*[aeiouAEIOU].*"))
        {
            throw new IllegalArgumentException("the string does not contain vowels.");
        }
    }
}