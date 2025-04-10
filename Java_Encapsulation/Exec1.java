/* 
Write a Java program to create a class called Person with private instance variables name, age. and country. 
Provide public getter and setter methods to access and modify these variables. 
*/

public class Exec1 {
    public static void main(String[] args)
    {
        Person person = new Person();

        person.setName("Lucas");
        person.setAge(19);
        person.setCountry("Brazil");

        System.out.printf("Name: %s|Age: %d|Country: %s", person.getName(), person.getAge(), person.getCountry());
    }
}

class Person 
{
    private String name;
    private int age;
    private String country;

    public String setName(String name)
    {
        return this.name = name;
    }

    public int setAge(int age)
    {
        return this.age = age;
    }

    public String setCountry(String country)
    {
        return this.country = country;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getCountry()
    {
        return country;
    }


}

