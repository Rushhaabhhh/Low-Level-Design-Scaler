public class SqlOrderRepository implements OrderRepository09 {
    @Override
    public void save(String id) {
        System.out.println("Saved order " + id + " to SQL");
    }
}
