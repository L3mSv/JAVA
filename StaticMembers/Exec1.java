/*
Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.
 */

public class Exec1 {
    
    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        Counter obj1 = new Counter();
        @SuppressWarnings("unused")
        Counter obj3 = new Counter();

        System.out.println("Count: " + Counter.GetCounter());
    }
}

class Counter{
    private static int count = 0;

    public Counter(){
        ++count;
    }

    public static int GetCounter(){
        return count;
    }
}
