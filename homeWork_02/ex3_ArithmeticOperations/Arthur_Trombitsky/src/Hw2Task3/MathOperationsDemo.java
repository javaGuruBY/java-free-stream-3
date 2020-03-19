package Hw2Task3;

public class MathOperationsDemo {
    public static void main(String args[])
            throws java.io.IOException {
        double  firstNumber = 5.9, secondNumber = 10.7;

        System.out.println("First number is " + firstNumber + ";");
        System.out.println("Second number is " + secondNumber + ";");
        double sum = firstNumber + secondNumber;
        System.out.println("1) Addition result is " + sum + ";");
        double sub = firstNumber - secondNumber;
        System.out.print("2) Subtraction result is ");
        System.out.printf("%.01f", sub);
        System.out.println(";");
        double mult = firstNumber * secondNumber;
        System.out.print("3) Multiplication result is ");
        System.out.printf("%.01f", mult);
        System.out.println(";");
        double div = firstNumber / secondNumber;
        System.out.print("4) Division result is ");
        System.out.printf("%.01f", div);
        System.out.print(".");
    }
}


