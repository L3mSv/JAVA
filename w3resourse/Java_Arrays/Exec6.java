/*
Write a Java program to find the index of an array element.
*/
import java.util.*;

public class Exec6{
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println("The array: " + Arrays.toString(array));
        System.out.println("Enter a array element: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        boolean found = false;
        for(int i = 0; i < array.length; ++i)
        {
            if(array[i] == value)
            {
                found = true;
                System.out.println("The " + value + " index is " + i);
            }
        }


        if(!found)
        {
            System.out.println("The value isn't in array!");
        }
        

    }
}