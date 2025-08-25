public class NonFlyingBird extends Bird {
    @Override
    public void release() {
        System.out.println("Walking away...");
    }
}