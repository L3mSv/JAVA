/*
Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
 */

public class Exec3{
    public static void main(String[] args){
        Book book = new Book();
        Book book1 = new Book("1984","George Orwell");
        Book book2 = new Book("Sherlock Holmes", "Arthur Conan Doyle", 50.0);

        book.GetBook();
        book1.GetBook();
        book2.GetBook();
    }
}

class Book{
    String title;
    String author;
    double price;

    public Book(){
        title = "No Title";
        author = "No Author";
        price = 0.0;
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void GetBook(){
        System.out.println("\nTitle: " + title + ", Author: " + author + ", Price: " + price);
    }
}