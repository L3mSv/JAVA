/*
Write a Java program to calculate the average of a list of integers using streams
*/
import java.util.*;



public class Exec1{
    public static void main(String[] args){
        
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        double averageList = list.stream()
                        .mapToInt(Integer :: intValue)
                        .average()
                        .orElse(0);

        System.out.println("A media: " + averageList);
    }
}