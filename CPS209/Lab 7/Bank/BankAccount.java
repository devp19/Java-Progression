/**
 * A BankAccount class that implements Filter. You are to implement the following
 * <p>
 * - Implement inRange method which checks if the balance is between the given values
 */
public class BankAccount implements Filter
{
    private long accountNumber;
    private double balance;

    public BankAccount()
    {
        accountNumber = 0;
        balance = 0;
    }

    public BankAccount(long accountNumber)
    {
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public BankAccount(long accountNumber, double initialBalance)
    {
        this.accountNumber = accountNumber;
        balance = initialBalance;
    }

    public BankAccount(int accountNumber, double initialBalance)
    {
        this.accountNumber = accountNumber;
        balance = initialBalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        this.balance -= amount;
    }

    public void transfer(double amount, BankAccount targetAccount)
    {
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }

    public String toString()
    {
        return "Account Number: " + accountNumber + " Balance: " + balance;
    }

    //-----------Start below here. To do: approximate lines of code = 4
    // Implement the necessary method such that class BankAccount implements the Filter interface
    // check the balance instance variable of this bank account object to see if it is in range specified by
    // the parameters. See Filter.java
    // You can assume all input is such that low <= high
    
    public boolean inRange(double low, double high) {
        return balance >= low && balance <= high;
    }

    
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
