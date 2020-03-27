package by.Kaz.Hw3Task3;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(7);
        Circle circle2 = new Circle(14);

        System.out.println("Если радиус круга = " + circle1.getRadius() + ", тогда площадь круга = " + circle1.calculateArea());
        System.out.println("Если радиус круга = " + circle2.getRadius() + ", тогда площадь круга = " + circle2.calculateArea());
    }
}
