/*
Write a Java program to create an interface called Greeting with a method sayHello(). 
In the main method, create an anonymous class that implements the Greeting interface and override the sayHello() method to print "Hello, World!". 
Call the sayHello() method.
*/

interface Greeting{

    public void sayHello();
}


public class Exec4 {
    public static void main(String[] args)
    {
        Greeting greeting = new Greeting(){
            @Override
            public void sayHello() {
                System.out.println("\nHello, World!\n");
            };
        };

        greeting.sayHello();

    }
}


/*
Como a interface Greeting possui apenas um único método abstrato (sayHello()), ela é uma interface funcional. 
Isso significa que você pode substituir a criação da classe anônima por uma expressão lambda, tornando o código mais conciso.


@FunctionalInterface
interface Greeting {
    public void sayHello();
}

public class Exec4 {
    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("\nHello, World!\n");

        greeting.sayHello();
    }
}
*/