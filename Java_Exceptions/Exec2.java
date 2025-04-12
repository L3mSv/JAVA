/* 
Write a Java program to 
create a method that takes an integer as a parameter and throws an exception if the number is odd.
*/
import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter a radom whole number: ");
            int number = scanner.nextInt();
            VerifyOddNumber(number);
            System.out.println("The number " + number + " is even.");
        }catch(IllegalArgumentException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }

    public static void VerifyOddNumber(int number)
    {
        if(number%2 != 0)
        {
            throw new IllegalArgumentException("The number " + number + " is odd!");
        }
    }
}


