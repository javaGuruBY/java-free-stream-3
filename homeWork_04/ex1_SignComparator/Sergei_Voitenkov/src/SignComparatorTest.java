import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignComparatorTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double number = Double.parseDouble(bufferedReader.readLine());
        int integerTypeInt = (int) number;
        SignComparator signComparator = new SignComparator();
        System.out.println(signComparator.compare(integerTypeInt));
    }
}
