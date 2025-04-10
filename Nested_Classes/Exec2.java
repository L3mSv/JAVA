/*
Write a Java program to create an outer class called University with a static nested class Department. 
The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members. 
Instantiate the Department class from the main method and call the "displayInfo()" method. 
*/

public class Exec2 {
    public static void main(String[] args)
    {
        University.Department department = new University.Department();

        department.displayInfo();
    }
}

class University{

    static class Department{

        public void displayInfo()
        {
            System.out.println("\nDepartment: Computer Science");
            System.out.println("Number of Faculty Members: 50\n");
        }
    }
}
