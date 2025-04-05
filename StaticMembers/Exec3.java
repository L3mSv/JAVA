/*
Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000. Print the value of 'initialValue' before and after creating an instance of "Initializer".
 */

@SuppressWarnings("unused")

public class Exec3 {
    public static void main(String[] args){
        System.out.println(Initializer.initialValue + "\n");
        Initializer initializer1 = new Initializer();
        System.out.println(Initializer.initialValue + "\n");
        
    }
}

class Initializer{

    static int initialValue = 1000;

    static
    {
        System.out.println("Static block: initialValue initialized to " + Initializer.initialValue);
    }
}