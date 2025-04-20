/*
Write a Java program to insert an element (specific position) into an array.
*/
import java.util.*;

public class Exec9{
    public static void main(String[] args) {
        int[] array = new int[]{1, 423, 4 ,543 ,65};

        System.out.println("Enter a value: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        System.out.println("Enter a index: ");
        int index = scanner.nextInt();


        boolean index_found = false;
        for(int i = 0; i < array.length; ++i)
        {
            if(index == i)
            {
                index_found = true;
                array[i] = value;
                System.out.println("\nThe new array: " + Arrays.toString(array));
            }
        }


        if(!index_found)
        {
            System.out.println("\nThe index is out of array bounds!");
        }
    }
}