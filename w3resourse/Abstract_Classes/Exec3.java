/*
 Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
 Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to 
 handle deposits and withdrawals for each account type. 
*/

public class Exec3 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(250);

        CurrentAccount currentAccount = new CurrentAccount(5000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(3000);
        currentAccount.withdraw(6000);
    }
}


abstract  class BankAccount{

    private double balance;

    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    public abstract void deposit(double deposit);
    public abstract  void withdraw(double withdraw);

    public double getBalance()
    {
        return balance;
    }

    public double setBalance(double newBalance)
    {
        return this.balance = newBalance;
    }
}

class SavingsAccount extends BankAccount{

    public SavingsAccount(double balance)
    {
        super(balance);
        System.out.printf("\nSaving A/c: Initial Balance: $%.1f", balance);
    }

    @Override
    public void deposit(double deposit)
    {
        double newBalance = getBalance() + deposit;
        setBalance(newBalance);
        System.out.printf("\nDeposit of $%.1f successful. Current balance: $%.1f", deposit, newBalance);
    }

    @Override
    public void withdraw(double withdraw)
    {
        if(getBalance() >= withdraw)
        {
            double newBalance = getBalance() - withdraw;
            setBalance(newBalance);
            System.out.printf("\nWithdrawal of $%.1f successful. Current balance: $%.1f\n", withdraw, newBalance);
        }
        else
        {
            System.out.printf("\nTry to withdraw: $%.1f", withdraw);
            System.out.printf("\nInsufficient funds. Withdrawal failed.\n");
        }
    }
}

class CurrentAccount extends BankAccount{
    
    public CurrentAccount(double balance)
    {
        super(balance);
        System.out.printf("\nCurrent A/c: Initial Balance: $%.1f", balance);
    }

    @Override
    public void deposit(double deposit)
    {
        double newBalance = getBalance() + deposit;
        setBalance(newBalance);
        System.out.printf("\nDeposit of $%.1f successful. Current balance: $%.1f", deposit, newBalance);
    }

    @Override
    public void withdraw(double withdraw)
    {
        if(getBalance() >= withdraw)
        {
            double newBalance = getBalance() - withdraw;
            setBalance(newBalance);
            System.out.printf("\nWithdrawal of $%.1f successful. Current balance: $%.1f\n", withdraw, newBalance);
        }
        else
        {
            System.out.printf("\nTry to withdraw: $%.1f", withdraw);
            System.out.printf("\nInsufficient funds. Withdrawal failed.\n");
        }
    }
}