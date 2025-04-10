

/* 
 Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). 
 Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific
  sound for each animal.
*/

public class Exec1 {
    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal cat = new Cat();

        bird.Sound();
        cat.Sound();
    }    
}

abstract class Animal{

    public abstract void Sound();
}

class Bird extends Animal{

    @Override
    public void Sound()
    {
        System.out.println("\nBird's make a sound!");
    }
}

class Cat extends Animal{

    @Override
    public void Sound()
    {
        System.out.println("\nCat's make a sound!\n");
    }
}