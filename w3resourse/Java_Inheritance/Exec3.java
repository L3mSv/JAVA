/*
Write a Java program to create a class called Shape with a method called getArea(). 
Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
*/

public class Exec3{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(3, 10);

        System.out.println("\nThe area of rectangle is: " + rectangle.getArea() + "\n");
    }
}

class Shape{

    public double getArea()
    {
        return 0.0;
    }
}

class Rectangle extends Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return length * width;
    }
}