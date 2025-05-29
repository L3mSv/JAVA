/*
Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
*/

public class Exec2{
    public static void main(String[] args){

        ThreadEven threadEven = new ThreadEven();
        ThreadOdd threadOdd = new ThreadOdd();

        threadEven.start();
        threadOdd.start();

    }
}

class ThreadEven extends Thread{

    @Override
    public void run()
    {
        for(int i = 1; i <= 20; ++i)
        {
            if(i%2 == 0)
            {
                System.out.println("Even number from evenThread: " + i);
            }
        }
    }
}

class ThreadOdd extends Thread{

    @Override
    public void run()
    {
        for(int i = 1; i <= 20; ++i)
        {
            if(i%2 != 0)
            {
                System.out.println("Odd number from oddThread: " + i);
            }
        }
    }
}
                                                                                                                            
