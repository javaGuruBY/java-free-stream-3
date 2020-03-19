public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Math Operations' ");
        int footballViewers = 82;
        int basketballViewers = 10;
        System.out.println("1) Суммирование '+': ");
        System.out.print("football Viewers = ");
        System.out.print(footballViewers);
        System.out.print(", ");
        System.out.print("basketball Viewers = ");
        System.out.print(basketballViewers);
        int summ = footballViewers + basketballViewers;
        System.out.println();
        System.out.print("Total viewers = football Viewers + basketball Viewers = ");
        System.out.println(summ);
        double priceForApple = 15.8;
        double priceForOrange = 75.5;
        System.out.println("2) Вычитание '-': ");
        System.out.print("price For Apple = " + priceForApple + ", price For Orange = " + priceForOrange);
        double difference = priceForOrange - priceForApple;
        System.out.println();
        System.out.print("Price for orange - price for apple = ");
        System.out.print(difference);
        System.out.println();
        System.out.println("3) Деление '/': ");
        long schoolStudents = 24;
        long universityStudents = 4;
        System.out.println("school Students = " + schoolStudents + ", University Students = " + universityStudents);
        long division = schoolStudents / universityStudents;
        System.out.print("School Students / University Students = ");
        System.out.print(division);
        System.out.println();
        System.out.println("4) Умножение '*': ");
        byte num1 = 11;
        byte num2 = 9;
        System.out.println("Number 1 = " + num1 + ", Number 2 = " + num2);
        long multiplication = num1 * num2;
        System.out.print("Number 1 * Number 2 = ");
        System.out.print(multiplication);


    }
}
