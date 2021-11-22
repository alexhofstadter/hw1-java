import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank {


    protected List<IAccount> accountsList;
    protected double balance;


    @Override
    public void OpenAccount(IAccount account) {
        accountsList.add(account);


    }

    @Override
    public void CloseAccount(int accountNumber) {
        List<IAccount> account_toClose = new ArrayList<IAccount>();
        for (IAccount account : accountsList) {
            if (account.GetAccountNumber() == accountNumber) {
                if (account.GetCurrentBalance() >= 0) {
                    account_toClose.add(account);
                } else {
                    System.out.println("account can't be closed due to a debt.");
                }
            }

        }

        accountsList.removeAll(account_toClose);
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return accountsList;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List<IAccount> accountsInDebt = new ArrayList<IAccount>();
        for (IAccount account : accountsList) {
            if (account.GetCurrentBalance() < 0) {
                accountsInDebt.add(account);
            }

        }
        return accountsInDebt;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List<IAccount> withBalance = new ArrayList<IAccount>();
        for (IAccount account : accountsList) {
            if (account.GetCurrentBalance() > balanceAbove) {
                withBalance.add(account);
            }

        }
        return withBalance;
    }

    public Bank() {

        balance = 0;
        accountsList = new ArrayList<IAccount>();

    }
}
