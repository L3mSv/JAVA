

/* 
 Write a Java program to create a class called Student with private instance variables student_id, student_name, 
 and grades. Provide public getter and setter methods to access and modify the student_id and student_name 
 variables. However, provide a method called addGrade() that allows adding a grade to the grades variable 
 while performing additional validation.
*/

import java.util.Arrays;

public class Exec7 {
    public static void main(String[] args)
    {
        Student student = new Student();


        student.setStudentId("1");
        student.setStudentName("Jojo");
        student.addGrade(23.4);
        student.addGrade(34.3);

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grades: " + student.getGrades());

        
    }
}

class Student{
    private String student_id;
    private String student_name;
    private double[] grades = new double[0];

    public String setStudentId(String student_id)
    {
        return this.student_id = student_id;
    }

    public String setStudentName(String student_name)
    {
        return this.student_name = student_name;
    }


    public String getStudentId()
    {
        return student_id;
    }

    public String getStudentName()
    {
        return student_name;
    }

    public String getGrades()
    {
        return Arrays.toString(grades);
    }


    public void addGrade(double grade)
    {
        grades = Arrays.copyOf(grades, grades.length + 1);
        grades[grades.length - 1] = grade;
    }


}
