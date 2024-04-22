package chain_of_responsibilities;

public class CreditCardPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 1000) {
            System.out.println("Paid using Credit Card: " + amount);
        } else {
            next.handlePayment(amount);
        }
    }

}
