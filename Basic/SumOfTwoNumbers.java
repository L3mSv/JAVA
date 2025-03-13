/*
Write a Java program to print the sum of two numbers.
*/

import java.util.Scanner;

public class SumOfTwoNumbers { 
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int firstNumber = input.nextInt();
            System.out.println("\nEnter the second number: ");
            int secondNumber = input.nextInt();
            int sum = firstNumber + secondNumber;
            
            System.out.println("\nThe sum of " + firstNumber + " and " + secondNumber + " is " + sum);
        }
}
