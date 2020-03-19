package Nataly_hW2Task4;
import java.util.Random;
import java.lang.Math;
public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        float firstRandomNumber = randomGenerator.nextFloat(); //  float value between [0;1)
        int secondRandomNumber = randomGenerator.nextInt(101); // int value between [0-100]
        double thirdRandomNumber = Math.random()*100; //  double value between  [0-100)
        float sum = (float) (firstRandomNumber + secondRandomNumber + thirdRandomNumber);
        System.out.println("Random numbers: ");
        System.out.println("1st = " + firstRandomNumber);
        System.out.println("2nd = " + secondRandomNumber);
        System.out.println("3rd = " + thirdRandomNumber);

        System.out.println("Sum of random numbers 1st+2nd+3rd = " + sum);
        System.out.printf("Sum rounded to 2 decimal places =  %.02f\n", sum);
    }
}
