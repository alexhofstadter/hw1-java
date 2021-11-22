public class Premium extends Account {
    public Premium(int accountNumber) {
        super(accountNumber, 0, 0, 0);
    }

    @Override
    public double Withdraw(double amount) {
        balance = balance - amount;
        return amount;
    }

    @Override
    public void Deposit(double amount) {
        balance = balance + amount;
    }
}
