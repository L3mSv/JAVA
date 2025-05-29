/*
Write a Java program to create a class called Employee with methods called work() and getSalary(). 
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee(). 
*/

public class Exec4 {
    public static void main(String[] args)
    {
        Employee employee = new Employee(40000);
        HRManager hrManager = new HRManager(70000);

        employee.work();
        System.out.println("Employee salary: " + employee.getSalary() + "\n");

        hrManager.work();
        System.out.println("Manager salary: " + hrManager.getSalary() + "\n");
        hrManager.addEmployee();
    }
}

class Employee{

    private final double salary;

    public Employee(double salary)
    {
        this.salary = salary;
    }

    public void work()
    {
        System.out.println("\nworking as an employee!");
    }

    public double getSalary()
    {
        return salary;
    }
}

class HRManager extends Employee{

    public HRManager(double salary){
        super(salary);
    }

    @Override
    public void work()
    {
        System.out.println("\nManaging employees\n");
    }

    public void addEmployee()
    {
        System.out.println("\nAdding new employee!\n");
    }
}