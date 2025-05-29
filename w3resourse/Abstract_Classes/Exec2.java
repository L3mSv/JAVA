/*
Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and 
perimeter of each shape.
*/

public class Exec2 {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.printf("\nArea of Circle: %.1f", circle.calculateArea());
        System.out.printf("\nPerimeter of the Circle: %.1f\n", circle.calculatePerimeter());

        System.out.printf("\n\nArea of Triangle: %.1f", triangle.calculateArea());
        System.out.printf("\nPerimeter of the Triangle: %.1f\n", triangle.calculatePerimeter());
    }
}

abstract class Shape{

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}

class Circle extends Shape{

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape{

    private double base;
    private double height;
    private double hypotesune;

    public Triangle(double base, double height, double hypotesune)
    {
        this.base = base;
        this.height = height;
        this.hypotesune = hypotesune;
    }

    @Override
    public double calculateArea()
    {
        return (base * height)/2;
    }

    @Override
    public double calculatePerimeter()
    {
        return (base + height + hypotesune);
    }
}

