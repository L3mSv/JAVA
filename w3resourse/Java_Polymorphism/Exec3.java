

/* 
Write a Java program to create a base class Shape with a method called calculateArea(). 
Create three subclasses: Circle, Rectangle, and Triangle. 
Override the calculateArea() method in each subclass to calculate and return the shape's area.
*/

public class Exec3 {
    public static void main(String[] args) {
        {
            Shape circle = new Circle(4);
            Shape rectangle = new Rectangle(12, 34);
            Shape triangle = new Triangle(5, 9);

            System.out.printf("\n Area of Circle: %,.1f", circle.calculateArea());
            System.out.printf("\n Area of Rectangle: %,.1f", rectangle.calculateArea());
            System.out.printf("\n Area of Triangle: %,.1f", triangle.calculateArea());
        }
    }    
}

abstract class Shape{

    public abstract double calculateArea();
}

class Circle extends Shape{
    private final double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
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
    public double calculateArea()
    {
        return length * width;
    } 
}

class Triangle extends Shape{
    private final double side_opposite;
    private final double side_adjacent;

    public Triangle(double side_opposite, double side_adjacent)
    {
        this.side_opposite = side_opposite;
        this.side_adjacent = side_adjacent;
    }

    @Override
    public double calculateArea()
    {
        return (side_opposite * side_adjacent) / 2;
    }
}
