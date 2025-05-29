

/* 
 Write a Java program to create a class Shape with methods getArea() and getPerimeter(). 
 Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter() 
 methods in each subclass to calculate and return the area and perimeter of the respective shapes.
*/

public class Exec6 {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(5, 4, 3);

        System.out.println("\nArea of the Circle: " + circle.getArea()); 
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());  

        System.out.println("\nArea of the Rectangle: " + rectangle.getArea());  
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter()); 

        System.out.println("\nArea of the Triangle: " + triangle.getArea()); 
        System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter());  
    }    
}

abstract class Shape{

    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends Shape{
    private final double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
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

    @Override
    public double getPerimeter()
    {
        return (2 * length) + (2 * width);
    }
}

class Triangle extends Shape{
    private final double side_opposite;
    private final double side_adjacent;
    private final double hypotenuse;

    public Triangle(double hypotenuse, double side_opposite, double side_adjacent)
    {
        this.side_opposite = side_opposite;
        this.side_adjacent = side_adjacent;
        this.hypotenuse = hypotenuse;

    }

    @Override
    public double getArea()
    {
        return (side_opposite * side_adjacent) / 2;
    }

    @Override
    public double getPerimeter()
    {
        return hypotenuse + side_adjacent + side_opposite;
    }
}
