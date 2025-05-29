/* 
Write a Java program to create a base class Sports with a method called play(). 
Create three subclasses: Football, Basketball, and Rugby. 
Override the play() method in each subclass to play a specific statement for each sport.
*/

public class Exec5 {
    public static void main(String[] args)
    {
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        football.play();
        basketball.play();
        rugby.play();
    };
       
}

abstract class Sports{

    abstract void play();
}

class Football extends Sports{

    @Override
    public void play()
    {
        System.out.println("\nPlaying Football!\n");
    }
}

class Basketball extends Sports{

    @Override
    public void play()
    {
        System.out.println("\nPlaying Basketball!\n");
    }

}

class Rugby extends Sports{

    @Override
    public void play()
    {
        System.out.println("\nPlaying Rugby!\n");
    }
}