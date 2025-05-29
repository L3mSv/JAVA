/*
Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize(). 
Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods 
to draw and resize each shape.
*/

public class Exec10 {
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        rectangle.draw();
        rectangle.resize();

        circle.draw();
        circle.resize();
    }
}

abstract class Shape2D{

    public abstract void draw();
    public abstract void resize();
}

class Rectangle extends Shape2D{

    @Override
    public void draw()
    {
        System.out.println("\nRectangle: Drawing a rectangle.");
    }

    @Override
    public void resize()
    {
        System.out.println("Rectangle: Resizing the rectangle.\n");
    }
}

class Circle extends  Shape2D{

    @Override
    public void draw()
    {
        System.out.println("\nCircle: Drawing a circle.");
    }

    @Override
    public void resize()
    {
        System.out.println("Circle: Resizing the circle.\n");
    }
}