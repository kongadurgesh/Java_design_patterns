package chain_of_responsibilities;

public class BankPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 500) {
            System.out.println("Paid using Bank Account: " + amount);
        } else {
            next.handlePayment(amount);
        }
    }

}
