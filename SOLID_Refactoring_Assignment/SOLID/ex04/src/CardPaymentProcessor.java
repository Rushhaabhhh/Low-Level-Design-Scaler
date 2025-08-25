public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public String process(double amount) {
        return "Charged card: " + amount;
    }
    
    @Override
    public String getProviderType() {
        return "CARD";
    }
}
