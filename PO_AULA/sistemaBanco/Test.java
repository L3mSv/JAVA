package sistemaBanco;

public class Test {
    public static void main(String[] args)
    {
        Bank bank1 = new Bank("Banco do Brasil");
        bank1.Create_Account("Lucas", 10000);
        bank1.Create_Savings("Julia", 2000);

        System.out.println("Bank Name: " + bank1.getName());
        System.out.println("Bank ID: " + bank1.getId_Bank());
        
        System.out.println("");

        Account account1 = bank1.findAccount(1);
        if (account1 != null) {
        System.out.println("Owner name: " + account1.getName());
        System.out.println("balance: " + account1.getBalance());
        account1.deposit(200);
        account1.withdraw(200);
        } else {
            System.out.println("Account not found!");
        }
        
        System.out.println("");

        Savings SavingsAccount1 = bank1.findSavings(1);
        if(SavingsAccount1 != null)
        {
        System.out.println("Owner name: " + SavingsAccount1.getName());
        System.out.println("balance: " + SavingsAccount1.getBalance());
        SavingsAccount1.Savings_Withdraw(3000);
        SavingsAccount1.Savings_Withdraw(200);
        }
        else {
            System.out.println("Saving Account not found!");
        }

        System.out.println("");

        Bank bank2 = new Bank("Bradesco");
        System.out.println("Bank Name: " + bank2.getName());
        System.out.println("Bank ID: " + bank2.getId_Bank());
    }
}
