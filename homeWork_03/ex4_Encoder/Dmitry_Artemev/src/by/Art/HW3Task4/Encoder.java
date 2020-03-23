package by.Art.HW3Task4;

public class Encoder {
    private char[] symbolList = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private short[] codeList = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
            97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118,
            119, 120, 121, 122};

    void encode (short code) {
        for (int i = 0; i < codeList.length; i++) {
            if (codeList[i] == code) {
                System.out.println(symbolList[i]);
                break;
            }
        }
    }
    void decode (char symbol) {
        for (int i = 0; i < symbolList.length; i++) {
            if (symbolList[i] == symbol) {
                System.out.println(codeList[i]);
                break;
            }
        }
    }
}
