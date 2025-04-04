/*
8. Overloading Constructors with Different Data Types
Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:

    One constructor takes int parameters.
    Another constructor takes double parameters.
    Print the values of the variables for each constructor.

*/

public class Exec8 {
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        Point point1 = new Point(5.5, 10.5);

        point.GetPoint();
        point1.GetPoint();
    }
}

class Point{
    private double x;
    private double y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        
    }

    public Point(double x, double y){
        this.x = (int)x;
        this.y = (int)y;
    }

    public Point() {
    }

    public void GetPoint(){
        System.out.println("\nX: " + x + ", Y: " + y);
    }
    

}