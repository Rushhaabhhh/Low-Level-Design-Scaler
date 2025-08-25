public class Demo01 {
    public static void main(String[] args) {
        EmailService emailService = new EmailClient();
        TaxCalculator taxCalculator = new StandardTaxCalculator();
        OrderRepository orderRepository = new DataOrderRepository();
        
        OrderService orderService = new OrderService();
        orderService.checkout("abc@shop.com", 100.0);
    }
}
