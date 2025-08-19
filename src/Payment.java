import PaymentByStrategyDesignPattern.PaymentStatus;
import PaymentByStrategyDesignPattern.PaymentStrategy;

public class Payment {
    private String paymentId;
    private double amount;
    private PaymentStatus status;
    private PaymentStrategy paymentStrategy;

    // Constructor
    public Payment(String paymentId, double amount, PaymentStatus status, PaymentStrategy paymentStrategy) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = status;
        this.paymentStrategy=paymentStrategy;
    }

    public PaymentStrategy getPaymentStrategy(){
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    // Getter and Setter for paymentId
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    // Getter and Setter for amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter and Setter for status
    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
