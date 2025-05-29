

/* 
Write a Java program to create a class Vehicle with a method called speedUp().
Create two subclasses Car and Bicycle. 
Override the speedUp() method in each subclass to increase the vehicle's speed differently.
*/

public class Exec2 {
    public static void main(String[] args) {
        Vehicle car = new Car(45);
        Vehicle bicycle = new Bicycle(10);

        System.out.printf("\nThe car's speed is %s KM/H", car.getSpeed());
        System.out.printf("\nThe bicycle's speed is %s KM/H\n", bicycle.getSpeed());

        car.speedUp(23);
        bicycle.speedUp(2);

        System.out.printf("\nThe car's speed have increased and now is %s KM/H", car.getSpeed());
        System.out.printf("\nThe bicycle's speed have increased and now is %s KM/H", bicycle.getSpeed());


    }
}

abstract class Vehicle 
{
    public abstract void speedUp(double increase);
    public abstract double getSpeed();
}

class Car extends Vehicle{
    private double speed;

    public Car(double speed)
    {
        this.speed = speed;
    }

    @Override
    public void speedUp(double increase)
    {
        speed += increase;
    }

    @Override
    public double getSpeed()
    {
        return speed;
    }
}

class Bicycle extends  Vehicle
{
    private double speed;

    public Bicycle(double speed)
    {
        this.speed = speed;
    }

    @Override
    public void speedUp(double increase)
    {
        speed += increase;
    }

    @Override
    public double getSpeed()
    {
        return speed;
    }
}