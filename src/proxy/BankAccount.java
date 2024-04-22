package proxy;

public class BankAccount implements Account {
    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void getAccountNumber() {
        System.out.println(accountNumber);
    }

    @Override
    public void withdraw(int money) {
        if (balance < money)
            System.out.println("insuffient Funds");
        else {
            balance -= money;
            System.out.println("Withdraw success");
        }
    }

}
