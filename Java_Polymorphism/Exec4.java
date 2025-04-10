



/* 
Write a Java program to create a class Employee with a method called calculateSalary(). 
Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() 
method to calculate and return the salary based on their specific roles.
*/

public class Exec4 {
    public static void main(String[] args)
    {
        Employee manager = new Manager("Lilo Heidi", 7500.0, 1500.0);
        Employee programmer = new Programmer("Margrit Cathrin", 5000.0, 600.0);

        manager.calculateSalary();
        programmer.calculateSalary();

        System.out.println("Manager: " + manager.getName() + "\nRole: " + manager.getRole() + "\nSalary: $" + manager.calculateSalary());
        System.out.println("\nProgrammer: " + programmer.getName() + "\nRole: " + programmer.getRole() + "\nSalary: $" + programmer.calculateSalary());
    }
}

abstract class Employee{
    private final String name;
    private final String role;

    public Employee(String name, String role)
    {
        this.name = name;
        this.role = role;
    }

    public String getName()
    {
        return name;
    }

    public String getRole()
    {
        return role;
    }
     
    abstract double calculateSalary();
}

class Manager extends Employee{

    private double salary;
    private final double bonus;

    public Manager(String name, double salary, double bonus)
    {
        super(name, "Manager");

        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary()
    {
        return salary += bonus;
    }

}

class Programmer extends Employee{
    private double salary;
    private final double overtimePay;

    public Programmer(String name, double salary, double overtimePay)
    {
        super(name, "Programmer");

        this.salary = salary;
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary()
    {
        return salary += overtimePay;
    }

}