import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt(101);
        int boundRandom = randomGenerator.nextInt(51);
        int lastRandom = (int)  (Math.random() * (91));
        int result = unboundRandom + boundRandom + lastRandom;
        System.out.println("First Random Number = " + unboundRandom);
        System.out.println("Second Random Number = " + boundRandom);
        System.out.println("Third  Random Number = " + lastRandom);
        System.out.println("Sum of Random Numbers = " + result);
    }
}
