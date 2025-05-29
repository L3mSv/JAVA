

/* 
Write a Java program to create a base class Animal with methods eat() and sound().
Create three subclasses: Lion, Tiger, and Panther. Override the eat() method in each subclass to 
describe what each animal eats. 
In addition, override the sound() method to make a specific sound for each animal.
*/


public class Exec10 {
    public static void main(String[] args) {
        {   
            Animal lion = new Lion();
            Animal tiger = new Tiger();
            Animal panther = new Panther();

            lion.eat();
            lion.sound();

            tiger.eat();
            tiger.sound();

            panther.eat();
            panther.sound();

        }
    }
}

abstract class Animal{

    public abstract void eat();
    public abstract void sound();
}

class Lion extends Animal{

    @Override
    public void eat()
    {
        System.out.println("\nThe lion's eating");
    }

    @Override
    public void sound()
    {
        System.out.println("The lion's make a sound");
    }
}

class Tiger extends Animal{

    @Override
    public void eat()
    {
        System.out.println("\nThe tiger's eating");
    }

    @Override
    public void sound()
    {
        System.out.println("The tiger's make a sound");
    }
}

class Panther extends Animal{

    @Override
    public void eat()
    {
        System.out.println("\nThe panther's eating");
    }

    @Override
    public void sound()
    {
        System.out.println("The panther's make a sound");
    }
}