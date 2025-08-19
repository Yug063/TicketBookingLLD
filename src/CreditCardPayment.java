import PaymentByStrategyDesignPattern.CreditCardPaymentStrategy;
import PaymentByStrategyDesignPattern.PaymentStatus;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(String paymentId, double amount, PaymentStatus status) {
        super(paymentId, amount, status, new CreditCardPaymentStrategy());
    }
}
