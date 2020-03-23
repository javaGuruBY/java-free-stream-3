package by.Art.Hw3Task3;

public class Circle {
    private double radius;

    public Circle () {
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getRadius () {
        return radius;
    }
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }
}
