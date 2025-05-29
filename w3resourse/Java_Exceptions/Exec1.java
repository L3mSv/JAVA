/* 
Write a Java program that throws an exception and catch it using a try-catch block.
*/
import java.util.Scanner;


public class Exec1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("The result of division between " + x + " and " + y + " is " + z);
        }
        catch(ArithmeticException e){
            System.out.println("You can't divide by zero! IDIOT!");
        }
    }

}
