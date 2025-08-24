public class BasicPrinter implements Print {
    @Override
    public void print(String text) {
        System.out.println("Print: " + text);
    }
}
