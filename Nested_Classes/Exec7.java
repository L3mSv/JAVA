/*
Write a Java program to create a class called House with a method calculateArea().
Inside this method, define a local class Room with a method getArea() that calculates and returns the area of the room (length * width). 
Instantiate the Room class and call the getArea() method from within calculateArea(). 
*/

public class Exec7 {
    public static void main(String[] args)
    {
        House house = new House();

        System.out.println("\nArea of the room: " + house.calculateArea(12.5, 7) + "\n");
    }
}

class House{

    public double calculateArea(double length, double width)
    {
        class Room{

            public double getArea(double length, double width)
            {
                return length * width;
            }
        }

        Room room = new Room();
        return room.getArea(length, width);
    }
}