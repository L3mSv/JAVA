/*
Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle. 
*/

public class Exec8 {
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(8);
        System.out.printf("\nPerimeter: %.1f", circle1.getPerimeter());
        System.out.printf("\nArea: %.1f\n", circle1.getArea());

        Circle circle2 = new Circle(3.2);
        System.out.printf("\nPerimeter: %.1f", circle2.getPerimeter());
        System.out.printf("\nArea: %.1f\n", circle2.getArea());
    }
}

class Shape{

    public double getPerimeter(){
        return 0.0;
    }

    public double getArea(){
        return 0.0;
    }
}

class Circle extends Shape{

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
        System.out.printf("\nRadius of the circle: %.1f", radius);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}