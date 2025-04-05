/*
Write a Java program to create a class called "IDGenerator" with a static variable 'nextID' and a static method "generateID()" that returns the next ID and increments 'nextID'. Demonstrate the usage of generateID in the main method.
*/

public class Exec6 {
    public static void main(String[] args) {
        {
            System.out.println("ID: " + IDGenerator.generateID());
            System.out.println("ID: " + IDGenerator.generateID());
            System.out.println("ID: " + IDGenerator.generateID());
        }
    }
}

class IDGenerator{

    static int nextID = 234;

    public static int generateID(){
            return ++nextID;
    }
}
