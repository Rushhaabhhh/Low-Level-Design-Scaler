public class Demo05 {
    static int areaAfterResize(Resizable shape) {
        shape.resize();
        return shape.area();
    }

    public static void main(String[] args) {
        System.out.println("Rectangle : " + areaAfterResize(new Rectangle())); 
        System.out.println("Square : " + areaAfterResize(new Square()));
    }
}