/* 
Write a Java program to create a method that reads a file and throws an exception if the file is not found.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Exec3 {
    public static void main(String[] args) {

        try {
            File file = new File("caminho.txt");
            Scanner scanner = new Scanner(System.in);  
            
            FoundFile(file, scanner);

        }catch(FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
    public static void FoundFile(File file, Scanner scanner) throws FileNotFoundException
    {
        if(!file.exists())
        {
            throw new FileNotFoundException(file.getAbsolutePath());
        }

        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
