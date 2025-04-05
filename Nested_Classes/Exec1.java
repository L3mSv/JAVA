/*
Write a Java program to create an outer class called Computer with an inner class Processor. The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed). Create an instance of Processor from the Computer class and call the "displayDetails()" method. 
*/

public class Exec1 {
    public static void main(String[] args) {
        {
            Computer computer = new Computer();
            Computer.Processor processor = computer.new Processor();

            processor.displayDetails();
        }
    }
}

class Computer{

    class Processor{

        public void displayDetails()
        {
            System.out.println("\nProcessor Brand: Intel");
            System.out.println("Processor Speed: 3.5 GHz\n");
        }
    }
}