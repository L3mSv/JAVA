/*
7. Constructor with Default Values
Write a Java program to create a class called Car with instance variables make, model, and year. Implement a parameterized constructor that initializes these variables and assigns default values if not provided. Print the values of the variables.
*/

public class Exec7{
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("Porsche", "911 GT3 RS", 2024);

        car1.GetCar();
        car2.GetCar();
    }
}

class Car{
    String make;
    String model;
    int year;

    public Car(){
        this.make = "Lamborghini";
        this.model = "Urus";
        this.year = 2018;

    }
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void GetCar(){
        System.out.println("Make: " + make + " |Model: " + model + " |Year: " + year + "\n");
    }

}