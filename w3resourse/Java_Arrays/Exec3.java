/*
Write a Java program to print the following grid.
*/

public class Exec3{
    public static void main(String[] args) {
        char[][] grid = new char[9][9];

        for(int i = 0; i < grid.length; ++i)
        {
            for(int j = 0; j < grid.length; ++j)
            {
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}