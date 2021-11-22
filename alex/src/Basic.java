public class Basic extends Account {

    public Basic(int accountNumber, double withdrawalLimit) {
        super(accountNumber, withdrawalLimit, 0, 0);
    }

    @Override
    public double Withdraw(double amount) {
        double balance = GetCurrentBalance();
        if (balance < amount) {
            balance = balance - balance;
            return balance;
        }

        if (withdrawLimit < amount) {
            balance = balance - withdrawLimit;
            return withdrawLimit;
        }
        balance = balance - amount;
        return amount;
    }


    @Override
    public void Deposit(double amount) {
        balance = balance + amount;
    }
}

