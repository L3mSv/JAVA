/*
Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum. Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".

 */

public class Exec2 {
    public static void main(String[] args)
    {
        int n1 = 3;
        int n2 = 9;
        int sum  = MathUtility.Add(n1, n2);

        System.out.println(n1 + " + " + n2  + " = " + sum);
    }
}

class MathUtility{

    public static int Add(int x, int y)
    {
        return x + y;
    }
}
