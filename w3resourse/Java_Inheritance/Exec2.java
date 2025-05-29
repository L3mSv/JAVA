/*
Write a Java program to create a class called Vehicle with a method called drive(). 
Create a subclass called Car that overrides the drive() method to print "Repairing a car".
*/

public class Exec2 {
    public static void main(String[] args) {
        {
            Vehicle vehicle = new Vehicle();
            Car car = new Car();

            vehicle.drive();
            car.drive();
        }
    }
}

class Vehicle{

    public void drive()
    {
        System.out.println("\nThe Vehicle is be driven!\n");
    }
}

class Car extends Vehicle{

    @Override
    public  void drive()
    {
        System.out.println("\nRepairing a car\n");
    }
}