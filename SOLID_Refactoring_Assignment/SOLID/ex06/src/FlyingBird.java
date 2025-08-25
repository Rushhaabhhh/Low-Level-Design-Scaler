public class FlyingBird extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying!");
    }
    
    @Override
    public void release() {
        fly();
    }
}