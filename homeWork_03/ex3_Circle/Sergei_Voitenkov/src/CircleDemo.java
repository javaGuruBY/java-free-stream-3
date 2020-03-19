public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 5;

        System.out.print("При радиусе круга " + circle1.radius + ", площадь круга равна ");
        System.out.printf("%.2f . ", circle1.calculateArea());
    }
}
