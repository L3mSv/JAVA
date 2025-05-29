/*
Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark
*/

public class Exec1 {
    public static void main(String[] args) {
    
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.makeSound();
        cat.makeSound();
        
        
    }
}

class Animal{

    public void makeSound()
    {
        System.out.println("\nThe animal makes a sound!\n");
    };

}

class Cat extends Animal{

    @Override
    public void makeSound()
    {
        System.out.println("\nMeow\n");
    }
}