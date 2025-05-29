package sistemaBanco;

class Bank{
    private String name;
    private int id_bank;
    private Account[] bank_accounts;
    private Savings[] bank_savings;
    private static int MAX_ACCOUNTS = 100;
    private static int counter_bank = 1;
    private int array_size_savings = 0;
    private int array_size_accounts = 0;

    Bank(String name)
    {
        this.name = name;
        id_bank = counter_bank;
        bank_accounts = new Account[MAX_ACCOUNTS];
        bank_savings = new Savings[MAX_ACCOUNTS];

        counter_bank++;
    }

    String getName()
    {
        return this.name;
    }

    int getId_Bank()
    {
        return this.id_bank;
    }

    Account Create_Account(String name, double balance)
    {
        if(array_size_accounts < MAX_ACCOUNTS)
        {
            return bank_accounts[array_size_accounts++] = new Account(name, balance);
        }

        return null;
    }

    Savings Create_Savings(String name, double balance)
    {
        if(array_size_savings < MAX_ACCOUNTS)
        {
            return bank_savings[array_size_savings++] = new Savings(name, balance);
        }

        return null;
    }

    Account findAccount(int id)
    {
        for(int i = 0; i < array_size_accounts; ++i)
        {
            if(bank_accounts[i] != null && bank_accounts[i].getId() == id)
            {
                return bank_accounts[i];
            }
        }
        return null;
    }

    Savings findSavings(int id)
    {
        for(int i = 0; i < array_size_savings; ++i)
        {
            if(bank_savings[i] != null && bank_savings[i].get_Saving_Id() == id)
            {
                return bank_savings[i];
            }
        }
        return null;
    }

}