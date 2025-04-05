/*
Write a Java program to create a class called Car with a method startEngine(). 
Inside this method, define a local class Engine that has a method run(). 
The run() method should print "Engine is running". 
Instantiate and call the run() method from within the startEngine() method. 
*/

public class Exec3 {
    public static void main(String[] args)
    {
        Car car = new Car();
        car.startEngine();
    }
}

class Car{

    public void startEngine()
    {
        class Engine{

            public void run()
            {
                System.out.println("\nEngine is running...\n");
            }
        }

        Engine engine = new Engine();
        engine.run();
    }
}