

/*
Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). 
Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary 
and display information for each role.
*/

public class Exec5 {
    public static void main(String[] args) {
        Manager manager = new Manager(6000, "Corona Cadagon", 1000);
        Programmer programmer = new Programmer(5000, "Anakin Skywalker", 20, 25);

        manager.displayInfo();
        programmer.displayInfo();
    
    }
}

abstract class Employee{

    private double salary;
    private String name;

    public Employee(double salary, String name)
    {
        this.salary = salary;
        this.name = name;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();

    public double getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }

    public double setSalary(double salary)
    {
        return this.salary = salary;
    }

}

class Manager extends Employee{

    private double bonus;

    public Manager(double salary, String name, double bonus)
    {
        super(salary, name);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary()
    {
        return getSalary() + bonus;
    }

    @Override
    public void displayInfo()
    {
        System.out.printf("\nManager Name: %s\n", getName());
        System.out.printf("Base Salary: %.1f\n", getSalary());
        System.out.printf("Bonus: $%.1f\n", bonus);
        System.out.printf("Total Salary: $%.1f\n", calculateSalary());
    }
}

class Programmer extends Employee{

    private int overtimeHours;
    private double hourlyRate;

    public Programmer(double salary, String name, int overtimeHours, double hourlyRate)
    {
        super(salary, name);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary()
    {
        return getSalary() + (overtimeHours * hourlyRate);
    }

    @Override
    public void displayInfo()
    {
        System.out.printf("\nProgrammer Name: %s\n", getName());
        System.out.printf("Base Salary: %.1f\n", getSalary());
        System.out.printf("Overtime Hours: $%d\n", overtimeHours);
        System.out.printf("Hourly Rate: $%.1f\n", hourlyRate);
        System.out.printf("Total Salary: $%.1f\n", calculateSalary());
    }
}
