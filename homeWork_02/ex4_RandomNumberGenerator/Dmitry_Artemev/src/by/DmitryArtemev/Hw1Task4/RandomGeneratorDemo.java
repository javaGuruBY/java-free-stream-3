package by.DmitryArtemev.Hw1Task4;

import java.util.Random;
import java.lang.Math;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
    Random numberRandomGenerator = new Random();
        System.out.println("Welcom to my random generator demonstration!");

        int firstRandomNumber = numberRandomGenerator.nextInt(101); //Generate random number range(1,100) by class Random
        int secondRandomNumber = (int) (Math.random()*100);                //Generate random number range(1,100) by class Math
        int thirdRandomNumber = (int) (Math.random()*100);

        System.out.printf("First random number: " + firstRandomNumber +
                        "\nSecond random number: " + secondRandomNumber +
                        "\nThird random number: " + thirdRandomNumber +
                        "\nSum of these random numbers is: " + (firstRandomNumber + secondRandomNumber + thirdRandomNumber));
    }
}
