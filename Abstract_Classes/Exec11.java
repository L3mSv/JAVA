

/*
Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). 
Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods 
to describe how each bird flies and makes a sound. 
*/

public class Exec11 {
    public static void main(String[] args)
    {
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        eagle.fly();
        eagle.makeSound();

        hawk.fly();
        hawk.makeSound();

    }
}

abstract class Bird{

    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird{

    @Override
    public void fly()
    {
        System.out.println("\nEagle: Flying high in the sky.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Eagle: Screech! Screech!\n");
    }
}

class Hawk extends Bird{

    @Override
    public void fly()
    {
        System.out.println("\nHawk: Soaring through the air.");
    }

    @Override
    public void makeSound()
    {
        System.out.println("Hawk: Caw! Caw!\n");
    }
}
