package PaymentByStrategyDesignPattern;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void payment(String paymentId, double amount, PaymentStatus status) {
        System.out.println("Payment of " + amount + " is done by Credit Card | Status: " + status);
    }
}
