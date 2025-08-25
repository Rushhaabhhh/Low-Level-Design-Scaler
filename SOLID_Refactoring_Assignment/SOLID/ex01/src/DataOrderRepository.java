public class DataOrderRepository implements OrderRepository {
    @Override
    public void store() {
        System.out.println("Order stored in DB");
    }
}