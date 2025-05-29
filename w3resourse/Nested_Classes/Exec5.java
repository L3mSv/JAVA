/*
Write a Java program to create an outer class called Library with an instance variable libraryName. 
Create an inner class Book with a method getLibraryName() that returns the name of the library. 
Instantiate the Book class and call the getLibraryName() method. 
*/


public class Exec5 {
    public static void main(String[] args) {
        {
            Library library = new Library("Central Library");
            Library.Book book = library.new Book();

            System.out.println("\nLibrary Name: " + book.getLibraryName() + "\n");
        }
    }
}

class Library{
    
    private final String libraryName;

    public Library(String name){
        this.libraryName = name;
    }

    class Book{

        public String getLibraryName()
        {
            return libraryName;
        }
    }
}