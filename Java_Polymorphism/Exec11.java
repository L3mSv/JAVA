

/* 
Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). 
Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() 
methods in each subclass to start and stop the engines differently.
*/

public class Exec11 {
    public static void main(String[] args) {
        {
            Vehicle car = new Car();
            Vehicle motorcycle = new Motorcycle();

            car.startEngine();
            car.stopEngine();

            motorcycle.startEngine();
            motorcycle.stopEngine();
        }
    }
}

abstract class Vehicle{

    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {

    @Override
    public void startEngine() {
      System.out.println("\nCar engine started.");
    }
  
    @Override
    public void stopEngine() {
      System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle{

    @Override
    public void startEngine() {
      System.out.println("\nMotorcycle engine started.");
    }
  
    @Override
    public void stopEngine() {
      System.out.println("Motorcycle engine stopped.");
    }
}