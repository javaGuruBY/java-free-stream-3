package by.Kaz.Hw3Task4;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        encoder.encode((short)65);
        encoder.decode('X');

        encoder.encode((short) 31);
        encoder.decode('*');
    }
}
