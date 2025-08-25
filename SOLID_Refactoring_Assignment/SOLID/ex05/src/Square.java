public class Square implements Resizable {
    private int side;

    @Override
    public void resize() {
        this.side = 4;
    }

    @Override
    public int area() {
        return side * side;
    }
}