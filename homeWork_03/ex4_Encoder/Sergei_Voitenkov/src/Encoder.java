public class Encoder {

    void encode(byte code) {
        System.out.println(code + " => '" + ((char) code) + "'");
    }

    void decode(char symbol) {
        System.out.println("'" + symbol + "' => " + ((byte) symbol));
    }

}