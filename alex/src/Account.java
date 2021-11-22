
public class Account implements IAccount {

    protected int accountNumber;
    protected double creditLimit;
    protected double withdrawLimit;
    protected double balance;

    public Account(int accountNumber, double withdrawalLimit, double creditLimit, double balance) {
        this.accountNumber = accountNumber;
        this.withdrawLimit = withdrawalLimit;
        this.creditLimit = creditLimit;
        this.balance = balance;
    }


    @Override
    public void Deposit(double amount) {
        balance = balance + amount;

    }

    @Override
    public double Withdraw(double amount) {
        balance = balance - amount;
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return balance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}

