public class Demo06 {
    public static void main(String[] args) {
        Aviary aviary = new Aviary();
        
        Bird sparrow = new FlyingBird();
        aviary.release(sparrow);
        
        Bird penguin = new NonFlyingBird();
        aviary.release(penguin);
    }
}
