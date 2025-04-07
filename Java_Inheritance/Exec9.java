/*
Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. 
Each subclass should have properties such as make, model, year, and fuel type. 
Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
*/

public class Exec9 {
    public static void main(String[] args)
    {
                Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
                Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);
                Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1, 32);
        
                System.out.println("\nTruck Model: " + truck.getModel());
                System.out.printf("\nFuel Efficiency: %.1f mpg", truck.calculate_fuel_efficiency());
                System.out.printf("\nDistance Traveled: %.1f miles", truck.distance_traveled());
                System.out.printf("\nMax Speed: %.1f mph\n", truck.maximum_speed());
        
                System.out.println("\nCar Model: " + car.getModel());
                System.out.printf("\nFuel Efficiency: %.1f mpg", car.calculate_fuel_efficiency());
                System.out.printf("\nDistance Traveled: %.1f miles", car.distance_traveled());
                System.out.printf("\nMax Speed: %.1f mph\n", car.maximum_speed());
        
                System.out.println("\nMotorcycle Model: " + motorcycle.getModel());
                System.out.printf("\nFuel Efficiency: %.1f mpg", motorcycle.calculate_fuel_efficiency());
                System.out.printf("\nDistance Traveled: %.1f miles", motorcycle.distance_traveled());
                System.out.printf("\nMax Speed: %.1f mph\n", motorcycle.maximum_speed());
    }
}

abstract class Vehicle{
    private String make;
    private String model;
    private int year;
    private String fuel_type;
    private double fuel_efficiency;

    public Vehicle(String make, String model, int year, String fuel_type, double fuel_efficiency)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
        this.fuel_efficiency = fuel_efficiency;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public String getFuel_Type()
    {
        return fuel_type;
    }

    public double getFuel_Efficiency()
    {
        return fuel_efficiency;
    }


    public abstract double calculate_fuel_efficiency();
    public abstract double distance_traveled();
    public abstract double maximum_speed();

}

class Car extends Vehicle{

    private int numSeats;

    public Car(String make, String model, int year, String fuel_type, double fuel_efficiency, int numSeats)
    {
        super(make,model,year,fuel_type,fuel_efficiency);
        this.numSeats = numSeats;
    }

    public double getNumSeats()
    {
        return numSeats;
    }

    @Override
    public double calculate_fuel_efficiency()
    {
        return getFuel_Efficiency() * (1/1+(getNumSeats()/5));
    }

    @Override
    public double distance_traveled()
    {
        return calculate_fuel_efficiency() * getFuel_Efficiency();
    }

    @Override
    public double maximum_speed()
    {
        return 120.0;
    }
}

class Truck extends Vehicle{

    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuel_type, double fuel_efficiency, double cargoCapacity)
    {
        super(make,model,year,fuel_type,fuel_efficiency);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity()
    {
        return cargoCapacity;
    }

    @Override
    public double calculate_fuel_efficiency()
    {
        return getFuel_Efficiency() * (1/1+(getCargoCapacity()/1000));
    }

    @Override
    public double distance_traveled()
    {
        return calculate_fuel_efficiency() * getFuel_Efficiency();
    }

    @Override
    public double maximum_speed()
    {
        return 80.0;
    }
}

class Motorcycle extends Vehicle{

    private double engineDisplacement;

    public Motorcycle(String make, String model, int year, String fuel_type, double fuel_efficiency, double engineDisplacement)
    {
        super(make,model,year,fuel_type,fuel_efficiency);
        this.engineDisplacement = engineDisplacement;
    }

    public double engineDisplacement()
    {
        return engineDisplacement;
    }

    @Override
    public double calculate_fuel_efficiency()
    {
        return getFuel_Efficiency() * (1/1+(engineDisplacement()/1000));
    }

    @Override
    public double distance_traveled()
    {
        return calculate_fuel_efficiency() * getFuel_Efficiency();
    }

    @Override
    public double maximum_speed()
    {
        return 80.0;
    }
}
