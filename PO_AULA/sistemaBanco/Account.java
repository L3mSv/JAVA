package sistemaBanco;

class Account {
    private String name;
    private double balance;
    private int id_account;
    private static int count_id_account = 1;

    Account(String name, double  balance)
    {
        this.name = name;
        this.balance = balance;
        this.id_account = count_id_account++;
        
    }
    
    String getName()
    {
        return this.name;
    }

    int getId()
    {
        return this.id_account;
    }

    double getBalance()
    {
        return this.balance;
    }

    double setBalance(double value)
    {
        return this.balance -= value;
    }

    public void deposit(double value)
    {
        Apply(value);
    }

    public void withdraw(double value)
    {
        Withdraw(value);
    }

    private void Apply(double value)
    {
        balance += value;
        System.out.println("Apply " + value + " in balance now $" + balance);
    }

    private void Withdraw(double value)
    {
        balance -= value;
        System.out.println("Withdraw " + value + " in balance now $" + balance);
    }

}
