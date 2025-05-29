/*
Write a Java program to calculate the average value of array elements.
*/

public class Exec4{
    public static void main(String[] args)
    {
        int[] array = new int[]{1, 2, 3, 4};
        double average = 0;

        for(int num: array)
        {
            average += num;
        }
        average /= array.length;

        System.out.println("The average: " + average);

    }
}