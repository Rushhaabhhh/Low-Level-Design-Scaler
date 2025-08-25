public class InMemoryFrameCache implements FrameCache {
    private Frame lastFrame;
    
    @Override
    public void cache(Frame frame) {
        this.lastFrame = frame;
    }
    
    @Override
    public boolean hasCachedFrame() {
        return lastFrame != null;
    }
}
