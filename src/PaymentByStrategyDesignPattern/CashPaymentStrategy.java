package PaymentByStrategyDesignPattern;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void payment(String paymentId, double amount, PaymentStatus status){
        System.out.println("Payment of " + amount + " is done by Cash | Status: " + status);
    }

}


