/*
6. Constructor with Validation
Write a Java program to create a class called Account with instance variables accountNumber and balance. Implement a parameterized constructor that initializes these variables with validation:

    accountNumber should be non-null and non-empty.

    balance should be non-negative.

    Print an error message if the validation fails.

*/

public class Exec6{
    public static void main(String[] args)
    {
        Account account1 = new Account("", 43.5);
        Account account2 = new Account("3", -34);
        Account account3 = new Account("5", 23.6);

        account1.GetAccount();

        
    }
}

class Account{
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance){

        if(accountNumber == null || accountNumber.isEmpty()){
            System.out.println("Error! accountNumber should be non-null and non-empty.\n");
            return;
        }
        if(balance < 0)
        {
            System.out.println("Error! balance should be non-negative.");
            return;
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void GetAccount(){
        System.out.println("\nAccountNumber: " + accountNumber + " |Balance: " + balance + "\n");
    }
}