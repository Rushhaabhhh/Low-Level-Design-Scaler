public class VideoFrameDecoder implements FrameDecoder {
    @Override
    public Frame decode(byte[] fileBytes) {
        // pretend decoding
        return new Frame(fileBytes);
    }
}
