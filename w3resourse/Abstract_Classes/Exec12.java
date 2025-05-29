/*
Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). 
Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods 
to calculate the area and perimeter of each shape. 
*/

public class Exec12 {
    public static void main(String[] args)
    {
        Triangle triangle = new Triangle(6, 5, 4);
        Square square = new Square(6);

        System.out.printf("\nTriangle Area: %.1f", triangle.area());
        System.out.printf("\nTriangle Perimeter: %.1f", triangle.perimeter());
        System.out.printf("\nSquare Area: %.1f", square.area());
        System.out.printf("\nSquare Perimeter: %.1f\n", square.perimeter());

    }
}

abstract class GeometricShape{

    public abstract double area();
    public abstract double perimeter();
}

class Triangle extends GeometricShape{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area()
    {
        return (b*c)/2;
    }

    @Override
    public double perimeter()
    {
        return a+b+c;
    }
}

class Square extends GeometricShape{

    private double edge;


    public Square(double edge)
    {
        this.edge = edge;
    }

    @Override
    public double area()
    {
        return Math.pow(edge, 2);
    }

    @Override
    public double perimeter()
    {
        return 4*edge;
    }
}