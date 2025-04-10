

/* 
Write a Java program to create a class called BankAccount with private instance 
variables accountNumber and balance. 
Provide public getter and setter methods to access and modify these variables.
*/

public class Exec2 {
    public static void main(String[] args)
    {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("741");
        bankAccount.setBalance(3500);

        System.out.printf("Account Number: %s|Balance: %.1f", bankAccount.getAccountNumber(), bankAccount.getBalance());
    }
}

class BankAccount{
    private String accountNumber;
    private double balance;

    public String setAccountNumber(String accountNumber)
    {
        return this.accountNumber = accountNumber;
    }

    public double setBalance(double balance)
    {
        return this.balance = balance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }
}
