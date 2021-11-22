import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<IAccount> accounts = new ArrayList<IAccount>();
        accounts.add(new Basic(1, 100));
        accounts.add(new Standard(2, -100));
        accounts.add(new Premium(3));

        for (IAccount account : accounts) {
            account.Deposit(100);
            System.out.println("Tow ithdraw 500, " + account.GetAccountNumber() + " can only  withdraw " + account.Withdraw(500));

        }

        Bank bank_account = new Bank();
        Account basic = new Basic(1, 100);
        basic.Deposit(900);
        Account premium = new Premium(2);
        premium.Deposit(200);
        Account standard = new Standard(3, 100);
        bank_account.OpenAccount(basic);
        bank_account.OpenAccount(premium);
        bank_account.OpenAccount(standard);

        basic.Withdraw(1000);
        premium.Withdraw(500);
        System.out.println(premium.GetCurrentBalance());

        bank_account.CloseAccount(2);

        System.out.println(bank_account.GetAllAccounts());
        System.out.println(bank_account.GetAllAccountsInDebt());


    }

}
