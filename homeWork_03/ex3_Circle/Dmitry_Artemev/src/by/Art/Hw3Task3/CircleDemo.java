package by.Art.Hw3Task3;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(18.24);

        circle1.setRadius(12.00);
        System.out.println("Радиус 1-го круга: "+ circle1.getRadius() + ". Площадь 1-го круга: " + circle1.calculateArea());
        System.out.println("Радиус 2-го круга: "+ circle2.getRadius() + ". Площадь 2-го круга: " + circle2.calculateArea());
    }
}
