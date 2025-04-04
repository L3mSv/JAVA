/*
Write a Java program to create a class called "ComplexInitializer" with a static block that initializes multiple static variables (x, y, z) using complex logic. Print the values of these variables in the main method.
*/

public class Exec7{

        public static void main(String[] args) {

            Car car1 = new Car("Toyota", "Corolla", 2021);

            System.out.println("Car 1 Make: " + car1.make);
            System.out.println("Car 1 Model: " + car1.model);
            System.out.println("Car 1 Year: " + car1.year);
    

            Car car2 = new Car("", "", -1);

            System.out.println("Car 2 Make: " + car2.make);
            System.out.println("Car 2 Model: " + car2.model);
            System.out.println("Car 2 Year: " + car2.year);
        }
}


class Car {

    String model;
    int year;
    String make;

    public Car(String make, String model, int year) {

        this.make = (make == null || make.isEmpty()) ? "Unknown Make" : make;

        this.model = (model == null || model.isEmpty()) ? "Unknown Model" : model;

        this.year = (year <= 0) ? 2000 : year;
    }
}