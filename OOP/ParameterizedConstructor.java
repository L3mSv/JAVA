/*
Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. Print the values of the variables
*/

public class ParameterizedConstructor {
    public static void main(String[] args){
        Dog dog = new Dog("Rex", "Azul");
        System.out.printf("Name: %s |Color: %s", dog.name, dog.color);
    }
}

class Dog{
    String name;
    String color;

    public Dog(String name,String color){
        this.name = name;
        this.color = color;
    }
}