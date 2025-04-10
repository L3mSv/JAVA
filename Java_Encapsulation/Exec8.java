/* 
Write a Java program to create a class called “Book” with private instance variables title, author, and price. 
Provide public getter and setter methods to access and modify these variables. Add a method called applyDiscount()
 that takes a percentage as a parameter and reduces the price by that percentage.
*/

public class Exec8 {
    public static void main(String[] args)
    {
        Book book = new Book();

        book.setAuthor("Carol Dweck");
        book.setTitle("Mindset");
        book.setPrice(100);
        
        System.out.printf("\nAuthor: %s", book.getAuthor());
        System.out.printf("\nTitle: %s", book.getTitle());
        System.out.printf("\nFull Price: %.1f\n", book.getPrice());

        book.applyDiscount(50);

        System.out.printf("\nThe book have a discount of 50%% and now your price is %.1f", book.getPrice());

    }
}


class Book{
    private String title;
    private String author;
    private double price;

    public String setTitle(String title)
    {
        return this.title = title;
    }

    public String setAuthor(String author)
    {
        return this.author = author;
    }

    public double setPrice(double price)
    {
        return this.price = price;
    }

    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor(){
        return author;
    }

    public double getPrice()
    {
        return price;
    }    

    public void applyDiscount(int discount)
    {
        price = (price*discount)/100;
    }
}