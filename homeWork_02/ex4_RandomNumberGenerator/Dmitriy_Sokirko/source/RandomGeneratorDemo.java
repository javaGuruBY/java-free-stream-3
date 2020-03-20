import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int  firstNum  = new Random().nextInt(100);
        int  secondNum  = new Random().nextInt(100);
        int  thirdNum  = new Random().nextInt(100);
        int sum = firstNum + secondNum + thirdNum;
        System.out.println("first value =  " + firstNum );
        System.out.println("second value =  " + secondNum );
        System.out.println("third value =  " + thirdNum );
        System.out.println("summ = " + sum);
    }
}