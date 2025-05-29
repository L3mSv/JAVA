/* 
Write a Java program to create a class called Account with private instance variables accountNumber,
 accountHolder, and balance. Provide public getter and setter methods to access and modify these variables. 
Add a method called deposit() that takes an amount and increases the balance by that amount, and a
 method called withdraw() that takes an amount and decreases the balance by that amount.
*/

public class Exec12 {
    public static void main(String[] args) {
        {
            Account account = new Account();

            account.setAccountNumber("123456789");
            account.setAccountHolder("Rodolfo Desiree");
            account.setBalance(1000);

            System.out.printf("\nAccount Number: %s", account.getAccountNumber());
            System.out.printf("\nAccount Holder: %s", account.getAccountHolder());
            System.out.printf("\nBalance: %s\n", account.getBalance());

            account.deposit(500);
            System.out.printf("\nThe balance $%s get a deposit of $500", account.getBalance());
            account.withdraw(200);
            System.out.printf("\nThe balance $%s get a withdraw of $200", account.getBalance());


            System.out.printf("\nBalance: %s\n", account.getBalance());

            account.withdraw(2000);
        }
    }
}

class Account{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String setAccountNumber(String accountNumber)
    {
        return this.accountNumber = accountNumber;
    }

    public String setAccountHolder(String accountHolder)
    {
        return this.accountHolder = accountHolder;
    }

    public double setBalance(double balance)
    {
        return this.balance = balance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double deposit)
    {
        balance += deposit;
    }

    public void withdraw(double withdraw)
    {
        if(balance >= withdraw)
        {
            balance -= withdraw;
        }
        else
        {
            System.out.println("\nThe balance insufficient!\n");
        }
    }
}