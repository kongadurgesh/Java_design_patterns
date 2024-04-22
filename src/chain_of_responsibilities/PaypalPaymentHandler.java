package chain_of_responsibilities;

public class PaypalPaymentHandler extends PaymentHandler {

    @Override
    public void handlePayment(double amount) {
        if (amount <= 1500) {
            System.out.println("paid using Paypal: " + amount);
        }
    }

}
