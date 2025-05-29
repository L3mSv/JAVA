/* 
Write a Java program to create a class called House with private instance variables address, numberOfRooms, 
and area. Provide public getter and setter methods to access and modify these variables. Add a method called 
calculatePrice() 
that returns the price of the house based on its area and a price per square meter.
*/

public class Exec11 {
    public static void main(String[] args)
    {
        House house = new House();

        house.setAddress("ABC Main Rd");
        house.setNumberOfRooms(5);
        house.setArea(130.5);


        System.out.printf("\nHouse's Address: %s", house.getAddress());
        System.out.printf("\nHouse's NumberOfRooms: %s", house.getNumberOfRooms());
        System.out.printf("\nHouse's Area: %.1f sq meters", house.getArea());
        System.out.printf("\nHouse's Price: $%,.1f\n", house.calculatePrice(2000));


    }   
}

class House{
    private String address;
    private int numberOfRooms;
    private double area;

    public String setAddress(String address)
    {
        return this.address = address;
    }

    public int setNumberOfRooms(int numberOfRooms)
    {
        return this.numberOfRooms = numberOfRooms;
    }

    public double setArea(double area)
    {
        return this.area = area;
    }

    public String getAddress()
    {
        return address;
    }

    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }

    public double getArea()
    {
        return area;
    }

    public double calculatePrice(double pricePerSquareMeter)
    {
        return area * pricePerSquareMeter;
    }
}
