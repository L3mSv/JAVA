/* 
Write a Java program that reads a file and throws an exception if the file is empty.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exec5{
    public static void main(String[] args)
    {
        try{
            File file = new File("numbers");
            Scanner scanner = new Scanner(file);

            if(!file.exists())
            {

                throw new IllegalArgumentException("The found not exists!");
            }
            if(file.length() == 0)
            {
                throw new IllegalArgumentException(file.getAbsolutePath());
            }

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("The file is empty " + e.getMessage());
        }
    }
}