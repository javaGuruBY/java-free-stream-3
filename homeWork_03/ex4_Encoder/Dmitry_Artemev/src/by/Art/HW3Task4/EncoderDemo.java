package by.Art.HW3Task4;

import java.util.Scanner;

public class EncoderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Encoder encoder = new Encoder();

        System.out.println("Enter symbol from big 'A' till small 'z' for decoding: ");
        String string = scanner.nextLine();
        char[] symbol = string.toCharArray();
        System.out.print("\nsymbol " + symbol[0] + " encoded to Code ");
        encoder.decode(symbol[0]);

        System.out.println("Enter code from range [65;90] or [97;122] for encoding: ");
        short code = scanner.nextShort();
        System.out.printf("\nCode %d encoded to symbol ", code);
        encoder.encode(code);
    }
}
