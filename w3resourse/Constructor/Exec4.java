/*
Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.
*/

public class Exec4{
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student(24102856,"Lucas Lemes", 9.8);

        student1.GetStudent();
        student2.GetStudent();
    }
}

class Student{
    int studentId;
    String studentName;
    double grade;

    public Student(){
        studentId = 0;
        studentName = "None";
        grade = 0.0;
    }
    public Student(int studentId, String studentName, double grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public void GetStudent(){
        System.out.println("Nome: " + studentName + " |Id: " + studentId + " |Grade: " + grade + "\n");
    }
}