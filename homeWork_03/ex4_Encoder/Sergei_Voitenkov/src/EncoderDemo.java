public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        encoder.encode((byte) 65);
        encoder.decode('X');

        encoder.encode((byte) 31);
        encoder.decode('*');
    }
}