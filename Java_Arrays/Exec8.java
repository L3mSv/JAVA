
import java.util.Arrays;

/*
 Write a Java program to copy an array by iterating the array.
*/

public class Exec8{
    public static void main(String[] args) {
        String[] arrayOne = new String[]{"azul", "vermelho"};
        String[] arrayTwo = new String[2];

        System.out.println("The arrayOne: " + Arrays.toString(arrayOne));
        System.out.println("The arrayTwo: " + Arrays.toString(arrayTwo));

        int count = 0;
        for(String element: arrayOne)
        {
            arrayTwo[count++] = element;
        }

        System.out.println("\nArrayTwo Update\n");

        System.out.println("The arrayOne: " + Arrays.toString(arrayOne));
        System.out.println("The arrayTwo: " + Arrays.toString(arrayTwo));
    }
}