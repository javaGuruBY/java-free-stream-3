package Pasha_Vinnikov_Hw3Ex3;

public class Circle {
    public double radius;
   public double P = 3.14;
   public double circleArea(){
       return this.radius * this.radius * this.P;

   }
}
class CircleDemo{
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 80;
        System.out.println(circle.circleArea());
    }
}