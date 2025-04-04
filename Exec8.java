/*
Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber' and balance, and static variables 'bankName' and 'interestRate'. Provide static methods to get and set the static variables. Create several 'BankAccount' objects and print their details along with the static variables. 
*/

public class Exec8 {
    public static void main(String[] args)
    {
        BankAccount bankAccount1 = new BankAccount("123456789", 1000);
        BankAccount bankAccount2 = new BankAccount("987654321",  2000);

        BankAccount.set_BankName_InterestRate("National Bank", 3.5);

        System.out.printf("\nAccount Number: %s \nBalance: %.1f \nBank Name: %s \nInterest Bank: %.1f%%\n", bankAccount1.getAccountNumber(), bankAccount1.getBalance(), BankAccount.getBankName(), BankAccount.getInterestRate());
        System.out.printf("\nAccount Number: %s \nBalance: %.1f \nBank Name: %s \nInterest Bank: %.1f%%\n", bankAccount2.getAccountNumber(), bankAccount2.getBalance(), BankAccount.getBankName(), BankAccount.getInterestRate());
    }
}

class BankAccount
{

    private final String accountNumber;
    private final double balance;
    private static String bankName;
    private static double interestRate;

    public BankAccount(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void set_BankName_InterestRate(String name, double rate) 
    {
        bankName = name;
        interestRate = rate;
    }

    public static String getBankName()
    {
        return bankName;
    }

    public static double getInterestRate()
    {
        return interestRate;
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