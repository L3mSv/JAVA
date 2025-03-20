/*
 Write a Java program to create a class called Rectangle with instance variables length and width. Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object. Print the values of the variables. 
*/

public class Exec5{
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(2.4, 54.4);
        Rectangle rectangle2 = new Rectangle(rectangle1);

        rectangle1.GetRectangle();
        rectangle2.GetRectangle();
    }
}

class Rectangle{
    double width;
    double length;
    
    public Rectangle(Rectangle rectangle){
        this.width = rectangle.width;
        this.length = rectangle.length;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public void GetRectangle(){
        System.out.println("Length: " + length + " |Width: " + width + "\n");
    }
}