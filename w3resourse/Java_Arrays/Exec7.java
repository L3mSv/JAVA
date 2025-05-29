/*
Write a Java program to remove a specific element from an array.
*/
import java.util.*;

public class Exec7{
    public static void main(String[] args)
    {
        String[] array = new String[]{"leona", "jhin", "aatrox", "vi", "jinx", "teemo"};
        
        System.out.println("Enter a champion to be removed: ");
        Scanner scanner = new Scanner(System.in);
        String remove_champion = scanner.nextLine();

        List<String> list = new ArrayList<>(Arrays.asList(array));

        if(list.contains(remove_champion))
        {
            list.remove(remove_champion);
            System.out.println("The new list: " + list);
        }
        else
        {
            System.out.println("The champion isn't in list, none update: " + list);
        }

    }
}