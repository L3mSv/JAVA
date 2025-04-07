

/*
Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine(). 
Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop 
the engines for each vehicle type.
*/

public class Exec7 {
    public static void main(String[] args)
    {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}

abstract class Vehicle{

    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends  Vehicle{

    @Override
    public void startEngine()
    {
        System.out.println("\nCar: Starting the engine...");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Car: Stopping the engine...\n");
    }
}

class Motorcycle extends  Vehicle{

    @Override
    public void startEngine()
    {
        System.out.println("\nMotorcycle: Starting the engine...");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Motorcycle: Stopping the engine...\n");
    }
}
