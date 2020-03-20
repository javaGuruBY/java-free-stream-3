public class RandomGeneratorDemo {

    public static void main(String[] args) {
        int number1 = (int) ( Math.random() * 100 );
        int number2 = (int) ( Math.random() * 100 );
        int number3 = (int) ( Math.random() * 100 );
        System.out.println("Первое число = " + number1);
        System.out.println("Второе число = " + number2);
        System.out.println("Третье число = " + number3);
        System.out.println("Сумма всех чисел = " + (number1 + number2 + number3));
    }
}
