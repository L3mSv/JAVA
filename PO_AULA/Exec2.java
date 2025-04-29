/*
Escreva um programa que dado três números inteiros,
apresente o menor deles e todos que são positivos. 
*/
import java.util.*;

public class Exec2{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(5);
        list.add(2);

        System.out.println("MENOR NUMERO: " + list.stream().min(Integer::compare).get());

        for(Integer num : list)
        {
            if(num >= 0)
            {
                System.out.println("" + num);
            }
        }
    }
}