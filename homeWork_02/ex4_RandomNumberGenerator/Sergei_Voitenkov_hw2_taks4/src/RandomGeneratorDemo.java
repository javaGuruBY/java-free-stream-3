
import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int oneRandomNumber = (int) (Math.random() * 101); // генерируем числа в диапазоне от 0 до 100 включительно.
        int twoRandomNumber = (int) (Math.random() * (10) + 11); // генерируем числа в диапазоне от 10 до 20 включительно.
        Random randomGenerator = new Random();
        int threeRandomNumber = randomGenerator.nextInt(6); // генерируем числа от 0 до 6 включительно.
        int sumRandomNumbers = oneRandomNumber + twoRandomNumber + threeRandomNumber;

        System.out.println("Первое случайное число = " + oneRandomNumber);
        System.out.println("Второе случайное число = " + twoRandomNumber);
        System.out.println("Третье случайное число = " + threeRandomNumber);
        System.out.println("Сумма всех случайных чисел = " + sumRandomNumbers);
    }

}
