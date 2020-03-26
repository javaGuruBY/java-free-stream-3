package Pasha_Vinnikov_Hw3Ex2;

public class Human {
    public int age;
    public String name;
public Human(String name, int age){
    this.name = name;
    this.age = age;
}
    public void greets(){System.out.println("Hello! I'm " + name + ". My age is " + age + " years old.");
    }
}
 class HumanDemo{
     public static void main(String[] args) {
         Human Dima = new Human("Dima", 25);
         Dima.greets();
     }
}