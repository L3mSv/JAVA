/*
Write a Java program to create an abstract class Animal with an abstract method called sound(). 
Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a 
specific sound for each animal. 
*/

public class Exec1 {
    public static void main(String[] args){
            Lion lion = new Lion();
            Tiger tiger = new Tiger();
    
            lion.sound();
            tiger.sound();
        
    }
}

abstract class Animal{

    public abstract void sound();
}

class Lion extends Animal{

    @Override
    public void sound()
    {
        System.out.printf("\nROAR\n");
    }
}

class Tiger extends Animal{

    @Override
    public void sound()
    {
        System.out.printf("\nRAAAH\n");
    }
}