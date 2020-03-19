package Nataly_hW2Task3;

public class MathOperationsDemo {
    public static void main(String[] args) {
        int firstNumber = 79;
        int secondNumber = 23;
        System.out.println("First Number = " + firstNumber + ", Second Number = " + secondNumber);
        System.out.println("1) Addition '+':");
        int sum = firstNumber + secondNumber;
        System.out.println("First Number + Second Number = " + firstNumber + " + " + secondNumber + "= " + sum);
        System.out.println("2) Subtraction '-':");
        long difference = firstNumber - secondNumber;
        System.out.println("First Number - Second Number = " + firstNumber + " - " + secondNumber + "= " + difference);
        System.out.println("3) Multiplication '*':");
        long multiplication = firstNumber * secondNumber;
        System.out.println("First Number * Second Number =  " + firstNumber + " / " + secondNumber + " = " + multiplication);
        System.out.println("4) Division '/':");
        float division = (float) firstNumber / secondNumber;
        System.out.print("First Number / Second Number =  " + firstNumber + " / " + secondNumber + " = ");
        System.out.printf("%.03f\n", division); // formatted printing: 3 decimal places
    }
}
