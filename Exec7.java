/*
Write a Java program to create a class called "ComplexInitializer" with a static block that initializes multiple static variables (x, y, z) using complex logic. Print the values of these variables in the main method.
*/

public class Exec7 {
    public static void main(String[] args) {
        {
            System.out.println("x: " + ComplexInitializer.x + "\ny: " + ComplexInitializer.y + "\nz: " + ComplexInitializer.z);
        }
    }
}

class ComplexInitializer{
    static int x;
    static int y;
    static int z;

    static {
        x = 10;
        y = x * 2;
        z = calculateZ(x, y);
    }

    static int calculateZ(int x, int y)
    {
        return x * y + 10;
    }
}