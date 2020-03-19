import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LightColorDetectorTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        LightColorDetector color = new LightColorDetector();
        int wavelength = Integer.parseInt(bufferedReader.readLine());
        System.out.println(color.detect(wavelength));
    }
}
