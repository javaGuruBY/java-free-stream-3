import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhraseAnalyserTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String text = bufferedReader.readLine();
        PhraseAnalyser texts = new PhraseAnalyser();
        System.out.println(texts.analyse(text));


    }
}
