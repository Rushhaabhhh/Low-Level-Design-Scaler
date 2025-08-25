public class Rectangle implements Resizable {
    private int width;
    private int height;

    @Override
    public void resize() {
        this.width = 5;
        this.height = 4;
    }

    @Override
    public int area() {
        return width * height;
    }
}