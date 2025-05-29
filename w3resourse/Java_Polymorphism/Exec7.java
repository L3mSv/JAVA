/* 
Write a Java program to create a base class Animal with methods move() and makeSound(). 
Create two subclasses Bird and Panther. Override the move() method in each subclass to describe how each 
animal moves. Also, override the makeSound() method in each subclass to make a specific sound for each animal.
*/

public class Exec7 {
    public static void main(String[] args) {
        
        Animal bird = new Bird();
        Animal panther = new Panther();

        bird.move();
        bird.makeSound();

        panther.move();
        panther.makeSound();
    }
    
}

abstract class Animal{
    abstract void move();
    abstract void makeSound();
}

class Bird extends Animal{

    @Override
    public void move()
    {
        System.out.println("\nThe bird's moving.");
    }

    @Override 
    public void makeSound()
    {
        System.out.println("The bird's make a sound.");
    }
}

class Panther extends Animal{

    @Override
    public void move()
    {
        System.out.println("\nThe panther's moving.");
    }

    @Override 
    public void makeSound()
    {
        System.out.println("The panther's make a sound.");
    }
}
