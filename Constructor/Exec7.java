/*
Write a Java program to create a class called "ComplexInitializer" with a static block that initializes multiple static variables (x, y, z) using complex logic. Print the values of these variables in the main method.
*/

<<<<<<< HEAD:Constructor/Exec7.java
public class Exec7{
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("Porsche", "911 GT3 RS", 2024);

        car1.GetCar();
        car2.GetCar();
=======
public class Exec7 {
    public static void main(String[] args) {
        {
            System.out.println("x: " + ComplexInitializer.x + "\ny: " + ComplexInitializer.y + "\nz: " + ComplexInitializer.z);
        }
>>>>>>> c21615ad385eea7496c6007ef32f7b0dad58704a:Exec7.java
    }
}

class ComplexInitializer{
    static int x;
    static int y;
    static int z;

<<<<<<< HEAD:Constructor/Exec7.java
    public Car(){
        this.make = "Lamborghini";
        this.model = "Urus";
        this.year = 2018;

    }
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
=======
    static {
        x = 10;
        y = x * 2;
        z = calculateZ(x, y);
>>>>>>> c21615ad385eea7496c6007ef32f7b0dad58704a:Exec7.java
    }

    static int calculateZ(int x, int y)
    {
        return x * y + 10;
    }
}