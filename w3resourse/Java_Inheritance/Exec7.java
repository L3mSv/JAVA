/*
Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method 
to include the employee's job title.
*/

public class Exec7 {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("4451","Kortney", "Rosalee","HR Manager");
        Employee employee2 = new Employee("4452","Junior", "Philipa","Software Manager");

        System.out.println("\n" + employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")\n");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
}


class Person{
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
}

class Employee extends Person{

    private final String Id;
    private String jobTitle;


    public Employee(String Id, String lastName, String firstName, String jobTitle)
    {
        super(firstName, lastName);
        this.Id = Id;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId()
    {
        return Id;
    }

    @Override
    public String getLastName()
    {
        return super.getLastName() + ", " + jobTitle;
    }
}