/* 
3. Write a Java program to create a class called Rectangle with private instance variables length and width. 
Provide public getter and setter methods to access and modify these variables.
*/

public class Exec3 {
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(4);
        rectangle.setWidth(2);

        System.out.printf("\nRectangle's Length: %.1f\n", rectangle.getLength());
        System.out.printf("Rectangle's Width: %.1f\n", rectangle.getWidth());
    }
}

class Rectangle{
    private double length;
    private double width;

    public double setLength(double length)
    {
        return this.length = length;
    }

    public double setWidth(double width)
    {
        return this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }
}
