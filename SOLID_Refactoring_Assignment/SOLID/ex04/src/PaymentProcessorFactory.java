import java.util.HashMap;
import java.util.Map;

public class PaymentProcessorFactory {
    private static final Map<String, PaymentProcessor> processors = new HashMap<>();
    
    static {
        registerProcessor(new CardPaymentProcessor());
        registerProcessor(new UpiPaymentProcessor());
        registerProcessor(new WalletPaymentProcessor());
    }
    
    public static void registerProcessor(PaymentProcessor processor) {
        processors.put(processor.getProviderType(), processor);
    }
    
    public static PaymentProcessor getProcessor(String providerType) {
        PaymentProcessor processor = processors.get(providerType);
        if (processor == null) {
            throw new RuntimeException("No provider found for: " + providerType);
        }
        return processor;
    }
}
