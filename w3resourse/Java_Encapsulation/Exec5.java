/* 
Write a Java program to create a class called Circle with a private instance variable radius.
 Provide public getter and setter methods to access and modify the radius variable. 
 However, provide two methods called calculateArea() and calculatePerimeter() that return the
  calculated area and perimeter based on the current radius value.
*/

public class Exec5 {
    public static void main(String[] args)
    {
        Circle circle = new Circle();

        circle.setRadius(7);
        
        System.out.printf("\nCircle's Area: %.1f", circle.calculateArea());
        System.out.printf("\nCircle's Perimeter: %.1f\n", circle.calculatePerimeter());
    }    
}


class Circle{
    private double radius;


    public double setRadius(double radius)
    {
        return this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double calculateArea()
    {
        return Math.PI*Math.pow(radius, 2);
    }

    public double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
}