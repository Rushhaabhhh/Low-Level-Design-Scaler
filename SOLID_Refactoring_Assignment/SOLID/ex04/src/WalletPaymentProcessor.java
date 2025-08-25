public class WalletPaymentProcessor implements PaymentProcessor {
    @Override
    public String process(double amount) {
        return "Wallet debit: " + amount;
    }
    
    @Override
    public String getProviderType() {
        return "WALLET";
    }
}
