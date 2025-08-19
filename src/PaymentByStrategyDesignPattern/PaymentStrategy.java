package PaymentByStrategyDesignPattern;

public interface PaymentStrategy {
    void payment(String paymentId, double amt, PaymentStatus status);
}
