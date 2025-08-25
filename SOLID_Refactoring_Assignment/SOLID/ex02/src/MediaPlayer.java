public class MediaPlayer {
    private final FrameDecoder decoder;
    private final FrameCache cache;
    private final UIRenderer renderer;
    
    public MediaPlayer(FrameDecoder decoder, FrameCache cache, UIRenderer renderer) {
        this.decoder = decoder;
        this.cache = cache;
        this.renderer = renderer;
    }
    
    public void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        cache.cache(frame);
        renderer.displayPlayback(fileBytes.length);
        System.out.println("Cached last frame? " + cache.hasCachedFrame());
    }
}
