

/* 
Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
*/

public class Exec1{
    public static void main(String[] args) {
        {
            Person person1 = new Person("Lucas", 19);
            Person person2 = new Person("Mike", 24);

            System.out.printf("\nName: %s|Age: %d", person1.getName(), person1.getAge());
            System.out.printf("\nName: %s|Age: %d\n", person2.getName(), person2.getAge());
        }
    }
}

class Person{
    private final String name;
    private final int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }   

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}