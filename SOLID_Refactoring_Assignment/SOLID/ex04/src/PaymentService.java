public class PaymentService {
    public String processPayment(Payment payment) {
        PaymentProcessor processor = PaymentProcessorFactory.getProcessor(payment.getProvider());
        return processor.process(payment.getAmount());
    }
}
