/*
Write a Java program to create a class called Animal with a method named move(). 
Create a subclass called Cheetah that overrides the move() method to run.
*/

public class Exec6 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cheetah cheetah = new Cheetah();

        animal.move();
        cheetah.move();
    }
}

class Animal{

    public void move()
    {
        System.out.println("\nThe animal is moving\n");
    }
}

class Cheetah extends Animal{

    @Override
    public void move()
    {
        System.out.println("\nThis cheetah is running\n");
    }
}