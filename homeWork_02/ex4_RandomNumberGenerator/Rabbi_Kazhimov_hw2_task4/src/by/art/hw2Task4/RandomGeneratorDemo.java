package by.art.hw2Task4;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        int firstNum = new Random().nextInt(100);
        int secondNum = new Random().nextInt(20);
        int sum = firstNum + secondNum;
        System.out.println("first value =  " + firstNum);
        System.out.println("second value =  " + secondNum);
        System.out.println("summ = " + sum);
    }
}
