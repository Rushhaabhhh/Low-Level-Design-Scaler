public class Demo09 {
    public static void main(String[] args) {
        OrderRepository09 repository = new SqlOrderRepository();

        OrderController controller = new OrderController(repository);
        controller.create("ORDER-1");
    }
}
