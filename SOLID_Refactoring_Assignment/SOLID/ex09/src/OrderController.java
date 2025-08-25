public class OrderController {
    private final OrderRepository09 repository;

    public OrderController(OrderRepository09 repository) {
        this.repository = repository;
    }

    public void create(String id) {
        repository.save(id);
        System.out.println("Created order: " + id);
    }
}
