public class Standard extends Account {
    public Standard(int accountNumber, double creditLimit) {

        super(accountNumber, 0, creditLimit, 0);
    }

    @Override
    public double Withdraw(double amount) {
        if (creditLimit < amount) {
            balance = balance - creditLimit;
            return balance;
        }
        balance = balance - amount;
        return amount;
    }

    @Override
    public void Deposit(double amount) {
        balance = balance + amount;
    }
}

