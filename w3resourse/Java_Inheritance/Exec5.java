

/*
 Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
 Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if 
 the account balance falls below one hundred.
 */

public class Exec5 {
    public static void main(String[] args)
    {
        BankAccount bankAccount = new  BankAccount(500, "BA1234");
        SavingsAccount savingsAccount1 = new SavingsAccount(450, "SA1234");
        SavingsAccount savingsAccount2 = new SavingsAccount(300, "SA1000");

        bankAccount.deposit(1000);
        bankAccount.withdraw(600);

        savingsAccount1.withdraw(300);
        
        savingsAccount2.withdraw(250);
    }
}

class BankAccount{

    protected final String accountNumber;
    protected double balance;

    public BankAccount(double balance, String accountString)
    {
        this.accountNumber = accountString;
        this.balance = balance;
        System.out.println("\nCreate a Bank Account object (A/c No. "+ accountNumber + ") with initial balance of $" + balance + " :\n");
    }

    public void deposit(double deposit)
    {
        balance += deposit;
        System.out.println("\nDeposit $" + deposit + " into account " + accountNumber + ":");
        System.out.println("New balance after depositing $" + deposit + ": $" + balance + "\n");
    }

    public void withdraw(double withdraw)
    {
        System.out.println("\nWithdraw $" + withdraw + " from account " + accountNumber + ":");
        if(balance >= withdraw)
        {
            System.out.println("New balance after withdrawing $" + withdraw + ": $" + (balance - withdraw) + "\n");
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

}

class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance, String accountNumber)
    {
        super(balance, accountNumber);
        System.out.println("\nCreate a SavingsAccount object (A/c No. " + accountNumber + ") with initial balance of $" + balance);
    }

    @Override
    public void withdraw(double withdraw)
    {
        if((balance - withdraw) < 100)
        {
            System.out.println("\nTry to withdraw $" + withdraw + " from " + accountNumber +"!");
            System.out.println("Minimum balance of $100 required!");
            System.out.println("Balance after trying to withdraw $" + withdraw + ": $" + balance  + "\n");
        }
        else
        {
            balance -= withdraw;
            super.withdraw(withdraw);
            System.out.println("Balance after trying to withdraw $" + withdraw + ": $" + balance + "\n");
        }
    }

}