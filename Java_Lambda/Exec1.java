/*
Write a Java program to implement a lambda expression to find the sum of two integers.
*/

interface lambdaSum{
    String sum (int x, int y);
}

public class Exec1{
    public static void main(String[] args)
    {
        lambdaSum newsum = (x, y) -> x + " + " + y + " = " + (x + y);
        System.out.println(newsum.sum(5, 10));
    }
}
