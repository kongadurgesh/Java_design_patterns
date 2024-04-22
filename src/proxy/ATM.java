package proxy;

public class ATM implements Account {

    @Override
    public void getAccountNumber() {

    }

    @Override
    public void withdraw(int money) {
        BankAccount bankAccount = new BankAccount(123, 10000);
        bankAccount.withdraw(1000);
    }

}
