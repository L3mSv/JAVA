/*
Write a Java program to create an outer class called Person with an inner class Address. 
The Address class should have a constructor that takes parameters city and state. 
Create an instance of Address from the Person class and print the address details.
*/

public class Exec9{
    public static void main(String[] args) {
        Person person = new Person();
        Person.Address address = person.new Address("New Delhi", "ND");
    }
}

class Person{

    class Address{

        public Address(String city, String state){
            System.out.println("\nCity: " + city + " | State: " + state + "\n");
        }
    }
}