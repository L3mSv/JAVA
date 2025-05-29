/*
Write a Java program to implement a lambda expression to check if a given string is empty.
*/

interface StringCheck{
    boolean isEmpty(String str);
}

public class Exec2{
    public static void main(String[] args) {
        
        StringCheck check = (str) -> str.isEmpty();
        String testString = "s";

    System.out.println("Is the string empty? " + check.isEmpty(testString));
    }
}