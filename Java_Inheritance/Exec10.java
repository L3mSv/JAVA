

/* 
Write a Java program that creates a class hierarchy for employees of a company. 
The base class should be Employee, with subclasses Manager, Developer, and Programmer. 
Each subclass should have properties such as name, address, salary, and job title. 
Implement methods for calculating bonuses, generating performance reports, and managing projects.
*/

public class Exec10 {
    public static void main(String[] args)
    {
        Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager");
        Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "Java");
        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Programmer","Python");

        System.out.printf("\nManager's Bonus: $%.1f", manager.calculateBonus());
        System.out.printf("\nDeveloper's Bonus: $%.1f", developer.calculateBonus());        
        System.out.printf("\nProgrammer's Bonus: $%.1f\n", programmer.calculateBonus());

        manager.performanceReport();
        developer.performanceReport();
        programmer.performanceReport();

        manager.managingProject();
        developer.writingCode();
        programmer.debugCode();

    }    
}

class Employee{
    private String name;
    private String address;
    private double salary;
    private String job_title;

    public Employee(String name, String address, double salary, String job_title)
    {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getJob_Title()
    {
        return job_title;
    }

    public String setName(String name)
    {
        return this.name = name;
    }

    public String setAddress(String address)
    {
        return this.address = address;
    }

    public double setSalary(double salary)
    {
        return this.salary = salary;
    }
    
    public String setJob_Title(String job_title)
    {
        return this.job_title = job_title;
    }

    public double calculateBonus()
    {
        return 0.0;
    }

    public void performanceReport()
    {
        //void
    }

}

class Manager extends Employee{


    public Manager(String name, String address, double salary, String job_title)
    {
        super(name, address, salary, job_title);
    }

    @Override
    public double calculateBonus()
    {
        return getSalary() * 0.15;
    }

    @Override
    public void performanceReport()
    {
        System.out.println("Performance report for" + getJob_Title() + " " + getName() + " : Excellent");
    }

    public void managingProject()
    {
        System.out.println(getJob_Title() + " " + getName() + " is managing a project.");
    }
}

class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String address, double salary, String job_title, String programmingLanguage)
    {
        super(name, address, salary, job_title);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus()
    {
        return getSalary() * 0.10;
    }

    @Override
    public  void performanceReport()
    {
        System.out.println("Performance report for" + getJob_Title() + " " + getName() + " : Good");
    }

    public void writingCode()
    {
        System.out.println(getJob_Title() + " " + getName() + " is writing code in " + programmingLanguage);
    }
}

class Programmer extends Employee{

    private String programmingLanguage;

    public Programmer(String name, String address, double salary, String job_title, String programmingLanguage)
    {
        super(name, address, salary, job_title);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus()
    {
        return getSalary() * 0.12;
    }

    @Override
    public void performanceReport()
    {
        System.out.println("Performance report for" + getJob_Title() + " " + getName() + " : Excellent");
    }

    public void debugCode()
    {
        System.out.println(getJob_Title() + " " + getName() + " is debugging code in " + programmingLanguage);
    }
}