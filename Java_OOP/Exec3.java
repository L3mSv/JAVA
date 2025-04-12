

/* 
Write a Java program to create a class called "Rectangle" with width and height attributes. 
Calculate the area and perimeter of the rectangle.
*/

public class Exec3 {
    public static void main(String[] args) {
        {
            Rectangle rectangle = new Rectangle(4, 8);

            System.out.printf("\nThe Rectangle's Area: %,.1f", rectangle.calculateArea()); 
            System.out.printf("\nThe Rectangle's Perimeter: %,.1f", rectangle.calculatePerimeter());
        }
    }    
}

class Rectangle{
    private final double width;
    private final double height;

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double calculateArea()
    {
        return width * height;
    }

    public double calculatePerimeter()
    {
        return  (2 * width) + (2 * height);
    }
}
