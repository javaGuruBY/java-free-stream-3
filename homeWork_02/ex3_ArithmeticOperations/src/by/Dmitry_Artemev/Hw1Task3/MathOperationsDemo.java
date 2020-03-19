package by.Dmitry_Artemev.Hw1Task3;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the demonstration of mathematical operations!");
        //Addition
        System.out.println("Addition:");
        int summandFirst = 1;
        int summandSecond = 2;
        System.out.println("First summand is: " + summandFirst);
        System.out.println("Second summand is: " + summandSecond);
        System.out.println("First summand (" + summandFirst + ") plus Second summand (" + summandSecond + ") equal to summ: " + (summandFirst + summandSecond));
        System.out.println("##########");

        //Subtraction
        System.out.println("Subtraction:");
        float minuend = 3.5f;
        float subtrahend = 2.3f;
        System.out.println("Minuend is: " + minuend);
        System.out.println("Subtrahend is: " + subtrahend);
        System.out.println("Minuend (" + minuend + ") minus subtrahend (" + subtrahend + ") equal to difference: " + (minuend - subtrahend));
        System.out.println("##########");

        //Multiplication
        System.out.println("Multiplication:");
        short multiplicanda = 2;
        short multiplier = 4;
        System.out.println("Multiplicanda is: " + multiplicanda);
        System.out.println("Multiplier is: " + multiplier);
        System.out.println("Multiplicanda (" + multiplicanda + ") multiplied by multiplier (" + multiplier + ") equal to product: " + (multiplicanda * multiplier));
        System.out.println("##########");

        //Division
        System.out.println("Division:");
        double dividend = 8.44;
        double divisor = 2.0;
        System.out.println("Dividend is: " + dividend);
        System.out.println("Divisor is: " + divisor);
        System.out.println("Dividend (" + dividend + ") divided by divisor (" + divisor + ") equal to quotient: " + (dividend / divisor));
        System.out.println("##########");
    }
}
