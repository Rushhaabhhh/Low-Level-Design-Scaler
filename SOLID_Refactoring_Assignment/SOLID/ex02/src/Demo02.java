public class Demo02 {
    public static void main(String[] args) {
        FrameDecoder decoder = new VideoFrameDecoder();
        FrameCache cache = new InMemoryFrameCache();
        UIRenderer renderer = new ConsoleUIRenderer();
        
        MediaPlayer player = new MediaPlayer(decoder, cache, renderer);
        player.play(new byte[]{1,2,3,4});
    }
}
