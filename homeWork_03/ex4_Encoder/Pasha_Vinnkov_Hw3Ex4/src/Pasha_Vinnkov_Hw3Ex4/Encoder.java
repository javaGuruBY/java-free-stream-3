package Pasha_Vinnkov_Hw3Ex4;

public class Encoder {
    public int x; //numbers
    public char y; //symbols

    public void encode(){y=(char)x; //method to encode numbers
    }
    public void decode(){x = (char)y;} // method to decode symbols
}
class EncoderDemo{
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        encoder.x = 80;
        encoder.encode();
        System.out.println(encoder.x + " => " + encoder.y);
        encoder.y = 'U';
        encoder.decode();
        System.out.println(encoder.y + " => " + encoder.x);

    }
}