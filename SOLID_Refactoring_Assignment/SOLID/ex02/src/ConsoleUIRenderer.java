public class ConsoleUIRenderer implements UIRenderer {
    @Override
    public void displayPlayback(int dataSize) {
        System.out.println("▶ Playing " + dataSize + " bytes");
    }
}
