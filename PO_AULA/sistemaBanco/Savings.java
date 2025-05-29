package sistemaBanco;

class Savings extends Account {
    private int id_savings_account;
    private static int counter_id_savings_accounts = 1;

    public Savings(String name, double balance) {
        super(name, balance);
        id_savings_account = counter_id_savings_accounts++;
    }

    int get_Saving_Id()
    {
        return this.id_savings_account;
    }

    void Savings_Withdraw(double value)
    {
        if(getBalance()  >= value)
        {
            setBalance(value);
            System.out.println("Withdraw " + value + " in balance now $" + getBalance());
        }else
        {
            System.out.println("You can't save $" + value);
        }
    }
    
}