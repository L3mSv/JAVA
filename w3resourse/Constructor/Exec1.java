/*
Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
*/

public class Exec1{
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.printf("Name: %s Age: %d\n", cat1.name, cat1.age);
    }
}

class Cat {
    String name;
    int age;

    public Cat(){
        name = "Unknown";
        age = 0;
    }   
}