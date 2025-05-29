/* 
Write a Java program that reads a list of integers from the user and throws an 
exception if any numbers are duplicates.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Exec6 {
    public static void main(String[] args) {
        {
            try{

                ArrayList<Integer> arrayList = new ArrayList<>();

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter integers (type 'done' to finish):");

                while(scanner.hasNext())
                {
                    if(scanner.hasNextInt())
                    {
                        int number = scanner.nextInt();
                        
                        if(arrayList.contains(number))
                        {
                            throw new IllegalArgumentException("The list have duplicate numbers");
                        }

                        arrayList.add(number);
                    }else{
                        String input = scanner.next();
                        if(input.equalsIgnoreCase("done"))
                        {
                            break;
                        }else{
                            System.out.println("Invalid input. Please enter an integer or 'done'.");
                        }
                    }
                }

                System.out.println("List of integers: " + arrayList);
            }catch(IllegalArgumentException e)
            {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
}
