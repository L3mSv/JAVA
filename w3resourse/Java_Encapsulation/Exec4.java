/*
Write a Java program to create a class called Employee with private instance variables employee_id, 
employee_name, and employee_salary. Provide public getter and setter methods to access and modify 
the id and name variables, 
but provide a getter method for the salary variable that returns a formatted string. 
*/

public class Exec4{
    public static void main(String[] args)
    {
        Employee employee = new Employee();

        employee.setEmployeeId("1234");
        employee.setEmployeeName("Wood");
        employee.setEmployeeSalary(1000000.);

        System.out.printf("\nEmployee's Id: %s", employee.getEmployeeId());
        System.out.printf("\nEmployee's Name: %s", employee.getEmployeeName());
        System.out.printf("\nEmployee's Salary: %,.1f\n", employee.getEmployeeSalary());
    }
}

class Employee{
    private String employee_id;
    private String employee_name;
    private double employee_salary;

    public String setEmployeeId(String employee_id)
    {
        return this.employee_id = employee_id;
    }

    public String setEmployeeName(String employee_name)
    {
        return this.employee_name = employee_name;
    }

    public double setEmployeeSalary(double employee_salary)
    {
        return this.employee_salary = employee_salary;
    }

    public String getEmployeeId()
    {
        return employee_id;
    }

    public String getEmployeeName()
    {
        return employee_name;
    }

    public double getEmployeeSalary()
    {
        return employee_salary;
    }
}