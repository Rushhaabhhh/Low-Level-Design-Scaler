public class PaymentProcessor {
    IProductRepo repo;
    public PaymentProcessor(IProductRepo repo) {
        this.repo = repo;
    }

    void pay(int productId) {
        System.err.println("");
        repo.getProductById(productId);
        System.out.println("");

    }
}