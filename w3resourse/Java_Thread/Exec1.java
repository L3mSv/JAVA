/*
Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
*/

public class Exec1{
    public static void main(String[] args) throws  InterruptedException{
        
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println(Thread.activeCount());
        System.out.println(myThread.isAlive());
    }
}

class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Hello, World!");
    }
}