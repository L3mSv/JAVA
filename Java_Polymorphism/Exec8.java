/* 
Write a Java program to create a base class Shape with methods draw() and calculateArea(). 
Create three subclasses: Circle, Square, and Triangle. Override the draw() 
method in each subclass to draw the respective shape, 
and override the calculateArea() method to calculate and return the area of each shape.
*/

public class Exec8 {
    public static void main(String[] args) {
        {
            Shape circle = new Circle(7);
            Shape square = new Square(12);
            Shape triangle = new Triangle(3, 5);

            circle.drawShapeAndCalculateArea();
            square.drawShapeAndCalculateArea();
            triangle.drawShapeAndCalculateArea();
        }
    }

}

abstract class Shape{

    public abstract double calculateArea();
    public abstract void draw();

    public void drawShapeAndCalculateArea()
    {
        this.draw();
        System.out.println("Area: " + this.calculateArea());
    }
}

class Circle extends Shape{
    private final double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw()
    {
        System.out.println("\nThe circle's drawing");
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

}

class Square extends Shape{
    private final double side;

    public Square(double side)
    {
        this.side = side;
    }

    @Override
    public void draw()
    {
        System.out.println("\nThe square's drawing");
    }

    @Override
    public double calculateArea()
    {
        return Math.pow(side, 2);
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
    public void draw()
    {
        System.out.println("\nThe triangle's drawing");
    }

    @Override
    public double calculateArea()
    {
        return (side_opposite * side_adjacent) / 2;
    }
}