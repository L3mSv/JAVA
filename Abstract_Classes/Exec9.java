/*
Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). 
Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the 
respective methods to play and tune each instrument. 
*/

public class Exec9 {
    public static void main(String[] args)
    {
        Glockenspeil glockenspeil = new Glockenspeil();
        Violin violin = new Violin();

        glockenspeil.play();
        glockenspeil.tune();

        violin.play();
        violin.tune();
    }
}

abstract class Instrument{

    public abstract void play();
    public abstract void tune();
}

class Glockenspeil extends Instrument{

    @Override
    public void play()
    {
        System.out.println("\nGlockenspiel: Playing the notes on the metal bars.");
    }

    @Override
    public void tune()
    {
        System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.\n");
    }
}

class Violin extends Instrument{

    @Override
    public void play()
    {
        System.out.println("\nViolin: Playing the strings with a bow or fingers.");
    }

    @Override
    public void tune()
    {
        System.out.println("Violin: Tuning the strings to the correct pitch.\n");
    }
}