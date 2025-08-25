public class UpiPaymentProcessor implements PaymentProcessor {
    @Override
    public String process(double amount) {
        return "Paid via UPI: " + amount;
    }
    
    @Override
    public String getProviderType() {
        return "UPI";
    }
}
