public class Demo04 {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Payment payment = new Payment("CARD", 39.19);
        System.out.println(paymentService.processPayment(payment));
    }
}
