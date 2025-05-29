/*
Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). 
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods 
differently based on their specific behavior. 
*/

public class Exec4 {
    public static void main(String[] args)
    {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

        lion.eat();
        lion.sleep();

        tiger.eat();
        tiger.sleep();

        deer.eat();
        deer.sleep();
    }
    
}

abstract class Animal{

    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal{

    @Override
    public void eat()
    {
        System.out.println("\nLion eats meat.");
    }

    @Override
    public void sleep()
    {
        System.out.println("Lion sleeps on grassland.\n");
    }
}

class Tiger extends Animal{

    @Override
    public void eat()
    {
        System.out.println("\nTiger eats meat and occasionally hunts in water.");
    }

    @Override
    public void sleep()
    {
        System.out.println("Tiger sleeps in a hidden spot.\n");
    }
}



class Deer extends Animal{

    @Override
    public void eat()
    {
        System.out.println("\nDeer grazes on grass and leaves.");
    }

    @Override
    public void sleep()
    {
        System.out.println("Deer sleeps in open fields\n");
    }

}