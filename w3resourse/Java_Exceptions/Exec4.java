/* 
Write a Java program that reads a list of numbers 
from a file and throws an exception if any of the numbers are positive.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args)
    {
        try{
        File file = new File("numbers");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            int number = Integer.parseInt(line.trim());

            if(number > 0)
            {
                throw new IllegalArgumentException("The list have a number positive!");
            }

            System.out.println("Number: " + number);
        }

        }catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }    
}

