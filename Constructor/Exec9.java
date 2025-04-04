/*
Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.
*/

public class Exec9 {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie"};
        Classroom classroom = new Classroom("Math 101", students);
        classroom.displayClassroomInfo();
    }
}

class Classroom {
    private final String className;
    private final String[] students;

    public Classroom(String className, String[] students)
    {
        this.className = className;
        this.students = students;
    }

    public void displayClassroomInfo()
    {
        System.out.println("Class Name: " + className);
        System.out.print("Students: ");
        for (String student : students) {
            System.out.print(student + " ");
        }
        System.out.println();
    }

}